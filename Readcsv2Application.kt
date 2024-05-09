package com.example.readcsv2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.example.readcsv2", "PracticeRepository"])
class Readcsv2Application(val csvService: CsvService) { // CsvServiceをDI

	init {
		// アプリケーション起動時にCSVファイルからデータベースにデータを挿入する
		csvService.insertDataFromCSV()
	}
}
fun main(args: Array<String>) {
	runApplication<Readcsv2Application>(*args)
}
