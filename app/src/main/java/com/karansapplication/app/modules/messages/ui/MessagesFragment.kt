package com.karansapplication.app.modules.messages.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseFragment
import com.karansapplication.app.databinding.FragmentMessagesBinding
import com.karansapplication.app.modules.chat.ui.ChatActivity
import com.karansapplication.app.modules.messages.`data`.model.ListphotoFourRowModel
import com.karansapplication.app.modules.messages.`data`.model.ListphotoSixRowModel
import com.karansapplication.app.modules.messages.`data`.viewmodel.MessagesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessagesFragment : BaseFragment<FragmentMessagesBinding>(R.layout.fragment_messages) {
  private val viewModel: MessagesVM by viewModels<MessagesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listphotoFourAdapter =
    ListphotoFourAdapter(viewModel.listphotoFourList.value?:mutableListOf())
    binding.recyclerListphotoFour.adapter = listphotoFourAdapter
    listphotoFourAdapter.setOnItemClickListener(
    object : ListphotoFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListphotoFourRowModel) {
        onClickRecyclerListphotoFour(view, position, item)
      }
    }
    )
    viewModel.listphotoFourList.observe(requireActivity()) {
      listphotoFourAdapter.updateData(it)
    }
    val listphotoSixAdapter =
    ListphotoSixAdapter(viewModel.listphotoSixList.value?:mutableListOf())
    binding.recyclerListphotoSix.adapter = listphotoSixAdapter
    listphotoSixAdapter.setOnItemClickListener(
    object : ListphotoSixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListphotoSixRowModel) {
        onClickRecyclerListphotoSix(view, position, item)
      }
    }
    )
    viewModel.listphotoSixList.observe(requireActivity()) {
      listphotoSixAdapter.updateData(it)
    }
    binding.messagesVM = viewModel
    setUpSearchViewInputtextnoneListener()
  }

  override fun setUpClicks(): Unit {
    binding.linear2Messages.setOnClickListener {
      val destIntent = ChatActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListphotoFour(
    view: View,
    position: Int,
    item: ListphotoFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListphotoSix(
    view: View,
    position: Int,
    item: ListphotoSixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewInputtextnoneListener(): Unit {
    binding.searchViewInputtextnone.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "MESSAGES_FRAGMENT"


      fun getInstance(bundle: Bundle?): MessagesFragment {
        val fragment = MessagesFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
