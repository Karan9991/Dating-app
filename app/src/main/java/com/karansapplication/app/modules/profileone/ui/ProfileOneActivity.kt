package com.karansapplication.app.modules.profileone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityProfileOneBinding
import com.karansapplication.app.modules.profileone.`data`.viewmodel.ProfileOneVM
import kotlin.String
import kotlin.Unit

class ProfileOneActivity : BaseActivity<ActivityProfileOneBinding>(R.layout.activity_profile_one) {
  private val viewModel: ProfileOneVM by viewModels<ProfileOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
