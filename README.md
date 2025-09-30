# ktor-JWT-auth-API

    Minimal Ktor backend to practice Ktor + RxJava + Dagger + kotlinx.serialization, JWT auth, and unit testing.

    Created with the Ktor Project Generator (https://start.ktor.io) — imported into Android Studio.

## Features

    DI: Dagger 2
    Async: RxJava 3
    Serialization: kotlinx.serialization (JSON)
    Auth: JWT (com.auth0/java-jwt via Ktor auth-jwt)
    Tests: JUnit 5 + ktor-server-tests + MockK

## Building & Running

    Run locally (dev): ./gradlew run
    Build (tests + jar): ./gradlew clean build
    Create fat JAR (recommended for deployment): ./gradlew shadowJar
    Run artifact: java -jar build/libs/<your-fat-jar>.jar

## Continuous Integration

    This repository includes a GitHub Actions workflow at .github/workflows/ci.yml that:

    builds the project
    runs tests
    creates and uploads a fat JAR artifact

## Progress
    Part 1: Skeleton + gradle setup: [✔]
    Part 2: Cryptographic hashing setup: [X]