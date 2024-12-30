
📚 Foro Hub API
Foro Hub es un proyecto que proporciona una API REST para gestionar dudas y discusiones relacionadas con cursos realizados por estudiantes. El principal enfoque de esta API son los tópicos, ofreciendo funcionalidades CRUD completas.

✨ Objetivos del Proyecto
Crear una API REST utilizando Spring Boot.
Implementar funcionalidades CRUD para los tópicos:
➕ Crear un nuevo tópico.
📋 Listar todos los tópicos creados.
🔍 Consultar un tópico específico.
✏️ Actualizar un tópico.
❌ Eliminar un tópico (delete lógico).
Desarrollar con las mejores prácticas de arquitectura REST y seguridad.

📌 Estado Actual del Proyecto
Funcionalidades completas:
CRUD de tópicos:
✅ Crear, listar, consultar, actualizar y eliminar tópicos.
🔁 Paginación de los tópicos con orden descendente por fecha.
👤 El campo autor (usuario logueado) se agrega automáticamente al crear un tópico.
Autenticación y autorización:
🔒 Seguridad configurada con JWT.
👥 Solo usuarios autenticados con un token válido pueden acceder a los métodos.
Validaciones:
✔️ Regla: No se puede crear un tópico con el mismo título por el mismo autor.
Integración con:
🛠️ Swagger UI para documentación interactiva.
🛠️ MySQL como base de datos.
🛠️ Insomnia para pruebas de endpoints.

Por implementar:
CRUD para los usuarios.
Agregar más validaciones específicas según reglas de negocio.
🚀 Guía de Uso
1️⃣ Base de Datos
Configura y ejecuta la base de datos en MySQL.

Script de migración: Utiliza Flyway para crear las tablas usuarios y topicos.

![image](https://github.com/user-attachments/assets/199868d5-2da1-4a9d-8951-e17fad0c3909)


2️⃣ Pruebas de la API
Puedes probar los endpoints utilizando Insomnia:

![image](https://github.com/user-attachments/assets/d619f805-f917-4801-baae-b9b2b2ab24c4)


3️⃣ Documentación Interactiva
Accede a la documentación Swagger UI en tu navegador.

Ruta: /swagger-ui.html

![Captura de pantalla 2024-12-30 163304](https://github.com/user-attachments/assets/67e9241c-2e24-4df1-a604-544ddddda2df)

![Captura de pantalla 2024-12-30 165604](https://github.com/user-attachments/assets/e5b0baa4-7509-4fb3-8a9c-544ce988e6a7)

![Captura de pantalla 2024-12-30 165752](https://github.com/user-attachments/assets/fc19c2c0-362b-4470-8bd4-9d57dd1b0112)


🛠️ Tecnologías Utilizadas
Java con Spring Boot.
MySQL para la persistencia de datos.
JWT para autenticación y seguridad.
Flyway para migraciones de la base de datos.
Swagger UI para documentación.
📝 Reflexión
"Gracias a la buena documentación interna, he podido retomar el proyecto en puntos clave, facilitando el desarrollo y evitando contratiempos."




