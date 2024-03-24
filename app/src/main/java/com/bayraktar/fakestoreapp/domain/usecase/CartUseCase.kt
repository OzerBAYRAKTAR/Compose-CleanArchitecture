package com.bayraktar.fakestoreapp.domain.usecase

import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.repositoryImp.CartRepositoryImp
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class CartUseCase @Inject constructor(
    private val repo: CartRepositoryImp
) {
    suspend fun getAllCarts() = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllCarts()
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
    suspend fun getSingleCart() = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllCarts()
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
    suspend fun getCartsByLimit() = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllCarts()
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
    suspend fun getUserCarts() = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllCarts()
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
    suspend fun createProduct() = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllCarts()
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
    suspend fun deletecart() = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllCarts()
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
}