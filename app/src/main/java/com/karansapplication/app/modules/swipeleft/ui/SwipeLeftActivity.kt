package com.karansapplication.app.modules.swipeleft.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivitySwipeLeftBinding
import com.karansapplication.app.modules.match.ui.MatchActivity
import com.karansapplication.app.modules.swipeleft.`data`.viewmodel.SwipeLeftVM
import kotlin.String
import kotlin.Unit

class SwipeLeftActivity : BaseActivity<ActivitySwipeLeftBinding>(R.layout.activity_swipe_left) {
  private val viewModel: SwipeLeftVM by viewModels<SwipeLeftVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.swipeLeftVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePhoto.setOnClickListener {
      val destIntent = MatchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SWIPE_LEFT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SwipeLeftActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
