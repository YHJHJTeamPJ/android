package com.example.board

import retrofit2.Call
import retrofit2.http.GET


interface API {
    //보드 값 가져오기
    @GET("board")
    fun getBoardList():Call<List<ItemEntity>>
}