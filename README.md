# kotlin-pg

Kotlin playground — learning the language through unit tests.

## Requirements

- JDK 25+

## Build & Test

```bash
./gradlew build     # compile + test
./gradlew test      # tests only
```

## Structure

```
src/test/kotlin/by/duzh/pg/kotlin/
├── BasicTest.kt          # val/var, string templates, ranges, nullable
├── ...                    # one class per feature
```

## Stack

- Kotlin 2.1.10
- JUnit 5 via `kotlin.test`
- AssertJ
- Gradle (Kotlin DSL)
