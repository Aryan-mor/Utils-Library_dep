package ir.aryanmo.utils


interface BaseFunction : BaseLogFunction, BaseGetFunction, BaseIntentFunction, BaseToastFunction, BaseSnackbarFunction, BaseConverterFunction {

    var logLifeCycle: Boolean

    //Device
    fun isXLargeScreen(): Boolean {
        return ir.aryanmo.utils.Utils.isXLargeScreen(appContext!!)
    }

    fun isLargeScreen(): Boolean {
        return ir.aryanmo.utils.Utils.isLargeScreen(appContext!!)
    }

    fun isNormalScreen(): Boolean {
        return ir.aryanmo.utils.Utils.isNormalScreen(appContext!!)
    }

    fun isSmallScreen(): Boolean {
        return ir.aryanmo.utils.Utils.isSmallScreen(appContext!!)
    }

    fun isPortrait(): Boolean {
        return ir.aryanmo.utils.Utils.isPortrait(appContext!!)
    }

    fun isLandscape(): Boolean {
        return ir.aryanmo.utils.Utils.isLandscape(appContext!!)
    }
}
