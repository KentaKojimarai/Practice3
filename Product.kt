package com.example.readcsv

import jakarta.persistence.*

@Entity
@Table(name = "product", schema = "data")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val category: String,
    val name: String,
    val price: Int,
    val origin: String
)