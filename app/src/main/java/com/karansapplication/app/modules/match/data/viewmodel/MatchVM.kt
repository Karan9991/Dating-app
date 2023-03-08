package com.karansapplication.app.modules.match.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.match.`data`.model.MatchModel
import org.koin.core.KoinComponent

class MatchVM : ViewModel(), KoinComponent {
  val matchModel: MutableLiveData<MatchModel> = MutableLiveData(MatchModel())

  var navArguments: Bundle? = null
}
