# FSAD Skill Exam — Spring Boot Application

A minimal Spring Boot web application created for the FSAD skill examination.

## Current functionality

The application currently exposes one HTTP endpoint:

| Method | Route | Behaviour |
|---|---|---|
| GET | `/` | Returns a welcome message |

The endpoint is implemented in `HomeController.java`. The application entry point is `Application.java`.

## Technology

- Java 17
- Spring Boot 4.0.3
- Spring MVC
- Maven
- MySQL JDBC driver is included in the Maven dependencies

> **Authentication status:** This repository currently does not implement user login, registration, Spring Security, JWT, OAuth, access tokens, or refresh tokens. The root endpoint is a public welcome endpoint. The MySQL driver dependency alone does not establish a database connection or an authentication system.

## Project location

The Spring Boot project is inside:

```text
2400031106-FSAD-SKILL-EXAM-main/
└── 2400031106-FSAD-ENDSEMSKILLEXAM/
    ├── pom.xml
    └── src/
        └── main/
            ├── java/com/klu/__FSAD_SKILL_EXAM_main/
            │   ├── Application.java
            │   └── HomeController.java
            └── resources/
                └── application.properties
```

## Run locally

**Requirements:** JDK 17+ and Maven (or use the included Maven wrapper).

From the Spring Boot project directory:

```bash
./mvnw spring-boot:run
```

On Windows:

```bat
mvnw.cmd spring-boot:run
```

The configured port is **8081**. Visit:

```text
http://localhost:8081/
```

Expected response:

```text
Welcome to FSAD Skill Exam Application!
```

## Notes

- The application name and port are configured in `src/main/resources/application.properties`.
- No database credentials are committed in the checked-in configuration.
- The generated Maven `target/` directory is build output, not source code.
