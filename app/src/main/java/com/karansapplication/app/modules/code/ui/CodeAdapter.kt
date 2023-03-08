package com.karansapplication.app.modules.code.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karansapplication.app.R
import com.karansapplication.app.databinding.RowCodeBinding
import com.karansapplication.app.modules.code.`data`.model.CodeRowModel
import kotlin.Int
import kotlin.collections.List

class CodeAdapter(
  var list: List<CodeRowModel>
) : RecyclerView.Adapter<CodeAdapter.RowCodeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCodeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_code,parent,false)
    return RowCodeVH(view)
  }

  override fun onBindViewHolder(holder: RowCodeVH, position: Int) {
    val codeRowModel = CodeRowModel()
    // TODO uncomment following line after integration with data source
    // val codeRowModel = list[position]
    holder.binding.codeRowModel = codeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CodeRowModel>) {
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
      item: CodeRowModel
    ) {
    }
  }

  inner class RowCodeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCodeBinding = RowCodeBinding.bind(itemView)
  }
}
