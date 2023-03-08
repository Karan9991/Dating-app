package com.karansapplication.app.modules.photofullsreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.photofullsreen.`data`.model.PhotoFullsreenModel
import org.koin.core.KoinComponent

class PhotoFullsreenVM : ViewModel(), KoinComponent {
  val photoFullsreenModel: MutableLiveData<PhotoFullsreenModel> =
      MutableLiveData(PhotoFullsreenModel())

  var navArguments: Bundle? = null
}
