package com.karansapplication.app.modules.profiledetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.appcomponents.views.DatePickerFragment
import com.karansapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.karansapplication.app.databinding.ActivityProfileDetailsBinding
import com.karansapplication.app.modules.calendar.ui.CalendarActivity
import com.karansapplication.app.modules.profiledetails.`data`.viewmodel.ProfileDetailsVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class ProfileDetailsActivity :
    BaseActivity<ActivityProfileDetailsBinding>(R.layout.activity_profile_details) {
  private val viewModel: ProfileDetailsVM by viewModels<ProfileDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.linearInputCalendar.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearInputCalendar(selectedDate)
      }
    }
    binding.btnConfirm.setOnClickListener {
      val destIntent = CalendarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun onDateSelectedLinearInputCalendar(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "PROFILE_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
