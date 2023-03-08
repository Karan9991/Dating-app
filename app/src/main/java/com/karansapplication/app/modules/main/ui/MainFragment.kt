package com.karansapplication.app.modules.main.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseFragment
import com.karansapplication.app.databinding.FragmentMainBinding
import com.karansapplication.app.modules.main.`data`.viewmodel.MainVM
import kotlin.String
import kotlin.Unit

class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {
  private val viewModel: MainVM by viewModels<MainVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.mainVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "MAIN_FRAGMENT"


    fun getInstance(bundle: Bundle?): MainFragment {
      val fragment = MainFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
