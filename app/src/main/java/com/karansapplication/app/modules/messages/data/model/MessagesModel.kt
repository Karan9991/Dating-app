package com.karansapplication.app.modules.messages.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MessagesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMessages: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivities: String? = MyApp.getInstance().resources.getString(R.string.lbl_activities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_emma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ava)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessagesOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)

)
