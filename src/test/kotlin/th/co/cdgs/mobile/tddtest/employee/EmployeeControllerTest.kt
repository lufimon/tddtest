package th.co.cdgs.mobile.tddtest.employee

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    fun getById() {
        // Act
        val result = restTemplate.getForObject("/employee/1", EmployeeResponse::class.java)
        // Assert
        assertEquals("tanuphong", result.name)
    }
}
