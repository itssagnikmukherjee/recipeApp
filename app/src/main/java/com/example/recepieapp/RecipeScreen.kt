package com.example.recepieapp
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun RecipeScreen(modifier: Modifier){
    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoryState
    Box(){
        when{
            viewState.loading->{
                CircularProgressIndicator(modifier.align(Alignment.Center))
            }
            viewState.error != null ->{

            }
        }
    }
}

