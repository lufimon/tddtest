package th.co.cdgs.mobile.tddtest.employee

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController {

    @Autowired
    private lateinit var employeeService: EmployeeService

    @GetMapping("/employee/{id}")
    fun getById(@PathVariable id: Int): EmployeeResponse? {
        return employeeService.get(id)
    }

    @GetMapping("/employee")
    fun getAll(): MutableList<EmployeeResponse>? {
        return mutableListOf(
            EmployeeResponse(1,"tanuphong"),
            EmployeeResponse(2,"tam")
        )
    }
}
