package com.karansapplication.app.modules.notification.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnablenotifica: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enable_notifica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetpushnotifi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_get_push_notifi)

)
