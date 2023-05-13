package com.example.myapplication.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Marks (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("mark_id")
    var markId:Int,

)