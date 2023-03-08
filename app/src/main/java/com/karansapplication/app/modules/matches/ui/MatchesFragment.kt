package com.karansapplication.app.modules.matches.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.karansapplication.app.R
import com.karansapplication.app.appcomponents.base.BaseFragment
import com.karansapplication.app.databinding.FragmentMatchesBinding
import com.karansapplication.app.modules.matches.`data`.model.Matches1RowModel
import com.karansapplication.app.modules.matches.`data`.model.MatchesRowModel
import com.karansapplication.app.modules.matches.`data`.viewmodel.MatchesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MatchesFragment : BaseFragment<FragmentMatchesBinding>(R.layout.fragment_matches) {
  private val viewModel: MatchesVM by viewModels<MatchesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val matchesAdapter = MatchesAdapter(viewModel.matchesList.value?:mutableListOf())
    binding.recyclerMatches.adapter = matchesAdapter
    matchesAdapter.setOnItemClickListener(
    object : MatchesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MatchesRowModel) {
        onClickRecyclerMatches(view, position, item)
      }
    }
    )
    viewModel.matchesList.observe(requireActivity()) {
      matchesAdapter.updateData(it)
    }
    val matches1Adapter = Matches1Adapter(viewModel.matches1List.value?:mutableListOf())
    binding.recyclerMatches1.adapter = matches1Adapter
    matches1Adapter.setOnItemClickListener(
    object : Matches1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Matches1RowModel) {
        onClickRecyclerMatches1(view, position, item)
      }
    }
    )
    viewModel.matches1List.observe(requireActivity()) {
      matches1Adapter.updateData(it)
    }
    binding.matchesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMatches(
    view: View,
    position: Int,
    item: MatchesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerMatches1(
    view: View,
    position: Int,
    item: Matches1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MATCHES_FRAGMENT"


    fun getInstance(bundle: Bundle?): MatchesFragment {
      val fragment = MatchesFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
