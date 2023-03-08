package com.karansapplication.app.modules.swipeleftvtwo.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SwipeLeftVtwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBredJacksonTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bred_jackson_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotograph: String? = MyApp.getInstance().resources.getString(R.string.lbl_photograph)

)
