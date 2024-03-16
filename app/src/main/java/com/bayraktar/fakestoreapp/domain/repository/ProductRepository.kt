package com.bayraktar.fakestoreapp.domain.repository

import com.bayraktar.fakestoreapp.data.model.Categories
import com.bayraktar.fakestoreapp.data.model.NewProduct
import com.bayraktar.fakestoreapp.data.model.Products
import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.data.remote.api.ProductApiService
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import javax.inject.Inject

interface ProductRepository {

    suspend fun getAllProducts(): Response<List<Products>>
    suspend fun getSingleProduct(id: Int): Response<Products>
    suspend fun getProductByLimit(limit: Int): Response<List<Products>>
    suspend fun getAllCategories(): Response<Categories>
    suspend fun specificCategorie(Categorie: String): Response<List<Products>>
    suspend fun createProduct(@Body product: NewProduct): Response<Products>
    suspend fun deleteProduct(id: Int): Response<Void>

}