package com.example.calculatorassignment

import android.location.GnssAntennaInfo.Listener
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.calculatorassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate((layoutInflater))
        setContentView(tasarim.root)


        var fNumber = 0
        var sNumber =0
        var current = -1

        fun toplam (ilkSayi:Int,ikinciSayi:Int):Int{
            var toplam = ilkSayi+ikinciSayi
            return toplam
        }


        tasarim.apply {
            buttonBir.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "1"){
                    textSonuc.setText("1")
                }else{
                    textSonuc.setText("${input}1")
                }
            }
            buttonIki.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "2"){
                    textSonuc.setText("2")
                }else{
                    textSonuc.setText("${input}2")
                }
            }
            buttonUc.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "3"){
                    textSonuc.setText("3")
                }else{
                    textSonuc.setText("${input}3")
                }
            }
            buttonDort.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "4"){
                    textSonuc.setText("4")
                }else{
                    textSonuc.setText("${input}4")
                }
            }
            buttonBes.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "5"){
                    textSonuc.setText("5")
                }else{
                    textSonuc.setText("${input}5")
                }
            }
            buttonAlti.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "6"){
                    textSonuc.setText("6")
                }else{
                    textSonuc.setText("${input}6")
                }
            }
            buttonYedi.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "7"){
                    textSonuc.setText("7")
                }else{
                    textSonuc.setText("${input}7")
                }
            }
            buttonSekiz.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "8"){
                    textSonuc.setText("8")
                }else{
                    textSonuc.setText("${input}8")
                }
            }
            buttonDokuz.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "9"){
                    textSonuc.setText("9")
                }else{
                    textSonuc.setText("${input}9")
                }
            }
            buttonSifir.setOnClickListener {
                var input = textSonuc.text.toString()
                if(input == "0"){
                    textSonuc.setText("0")
                }else{
                    textSonuc.setText("${input}0")
                }
            }
            buttonTemizle.setOnClickListener {
                textSonuc.setText("0")
                fNumber = 0
                sNumber = 0
            }

            buttonArti.setOnClickListener {
                fNumber = textSonuc.text.toString().toInt()
                textSonuc.setText("")
                current = 0
            }

            buttonSonuc.setOnClickListener {
                sNumber = textSonuc.text.toString().toInt()
                textSonuc.setText(toplam(fNumber,sNumber).toString())

            }
        }
    }

}