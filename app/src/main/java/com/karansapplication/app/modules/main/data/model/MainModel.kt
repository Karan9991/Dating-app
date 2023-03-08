package com.karansapplication.app.modules.main.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscover: String? = MyApp.getInstance().resources.getString(R.string.lbl_discover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChicagoII: String? = MyApp.getInstance().resources.getString(R.string.lbl_chicago_ii)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJessicaParker: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jessica_parker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfessionalmo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_professional_mo)

)
