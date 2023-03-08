package com.karansapplication.app.modules.swiperight.ui

import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivitySwipeRightBinding
import com.karansapplication.app.modules.swipeleft.ui.SwipeLeftActivity
import com.karansapplication.app.modules.swiperight.`data`.viewmodel.SwipeRightVM
import kotlin.String
import kotlin.Unit

class SwipeRightActivity : BaseActivity<ActivitySwipeRightBinding>(R.layout.activity_swipe_right) {
  private val viewModel: SwipeRightVM by viewModels<SwipeRightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.swipeRightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePhoto.setOnClickListener {
      val destIntent = SwipeLeftActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SWIPE_RIGHT_ACTIVITY"

  }
}
