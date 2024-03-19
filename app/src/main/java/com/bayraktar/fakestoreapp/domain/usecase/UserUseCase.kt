package com.bayraktar.fakestoreapp.domain.usecase

import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.repositoryImp.UserRepositoryImp
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import okio.IOException
import retrofit2.HttpException
import java.util.concurrent.Flow
import javax.inject.Inject

class UserUseCase @Inject constructor(
    private val repo: UserRepositoryImp
){

    suspend fun getAllUsers() = flow{
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val users = repo.getAllUsers()
            emit(APIResponse.Success(users))
        } catch (e: HttpException) {
            emit(
                APIResponse.Error(
                    e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                )
            )
        } catch (e: IOException) {
            emit(
                APIResponse.Error(
                    e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                )
            )
        }
    }

    suspend fun getSingleUser(id: Int) = flow{
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val user = repo.getSingleUser(id)
            emit(APIResponse.Success(user))
        } catch (e: HttpException) {
            emit(
                APIResponse.Error(
                    e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                )
            )
        } catch (e: IOException) {
            emit(
                APIResponse.Error(
                    e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                )
            )
        }
    }
    suspend fun getUserByLimit(limit: Int) = flow{
        try {
            emit(APIResponse.Loading<BaseResponse<Users>>())
            val user = repo.getUserByLimit(limit)
            emit(APIResponse.Success(user))
        } catch (e: HttpException) {
            emit(
                APIResponse.Error(
                    e.localizedMessage ?: "Beklenmeyen bir hata oluştu"
                )
            )
        } catch (e: IOException) {
            emit(
                APIResponse.Error(
                    e.localizedMessage ?: "Sunucuya ulaşılamıyor. İnternet bağlantınızı kontrol edin"
                )
            )
        }
    }
}