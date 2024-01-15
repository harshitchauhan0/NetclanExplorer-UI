package com.harshit.netclan.explore

data class MyModel(
    val name: String,
    val address: String,
    val interests: List<String>,
    val status: String,
    val imageResId: String // Adding image resource ID attribute
)

