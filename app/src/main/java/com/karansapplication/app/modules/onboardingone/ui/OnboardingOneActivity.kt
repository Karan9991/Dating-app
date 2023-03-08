package com.karansapplication.app.modules.onboardingone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityOnboardingOneBinding
import com.karansapplication.app.modules.onboardingone.`data`.viewmodel.OnboardingOneVM
import com.karansapplication.app.modules.onboardingtwo.ui.OnboardingTwoActivity
import kotlin.String
import kotlin.Unit

class OnboardingOneActivity :
    BaseActivity<ActivityOnboardingOneBinding>(R.layout.activity_onboarding_one) {
  private val viewModel: OnboardingOneVM by viewModels<OnboardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = OnboardingTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnCreateAnAccountOne.setOnClickListener {
        val destIntent = OnboardingTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "ONBOARDING_ONE_ACTIVITY"

    }
  }
