package com.karansapplication.app.modules.swiperight.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SwipeRightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCamilaSnowTwentyThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_camila_snow_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMarketer: String? = MyApp.getInstance().resources.getString(R.string.lbl_marketer)

)
