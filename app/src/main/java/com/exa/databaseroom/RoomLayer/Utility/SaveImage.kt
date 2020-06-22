package com.exa.databaseroom.RoomLayer.Utility

import android.app.Activity
import android.content.Context
import android.content.Intent
import java.io.File
import java.util.*

class SaveImage() {

companion object{


    fun saveimage(context: Context, path: String): String? {
        val imageFile = File(path)
        if (!imageFile.exists())
            return null
        val imageName = UUID.randomUUID().toString()
        context.openFileOutput(imageName, Context.MODE_PRIVATE).write(imageFile.readBytes())
        return imageName

    }
}





}