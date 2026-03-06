package by.duzh.pg.kotlin

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class BasicTest {

    @Test
    fun `val is immutable`() {
        val name = "Kotlin"
        // name = "Java" // compilation error: Val cannot be reassigned
        assertThat(name).isEqualTo("Kotlin")
    }

    @Test
    fun `var is mutable`() {
        var count = 0
        count += 1
        assertThat(count).isEqualTo(1)
    }

    @Test
    fun `string templates`() {
        val language = "Kotlin"
        val version = 2
        val message = "$language version ${version}.x"
        assertThat(message).isEqualTo("Kotlin version 2.x")
    }

    @Test
    fun `ranges and loops`() {
        val numbers = mutableListOf<Int>()
        for (i in 1..5) {
            numbers.add(i)
        }
        assertThat(numbers).containsExactly(1, 2, 3, 4, 5)
    }

    @Test
    fun `nullable types`() {
        val nullable: String? = null
        val nonNull: String = "hello"

        assertThat(nullable).isNull()
        assertThat(nonNull.length).isEqualTo(5)
        assertThat(nullable?.length).isNull()
    }
}
