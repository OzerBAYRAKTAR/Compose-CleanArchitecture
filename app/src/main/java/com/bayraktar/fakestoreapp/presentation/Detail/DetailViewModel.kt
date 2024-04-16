package com.bayraktar.fakestoreapp.presentation.Detail

import androidx.lifecycle.ViewModel
import com.bayraktar.fakestoreapp.data.repositoryImp.CartRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.ProductRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.UserRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    val repoCart : CartRepositoryImp,
    val repoProduct : ProductRepositoryImp,
    val repoUser : UserRepositoryImp,
): ViewModel(){
}