package com.example.photogallery

import android.content.Context
import java.io.File

class PhotoStorage() {

    fun storePhoto(context: Context, photo: Photo){
        val file = File(context.filesDir, photo.title)
    }

    fun openPhoto(context: Context): Array<String>{
        val files: Array<String> = context.fileList()
        return files
    }

}