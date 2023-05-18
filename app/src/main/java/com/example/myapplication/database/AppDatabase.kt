package com.example.myapplication.database


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.database.entity.*

@Database(
    version = 1,
    entities = [
        Group::class,
        Marks::class,
        Subject::class,
        User::class
    ]
)
abstract class AppDatabase : RoomDatabase(){
}