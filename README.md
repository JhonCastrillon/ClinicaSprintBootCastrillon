# ClinicaSpringBootCastrillon

![Spring Boot](https://img.shields.io/badge/Spring-Boot-green?logo=spring)
![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![MySQL](https://img.shields.io/badge/MySQL-8.0-orange?logo=mysql)

## 🏥 Descripción
ClinicaSpringBootCastrillon es una aplicación web desarrollada con **Spring Boot** para la gestión de pacientes, médicos e historias clínicas en una clínica.  
Permite almacenar información sobre pacientes, médicos, tarjetas profesionales y el historial clínico de cada paciente.

---

## ⚙️ Tecnologías utilizadas
- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA**
- **Hibernate**
- **MySQL 8**
- **Maven** (gestión de dependencias)
- **Tomcat embebido** (para ejecutar la aplicación)
- **Spring Boot DevTools** (para desarrollo más rápido)

---

## 🗂 Estructura del proyecto

src/
└─ main/
├─ java/com/example/clinica/
│ ├─ modelos/ # Clases de entidades JPA
│ ├─ repositorios/ # Repositorios Spring Data JPA
│ ├─ servicios/ # Lógica de negocio
│ └─ controllers/ # Controladores REST
└─ resources/
├─ application.properties
└─ static/ # Archivos estáticos (CSS, JS)


---

## 🛠 Configuración de la base de datos
Archivo `application.properties` ejemplo:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ClinicaSpringBootCastrillon
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect


⚠️ Asegúrate de tener MySQL corriendo y la base de datos creada o habilita spring.jpa.hibernate.ddl-auto=create para que Hibernate la cree automáticamente.

🚀 Cómo ejecutar el proyecto

Clonar el repositorio:

git clone https://github.com/TU_USUARIO/ClinicaSpringBootCastrillon.git


Entrar al proyecto:

cd ClinicaSpringBootCastrillon


Construir el proyecto con Maven:

mvn clean install


Ejecutar la aplicación:

mvn spring-boot:run


Abrir en el navegador:

http://localhost:8080

📦 Funcionalidades

CRUD de pacientes, médicos y tarjetas profesionales.

Registro de historias clínicas.

Gestión de datos con MySQL y Hibernate.

API REST para integraciones futuras.

📌 Buenas prácticas

Las clases de entidades usan JPA con @Entity, @Table y @Column.

Relaciones manejadas con @OneToOne y @ManyToOne según corresponda.

Uso de spring.jpa.show-sql para debug de consultas SQL.

💡 Próximos pasos

Crear controladores REST para exponer la API.

Implementar validaciones y manejo de errores.

Agregar seguridad con Spring Security.

Documentar la API con Swagger.

📄 Licencia

Este proyecto es open-source bajo licencia MIT.

## 👤 Autor
**Jhon Castrillon**  
- GitHub: https://github.com/JhonCastrillon/ClinicaSprintBootCastrillon/tree/main
- Email: jhoncastrillon@globant.com
- Colombia
