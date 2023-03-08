package com.karansapplication.app.modules.iam.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class IAmModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIama: String? = MyApp.getInstance().resources.getString(R.string.lbl_i_am_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMan: String? = MyApp.getInstance().resources.getString(R.string.lbl_man)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseanother: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_another)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etWomanValue: String? = null
)
