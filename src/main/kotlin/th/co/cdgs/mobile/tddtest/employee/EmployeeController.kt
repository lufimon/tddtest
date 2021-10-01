package th.co.cdgs.mobile.tddtest.employee

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController {

    @GetMapping("/employee/{id}")
    fun getById(@PathVariable id: Int): EmployeeResponse? {
        return EmployeeResponse(
            id = id,
            name = "tanuphong"
        )
    }

    @GetMapping("/employee")
    fun getAll(): MutableList<EmployeeResponse>? {
        return mutableListOf(
            EmployeeResponse(
                id = 1,
                name = "tanuphong"
            ),
            EmployeeResponse(
                id = 2,
                name = "tam"
            )
        )
    }
}
