package com.bayraktar.fakestoreapp.presentation.Main

import androidx.lifecycle.ViewModel
import com.bayraktar.fakestoreapp.data.repositoryImp.CartRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.UserRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val repo : UserRepositoryImp
): ViewModel(){
}