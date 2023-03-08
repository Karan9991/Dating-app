package com.karansapplication.app.modules.passions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityPassionsBinding
import com.karansapplication.app.modules.friends.ui.FriendsActivity
import com.karansapplication.app.modules.passions.`data`.viewmodel.PassionsVM
import kotlin.String
import kotlin.Unit

class PassionsActivity : BaseActivity<ActivityPassionsBinding>(R.layout.activity_passions) {
  private val viewModel: PassionsVM by viewModels<PassionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.passionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = FriendsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PASSIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PassionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
