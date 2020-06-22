package com.exa.databaseroom.RoomLayer.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import com.exa.databaseroom.RoomLayer.Dao.UserDao
import com.exa.databaseroom.RoomLayer.Entity.User_Entity

@Database(entities = arrayOf(User_Entity::class), version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun users(): UserDao

    companion object {

        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {

            if (instance == null) {

                instance = Room.databaseBuilder(context, AppDatabase::class.java, "room_basic")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance!!
        }
    }
}