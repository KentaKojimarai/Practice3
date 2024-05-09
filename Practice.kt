package com.example.readcsv2

import jakarta.persistence.*

@Entity
@Table(name = "Sample", schema = "data")
class Practice(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "Category", nullable = false, length = 10)
    var category: String,

    @Column(name = "Product", nullable = false, length = 10)
    var product: String,

    @Column(name = "Yen", nullable = false, length = 10)
    var yen: Int,

    @Column(name = "Country", nullable = false, length = 3)
    var country: String,
)