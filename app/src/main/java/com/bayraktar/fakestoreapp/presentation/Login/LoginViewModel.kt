package com.bayraktar.fakestoreapp.presentation.Login

import androidx.lifecycle.ViewModel
import com.bayraktar.fakestoreapp.data.repositoryImp.CartRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.LoginRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    val repo : LoginRepositoryImp
): ViewModel(){
}