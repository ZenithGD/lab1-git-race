package es.unizar.webeng.hello

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class IntegrationTest {
    @LocalServerPort
    private var port: Int = 0

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    fun testHome() {
        with(restTemplate.getForEntity("http://localhost:$port", String::class.java)) {
            assertThat(statusCode).isEqualTo(HttpStatus.OK)
            assertThat(body).contains("<title>Hello")
        }
    }

    @Test
    fun testCss() {
        with(restTemplate.getForEntity("http://localhost:$port/webjars/bootstrap/5.1.0/css/bootstrap.min.css", String::class.java)) {
            assertThat(statusCode).isEqualTo(HttpStatus.OK)
            assertThat(body).contains("body")
            assertThat(headers.contentType).isEqualTo(MediaType.valueOf("text/css"))
        }
    }
}