package com.cnon.kot3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hi kotlin")


        var i: Any=73


        /*
         var sonuc: Int =  if(i in 0..24) 0
        else if(i in 25..44) 1
        else if(i in 45..54) 2
        else if(i in 55..69) 3
        else if(i in 70..84) 4
        else if(i in 85..100) 5
        else 6

         */

        /*
        var sonuc: Int =  when(i)
        {
            in 0..24 -> 0
            in 25..44-> 1
            in 45..54-> 2
            in 55..69-> 3
            in 70..84-> 4
            in 85..100-> 5
            else -> 6
        }


       if(sonuc != 6) println("Aldığınız not: $sonuc")
        else println("Yanlış değer girdiniz.")
         */


       // var dizi: Array<IntRange> = arrayOf(100..1000)
        var dizi: Array<Int> = arrayOf(3,5,36,3,67,78)

        for(x in dizi )
        {
            println(x)
        }


        var isim = "Sinan ALAGÖZ"

        for(a in isim)
        {
            println(a+",")
        }

        var dizi2 = arrayOf(arrayOf(87,5,36,3,67,56),arrayOf(3,9,36,3,67,56))

        /*
         for (i in dizi2.indices) {
            println(dizi2[i].contentToString())
        }
         */



        var dfd=""

        for (x in dizi2.indices)
        {
            for (y in dizi2[x]) dfd+=y.toString()+","
            println(dfd)
            dfd=""
        }






    }
}