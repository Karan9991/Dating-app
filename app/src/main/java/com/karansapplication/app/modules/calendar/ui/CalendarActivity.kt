package com.karansapplication.app.modules.calendar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseActivity
import com.karansapplication.app.databinding.ActivityCalendarBinding
import com.karansapplication.app.modules.calendar.`data`.model.CalendarRowModel
import com.karansapplication.app.modules.calendar.`data`.viewmodel.CalendarVM
import com.karansapplication.app.modules.iam.ui.IAmActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalendarActivity : BaseActivity<ActivityCalendarBinding>(R.layout.activity_calendar) {
  private val viewModel: CalendarVM by viewModels<CalendarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val calendarAdapter = CalendarAdapter(viewModel.calendarList.value?:mutableListOf())
    binding.recyclerCalendar.adapter = calendarAdapter
    calendarAdapter.setOnItemClickListener(
    object : CalendarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CalendarRowModel) {
        onClickRecyclerCalendar(view, position, item)
      }
    }
    )
    viewModel.calendarList.observe(this) {
      calendarAdapter.updateData(it)
    }
    binding.calendarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = IAmActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCalendar(
    view: View,
    position: Int,
    item: CalendarRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALENDAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CalendarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
