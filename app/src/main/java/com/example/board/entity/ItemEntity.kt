package com.example.board.entity

import com.squareup.moshi.Json
import java.io.Serializable

data class ItemEntity(
    @field:Json(name = "number")
    var number: Long?,
    @field:Json(name = "title")
    var title: String?,
    @field:Json(name = "nickname")
    var nickname: String?,
    @field:Json(name = "content")
    var content: String?
):Serializable{}

data class RegisterPostModel(
    var title : String? =null ,
    var content : String?=null,
    var nickname : String? =null
)
data class RegisterPostResult(
    var number: Long?
)
