-- Inserción de datos en la tabla CIUDADES
INSERT INTO CIUDADES (NOMBRE, ESTADO, PAIS, DESCRIPCION)
VALUES
    ('Madrid', 'Comunidad de Madrid', 'España', 'Capital de España'),
    ('Barcelona', 'Cataluña', 'España', 'Ciudad conocida por su arte y arquitectura'),
    ('Valencia', 'Comunidad Valenciana', 'España', 'Famosa por la Ciudad de las Artes y las Ciencias'),
    ('Paris', 'Paris', 'Francia', 'Capital de Francia y conocida por la Torre Eiffel'),
    ('Roma', 'Roma', 'Italia', 'Capital de Italia y hogar del Coliseo Romano'),
    ('Londres', 'Londres', 'Reino Unido', 'Capital del Reino Unido y famosa por el Big Ben'),
    ('Nueva York', 'Nueva York', 'Estados Unidos', 'Ciudad más grande de Estados Unidos y centro cultural'),
    ('Tokio', 'Tokio', 'Japón', 'Capital de Japón y una de las ciudades más pobladas del mundo'),
    ('Sídney', 'Nueva Gales del Sur', 'Australia', 'Ciudad icónica de Australia con el Ópera House'),
    ('Ciudad de México', 'Ciudad de México', 'México', 'Capital de México y rica en historia y cultura'),
    ('Rio de Janeiro', 'Rio de Janeiro', 'Brasil', 'Famosa por sus playas y el Cristo Redentor'),
    ('Dubai', 'Dubai', 'Emiratos Árabes Unidos', 'Ciudad conocida por sus rascacielos y el Burj Khalifa');


-- Inserción de datos en la tabla DOCUMENTOS
INSERT INTO DOCUMENTOS (TIPO, NUMERO, DESCRIPCION)
VALUES
    ('DNI', '12345678A', 'Documento Nacional de Identidad'),
    ('Pasaporte', 'A1234567', 'Pasaporte Español'),
    ('CE', '23456789B', 'Cédula de Extranjería');



-- Inserción de datos en la tabla PERSONAS
INSERT INTO PERSONAS (NOMBRE, APELLIDO, ID_DOCUMENTO, ID_CIUDAD, FECHA_NACIMIENTO, EMAIL, TELEFONO, USERNAME, PASSWORD)
VALUES
    ('Juan', 'Pérez', 1, 1, '1990-01-01', 'juan.perez@example.com', '123456789', 'jperez', 'password123'),
    ('María', 'López', 2, 2, '1985-05-15', 'maria.lopez@example.com', '987654321', 'mlopez', 'password456'),
    ('Carlos', 'García', 3, 3, '1995-09-30', 'carlos.garcia@example.com', '567123890', 'cgarcia', 'password789'),
    ('Ana', 'Martínez', 1, 4, '1988-07-20', 'ana.martinez@example.com', '456789012', 'amartinez', 'passwordabc'),
    ('Luis', 'Rodríguez', 2, 5, '1980-03-12', 'luis.rodriguez@example.com', '654321098', 'lrodriguez', 'passworddef'),
    ('Elena', 'Fernández', 3, 6, '1992-11-05', 'elena.fernandez@example.com', '789012345', 'efernandez', 'passwordghi'),
    ('Ahmed', 'Ali', 1, 7, '1987-04-18', 'ahmed.ali@example.com', '890123456', 'aali', 'passwordjkl'),
    ('Sophie', 'Dubois', 2, 8, '1983-08-25', 'sophie.dubois@example.com', '234567890', 'sdubois', 'passwordmno'),
    ('Hiroshi', 'Tanaka', 3, 9, '1993-12-10', 'hiroshi.tanaka@example.com', '543210987', 'htanaka', 'passwordpqr'),
    ('Isabella', 'Silva', 1, 10, '1986-06-30', 'isabella.silva@example.com', '678901234', 'isilva', 'passwordstu'),
    ('Maximilian', 'Schulz', 2, 11, '1982-02-08', 'maximilian.schulz@example.com', '321098765', 'mschulz', 'passwordvwx'),
    ('Yuki', 'Sato', 3, 12, '1991-10-15', 'yuki.sato@example.com', '876543210', 'ysato', 'passwordyz'),
    ('Jhon', 'Dairo', 3, 12, '1991-10-15', 'jhon.calderon@example.com', '876543210', 'jcalderon', 'passwordyz');