package th.co.cdgs.mobile.tddtest.employee

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private lateinit var employeeRepository: EmployeeRepository

    @Test
    fun case01() {
        // Arrange
        val demo = Employee()
        demo.name = "tanuphong"
        employeeRepository.save(demo)
        // Act
        val result = employeeRepository.findById(1)
        // Assert
        assertTrue(result.isPresent)
        assertEquals(1, result.get().id)
        assertEquals("tanuphong", result.get().name)
    }

    @Test
    fun case02() {
        // Act
        val result = employeeRepository.findById(1)
        // Assert
        assertFalse(result.isPresent)
    }
}
