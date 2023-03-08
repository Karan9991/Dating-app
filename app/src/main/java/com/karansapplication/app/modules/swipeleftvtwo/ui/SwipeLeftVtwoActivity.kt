package com.karansapplication.app.modules.swipeleftvtwo.ui

import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivitySwipeLeftVtwoBinding
import com.karansapplication.app.modules.swipeleftvtwo.`data`.viewmodel.SwipeLeftVtwoVM
import kotlin.String
import kotlin.Unit

class SwipeLeftVtwoActivity :
    BaseActivity<ActivitySwipeLeftVtwoBinding>(R.layout.activity_swipe_left_vtwo) {
  private val viewModel: SwipeLeftVtwoVM by viewModels<SwipeLeftVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.swipeLeftVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SWIPE_LEFT_VTWO_ACTIVITY"

  }
}
