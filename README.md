# Spring Boot Simple Project

About Spring Boot base project architecture.

## Configuration

### Redis
```bash
docker pull redis:alpine
docker run --name demo_redis -p 6379:6379 -d redis:alpine
```

### MySQL
MYSQL_ROOT_PASSWORD = 1234$
```bash
docker pull mysql:8.0
docker run --name demo_mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234$ -d mysql:8.0 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci
```

### SonarQube
```bash
docker pull sonarqube:8-community
docker run -d --name demo_sonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:8-community
```

## Architecture
```
spring-boot-bestpracite
├── main
│   ├── java
│   │    └── com.example.baseproject
│   │       ├── common
│   │       │   ├── config
│   │       │   ├── filter
│   │       │   ├── mapper
│   │       │   ├── validation
│   │       │   ├── constant
│   │       │   └── util
│   │       │
│   │       ├── controller
│   │       │
│   │       ├── exceptions
│   │       │
│   │       ├── model
│   │       │   ├── bo
│   │       │   ├── entity
│   │       │   ├── request
│   │       │   └── response
│   │       │
│   │       ├── repository
│   │       │
│   │       ├── service
│   │       │   └── impl
│   │       │
│   │       └── Application.java
│   │ 
│   └── resources
│       ├── application.yml
│       └── log4j.yml
└── test
    └── ApplicationTests.java
```# spring-boot-base-project
