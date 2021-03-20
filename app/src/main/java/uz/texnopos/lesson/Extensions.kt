package uz.texnopos.lesson

import android.view.LayoutInflater
import android.view.ViewGroup

fun ViewGroup.inflate(resId: Int) =
        LayoutInflater.from(this.context).inflate(resId, this, false)
