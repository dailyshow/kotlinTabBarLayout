package com.cis.kotlintabbarlayout


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sub.view.*

/**
 * A simple [Fragment] subclass.
 */
class SubFragment : Fragment() {
    var str1: String? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sub, container, false)

        view.subTv.text = str1

        return view
    }
}
