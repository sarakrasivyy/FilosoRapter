package com.example.filosorapter


data class FilosoRapter( var varid:String="",
                         var  title:String="",
                         var photoUrl: String="",
                         var likeList:Map<String,Boolean> = mutableMapOf())
