package com.example.youthlete.model

data class Sports(
    val name: String,
    val kursus: String,
    val imageResId: Int,
    val courses: List<Course>
)

data class Course(
    val name: String,
    val instructor: String,
    val schedule: String
)