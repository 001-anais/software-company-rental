# Project Instructions

## Project Context

This repository contains a university software engineering project for a housing rental platform.

The system allows:

- User registration.
- Property publication.
- Availability management.
- Accommodation search.
- Reservation management.
- Payment simulation.

The agent must only work with requirements explicitly defined in the project documentation and GitHub issues.

## Technology Stack

- Java
- Maven
- Spring Boot
- Spring Data JPA
- JUnit

## Architecture

Use a layered architecture:

Controller → Service → Repository → Persistence

Guidelines:

- Business logic must not be placed in controllers.
- Data access must be handled through repositories.
- Code should be modular and maintainable.
- Follow good object-oriented design practices.

## Development Process

Before implementing a task:

1. Read the related issue and its acceptance criteria.
2. Inspect the current repository structure.
3. Propose an implementation plan.
4. Identify affected components.
5. Identify risks and assumptions.
6. Wait for human review before implementation.

After implementation:

1. Build the project.
2. Execute relevant tests.
3. Explain the changes performed.
4. Report any unresolved problems.
5. Report any assumptions made.

## Restrictions

- Do not invent requirements.
- Do not silently modify the architecture.
- Do not remove tests to make the build pass.
- Do not approve or merge your own changes.
- Do not modify unrelated functionality.
- Do not generate fake test results.

## Quality Expectations

- Clear and readable code.
- Meaningful names for classes and methods.
- Minimal duplication.
- Traceability between issues and implemented code.
- Compliance with acceptance criteria.
