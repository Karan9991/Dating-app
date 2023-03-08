package com.karansapplication.app.modules.iam.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityIAmBinding
import com.karansapplication.app.modules.iam.`data`.viewmodel.IAmVM
import com.karansapplication.app.modules.passions.ui.PassionsActivity
import kotlin.String
import kotlin.Unit

class IAmActivity : BaseActivity<ActivityIAmBinding>(R.layout.activity_i_am) {
  private val viewModel: IAmVM by viewModels<IAmVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iAmVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = PassionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "I_AM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IAmActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
