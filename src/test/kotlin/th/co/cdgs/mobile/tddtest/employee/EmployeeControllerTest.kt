package th.co.cdgs.mobile.tddtest.employee

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    fun getById() {
        // Act
        val result = restTemplate.getForObject("/employee/1", EmployeeResponse::class.java)
        // Assert
        assertEquals(1, result.id)
        assertEquals("tanuphong", result.name)
    }

    @Test
    fun getAll() {
        val results = restTemplate.getForObject<MutableList<EmployeeResponse>>("/employee")
        assertEquals(2, results?.size)
    }
}
