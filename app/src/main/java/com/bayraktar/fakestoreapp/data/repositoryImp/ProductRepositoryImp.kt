package com.bayraktar.fakestoreapp.data.repositoryImp

import com.bayraktar.fakestoreapp.data.model.Categories
import com.bayraktar.fakestoreapp.data.model.NewProduct
import com.bayraktar.fakestoreapp.data.model.Products
import com.bayraktar.fakestoreapp.data.remote.api.ProductApiService
import com.bayraktar.fakestoreapp.domain.repository.ProductRepository
import com.bayraktar.fakestoreapp.util.APIResponse
import com.bayraktar.fakestoreapp.util.BaseResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class ProductRepositoryImp @Inject constructor(
    private val api: ProductApiService
):ProductRepository{
    override suspend fun getAllProducts(): Flow<APIResponse<BaseResponse<List<Products>>>> {
        return api.getAllProducts()
    }

    override suspend fun getSingleProduct(id: Int): Flow<APIResponse<BaseResponse<Products>>> {
        return api.getSingleProduct(id)
    }

    override suspend fun getProductByLimit(limit: Int): Flow<APIResponse<BaseResponse<List<Products>>>> {
        return api.getProductByLimit(limit)
    }

    override suspend fun getAllCategories(): Flow<APIResponse<BaseResponse<Categories>>> {
        return api.getAllCategories()
    }

    override suspend fun specificCategorie(categorie: String): Flow<APIResponse<BaseResponse<List<Products>>>> {
        return api.specificCategorie(categorie)
    }

    override suspend fun createProduct(product: NewProduct): Flow<APIResponse<BaseResponse<Products>>> {
        return api.createProduct(product)
    }

    override suspend fun deleteProduct(id: Int): Flow<APIResponse<BaseResponse<Void>>> {
        return api.deleteProduct(id)
    }

}