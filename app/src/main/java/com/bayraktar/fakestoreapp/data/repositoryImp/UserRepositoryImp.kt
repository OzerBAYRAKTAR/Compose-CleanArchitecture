package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.Users
import com.bayraktar.fakestoreapp.data.model.UsersItem
import com.bayraktar.fakestoreapp.data.remote.api.UserApiService
import com.bayraktar.fakestoreapp.domain.repository.UserRepository
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import retrofit2.Response
import javax.inject.Inject

class UserRepositoryImp @Inject constructor(
    private val api: UserApiService
):UserRepository {
    override suspend fun getAllUsers(): Flow<APIResponse<List<UsersItem>>> {
        return flow {
            try {
                val response = api.getAllUsers()
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

    override suspend fun getSingleUser(id: Int): Flow<APIResponse<UsersItem>> {
        return flow {
            try {
                val response = api.getSingleUser(id)
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

    override suspend fun getUserByLimit(limit: Int): Flow<APIResponse<List<UsersItem>>> {
        return flow {
            try {
                val response = api.getUserByLimit(limit)
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