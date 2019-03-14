package ir.aryanmo.utils

import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.support.v7.app.AppCompatActivity
import java.io.Serializable
import java.lang.Exception
import java.math.BigInteger
import kotlin.reflect.KClass

interface BaseIntentFunction : Basic {

    fun makeIntent(cls: Class<*>): Intent {
        return ir.aryanmo.utils.Utils.makeIntent(appContext!!, cls)
    }

    fun makeIntent(cls: KClass<*>): Intent {
        return ir.aryanmo.utils.Utils.makeIntent(appContext!!, cls)
    }

    fun makeIntent(activity: AppCompatActivity): Intent {
        return ir.aryanmo.utils.Utils.makeIntent(appContext!!, activity)
    }

    fun makeIntent(cls: Class<*>, key: Any, value: Any): Intent {
        return ir.aryanmo.utils.Utils.makeIntent(appContext!!, cls, key, value)
    }

    fun makeIntent(cls: KClass<*>, key: Any, value: Any): Intent {
        return ir.aryanmo.utils.Utils.makeIntent(appContext!!, cls, key, value)
    }

    fun makeIntent(activity: AppCompatActivity, key: Any, value: Any): Intent {
        return ir.aryanmo.utils.Utils.makeIntent(appContext!!, activity, key, value)
    }

    fun intentTo(cls: Class<*>) {
        return ir.aryanmo.utils.Utils.intentTo(appContext!!, cls)
    }

    fun intentTo(cls: KClass<*>) {
        return ir.aryanmo.utils.Utils.intentTo(appContext!!, cls)
    }

    fun intentTo(activity: AppCompatActivity) {
        return ir.aryanmo.utils.Utils.intentTo(appContext!!, activity)
    }

    fun intentTo(cls: Class<*>, key: Any, value: Any) {
        return ir.aryanmo.utils.Utils.intentTo(appContext!!, cls, key, value)
    }

    fun intentTo(cls: KClass<*>, key: Any, value: Any) {
        return ir.aryanmo.utils.Utils.intentTo(appContext!!, cls, key, value)
    }

    fun intentTo(activity: AppCompatActivity, key: Any, value: Any) {
        return ir.aryanmo.utils.Utils.intentTo(appContext!!, activity, key, value)
    }

    fun intentTo(intent: Intent) {
        return ir.aryanmo.utils.Utils.intentTo(appContext!!, intent)
    }
}