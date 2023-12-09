package com.arylinggar.tugas.Model

import com.arylinggar.tugas.Adapter.LAYOUT_CARD
import com.arylinggar.tugas.Adapter.LAYOUT_LIST
import java.io.Serializable

data class ArticleModel(
    val id:Int,
    val title:String,
    val content:String,
    val date:String,
    val excerpt:String,
    val authorName:String,
    val authorUrl:String,
    val authorPic:String,
    val readingTime:String,
    val image:String,
    val category:Int,
    var LAYOUT_TYPE:Int= LAYOUT_LIST,
):Serializable
