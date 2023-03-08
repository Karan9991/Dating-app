package com.karansapplication.app.modules.stories.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.stories.`data`.model.StoriesModel
import org.koin.core.KoinComponent

class StoriesVM : ViewModel(), KoinComponent {
  val storiesModel: MutableLiveData<StoriesModel> = MutableLiveData(StoriesModel())

  var navArguments: Bundle? = null
}
