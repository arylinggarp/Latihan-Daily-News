package com.arylinggar.tugas.ViewModels

import androidx.lifecycle.ViewModel
import com.arylinggar.tugas.Repos.MainRepository

class MainViewModel(val mainRepository: MainRepository):ViewModel() {
    var currentPage = 0
    val articleLiveData get() = mainRepository.liveData
    fun loadArticles(){
        currentPage++
        mainRepository.getArticles(currentPage.toString())
    }


}