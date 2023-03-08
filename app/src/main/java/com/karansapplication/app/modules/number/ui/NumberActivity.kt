package com.karansapplication.app.modules.number.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityNumberBinding
import com.karansapplication.app.modules.code.ui.CodeActivity
import com.karansapplication.app.modules.number.`data`.model.SpinnerGroupFiftyThreeModel
import com.karansapplication.app.modules.number.`data`.viewmodel.NumberVM
import kotlin.String
import kotlin.Unit

class NumberActivity : BaseActivity<ActivityNumberBinding>(R.layout.activity_number) {
  private val viewModel: NumberVM by viewModels<NumberVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFiftyThreeList.value = mutableListOf(
    SpinnerGroupFiftyThreeModel("Item1"),
    SpinnerGroupFiftyThreeModel("Item2"),
    SpinnerGroupFiftyThreeModel("Item3"),
    SpinnerGroupFiftyThreeModel("Item4"),
    SpinnerGroupFiftyThreeModel("Item5")
    )
    val spinnerGroupFiftyThreeAdapter =
    SpinnerGroupFiftyThreeAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFiftyThreeList.value?:
    mutableListOf())
    binding.spinnerGroupFiftyThree.adapter = spinnerGroupFiftyThreeAdapter
    binding.numberVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destIntent = CodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NUMBER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
