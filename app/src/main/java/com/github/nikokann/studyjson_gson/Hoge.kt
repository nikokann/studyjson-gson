package com.github.nikokann.studyjson_gson

import com.google.gson.Gson

class Hoge {
    val strJson = "{a=A, b=B}"
    val hogeData = Gson().fromJson(strJson,HogeData::class.java)
    val a = hogeData.a
}