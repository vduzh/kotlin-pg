# kotlin-pg

Kotlin playground — изучение языка через unit-тесты.

## Требования

- JDK 25+

## Сборка и тесты

```bash
./gradlew build     # компиляция + тесты
./gradlew test      # только тесты
```

## Структура

```
src/test/kotlin/by/duzh/pg/kotlin/
├── BasicTest.kt          # val/var, string templates, ranges, nullable
├── ...                    # по классу на каждую фичу
```

## Стек

- Kotlin 2.1.10
- JUnit 5 via `kotlin.test`
- AssertJ
- Gradle (Kotlin DSL)
