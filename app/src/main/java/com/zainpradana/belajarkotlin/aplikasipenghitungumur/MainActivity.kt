package com.zainpradana.belajarkotlin.aplikasipenghitungumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var etInputAge: EditText
    private lateinit var tvAge: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etInputAge = findViewById(R.id.etInputAge)
        tvAge = findViewById(R.id.tvAge)
    }

    fun btnFindUmur(view: View) {
        val tahunLahir = etInputAge.text.toString()
        val tahun: Int = Calendar.getInstance().get(Calendar.YEAR)

        var umur = 0
        if (tahunLahir.toIntOrNull() != null) {
            umur = tahun - tahunLahir.toInt()
            tvAge.setText("Umur Kamu $umur tahun")
        } else {
            tvAge.setText("Masukkan Tahun Lahir dengan benar")
        }
    }
}