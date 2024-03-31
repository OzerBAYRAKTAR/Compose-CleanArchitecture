package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.CartsItem
import com.bayraktar.fakestoreapp.data.model.Categories
import com.bayraktar.fakestoreapp.data.model.NewProduct
import com.bayraktar.fakestoreapp.data.model.Products
import com.bayraktar.fakestoreapp.data.remote.api.ProductApiService
import com.bayraktar.fakestoreapp.domain.repository.ProductRepository
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class ProductRepositoryImp @Inject constructor(
    private val api: ProductApiService
):ProductRepository{
    override suspend fun getAllProducts(): Flow<APIResponse<List<Products>>> {
        return flow {
            try {
                val response = api.getAllProducts()
                if (response.isSuccessful) {
                    val body = response.body()!!
                    val carts = mutableListOf<Products>()
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

    override suspend fun getSingleProduct(id: Int): Flow<APIResponse<Products>> {
        return flow {
            try {
                val response = api.getSingleProduct(id)
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

    override suspend fun getProductByLimit(limit: Int): Flow<APIResponse<List<Products>>> {
        return flow {
            try {
                val response = api.getProductByLimit(limit)
                if (response.isSuccessful) {
                    val body = response.body()!!
                    val products = mutableListOf<Products>()
                    products.addAll(body.data!!)
                    emit(APIResponse.Success(products))
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

    override suspend fun getAllCategories(): Flow<APIResponse<List<String>>> {
        return flow {
            try {
                val response = api.getAllCategories()
                if (response.isSuccessful) {
                    val body = response.body()!!
                    val categories = mutableListOf<String>()
                    categories.addAll(body.data!!)
                    emit(APIResponse.Success(categories))
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

    override suspend fun specificCategorie(Categorie: String): Flow<APIResponse<List<Products>>> {
        return flow {
            try {
                val response = api.specificCategorie(Categorie)
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

    override suspend fun createProduct(product: NewProduct): Flow<APIResponse<Products>> {
        return flow {
            try {
                val response = api.createProduct(product)
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

    override suspend fun deleteProduct(id: Int): Flow<APIResponse<Void>> {
        return flow {
            try {
                val response = api.deleteProduct(id)
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