package com.example.codingchallangweek21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.stream.DoubleStream.generate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var original = "frog"
        var sub = " "
    fun recurse(repete: String) {
        if (original.count() == 1) {
            sub = sub + original + ", "
            return
        } else {
            sub = sub + original + ", "
            recurse(original.substring(0, repete.count() - 1))
            recurse(original.substring(1, repete.count()))
        }
    }
        recurse(original)
        answer.text = sub
    }

//    class arraySort() {
//
//        val mixed = arrayOf(2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8)
//        val sort = mixed.sortedArray()
//
//        val done = Arrays.toString(sort)
//
//        answer.text = done
//    }
//
//    class subStrings() {
//val word = "frog"
//        var out = ""
//        var chArray = word.toCharArray()
//
//
//        for(char in chArray){
//
//            out = out + "$char, "
//    }
//
//    class compareArrays() {
//        val chars1 = arrayOf("a", "b", "c", "d", "e", "f", "g", "a", "b")
//        val chars2 = arrayOf()
//    }
//}
//
//    class jungle() {
}
