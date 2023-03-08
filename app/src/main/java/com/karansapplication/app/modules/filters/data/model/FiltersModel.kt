package com.karansapplication.app.modules.filters.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FiltersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilters: String? = MyApp.getInstance().resources.getString(R.string.lbl_filters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInterestedin: String? = MyApp.getInstance().resources.getString(R.string.lbl_interested_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoys: String? = MyApp.getInstance().resources.getString(R.string.lbl_boys)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBoth: String? = MyApp.getInstance().resources.getString(R.string.lbl_both)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlex: String? = MyApp.getInstance().resources.getString(R.string.lbl_chicago_usa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTexthere: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_distance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_40km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAge: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2028: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_28)

)
