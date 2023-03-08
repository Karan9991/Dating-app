package com.karansapplication.app.modules.iam.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.iam.`data`.model.IAmModel
import org.koin.core.KoinComponent

class IAmVM : ViewModel(), KoinComponent {
  val iAmModel: MutableLiveData<IAmModel> = MutableLiveData(IAmModel())

  var navArguments: Bundle? = null
}
