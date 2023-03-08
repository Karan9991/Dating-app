package com.karansapplication.app.modules.passions.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PassionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourinterests: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectafewof: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_a_few_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShopping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shopping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRun: String? = MyApp.getInstance().resources.getString(R.string.lbl_run)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTraveling: String? = MyApp.getInstance().resources.getString(R.string.lbl_traveling)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etElevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTwelveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etThirteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFourteenValue: String? = null
)
