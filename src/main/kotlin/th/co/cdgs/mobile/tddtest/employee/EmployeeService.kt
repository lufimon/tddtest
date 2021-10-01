package th.co.cdgs.mobile.tddtest.employee

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeService(@Autowired private val employeeRepository: EmployeeRepository) {
    fun get(id: Int): EmployeeResponse? {
        val result = employeeRepository.findById(id)
        if(result.isPresent){
            return EmployeeResponse(id, result.get().name)
        }
        throw RuntimeException("Employee not found with id=$id")
    }
}
