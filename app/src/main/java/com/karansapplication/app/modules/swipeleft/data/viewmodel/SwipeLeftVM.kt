package com.karansapplication.app.modules.swipeleft.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.swipeleft.`data`.model.SwipeLeftModel
import org.koin.core.KoinComponent

class SwipeLeftVM : ViewModel(), KoinComponent {
  val swipeLeftModel: MutableLiveData<SwipeLeftModel> = MutableLiveData(SwipeLeftModel())

  var navArguments: Bundle? = null
}
