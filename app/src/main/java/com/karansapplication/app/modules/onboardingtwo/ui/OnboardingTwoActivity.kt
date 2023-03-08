package com.karansapplication.app.modules.onboardingtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityOnboardingTwoBinding
import com.karansapplication.app.modules.onboardingthree.ui.OnboardingThreeActivity
import com.karansapplication.app.modules.onboardingtwo.`data`.viewmodel.OnboardingTwoVM
import kotlin.String
import kotlin.Unit

class OnboardingTwoActivity :
    BaseActivity<ActivityOnboardingTwoBinding>(R.layout.activity_onboarding_two) {
  private val viewModel: OnboardingTwoVM by viewModels<OnboardingTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCreateAnAccountOne.setOnClickListener {
      val destIntent = OnboardingThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
