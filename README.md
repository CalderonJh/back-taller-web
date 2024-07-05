La rama `main` está configurada para trabajar con una base de datos PostgreSQL.
Si se quiere ejecutar, deberá configurar la conexión y el esquema correspondiente.

La rama `test` cambia algunas configuraciones y usa una base de datos en memoria (H2) para crear una imagen de docker.

Podrá ejecutar el back con docker con el comando:

   ```bash
    docker run -p 8080:8080 calderonjh/tallerweb
   ```

Si se logra levantar correctamente, podrá acceder a:

Documentación API: http://localhost:8080/swagger-ui.html

Visualización base de datos: http://localhost:8080/h2-console

    Usuario: sa

    Password: test
    
    JDBC URL: jdbc:h2:mem:testdb