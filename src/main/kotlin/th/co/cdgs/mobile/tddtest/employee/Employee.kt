package th.co.cdgs.mobile.tddtest.employee

import org.hibernate.Hibernate
import javax.persistence.*

@Entity(name = "employee")
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Int? = null,

    @Column(name = "name", nullable = false)
    var name: String? = null
)
