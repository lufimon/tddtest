package th.co.cdgs.mobile.tddtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
class TddtestApplication

fun main(args: Array<String>) {
	val context = runApplication<TddtestApplication>(*args)
	println("Bean Count : ${context.beanDefinitionCount}")
}
