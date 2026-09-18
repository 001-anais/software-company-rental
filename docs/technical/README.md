# Base técnica

Este documento recoge las decisiones técnicas relacionadas con la configuración base del proyecto y sirve como referencia para cualquier integrante del equipo.

---

# Objetivo

Disponer de una base técnica reproducible y comprensible para el desarrollo de la plataforma de alquiler de viviendas.

La configuración actual permite:

- Compilar el proyecto.
- Ejecutar pruebas.
- Verificar la aplicación.
- Ejecutar una instancia local de Spring Boot.
- Mantener una estructura estándar para el desarrollo futuro.

---

# Tecnologías utilizadas

- Java 17
- Maven
- Spring Boot
- Spring Web
- Thymeleaf
- JUnit
- Git
- GitHub

---

# Arquitectura actual

Actualmente el proyecto sigue una arquitectura por capas:

```text
Controller -> Service -> Repository -> Persistence
```

Actualmente solo existe la capa Controller mediante la clase HomeController. Las capas Service y Repository se incorporarán progresivamente durante el desarrollo de las funcionalidades del sistema.