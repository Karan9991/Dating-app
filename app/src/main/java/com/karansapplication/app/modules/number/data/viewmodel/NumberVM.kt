package com.karansapplication.app.modules.number.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.number.`data`.model.NumberModel
import com.karansapplication.app.modules.number.`data`.model.SpinnerGroupFiftyThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NumberVM : ViewModel(), KoinComponent {
  val numberModel: MutableLiveData<NumberModel> = MutableLiveData(NumberModel())

  var navArguments: Bundle? = null

  val spinnerGroupFiftyThreeList: MutableLiveData<MutableList<SpinnerGroupFiftyThreeModel>> =
      MutableLiveData()
}
