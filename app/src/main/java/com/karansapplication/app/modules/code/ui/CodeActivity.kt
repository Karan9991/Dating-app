package com.karansapplication.app.modules.code.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityCodeBinding
import com.karansapplication.app.modules.code.`data`.model.CodeRowModel
import com.karansapplication.app.modules.code.`data`.viewmodel.CodeVM
import com.karansapplication.app.modules.profiledetails.ui.ProfileDetailsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CodeActivity : BaseActivity<ActivityCodeBinding>(R.layout.activity_code) {
  private val viewModel: CodeVM by viewModels<CodeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val codeAdapter = CodeAdapter(viewModel.codeList.value?:mutableListOf())
    binding.recyclerCode.adapter = codeAdapter
    codeAdapter.setOnItemClickListener(
    object : CodeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CodeRowModel) {
        onClickRecyclerCode(view, position, item)
      }
    }
    )
    viewModel.codeList.observe(this) {
      codeAdapter.updateData(it)
    }
    binding.codeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.otpViewOtpview.setOnClickListener {
      val destIntent = ProfileDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerCode(
    view: View,
    position: Int,
    item: CodeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CODE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CodeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
