package com.karansapplication.app.modules.friends.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityFriendsBinding
import com.karansapplication.app.modules.friends.`data`.viewmodel.FriendsVM
import com.karansapplication.app.modules.notification.ui.NotificationActivity
import kotlin.String
import kotlin.Unit

class FriendsActivity : BaseActivity<ActivityFriendsBinding>(R.layout.activity_friends) {
  private val viewModel: FriendsVM by viewModels<FriendsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.friendsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAccessToAContactList.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRIENDS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FriendsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
