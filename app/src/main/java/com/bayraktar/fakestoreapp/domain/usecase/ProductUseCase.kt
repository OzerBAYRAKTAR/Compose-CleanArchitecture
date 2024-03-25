package com.bayraktar.fakestoreapp.domain.usecase

import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.repositoryImp.CartRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.ProductRepositoryImp
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class ProductUseCase @Inject constructor(
    private val repo: ProductRepositoryImp
){
    suspend fun getAllProducts() = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllProducts()
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(
                APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(
                APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
    suspend fun getSingleProduct(id: Int) = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getSingleProduct(id)
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(
                APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(
                APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
    suspend fun getProductByLimit(limit: Int) = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getProductByLimit(limit)
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(
                APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(
                APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }
    suspend fun getAllCategories() = flow {
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllCategories()
            emit(APIResponse.Success(users))
        } catch (e: HttpException){
            emit(
                APIResponse.Error(
                e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
            ))
        }catch (e: IOException){
            emit(
                APIResponse.Error(
                e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
            ))
        }
    }

}