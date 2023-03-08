package com.karansapplication.app.modules.messages.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karansapplication.app.R
import com.karansapplication.app.databinding.RowListphotoSixBinding
import com.karansapplication.app.modules.messages.`data`.model.ListphotoSixRowModel
import kotlin.Int
import kotlin.collections.List

class ListphotoSixAdapter(
  var list: List<ListphotoSixRowModel>
) : RecyclerView.Adapter<ListphotoSixAdapter.RowListphotoSixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListphotoSixVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listphoto_six,parent,false)
    return RowListphotoSixVH(view)
  }

  override fun onBindViewHolder(holder: RowListphotoSixVH, position: Int) {
    val listphotoSixRowModel = ListphotoSixRowModel()
    // TODO uncomment following line after integration with data source
    // val listphotoSixRowModel = list[position]
    holder.binding.listphotoSixRowModel = listphotoSixRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListphotoSixRowModel>) {
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
      item: ListphotoSixRowModel
    ) {
    }
  }

  inner class RowListphotoSixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListphotoSixBinding = RowListphotoSixBinding.bind(itemView)
  }
}
