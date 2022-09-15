package es.unizar.webeng.hello.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class HelloControllerUnitTests {
    private lateinit var controller: HelloController
    @BeforeEach
    fun setup() {
        controller = HelloController()
    }
    @Test
    fun testMessage() {
        val map = mutableMapOf<String,Any>()
        val view = controller.welcome(map)
        assertThat(view).isEqualTo("welcome")
        assertThat(map.containsKey("message")).isTrue
        assertThat(map["message"]).isEqualTo("Hello World")
    }
}
