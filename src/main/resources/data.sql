-- Inserción de datos en la tabla CIUDADES
INSERT INTO CIUDADES (ID, NOMBRE, ESTADO, PAIS, DESCRIPCION)
VALUES
    (1, 'Madrid', 'Comunidad de Madrid', 'España', 'Capital de España'),
    (2, 'Barcelona', 'Cataluña', 'España', 'Ciudad conocida por su arte y arquitectura'),
    (3, 'Valencia', 'Comunidad Valenciana', 'España', 'Famosa por la Ciudad de las Artes y las Ciencias');

-- Inserción de datos en la tabla DOCUMENTOS
INSERT INTO DOCUMENTOS (ID, TIPO, NUMERO, DESCRIPCION)
VALUES
    (1, 'DNI', '12345678A', 'Documento Nacional de Identidad'),
    (2, 'Pasaporte', 'A1234567', 'Pasaporte Español'),
    (3, 'NIE', 'X1234567T', 'Número de Identidad de Extranjero');

-- Inserción de datos en la tabla PERSONAS
INSERT INTO PERSONAS (ID, NOMBRE, APELLIDO, ID_DOCUMENTO, ID_CIUDAD, FECHA_NACIMIENTO, EMAIL, TELEFONO, USERNAME, PASSWORD)
VALUES
    (1, 'Juan', 'Pérez', 1, 1, '1990-01-01', 'juan.perez@example.com', '123456789', 'jperez', 'password123'),
    (2, 'María', 'López', 2, 2, '1985-05-15', 'maria.lopez@example.com', '987654321', 'mlopez', 'password456'),
    (3, 'Carlos', 'García', 3, 3, '1995-09-30', 'carlos.garcia@example.com', '567123890', 'cgarcia', 'password789');
