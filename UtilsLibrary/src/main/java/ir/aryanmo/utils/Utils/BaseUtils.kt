package ir.aryanmo.utils.Utils

import android.content.Context
import android.content.res.Resources

var FLAG = "Utils"

fun setFlag(flag: String) {
    FLAG = flag
}

fun getResources(context: Context): Resources {
    return context.resources
}