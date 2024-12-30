<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Foro Hub API</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            background-color: #f9f9f9;
            color: #333;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: auto;
            padding: 20px;
            background: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1, h2 {
            color: #444;
        }
        .emoji {
            font-size: 1.2em;
        }
        img {
            max-width: 100%;
            height: auto;
            display: block;
            margin: 10px 0;
        }
        .code-block {
            background: #f4f4f4;
            padding: 10px;
            border-left: 3px solid #3498db;
            margin: 20px 0;
            overflow-x: auto;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>📚 Foro Hub API</h1>
        <p>Foro Hub es un proyecto que proporciona una <strong>API REST</strong> para gestionar dudas y discusiones relacionadas con cursos realizados por estudiantes. El principal enfoque de esta API son los <em>tópicos</em>, ofreciendo funcionalidades CRUD completas.</p>

        <h2>✨ Objetivos del Proyecto</h2>
        <ul>
            <li>Crear una API REST utilizando <strong>Spring Boot</strong>.</li>
            <li>Implementar funcionalidades CRUD para los tópicos:
                <ul>
                    <li>➕ Crear un nuevo tópico.</li>
                    <li>📋 Listar todos los tópicos creados.</li>
                    <li>🔍 Consultar un tópico específico.</li>
                    <li>✏️ Actualizar un tópico.</li>
                    <li>❌ Eliminar un tópico (delete lógico).</li>
                </ul>
            </li>
            <li>Desarrollar con las mejores prácticas de arquitectura REST y seguridad.</li>
        </ul>

        <h2>📌 Estado Actual del Proyecto</h2>
        <h3>Funcionalidades completas:</h3>
        <ul>
            <li><strong>CRUD de tópicos:</strong>
                <ul>
                    <li>✅ Crear, listar, consultar, actualizar y eliminar tópicos.</li>
                    <li>🔁 Paginación de los tópicos con orden descendente por fecha.</li>
                    <li>👤 El campo <code>autor</code> (usuario logueado) se agrega automáticamente al crear un tópico.</li>
                </ul>
            </li>
            <li><strong>Autenticación y autorización:</strong>
                <ul>
                    <li>🔒 Seguridad configurada con <strong>JWT</strong>.</li>
                    <li>👥 Solo usuarios autenticados con un token válido pueden acceder a los métodos.</li>
                </ul>
            </li>
            <li><strong>Validaciones:</strong>
                <ul>
                    <li>✔️ Regla: No se puede crear un tópico con el mismo título por el mismo autor.</li>
                </ul>
            </li>
            <li><strong>Integración con:</strong>
                <ul>
                    <li>🛠️ Swagger UI para documentación interactiva.</li>
                    <li>🛠️ MySQL como base de datos.</li>
                    <li>🛠️ Insomnia para pruebas de endpoints.</li>
                </ul>
            </li>
        </ul>

        <h3>Por implementar:</h3>
        <ul>
            <li>CRUD para los <strong>usuarios</strong>.</li>
            <li>Agregar más validaciones específicas según reglas de negocio.</li>
        </ul>

        <h2>🚀 Guía de Uso</h2>
        <h3>1️⃣ Base de Datos</h3>
        <p>Configura y ejecuta la base de datos en <strong>MySQL</strong>.</p>
        <div class="code-block">
            Script de migración: Utiliza Flyway para crear las tablas <code>usuarios</code> y <code>topicos</code>.
        </div>
        <img src="https://github.com/user-attachments/assets/199868d5-2da1-4a9d-8951-e17fad0c3909" alt="MySQL Configuration">

        <h3>2️⃣ Pruebas de la API</h3>
        <p>Puedes probar los endpoints utilizando <strong>Insomnia</strong>:</p>
        <img src="https://github.com/user-attachments/assets/d619f805-f917-4801-baae-b9b2b2ab24c4" alt="Pruebas con Insomnia">

        <h3>3️⃣ Documentación Interactiva</h3>
        <p>Accede a la documentación <strong>Swagger UI</strong> en tu navegador.</p>
        <p><strong>Ruta:</strong> <code>/swagger-ui.html</code></p>
        <img src="https://github.com/user-attachments/assets/67e9241c-2e24-4df1-a604-544ddddda2df" alt="Swagger UI">
        <img src="https://github.com/user-attachments/assets/e5b0baa4-7509-4fb3-8a9c-544ce988e6a7" alt="Swagger UI Example">
        <img src="https://github.com/user-attachments/assets/fc19c2c0-362b-4470-8bd4-9d57dd1b0112" alt="Swagger UI Example">

        <h2>🛠️ Tecnologías Utilizadas</h2>
        <ul>
            <li>Java con Spring Boot.</li>
            <li>MySQL para la persistencia de datos.</li>
            <li>JWT para autenticación y seguridad.</li>
            <li>Flyway para migraciones de la base de datos.</li>
            <li>Swagger UI para documentación.</li>
        </ul>
    </div>
</body>
</html>
