package com.example.readcsv2

import repository.PracticeRepository
import java.io.File
import java.nio.charset.Charset

class test(
    private val practiceRepository: PracticeRepository
) {
    val filePath = "C:/Users/10260226/sample.csv" // 指定したディレクトリのファイルを読み込む
    val charset = Charset.forName("Shift_JIS")
    val lines = File(filePath).readLines()
}
