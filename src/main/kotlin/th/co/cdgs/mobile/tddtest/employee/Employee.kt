package th.co.cdgs.mobile.tddtest.employee

import javax.persistence.*

@Entity
open class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Column(name = "name", nullable = false)
    open var name: String? = null
}
