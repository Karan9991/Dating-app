package com.karansapplication.app.modules.profiledetails.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfiledetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_profile_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlex: String? = MyApp.getInstance().resources.getString(R.string.lbl_david)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTexthere: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlexOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_peterson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTexthereOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt22091997: String? = MyApp.getInstance().resources.getString(R.string.msg_choose_birthday)

)
