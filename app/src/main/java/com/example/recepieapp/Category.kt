package com.example.recepieapp

data class Category(val idCategory: String, val strCategory: String, val strCategoryDescription: String)

data class CategoriesResponse(val categories: List<Category>)