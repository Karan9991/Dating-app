package com.karansapplication.app.modules.maincontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityMainContainerBinding
import com.karansapplication.app.extensions.loadFragment
import com.karansapplication.app.modules.main.ui.MainFragment
import com.karansapplication.app.modules.maincontainer.`data`.viewmodel.MainContainerVM
import com.karansapplication.app.modules.matches.ui.MatchesFragment
import com.karansapplication.app.modules.messages.ui.MessagesFragment
import kotlin.String
import kotlin.Unit

class MainContainerActivity :
    BaseActivity<ActivityMainContainerBinding>(R.layout.activity_main_container) {
  private val viewModel: MainContainerVM by viewModels<MainContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainContainerVM = viewModel
    val destFragment = MainFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = MainFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linear1Homeactive.setOnClickListener {
      val destFragment = MainFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = MainFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageMenu.setOnClickListener {
      val destFragment = MessagesFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = MessagesFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageComputer.setOnClickListener {
      val destFragment = MatchesFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = MatchesFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "MAIN_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MainContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
