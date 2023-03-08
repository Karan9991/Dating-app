package com.karansapplication.app.modules.messages.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListphotoFourRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNameThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_sophia)

)
