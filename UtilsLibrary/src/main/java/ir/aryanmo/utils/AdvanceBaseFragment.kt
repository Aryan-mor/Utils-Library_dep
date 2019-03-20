package ir.aryanmo.utils


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ir.aryanmo.utils.Utils.FLAG

abstract class AdvanceBaseFragment : BaseFragment(), BaseFunction {

    private lateinit var view: View

    fun AdvanceBaseFragment(s: String) {
        activityName = s
    }

    override fun setMenuVisibility(visible: Boolean) {
        super.setMenuVisibility(visible)
        if (visible) {
            visibleUI()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userVisibleHint = false
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        view = inflater.inflate(inflate(), container, false)

        customizeUI()

        return view
    }


    override fun getView(): View {
        return view
    }

    protected open fun customizeUI(){
        if (logLifeCycle)
            logInfo("$activityName : customizeUI()", "${FLAG}-LifeCycle")
    }

    protected open fun visibleUI(){
        if (logLifeCycle)
            logInfo("$activityName : visibleUI()", "${FLAG}-LifeCycle")
    }

    protected abstract fun inflate(): Int
}
