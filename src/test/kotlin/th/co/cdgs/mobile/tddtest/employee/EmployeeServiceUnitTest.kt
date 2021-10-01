package th.co.cdgs.mobile.tddtest.employee

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import java.util.*

@ExtendWith(MockitoExtension::class)
class EmployeeServiceUnitTest {

    @Mock
    private lateinit var employeeRepository: EmployeeRepository

    @Test
    fun get(){
        // Arrange
        val demo = Employee(99, "Mock with unit test")
        `when`(employeeRepository.findById(99)).thenReturn(Optional.of(demo))
        val service = EmployeeService(employeeRepository)
        // Act
        val result = service.get(99)
        //Assert
        assertEquals(99, result?.id)
        assertEquals("Mock with unit test", result?.name)
    }
}
