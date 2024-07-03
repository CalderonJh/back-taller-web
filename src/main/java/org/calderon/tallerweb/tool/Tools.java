package org.calderon.tallerweb.tool;

import java.beans.FeatureDescriptor;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public interface Tools {
  static void copyProperties(Object source, Object target, String... ignoreProperties) {
    String[] nullFields = getNullFields(source);
    for (String ignoreProperty : ignoreProperties) {
      nullFields =
          Stream.concat(Stream.of(nullFields), Stream.of(ignoreProperty)).toArray(String[]::new);
    }
    BeanUtils.copyProperties(source, target, nullFields);
  }

  private static String[] getNullFields(Object object) {
    BeanWrapper wrappedSource = new BeanWrapperImpl(object);
    return Stream.of(wrappedSource.getPropertyDescriptors())
        .map(FeatureDescriptor::getName)
        .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
        .toArray(String[]::new);
  }

  static Date getRelativeDate(int years, int months, int days) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.YEAR, years);
    calendar.add(Calendar.MONTH, months);
    calendar.add(Calendar.DAY_OF_MONTH, days);
    calendar.add(Calendar.HOUR_OF_DAY, 0);
    calendar.add(Calendar.MINUTE, 0);
    calendar.add(Calendar.SECOND, 0);
    calendar.add(Calendar.MILLISECOND, 0);
    return calendar.getTime();
  }
}
