CREATE TABLE topicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha DATETIME NOT NULL,
    estado ENUM('ACTIVO','INACTIVO') NOT NULL,
    autor VARCHAR(255) NOT NULL,
    curso VARCHAR(255) NOT NULL,
    activo BOOLEAN NOT NULL,
    id_usuario BIGINT,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);