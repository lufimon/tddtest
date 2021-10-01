package th.co.cdgs.mobile.tddtest.employee

import org.springframework.stereotype.Service

@Service
class EmployeeService {
    fun get(id: Int): EmployeeResponse? {
        return EmployeeResponse(id,"tanuphong")
    }
}
