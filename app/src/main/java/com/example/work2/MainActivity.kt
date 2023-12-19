package com.example.work2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s1:EditText = findViewById(R.id.s1)
        val s2:EditText = findViewById(R.id.s2)
        val s3 :EditText = findViewById(R.id.s3)
        val s4 :EditText = findViewById(R.id.s4)
        val s5 :EditText = findViewById(R.id.s5)
        val c1 :EditText = findViewById(R.id.c1)
        val c2 :EditText = findViewById(R.id.c2)
        val c3 :EditText = findViewById(R.id.c3)
        val c4 :EditText = findViewById(R.id.c4)
        val c5 :EditText = findViewById(R.id.c5)
        val p1 :EditText = findViewById(R.id.p1)
        val p2 :EditText = findViewById(R.id.p2)
        val p3 :EditText = findViewById(R.id.p3)
        val p4:EditText = findViewById(R.id.p4)
        val p5:EditText = findViewById(R.id.p5)
        val ok: Button = findViewById(R.id.ok)
        val clear: Button = findViewById(R.id.clear)
        val run:TextView = findViewById(R.id.total1)
        val runn:TextView = findViewById(R.id.gpa1)

        ok.setOnClickListener{
            var s1 = s1.text.toString()
            var c1 = c1.text.toString()
            var p1 = p1.text.toString()

            var s2 = s2.text.toString()
            var c2 = c2.text.toString()
            var p2 = p2.text.toString()

            var s3 = s3.text.toString()
            var c3 = c3.text.toString()
            var p3  = p3 .text.toString()

            var s4 = s4.text.toString()
            var c4 = c4.text.toString()
            var p4 = p4 .text.toString()

            var s5 = s5.text.toString()
            var c5 = c5.text.toString()
            var p5  = p5 .text.toString()

            if (s1 == "" || c1 == ""|| p1 == ""|| s2 == "" || c2 == ""|| p2 == ""|| s3 == "" || c3 == ""|| p3 == ""
                || s4 == "" || c4 == ""|| p4 == ""|| s4 == "" || c5 == ""|| p5 == "") {
                Toast.makeText(
                    applicationContext,
                    "กรุณากรอกให้ครบ",
                    Toast.LENGTH_SHORT
                ).show()

                Toast.makeText(
                    applicationContext,
                    "กรุณากรอกให้ครบ",
                    Toast.LENGTH_SHORT
                ).show()
            } else{
                var sumcredit = c1.toInt() + c2.toInt() + c3.toInt() + c4.toInt() + c5.toInt()
                run.setText("$sumcredit")
                var cxd1 = c1.toDouble() * p1.toDouble()
                var cxd2 = c2.toDouble() * p2.toDouble()
                var cxd3 = c3.toDouble() * p3.toDouble()
                var cxd4 = c4.toDouble() * p4.toDouble()
                var cxd5 = c5.toDouble() * p5.toDouble()
                var sumcxd = cxd1 + cxd2 + cxd3 + cxd4 + cxd5
                var grade = sumcxd / sumcredit
                val ss = String.format("%.2f",grade)
                runn.setText(ss)

            }
        }
        clear.setOnClickListener {
            c1.setText("")
            p1.setText("")

            c2.setText("")
            p2.setText("")

            c3.setText("")
            p3.setText("")

            c4.setText("")
            p4.setText("")

            c5.setText("")
            p5.setText("")

            run.setText("")
            runn.setText("")

        }

    }
}