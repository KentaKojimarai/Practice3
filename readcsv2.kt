package com.example.readcsv2

import java.io.File
import java.nio.charset.Charset

class readCSV() {
    val filePath = "C:/Users/10260226/20230801_AS_1001_dept05.csv" // 指定したディレクトリのファイルを読み込む
    val charset = Charset.forName("Shift_JIS")
    val lines = File(filePath).readLines()

    val data = lines.drop(1)
}
