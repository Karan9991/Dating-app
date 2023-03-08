package com.karansapplication.app.modules.calendar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.calendar.`data`.model.CalendarModel
import com.karansapplication.app.modules.calendar.`data`.model.CalendarRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalendarVM : ViewModel(), KoinComponent {
  val calendarModel: MutableLiveData<CalendarModel> = MutableLiveData(CalendarModel())

  var navArguments: Bundle? = null

  val calendarList: MutableLiveData<MutableList<CalendarRowModel>> =
      MutableLiveData(mutableListOf())
}
