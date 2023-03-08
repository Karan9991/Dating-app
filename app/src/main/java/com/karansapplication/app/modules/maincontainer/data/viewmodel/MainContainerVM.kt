package com.karansapplication.app.modules.maincontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.maincontainer.`data`.model.MainContainerModel
import org.koin.core.KoinComponent

class MainContainerVM : ViewModel(), KoinComponent {
  val mainContainerModel: MutableLiveData<MainContainerModel> =
      MutableLiveData(MainContainerModel())

  var navArguments: Bundle? = null
}
