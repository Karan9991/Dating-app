package com.karansapplication.app.modules.code.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CodeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_00_42)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTypetheverifi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_type_the_verifi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZero: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendagain: String? = MyApp.getInstance().resources.getString(R.string.lbl_send_again)

)
