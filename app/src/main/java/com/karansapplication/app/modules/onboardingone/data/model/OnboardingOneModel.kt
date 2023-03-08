package com.karansapplication.app.modules.onboardingone.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAlgorithm: String? = MyApp.getInstance().resources.getString(R.string.lbl_algorithm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsersgoingthr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_users_going_thr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
