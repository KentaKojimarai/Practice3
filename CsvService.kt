package com.example.readcsv2

import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import repository.PracticeRepository
import java.io.File
import java.nio.charset.Charset

@Service
class CsvService @Autowired constructor(private val practiceRepository: PracticeRepository) {

    @Transactional
    fun insertDataFromCSV() {
        val filePath = "C:/Users/10260226/sample.csv"
        val charset = Charset.forName("Shift_JIS")
        val file = File(filePath)
        val lines = file.readLines(charset)

        for (line in lines.drop(1)) { // ヘッダー行をスキップ
            val columns = line.split(",")

            // Practiceエンティティのインスタンスを作成し、CSVファイルのデータをセットする
            val practice = Practice(
                category = columns[0],
                product = columns[1],
                yen = columns[2].toInt(),
                country = columns[3]
            )

            // Repositoryを介してエンティティをデータベースに保存する
            practiceRepository.save(practice)
        }
    }
}
