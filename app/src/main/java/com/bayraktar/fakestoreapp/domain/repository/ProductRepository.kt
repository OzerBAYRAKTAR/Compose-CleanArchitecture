package com.bayraktar.fakestoreapp.domain.repository

import com.bayraktar.fakestoreapp.data.model.Categories
import com.bayraktar.fakestoreapp.data.model.NewProduct
import com.bayraktar.fakestoreapp.data.model.Products
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.data.remote.api.ProductApiService
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import javax.inject.Inject

interface ProductRepository {

    suspend fun getAllProducts(): Flow<APIResponse<List<Products>>>
    suspend fun getSingleProduct(id: Int): Flow<APIResponse<Products>>
    suspend fun getProductByLimit(limit: Int): Flow<APIResponse<List<Products>>>
    suspend fun getAllCategories(): Flow<APIResponse<Categories>>
    suspend fun specificCategorie(Categorie: String): Flow<APIResponse<List<Products>>>
    suspend fun createProduct(@Body product: NewProduct): Flow<APIResponse<Products>>
    suspend fun deleteProduct(id: Int): Flow<APIResponse<Void>>

}