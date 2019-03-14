package ir.aryanmo.utilsexample

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import ir.aryanmo.utils.BaseActivity
import ir.aryanmo.utils.Utils.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {

            GetUtils.getString(this,R.string.salam)
            ConverterUtils
            text.setOnClickListener {
                SnackbarUtils.snackbar(text, R.string.MOJI, Snackbar.LENGTH_INDEFINITE, "Hello", Runnable {
                    toast("Helooooooooooooooooooooooooo").show()
                }).show()
            }
        } catch (e: Exception) {
            logError("errror", e)
        }
        log(StringUtils.toTitleCase("salam khobi"))

    }
}
