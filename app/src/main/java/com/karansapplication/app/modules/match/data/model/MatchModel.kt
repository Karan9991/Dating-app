package com.karansapplication.app.modules.match.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MatchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtItsamatchJ: String? = MyApp.getInstance().resources.getString(R.string.msg_it_s_a_match_j)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartaconvers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_start_a_convers)

)
