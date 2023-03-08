package com.karansapplication.app.modules.stories.ui

import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityStoriesBinding
import com.karansapplication.app.modules.stories.`data`.viewmodel.StoriesVM
import kotlin.String
import kotlin.Unit

class StoriesActivity : BaseActivity<ActivityStoriesBinding>(R.layout.activity_stories) {
  private val viewModel: StoriesVM by viewModels<StoriesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.storiesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "STORIES_ACTIVITY"

  }
}
