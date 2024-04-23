package com.bayraktar.fakestoreapp.presentation.Main

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bayraktar.fakestoreapp.R

const val TAG = "MainScreen"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {
            BottomAppBar {
                IconButton(onClick = { Log.d(TAG, "Main Screen") }) {
                    Icon(R.drawable.homee, contentDescription = "Main")
                }
                Spacer(Modifier.weight(1f, true))
                IconButton(onClick = { Log.d(TAG, "Products Screen") }) {
                    Icon(R.drawable.prodcttt, contentDescription = "Products")
                }
                Spacer(Modifier.weight(1f, true))
                IconButton(onClick = { Log.d(TAG, "Carts Screen") }) {
                    Icon(R.drawable.carttt, contentDescription = "Carts")
                }
            }
        }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }
}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Main content goes here")
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}