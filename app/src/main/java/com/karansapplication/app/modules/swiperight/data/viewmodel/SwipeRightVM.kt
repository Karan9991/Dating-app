package com.karansapplication.app.modules.swiperight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.swiperight.`data`.model.SwipeRightModel
import org.koin.core.KoinComponent

class SwipeRightVM : ViewModel(), KoinComponent {
  val swipeRightModel: MutableLiveData<SwipeRightModel> = MutableLiveData(SwipeRightModel())

  var navArguments: Bundle? = null
}
