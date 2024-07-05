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
    ('Dubai', 'Dubai', 'Emiratos Árabes Unidos', 'Ciudad conocida por sus rascacielos y el Burj Khalifa'),
    ('Bucaramanga', 'Santander', 'Colombia', 'Ciudad de los parques');


-- Inserción de datos en la tabla DOCUMENTOS
INSERT INTO DOCUMENTOS (TIPO, NUMERO, DESCRIPCION)
VALUES
    ('DNI', '12345678A', 'Documento Nacional de Identidad'),
    ('Pasaporte', 'A112314567', 'Pasaporte'),
    ('Pasaporte', 'A112315467', 'Pasaporte'),
    ('Pasaporte', 'A197634567', 'Pasaporte'),
    ('Pasaporte', 'A121345111', 'Pasaporte'),
    ('Pasaporte', 'A126685167', 'Pasaporte'),
    ('Pasaporte', 'A141533567', 'Pasaporte'),
    ('Pasaporte', 'A131133567', 'Pasaporte'),
    ('Pasaporte', 'A161536567', 'Pasaporte'),
    ('Pasaporte', 'A122134567', 'Pasaporte'),
    ('Pasaporte', 'A199234567', 'Pasaporte'),
    ('Pasaporte', 'A221234567', 'Pasaporte'),
    ('CE', '23456789B', 'Cédula de Extranjería');



-- Inserción de datos en la tabla PERSONAS
INSERT INTO PERSONAS (NOMBRE, APELLIDO, ID_DOCUMENTO, ID_CIUDAD, FECHA_NACIMIENTO, EMAIL, TELEFONO, USERNAME, PASSWORD)
VALUES
    ('Juan', 'Pérez', 1, 1, '1990-01-01', 'juan.perez@example.com', '123456789', 'jperez', 'Pass:123'),
    ('María', 'López', 2, 2, '1985-05-15', 'maria.lopez@example.com', '987654321', 'mlopez', 'Pass:456'),
    ('Carlos', 'García', 3, 3, '1995-09-30', 'carlos.garcia@example.com', '567123890', 'cgarcia', 'Pass:789'),
    ('Ana', 'Martínez', 4, 4, '1988-07-20', 'ana.martinez@example.com', '456789012', 'amartinez', 'Pass:abc1'),
    ('Luis', 'Rodríguez', 5, 5, '1980-03-12', 'luis.rodriguez@example.com', '654321098', 'lrodriguez', 'Pass:def2'),
    ('Elena', 'Fernández', 6, 6, '1992-11-05', 'elena.fernandez@example.com', '789012345', 'efernandez', 'Pass:ghi3'),
    ('Ahmed', 'Ali', 7, 7, '1987-04-18', 'ahmed.ali@example.com', '890123456', 'aali', 'Pass:jkl4'),
    ('Sophie', 'Dubois', 8, 8, '1983-08-25', 'sophie.dubois@example.com', '234567890', 'sdubois', 'Pass:mno4'),
    ('Hiroshi', 'Tanaka', 9, 9, '1993-12-10', 'hiroshi.tanaka@example.com', '543210987', 'htanaka', 'Pass:pqr5'),
    ('Isabella', 'Silva', 10, 10, '1986-06-30', 'isabella.silva@example.com', '678901234', 'isilva', 'Pass:stu5'),
    ('Maximilian', 'Schulz', 11, 11, '1982-02-08', 'maximilian.schulz@example.com', '321098765', 'mschulz', 'Pass:vwx2'),
    ('Yuki', 'Sato', 12, 12, '1991-10-15', 'yuki.sato@example.com', '876543210', 'ysato', 'Pass:yz4'),
    ('Jhon', 'Dairo', 13, 13, '1991-10-15', 'jhon.calderon@example.com', '876543210', 'jcalderon', 'Pass:yz9');