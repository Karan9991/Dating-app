package com.karansapplication.app.modules.matches.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karansapplication.app.R
import com.karansapplication.app.databinding.RowMatches1Binding
import com.karansapplication.app.modules.matches.`data`.model.Matches1RowModel
import kotlin.Int
import kotlin.collections.List

class Matches1Adapter(
  var list: List<Matches1RowModel>
) : RecyclerView.Adapter<Matches1Adapter.RowMatches1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMatches1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_matches1,parent,false)
    return RowMatches1VH(view)
  }

  override fun onBindViewHolder(holder: RowMatches1VH, position: Int) {
    val matches1RowModel = Matches1RowModel()
    // TODO uncomment following line after integration with data source
    // val matches1RowModel = list[position]
    holder.binding.matches1RowModel = matches1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Matches1RowModel>) {
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
      item: Matches1RowModel
    ) {
    }
  }

  inner class RowMatches1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMatches1Binding = RowMatches1Binding.bind(itemView)
  }
}
