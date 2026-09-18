# Software Company Rental Platform

Proyecto de laboratorio para la asignatura Ingeniería del Software II (curso 2026-2027).

## Descripción

Desarrollo de una plataforma de alquiler de viviendas inspirada en sistemas como Airbnb, siguiendo un proceso iterativo e incremental de ingeniería del software.

El proyecto se desarrolla como parte del laboratorio de Ingeniería del Software II, aplicando técnicas de gestión de proyectos, control de versiones, trazabilidad, pruebas, calidad de software y uso supervisado de inteligencia artificial.

## Equipo

### Empresa

Software Company

### Integrantes

- Pablo Ahijón Hormigos
- Irene Caraballo Jerez
- Anaís Chiquito Patiño
- Hugo Fernández Blanco

### Portavoz

- Anaís Chiquito Patiño

### Responsabilidades iniciales

- Pablo Ahijón Hormigos
  - Gestión de configuración
  - Coordinación y seguimiento del proyecto

- Irene Caraballo Jerez
  - Pruebas y verificación
  - Seguimiento de criterios de aceptación
 
- Anaís Chiquito Patiño
  - Portavoz del equipo
  - Repositorio y control de versiones

- Hugo Fernández Blanco
  - Gestión del producto
  - Requisitos y backlog

> Estas responsabilidades son iniciales y podrán modificarse durante el desarrollo del proyecto.

## Objetivo

Desarrollar una plataforma que permita:

- Registro de usuarios.
- Publicación de inmuebles.
- Gestión de disponibilidad.
- Búsqueda de alojamientos.
- Creación y gestión de reservas.
- Simulación de pagos.

## Metodología de trabajo

El proyecto seguirá un proceso iterativo e incremental basado en:

- Product Backlog.
- Historias de usuario.
- Issues de GitHub.
- Iteraciones planificadas.
- Revisión de cambios mediante Pull Requests.
- Uso supervisado de herramientas de IA.

## Documentación

- README.md
- AGENTS.md
- AI_USAGE.md

## Estado del proyecto
### Sprint 0 - Preparación y planificación

Completado:

- Creación del repositorio GitHub.
- Creación del Project Board.
- Definición del Product Backlog.
- Creación de historias de usuario.
- Configuración inicial del proyecto.
- Creación de la documentación base.
- Generación del proyecto Maven/Spring Boot.
- Configuración de la estructura base del proyecto.
- Creación de la primera página de prueba.

## Documentación del proyecto

La documentación viva del proyecto se mantiene en:

- docs/technical/: base técnica y dependencias.
- docs/diagrams/: diagramas UML y modelos.
- docs/decisions/: decisiones técnicas relevantes.

## Tecnologías utilizadas

- Java 17
- Maven
- Spring Boot
- Spring Data JPA
- JUnit
- GitHub

## Dependencias principales

### Spring Web

Permite desarrollar aplicaciones web utilizando Spring MVC, controladores y gestión de peticiones HTTP.

### Thymeleaf

Motor de plantillas utilizado para generar vistas HTML.

## Construcción y ejecución

### Requisitos

- Java 17

### Limpiar el proyecto

```powershell
.\mvnw.cmd clean
``