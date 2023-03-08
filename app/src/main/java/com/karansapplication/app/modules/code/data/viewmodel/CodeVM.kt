package com.karansapplication.app.modules.code.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.karansapplication.app.modules.code.`data`.model.CodeModel
import com.karansapplication.app.modules.code.`data`.model.CodeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CodeVM : ViewModel(), KoinComponent {
  val codeModel: MutableLiveData<CodeModel> = MutableLiveData(CodeModel())

  var navArguments: Bundle? = null

  val codeList: MutableLiveData<MutableList<CodeRowModel>> = MutableLiveData(mutableListOf())
}
