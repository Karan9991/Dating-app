package com.karansapplication.app.modules.matches.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Matches1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKyleCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_kyle_24)

)
