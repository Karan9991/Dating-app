package com.karansapplication.app.modules.friends.`data`.model

import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FriendsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchfriends: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_friend_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanfindfr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_find_fr)

)
