package com.crypto.ticker.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import com.crypto.ticker.core.common.BaseViewModel
import com.crypto.ticker.data.repository.settings.SettingsRepository

class HomeActivityViewModel @ViewModelInject constructor(private val repository: SettingsRepository) : BaseViewModel() {

    fun isDarkModeOn () : Boolean{
        return repository.isDarkModeEnabled()
    }
}