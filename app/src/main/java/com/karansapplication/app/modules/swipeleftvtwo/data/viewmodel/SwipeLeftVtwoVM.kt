package com.karansapplication.app.modules.swipeleftvtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.swipeleftvtwo.`data`.model.SwipeLeftVtwoModel
import org.koin.core.KoinComponent

class SwipeLeftVtwoVM : ViewModel(), KoinComponent {
  val swipeLeftVtwoModel: MutableLiveData<SwipeLeftVtwoModel> =
      MutableLiveData(SwipeLeftVtwoModel())

  var navArguments: Bundle? = null
}
