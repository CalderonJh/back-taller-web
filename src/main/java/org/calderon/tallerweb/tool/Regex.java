package org.calderon.tallerweb.tool;

import java.util.regex.Pattern;

public interface Regex {
  String EMAIL = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{1,}$";
  String PHONE = "^\\+?[0-9]{7,15}$";
  String USERNAME = "^[a-zA-Z0-9._-]{5,20}$";
  String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,}$";
  String DOCUMENT = "^[0-9a-zA-Z]{7,15}$";

  static boolean matches(String regex, String value) {
    Pattern pattern = Pattern.compile(regex);
    return pattern.matcher(value).matches();
  }
}
