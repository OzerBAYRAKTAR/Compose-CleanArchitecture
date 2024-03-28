package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.Carts
import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.NewCart
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.domain.repository.CartRepository
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import retrofit2.Response
import javax.inject.Inject


class CartRepositoryImp @Inject constructor(
     private val api: CartApiService
):CartRepository {
    override suspend fun getAllCarts(): Flow<APIResponse<List<CartsItem>>>{
        return flow {
            try {
                val response = api.getAllCarts()
                if (response.isSuccessful) {
                    val body = response.body()!!
                    val carts = mutableListOf<CartsItem>()
                    carts.addAll(body.data!!)
                    emit(APIResponse.Success(carts))
                } else {
                    emit(
                        APIResponse.Error(
                            errorMsg = response.errorBody()?.charStream().toString()
                        )
                    )
                }
            } catch (e: HttpException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                ))
            }catch (e: IOException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                ))
            }
        }
    }

    override suspend fun getSingleCart(id: Int): Flow<APIResponse<CartsItem>> {
        return flow {
            try {
                val response = api.getSingleCart(id)
                if (response.isSuccessful) {
                    val body = response.body()!!
                    emit(APIResponse.Success(body.data))
                } else {
                    emit(
                        APIResponse.Error(
                            errorMsg = response.errorBody()?.charStream().toString()
                        )
                    )
                }
            } catch (e: HttpException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                ))
            }catch (e: IOException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                ))
            }
        }
    }

    override suspend fun getCartsByLimit(limit: Int): Flow<APIResponse<List<CartsItem>>> {
        return flow {
            try {
                val response = api.getCartsByLimit(limit)
                if (response.isSuccessful) {
                    val body = response.body()!!
                    emit(APIResponse.Success(body.data))
                } else {
                    emit(
                        APIResponse.Error(
                            errorMsg = response.errorBody()?.charStream().toString()
                        )
                    )
                }
            } catch (e: HttpException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                ))
            }catch (e: IOException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                ))
            }
        }
    }

    override suspend fun getUserCarts(id: Int): Flow<APIResponse<CartsItem>> {
        return flow {
            try {
                val response = api.getUserCarts(id)
                if (response.isSuccessful) {
                    val body = response.body()!!
                    emit(APIResponse.Success(body.data))
                } else {
                    emit(
                        APIResponse.Error(
                            errorMsg = response.errorBody()?.charStream().toString()
                        )
                    )
                }
            } catch (e: HttpException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                ))
            }catch (e: IOException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                ))
            }
        }
    }

    override suspend fun createProduct(cart: NewCart): Flow<APIResponse<CartsItem>> {
        return flow {
            try {
                val response = api.createProduct(cart)
                if (response.isSuccessful) {
                    val body = response.body()!!
                    emit(APIResponse.Success(body.data))
                } else {
                    emit(
                        APIResponse.Error(
                            errorMsg = response.errorBody()?.charStream().toString()
                        )
                    )
                }
            } catch (e: HttpException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                ))
            }catch (e: IOException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                ))
            }
        }
    }

    override suspend fun deletecart(id: Int): Flow<APIResponse<Void>> {
        return flow {
            try {
                val response = api.deletecart(id)
                if (response.isSuccessful) {
                    val body = response.body()!!
                    emit(APIResponse.Success(body.data))
                } else {
                    emit(
                        APIResponse.Error(
                            errorMsg = response.errorBody()?.charStream().toString()
                        )
                    )
                }
            } catch (e: HttpException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                ))
            }catch (e: IOException){
                emit(APIResponse.Error(
                    errorMsg = e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                ))
            }
        }
    }

}