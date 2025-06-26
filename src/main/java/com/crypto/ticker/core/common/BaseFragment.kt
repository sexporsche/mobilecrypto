package com.crypto.ticker.core.common

import android.widget.Toast
import androidx.fragment.app.Fragment


interface InitViews {
    fun initializeViews()
    fun observeViewModel()
}

abstract class BaseFragment : Fragment(), InitViews {

    fun showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(
            context,
            message,
            duration
        ).show()
    }
}