package th.co.cdgs.mobile.tddtest.employee

import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository: JpaRepository<Employee, Int> {
}
