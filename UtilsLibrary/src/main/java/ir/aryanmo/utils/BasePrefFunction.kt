package ir.aryanmo.utils.Utils

import android.content.Context
import com.google.gson.Gson
import ir.aryanmo.utils.Basic
import java.lang.Exception

interface BasePrefFunction : Basic {


    fun addPref(key: String, value: Any): Boolean {
        return ir.aryanmo.utils.Utils.addPref(appContext!!,key,value)
    }

    fun getPrefBoolean(key: String, defaultValue: Boolean): Boolean {
        return ir.aryanmo.utils.Utils.getPrefBoolean(appContext!!,key,defaultValue)
    }

    fun getPrefString(key: String, defaultValue: String): String {
        return ir.aryanmo.utils.Utils.getPrefString(appContext!!,key,defaultValue)
    }

    fun getPrefInt(key: String, defaultValue: Int): Int {
        return ir.aryanmo.utils.Utils.getPrefInt(appContext!!,key,defaultValue)
    }

    fun getPrefFloat(key: String, defaultValue: Float): Float {
        return ir.aryanmo.utils.Utils.getPrefFloat(appContext!!,key,defaultValue)
    }

    fun getPrefLong(key: String, defaultValue: Long): Long {
        return ir.aryanmo.utils.Utils.getPrefLong(appContext!!,key,defaultValue)
    }

    fun <T> getPref(key: String, classOf: Class<T>): Any {
        return ir.aryanmo.utils.Utils.getPref(appContext!!,key,classOf)
    }


}