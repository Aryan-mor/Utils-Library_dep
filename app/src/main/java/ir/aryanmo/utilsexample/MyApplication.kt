package ir.aryanmo.utilsexample

import android.app.Application
import ir.aryanmo.utils.Util

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        U = Util(this)
    }

    companion object {
        lateinit var U :Util
    }
}
