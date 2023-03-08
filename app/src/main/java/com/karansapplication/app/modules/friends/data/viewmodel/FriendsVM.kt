package com.karansapplication.app.modules.friends.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.friends.`data`.model.FriendsModel
import org.koin.core.KoinComponent

class FriendsVM : ViewModel(), KoinComponent {
  val friendsModel: MutableLiveData<FriendsModel> = MutableLiveData(FriendsModel())

  var navArguments: Bundle? = null
}
