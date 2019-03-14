package ir.aryanmo.utils


interface BaseConverterFunction :Basic{
    fun toString(any: Any): String = ir.aryanmo.utils.Utils.toString(any)

    fun toInt(any: Any): Int = ir.aryanmo.utils.Utils.toInt(any)

    fun toFloat(s: String): Float = ir.aryanmo.utils.Utils.toFloat(s)
}
