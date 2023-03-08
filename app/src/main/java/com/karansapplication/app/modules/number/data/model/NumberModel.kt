package com.karansapplication.app.modules.number.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NumberModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMymobile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_mobile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_please_enter_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnitedStates: String? = MyApp.getInstance().resources.getString(R.string.lbl_331_623_8413)

)
