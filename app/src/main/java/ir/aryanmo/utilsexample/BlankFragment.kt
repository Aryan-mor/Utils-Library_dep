package ir.aryanmo.utilsexample

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ir.aryanmo.utils.AdvanceBaseFragment
import ir.aryanmo.utils.BaseFragment


class BlankFragment : AdvanceBaseFragment() {
    override fun customizeUI() {
        log("customizeUI")
    }

    override fun visibleUI() {
        log("visibleUI")
    }

    override fun inflate(): Int {
        return R.layout.fragment_blank
    }

}
