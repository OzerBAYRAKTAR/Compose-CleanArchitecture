package com.bayraktar.fakestoreapp.data.remote.api

import com.bayraktar.fakestoreapp.data.model.Categories
import com.bayraktar.fakestoreapp.data.model.NewProduct
import com.bayraktar.fakestoreapp.data.model.Products
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ProductApiService {

    @GET("/products")
    suspend fun getAllProducts(
    ): Response<List<Products>>

    @GET("/products/{id}")
    suspend fun getSingleProduct(
        @Path("id") id: Int
    ): Response<Products>


    @GET("/products/{limit}")
    suspend fun getProductByLimit(
        @Path("limit") limit: Int
    ): Response<List<Products>>


    @GET("/products/categories")
    suspend fun getAllCategories(
    ): Response<Categories>

    @GET("/products/categories/{Categorie}")
    suspend fun specificCategorie(
        @Path("Categorie") Categorie: String
    ): Response<List<Products>>

    @POST("/products")
    suspend fun createProduct(@Body product: NewProduct): Response<Products>

    @DELETE("products/{id}")
    suspend fun deleteProduct(
        @Path("id") id: Int
    ):Response<Void>

}