package com.karansapplication.app.modules.messages.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karansapplication.app.R
import com.karansapplication.app.databinding.RowListphotoFourBinding
import com.karansapplication.app.modules.messages.`data`.model.ListphotoFourRowModel
import kotlin.Int
import kotlin.collections.List

class ListphotoFourAdapter(
  var list: List<ListphotoFourRowModel>
) : RecyclerView.Adapter<ListphotoFourAdapter.RowListphotoFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListphotoFourVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listphoto_four,parent,false)
    return RowListphotoFourVH(view)
  }

  override fun onBindViewHolder(holder: RowListphotoFourVH, position: Int) {
    val listphotoFourRowModel = ListphotoFourRowModel()
    // TODO uncomment following line after integration with data source
    // val listphotoFourRowModel = list[position]
    holder.binding.listphotoFourRowModel = listphotoFourRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListphotoFourRowModel>) {
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
      item: ListphotoFourRowModel
    ) {
    }
  }

  inner class RowListphotoFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListphotoFourBinding = RowListphotoFourBinding.bind(itemView)
  }
}
