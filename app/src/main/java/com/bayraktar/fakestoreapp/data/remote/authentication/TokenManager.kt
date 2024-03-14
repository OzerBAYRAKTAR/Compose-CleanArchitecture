package com.bayraktar.fakestoreapp.data.remote.authentication

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import java.io.IOException
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class TokenManager @Inject constructor(@ApplicationContext context: Context) {

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "RATE_KEY")
    private val dataStore = context.dataStore


    val TOKEN_KEY = stringPreferencesKey("token")

    suspend fun saveToken(context: Context, token: String) {
        withContext(Dispatchers.IO) {
            context.dataStore.edit { preferences ->
                preferences[TOKEN_KEY] = token
            }
        }
    }

    suspend fun getToken(): Flow<String> {
        return dataStore.data
            .catch { exception ->
                if (exception is IOException) {
                    emit(emptyPreferences())
                }else{
                    throw exception
                }
            }.map { pref ->
                pref[TOKEN_KEY] ?: ""
            }
    }
}