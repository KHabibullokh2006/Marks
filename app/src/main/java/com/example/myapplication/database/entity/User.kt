package com.example.myapplication.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    @ColumnInfo("user_name")
    var userName:String,
    var login:String,
    var password:String,
    var role:String
)