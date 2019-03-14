package ir.aryanmo.utils

import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast

interface BaseToastFunction : Basic {
    fun toast(message: String, duration: Int): Toast {
        return ir.aryanmo.utils.Utils.toast(appContext!!, message, duration)
    }

    fun toast(@StringRes message: Int, duration: Int): Toast {
        return ir.aryanmo.utils.Utils.toast(appContext!!, message, duration)
    }

    fun toast(message: String): Toast {
        return shortToast(message)
    }

    fun toast(@StringRes message: Int): Toast {
        return shortToast(message)
    }

    fun shortToast(message: String): Toast {
        return ir.aryanmo.utils.Utils.shortToast(appContext!!, message)
    }

    fun shortToast(@StringRes message: Int): Toast {
        return ir.aryanmo.utils.Utils.shortToast(appContext!!, message)
    }

    fun longToast(message: String): Toast {
        return ir.aryanmo.utils.Utils.longToast(appContext!!, message)
    }

    fun longToast(@StringRes message: Int): Toast {
        return ir.aryanmo.utils.Utils.longToast(appContext!!, message)
    }
}
