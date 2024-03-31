package com.bayraktar.fakestoreapp.data.remote.api

import com.bayraktar.fakestoreapp.data.model.Carts
import com.bayraktar.fakestoreapp.data.model.Categories
import com.bayraktar.fakestoreapp.data.model.NewProduct
import com.bayraktar.fakestoreapp.data.model.Products
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ProductApiService {

    @GET("/products")
    suspend fun getAllProducts(
    ): Response<APIResponse<List<Products>>>

    @GET("/products/{id}")
    suspend fun getSingleProduct(
        @Path("id") id: Int
    ): Response<APIResponse<Products>>


    @GET("/products/{limit}")
    suspend fun getProductByLimit(
        @Path("limit") limit: Int
    ): Response<APIResponse<List<Products>>>


    @GET("/products/categories")
    suspend fun getAllCategories(
    ): Response<APIResponse<List<String>>>

    @GET("/products/categories/{Categorie}")
    suspend fun specificCategorie(
        @Path("Categorie") Categorie: String
    ): Response<APIResponse<List<Products>>>

    @POST("/products")
    suspend fun createProduct(@Body product: NewProduct
    ): Response<APIResponse<Products>>

    @DELETE("products/{id}")
    suspend fun deleteProduct(
        @Path("id") id: Int
    ):Response<APIResponse<Void>>

}