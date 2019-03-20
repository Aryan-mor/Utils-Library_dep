package ir.aryanmo.utilsexample

import android.os.Bundle
import ir.aryanmo.utils.BaseActivity
import ir.aryanmo.utils.utils.log.DEFAULT_LOG_MODE
import ir.aryanmo.utils.utils.log.INFO_MODE
import ir.aryanmo.utilsexample.MyApplication.Companion.U

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var map = HashMap<String,String>()
        map["SALAM"] = "salam"
        map["BYE"] = "bye"
        map["GOOD_BYE"] = "good bye"

        addPref("myMap",map)
        map = U.getPref("myMap", HashMap<String, String>()::class.java)!!
        map.forEach {
            log("key -> ${it.key}     val -> ${it.value}")
        }
        DEFAULT_LOG_MODE = INFO_MODE

        log(":DDDDDDDDDDDDD")
    }
}
