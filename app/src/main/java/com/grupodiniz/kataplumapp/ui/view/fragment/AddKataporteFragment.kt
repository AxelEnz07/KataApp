package com.grupodiniz.kataplumapp.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import com.grupodiniz.kataplumapp.R

class AddKataporteFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        if (dialog != null && dialog!!.window != null) {
            dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog?.window?.requestFeature(Window.FEATURE_NO_TITLE)
        }
        return inflater.inflate(R.layout.fragment_add_kataporte, container, false)
    }

}