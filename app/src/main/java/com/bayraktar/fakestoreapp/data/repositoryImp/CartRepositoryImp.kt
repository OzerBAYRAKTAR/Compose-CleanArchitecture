package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.Carts
import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.NewCart
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.domain.repository.CartRepository
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject


class CartRepositoryImp @Inject constructor(
     private val api: CartApiService
):CartRepository {
    override suspend fun getAllCarts(): Flow<APIResponse<BaseResponse<Carts>>> {
        return api.getAllCarts()
    }

    override suspend fun getSingleCart(id: Int): Flow<APIResponse<BaseResponse<CartsItem>>> {
        return api.getSingleCart(id)
    }

    override suspend fun getCartsByLimit(limit: Int): Flow<APIResponse<BaseResponse<Carts>>> {
        return api.getCartsByLimit(limit)
    }

    override suspend fun getUserCarts(id: Int): Flow<APIResponse<BaseResponse<CartsItem>>> {
        return api.getUserCarts(id)
    }

    override suspend fun createProduct(cart: NewCart): Flow<APIResponse<BaseResponse<Carts>>> {
        return api.createProduct(cart)
    }

    override suspend fun deletecart(id: Int): Flow<APIResponse<BaseResponse<Void>>> {
        return  api.deletecart(id)
    }

}