package com.bayraktar.fakestoreapp.presentation.Products

import androidx.lifecycle.ViewModel
import com.bayraktar.fakestoreapp.data.repositoryImp.CartRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.ProductRepositoryImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    val repo : ProductRepositoryImp
): ViewModel(){
}