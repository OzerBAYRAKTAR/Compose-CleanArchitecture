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
        TODO("Not yet implemented")
    }

    override suspend fun getSingleProduct(id: Int): Flow<APIResponse<BaseResponse<Products>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getProductByLimit(limit: Int): Flow<APIResponse<BaseResponse<List<Products>>>> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllCategories(): Flow<APIResponse<BaseResponse<Categories>>> {
        TODO("Not yet implemented")
    }

    override suspend fun specificCategorie(Categorie: String): Flow<APIResponse<BaseResponse<List<Products>>>> {
        TODO("Not yet implemented")
    }

    override suspend fun createProduct(product: NewProduct): Flow<APIResponse<BaseResponse<Products>>> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteProduct(id: Int): Flow<APIResponse<BaseResponse<Void>>> {
        TODO("Not yet implemented")
    }

}