package repository

import org.springframework.stereotype.Repository
import com.example.readcsv.Product
import org.springframework.data.jpa.repository.JpaRepository
import java.io.File

@Repository
interface ProductRepository: JpaRepository<Product, Long> {
}
