La rama `main` está configurada para trabajar con una base de datos PostgreSQL.
Si se quiere ejecutar, deberá configurar la conexión y el esquema correspondiente.

La rama `test` cambia algunas configuraciones y usa una base de datos en memoria (H2) para crear una imagen de docker.

Para ejecutar el back podrá descargar el archivo `docker-compose.yml` y ejecutar el siguiente comando en la carpeta
donde se encuentre el archivo:

   ```bash
    docker-compose up
   ```

o desde la consola de docker:

   ```bash
    docker run -p 8080:8080 calderonJh/tallerweb:latest
   ```

Si se logra levantar correctamente, podrá acceder a:

Documentación API: http://localhost:8080/swagger-ui.html

Visualización base de datos: http://localhost:8080/h2-console

    Usuario: sa

    Password: test