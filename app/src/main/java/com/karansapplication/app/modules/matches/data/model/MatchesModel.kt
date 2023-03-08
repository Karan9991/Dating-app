package com.karansapplication.app.modules.matches.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MatchesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMatches: String? = MyApp.getInstance().resources.getString(R.string.lbl_matches)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisisalist: String? = MyApp.getInstance().resources.getString(R.string.msg_this_is_a_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYesterday: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)

)
