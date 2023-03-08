package com.karansapplication.app.modules.stories.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StoriesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAnnabelle: String? = MyApp.getInstance().resources.getString(R.string.lbl_annabelle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etYourmessageValue: String? = null
)
