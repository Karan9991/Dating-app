package com.karansapplication.app.modules.messages.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.messages.`data`.model.ListphotoFourRowModel
import com.karansapplication.app.modules.messages.`data`.model.ListphotoSixRowModel
import com.karansapplication.app.modules.messages.`data`.model.MessagesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MessagesVM : ViewModel(), KoinComponent {
  val messagesModel: MutableLiveData<MessagesModel> = MutableLiveData(MessagesModel())

  var navArguments: Bundle? = null

  val listphotoFourList: MutableLiveData<MutableList<ListphotoFourRowModel>> =
      MutableLiveData(mutableListOf())

  val listphotoSixList: MutableLiveData<MutableList<ListphotoSixRowModel>> =
      MutableLiveData(mutableListOf())
}
