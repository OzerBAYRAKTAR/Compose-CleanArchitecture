package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.Carts
import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.NewCart
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.domain.repository.CartRepository
import retrofit2.Response
import javax.inject.Inject


class CartRepositoryImp @Inject constructor(
     private val pi: CartApiService
):CartRepository {
    override suspend fun getAllCarts(): Response<Carts> {
        TODO("Not yet implemented")
    }

    override suspend fun getSingleCart(id: Int): Response<CartsItem> {
        TODO("Not yet implemented")
    }

    override suspend fun getCartsByLimit(limit: Int): Response<Carts> {
        TODO("Not yet implemented")
    }

    override suspend fun getUserCarts(id: Int): Response<CartsItem> {
        TODO("Not yet implemented")
    }

    override suspend fun createProduct(cart: NewCart): Response<Carts> {
        TODO("Not yet implemented")
    }

    override suspend fun deletecart(id: Int): Response<Void> {
        TODO("Not yet implemented")
    }
}