package com.karansapplication.app.modules.calendar.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CalendarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBirthday: String? = MyApp.getInstance().resources.getString(R.string.lbl_birthday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_1995)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJuly: String? = MyApp.getInstance().resources.getString(R.string.lbl_july)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_29)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirty: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_31)

)
