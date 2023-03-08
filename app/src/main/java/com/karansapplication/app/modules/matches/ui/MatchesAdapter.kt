package com.karansapplication.app.modules.matches.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karansapplication.app.R
import com.karansapplication.app.databinding.RowMatchesBinding
import com.karansapplication.app.modules.matches.`data`.model.MatchesRowModel
import kotlin.Int
import kotlin.collections.List

class MatchesAdapter(
  var list: List<MatchesRowModel>
) : RecyclerView.Adapter<MatchesAdapter.RowMatchesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMatchesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_matches,parent,false)
    return RowMatchesVH(view)
  }

  override fun onBindViewHolder(holder: RowMatchesVH, position: Int) {
    val matchesRowModel = MatchesRowModel()
    // TODO uncomment following line after integration with data source
    // val matchesRowModel = list[position]
    holder.binding.matchesRowModel = matchesRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MatchesRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MatchesRowModel
    ) {
    }
  }

  inner class RowMatchesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMatchesBinding = RowMatchesBinding.bind(itemView)
  }
}
