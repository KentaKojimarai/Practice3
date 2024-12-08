package com.example.readcsv

import org.springframework.stereotype.Service
import jakarta.transaction.Transactional
import repository.ProductRepository

import java.io.File

@Service
class ProductService(private val productRepository: ProductRepository) {
    @Transactional
    fun readFromCSV(filePath: String): List<Product> {
        val products = mutableListOf<Product>()
        File(filePath).useLines { lines ->
            lines.drop(1).forEach { line ->
                val tokens = line.split(",")
                val product = Product(
                    category = tokens[0],
                    name = tokens[1],
                    price = tokens[2].toInt(),
                    origin = tokens[3]
                )
                products.add(product)
            }
        }
        return products
    }
    fun importCSVData(filePath: String) {
        val products = readFromCSV(filePath)
        productRepository.saveAll(products)
    }
}