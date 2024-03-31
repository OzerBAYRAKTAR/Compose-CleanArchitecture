package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.LoginModel
import com.bayraktar.fakestoreapp.data.model.TokenModel
import com.bayraktar.fakestoreapp.data.remote.api.LoginApiService
import com.bayraktar.fakestoreapp.domain.repository.LoginRepository
import com.bayraktar.fakestoreapp.util.APIResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import retrofit2.Response
import javax.inject.Inject

class LoginRepositoryImp @Inject constructor(
    private val api: LoginApiService
): LoginRepository{
    override suspend fun getLogin(cart: LoginModel): Flow<APIResponse<TokenModel>> {
        return flow{
            try{
                val response = api.getLogin(cart)
                if (response.isSuccessful) {
                    val body = response.body()!!
                    val newModel = body.data
                    emit(APIResponse.Success(newModel))
                } else {
                    emit(
                        APIResponse.Error(
                            errorMsg = response.errorBody()?.charStream().toString()
                        )
                    )
                }
            }catch (e: HttpException){
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