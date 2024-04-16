package com.bayraktar.fakestoreapp.presentation.Carts

import androidx.lifecycle.ViewModel
import com.bayraktar.fakestoreapp.data.repositoryImp.CartRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CartsViewModel @Inject constructor(
    val repo : CartRepositoryImp
):ViewModel(){
}