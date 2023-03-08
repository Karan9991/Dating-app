package com.karansapplication.app.modules.matches.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MatchesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLeilaniCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_leilani_19)

)
