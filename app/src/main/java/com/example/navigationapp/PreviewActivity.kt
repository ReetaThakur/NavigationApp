package com.example.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        getDataFromIntent()
    }

    private fun getDataFromIntent() {
        intent?.run {
            tvStudentName.text=getStringExtra("name")
            tvStudentAge.text=getStringExtra("age")
            tvStudentGrade.text=getStringExtra("grade")
            tvStudentPercentage.text=getStringExtra("percentage")
        }
    }
}