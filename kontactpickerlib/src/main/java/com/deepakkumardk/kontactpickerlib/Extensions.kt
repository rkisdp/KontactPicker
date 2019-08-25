package com.deepakkumardk.kontactpickerlib

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amulyakhare.textdrawable.TextDrawable

/**
 * Extension functions
 * Created by Deepak Kumar on 25/05/2019
 */
fun View?.show() {
    this?.visibility = View.VISIBLE
}

fun View?.hide() {
    this?.visibility = View.GONE
}

fun RecyclerView.init(context: Context) {
    this.apply {
        hasFixedSize()
        layoutManager = LinearLayoutManager(context)
    }
}

fun generateRandomColor(): Int {
    val colorsList = arrayOf(
        "039BE5", "0F9D58", "4285F4", "FF5722", "DB4437", "689F38", "009688", "DB4437", "3F51B5",
        "9C27B0", "4E342E", "F50057", "42A5F5", "009688", "9E9D24", "00C853", "BF360C", "37474F"
    )
    return Color.parseColor("#${colorsList.random()}")
}

fun getTextDrawable(name: String): TextDrawable? {
    val initials = name[0].toString().capitalize()
    return TextDrawable.builder()
        .beginConfig()
        .width(1024)
        .height(1024)
        .bold()
        .endConfig()
        .buildRound(initials, generateRandomColor())
}

fun log(message: String) = Log.d("TAG_KONTACT_PICKER", message)