package th.co.cdgs.mobile.tddtest.employee

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForObject
import java.util.*

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeController2Test {

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @MockBean
    private lateinit var employeeRepository: EmployeeRepository

    @Test
    fun getById2() {
        // Arrange
        val demo = Employee()
        demo.id = 100
        demo.name = "tanuphong2"
        `when`(employeeRepository.findById(100)).thenReturn(Optional.of(demo))
        // Act
        val result = restTemplate.getForObject("/employee/100", EmployeeResponse::class.java)
        // Assert
        assertEquals(100, result.id)
        assertEquals("tanuphong2", result.name)
    }

    @Test
    fun getAll() {
        val results = restTemplate.getForObject<MutableList<EmployeeResponse>>("/employee")
        assertEquals(2, results?.size)
    }
}
