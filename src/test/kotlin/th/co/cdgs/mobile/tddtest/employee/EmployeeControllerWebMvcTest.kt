package th.co.cdgs.mobile.tddtest.employee

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(EmployeeController::class)
class EmployeeControllerWebMvcTest {

    @Autowired
    private lateinit var mvc: MockMvc

    @Test
    fun getById() {
        val mvcResult = mvc.perform(get("/employee/1")).andExpect(status().isOk).andReturn()
        val mapper = ObjectMapper()
        val result = mapper.readValue(mvcResult.response.contentAsByteArray, EmployeeResponse::class.java)
        assertEquals(1, result.id)
        assertEquals("tanuphong", result.name)
    }
}
