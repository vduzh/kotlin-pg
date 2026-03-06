# kotlin-pg

Kotlin learning project — exploring language features through unit tests.

## Build & Test

```bash
./gradlew build     # compile + test
./gradlew test      # run tests only
```

## Structure

- Package: `by.duzh.pg.kotlin`
- Tests: `src/test/kotlin/by/duzh/pg/kotlin/`
- Each Kotlin feature gets its own test class

## Conventions

- JDK 25, Kotlin 2.1.10
- Test framework: JUnit 5 via `kotlin.test` + AssertJ
- Tests are the primary way to explore Kotlin features
