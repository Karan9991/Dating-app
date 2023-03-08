package com.karansapplication.app.modules.profileone.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJessicaParker: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jessica_parker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProffesionalmo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_proffesional_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChicagoILUni: String? =
      MyApp.getInstance().resources.getString(R.string.msg_chicago_il_uni)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_my_name_is_jess)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReadmore: String? = MyApp.getInstance().resources.getString(R.string.lbl_read_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInterests: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTravelling: String? = MyApp.getInstance().resources.getString(R.string.lbl_travelling)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBooks: String? = MyApp.getInstance().resources.getString(R.string.lbl_books)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGallery: String? = MyApp.getInstance().resources.getString(R.string.lbl_gallery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReadmoreOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
