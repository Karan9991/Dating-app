package com.karansapplication.app.modules.match.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityMatchBinding
import com.karansapplication.app.modules.match.`data`.viewmodel.MatchVM
import kotlin.String
import kotlin.Unit

class MatchActivity : BaseActivity<ActivityMatchBinding>(R.layout.activity_match) {
  private val viewModel: MatchVM by viewModels<MatchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.matchVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MATCH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MatchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
