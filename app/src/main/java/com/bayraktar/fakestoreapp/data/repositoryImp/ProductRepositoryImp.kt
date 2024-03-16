package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.Categories
import com.bayraktar.fakestoreapp.data.model.NewProduct
import com.bayraktar.fakestoreapp.data.model.Products
import com.bayraktar.fakestoreapp.data.remote.api.ProductApiService
import com.bayraktar.fakestoreapp.domain.repository.ProductRepository
import retrofit2.Response
import javax.inject.Inject

class ProductRepositoryImp @Inject constructor(
    private val api: ProductApiService
):ProductRepository{
    override suspend fun getAllProducts(): Response<List<Products>> {
        TODO("Not yet implemented")
    }

    override suspend fun getSingleProduct(id: Int): Response<Products> {
        TODO("Not yet implemented")
    }

    override suspend fun getProductByLimit(limit: Int): Response<List<Products>> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllCategories(): Response<Categories> {
        TODO("Not yet implemented")
    }

    override suspend fun specificCategorie(Categorie: String): Response<List<Products>> {
        TODO("Not yet implemented")
    }

    override suspend fun createProduct(product: NewProduct): Response<Products> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteProduct(id: Int): Response<Void> {
        TODO("Not yet implemented")
    }
}