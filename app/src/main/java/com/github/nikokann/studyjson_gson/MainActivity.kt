package com.github.nikokann.studyjson_gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.json_change_button).setOnClickListener {
            val strJson = "{a=A, b=B}"
            val hogeData = Gson().fromJson(strJson,HogeData::class.java)
            val a = hogeData.a

            val outputText = "hogeDate: a = ${hogeData.a} , b = ${hogeData.b}"

            Log.d("jsonCheck",outputText)
            findViewById<TextView>(R.id.output_textview).text = outputText
        }

        findViewById<Button>(R.id.json_change_list_button).setOnClickListener {
            val strJson = "[{a=A,b=B},{a=AAA,b=BBB}]"
            val listType = object : TypeToken<List<Hogedata_list>>() {}.type
            val hogeData = Gson().fromJson<List<Hogedata_list>>(strJson,listType)
            val a = hogeData[0].a

            val outputText = "hogeDateLists: a[0] = ${hogeData[0].a} , a[1] = ${hogeData[1].a}"

            Log.d("jsonCheck",outputText)
            findViewById<TextView>(R.id.output_textview).text = outputText


        }
    }
}