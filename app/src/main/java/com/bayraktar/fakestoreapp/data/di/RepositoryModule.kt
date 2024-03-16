package com.bayraktar.fakestoreapp.data.di

import com.bayraktar.fakestoreapp.data.remote.api.CartApiService
import com.bayraktar.fakestoreapp.data.remote.api.LoginApiService
import com.bayraktar.fakestoreapp.data.remote.api.ProductApiService
import com.bayraktar.fakestoreapp.data.remote.api.UserApiService
import com.bayraktar.fakestoreapp.data.repositoryImp.CartRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.LoginRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.ProductRepositoryImp
import com.bayraktar.fakestoreapp.data.repositoryImp.UserRepositoryImp
import com.bayraktar.fakestoreapp.domain.repository.CartRepository
import com.bayraktar.fakestoreapp.domain.repository.LoginRepository
import com.bayraktar.fakestoreapp.domain.repository.ProductRepository
import com.bayraktar.fakestoreapp.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideCartRepository(api: CartApiService):CartRepository {
        return CartRepositoryImp(api)
    }

    @Provides
    @Singleton
    fun provideLoginRepository(api: LoginApiService):LoginRepository {
        return LoginRepositoryImp(api)
    }

    @Provides
    @Singleton
    fun provideProductRepository(api: ProductApiService):ProductRepository {
        return ProductRepositoryImp(api)
    }

    @Provides
    @Singleton
    fun provideUserRepository(api: UserApiService):UserRepository {
        return UserRepositoryImp(api)
    }
}