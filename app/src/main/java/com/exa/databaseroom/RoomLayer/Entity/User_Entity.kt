package com.exa.databaseroom.RoomLayer.Entity

import android.provider.ContactsContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
class User_Entity(@PrimaryKey(autoGenerate = true) var id : Int,
                  @ColumnInfo(name = "display_name") var displayName: String,
                  @ColumnInfo(name = "email") var email: String?,
                  @ColumnInfo(name = "phone") var phone : String,
                  @ColumnInfo(name = "user_image") var image : String? = null){

    constructor(displayName: String,email: String?,phone: String,image: String? = null) : this(0,displayName,email,phone,image)
}