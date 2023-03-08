package com.karansapplication.app.modules.matches.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.matches.`data`.model.Matches1RowModel
import com.karansapplication.app.modules.matches.`data`.model.MatchesModel
import com.karansapplication.app.modules.matches.`data`.model.MatchesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MatchesVM : ViewModel(), KoinComponent {
  val matchesModel: MutableLiveData<MatchesModel> = MutableLiveData(MatchesModel())

  var navArguments: Bundle? = null

  val matchesList: MutableLiveData<MutableList<MatchesRowModel>> = MutableLiveData(mutableListOf())

  val matches1List: MutableLiveData<MutableList<Matches1RowModel>> =
      MutableLiveData(mutableListOf())
}
