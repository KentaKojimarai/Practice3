package com.example.readcsv

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(
	basePackages = ["repository"]
)
@SpringBootApplication
class ReadcsvApplication(val productService: ProductService){
	val filePath = "C:/Users/10260226/products.csv"
	@Bean
	fun applicationRunner() =
		ApplicationRunner {
			productService.importCSVData(filePath)
		}
}

fun main(args: Array<String>) {
	runApplication<ReadcsvApplication>(*args)
}
