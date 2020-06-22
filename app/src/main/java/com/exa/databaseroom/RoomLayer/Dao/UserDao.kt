package com.exa.databaseroom.RoomLayer.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.exa.databaseroom.RoomLayer.Entity.User_Entity

@Dao
interface UserDao{
    @Query("SELECT * FROM users")
    fun getAll() : List<User_Entity>

    @Insert
    fun insert(user:User_Entity)

}