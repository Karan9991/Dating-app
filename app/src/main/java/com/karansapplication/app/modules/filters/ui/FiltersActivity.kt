package com.karansapplication.app.modules.filters.ui

import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityFiltersBinding
import com.karansapplication.app.modules.filters.`data`.viewmodel.FiltersVM
import kotlin.String
import kotlin.Unit

class FiltersActivity : BaseActivity<ActivityFiltersBinding>(R.layout.activity_filters) {
  private val viewModel: FiltersVM by viewModels<FiltersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filtersVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FILTERS_ACTIVITY"

  }
}
