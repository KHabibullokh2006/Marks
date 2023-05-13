package com.example.myapplication.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Group(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("group_id")
    var groupId:Int,
    var groupName:String,
    var groupClass:Int
)
