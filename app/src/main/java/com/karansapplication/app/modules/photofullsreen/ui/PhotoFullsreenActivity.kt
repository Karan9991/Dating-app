package com.karansapplication.app.modules.photofullsreen.ui

import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityPhotoFullsreenBinding
import com.karansapplication.app.modules.photofullsreen.`data`.viewmodel.PhotoFullsreenVM
import kotlin.String
import kotlin.Unit

class PhotoFullsreenActivity :
    BaseActivity<ActivityPhotoFullsreenBinding>(R.layout.activity_photo_fullsreen) {
  private val viewModel: PhotoFullsreenVM by viewModels<PhotoFullsreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.photoFullsreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PHOTO_FULLSREEN_ACTIVITY"

  }
}
