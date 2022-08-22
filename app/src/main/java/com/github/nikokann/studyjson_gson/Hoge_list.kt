package com.github.nikokann.studyjson_gson

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Hoge_list {
    val strJson = "[{a=A,b=B},{a=AAA,b=BBB}]"
    val listType = object : TypeToken<List<Hogedata_list>>() {}.type
    val hogeData = Gson().fromJson<List<Hogedata_list>>(strJson,listType)
    val a = hogeData[0].a
}