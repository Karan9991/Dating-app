package com.karansapplication.app.modules.passions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.passions.`data`.model.PassionsModel
import org.koin.core.KoinComponent

class PassionsVM : ViewModel(), KoinComponent {
  val passionsModel: MutableLiveData<PassionsModel> = MutableLiveData(PassionsModel())

  var navArguments: Bundle? = null
}
