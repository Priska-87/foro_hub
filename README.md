# 📚 Foro Hub API

_Foro Hub es un proyecto que proporciona una API REST para gestionar dudas y discusiones relacionadas con cursos realizados por estudiantes. El principal enfoque de esta API son los **tópicos**, ofreciendo funcionalidades CRUD completas._

---

## ✨ **Objetivos del Proyecto**
- Crear una API REST utilizando **Spring Boot**.
- Implementar funcionalidades CRUD para los tópicos:
  - ➕ Crear un nuevo tópico.
  - 📋 Listar todos los tópicos creados.
  - 🔍 Consultar un tópico específico.
  - ✏️ Actualizar un tópico.
  - ❌ Eliminar un tópico (delete lógico).
- Desarrollar con las mejores prácticas de arquitectura REST y seguridad.

---

## 📌 **Estado Actual del Proyecto**
### Funcionalidades completas:
- **CRUD de tópicos**:
  - ✅ Crear, listar, consultar, actualizar y eliminar tópicos.
  - 🔁 Paginación de los tópicos con orden descendente por fecha.
  - 👤 El campo `autor` (usuario logueado) se agrega automáticamente al crear un tópico.
- **Autenticación y autorización**:
  - 🔒 Seguridad configurada con **JWT**.
  - 👥 Solo usuarios autenticados con un token válido pueden acceder a los métodos.
- **Validaciones**:
  - ✔️ Regla: No se puede crear un tópico con el mismo título por el mismo autor.
- **Integraciones**:
  - 🛠️ Swagger UI para documentación interactiva.
  - 🛠️ MySQL como base de datos.
  - 🛠️ Insomnia para pruebas de endpoints.

### Por implementar:
- CRUD para los **usuarios**.
- Agregar más validaciones específicas según reglas de negocio.

---

## 🚀 **Guía de Uso**

### 1️⃣ Configuración de la Base de Datos
1. Configura y ejecuta la base de datos en **MySQL**.
2. Usa **Flyway** para migrar y crear las tablas necesarias:
   - `usuarios`
   - `topicos`

![MySQL Config](https://github.com/user-attachments/assets/199868d5-2da1-4a9d-8951-e17fad0c3909)

### 2️⃣ Pruebas de Endpoints
Utiliza **Insomnia** o cualquier herramienta de tu preferencia para probar los endpoints.

![Insomnia](https://github.com/user-attachments/assets/d619f805-f917-4801-baae-b9b2b2ab24c4)

### 3️⃣ Documentación Interactiva
Accede a la documentación Swagger UI en tu navegador:
- **Ruta:** `/swagger-ui.html`

![Swagger UI](https://github.com/user-attachments/assets/67e9241c-2e24-4df1-a604-544ddddda2df)
![Swagger Example](https://github.com/user-attachments/assets/e5b0baa4-7509-4fb3-8a9c-544ce988e6a7)

---

## 🛠️ **Tecnologías Utilizadas**
- **Java** con Spring Boot.
- **MySQL** para la persistencia de datos.
- **JWT** para autenticación y seguridad.
- **Flyway** para migraciones de la base de datos.
- **Swagger UI** para documentación interactiva.
- **Insomnia** para pruebas de API.

---

## 🛡️ **Seguridad**
- Implementación de autenticación y autorización mediante **JWT**.
- Acceso restringido a endpoints para usuarios autenticados.

---

## 📝 **Licencia**
Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.
