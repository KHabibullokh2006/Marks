package com.example.myapplication.database.dao

import androidx.room.*
import com.example.myapplication.database.entity.User

@Dao
interface UserDao {
    @Query("select * from user")
    fun getAllUser():List<User>

    @Insert
    fun addUser(user:User)

    @Delete
    fun deleteUser(user: User)

    @Update
    fun updateUser(user: User)

    @Query("select * from user where login = :l and password = :p")
    fun findUserByLogin(l:String, p:String)

}