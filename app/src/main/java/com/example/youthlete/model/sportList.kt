package com.example.youthlete.model

import com.example.youthlete.R

object sportList {
    val sportss = listOf(
        Sports(
            "Sepak Bola",
            "30",
            R.drawable.soccer_image,
            listOf(
                Course("Pengenalan Sepak Bola", "John Doe", "Senin, 15:00 - 17:00"),
                Course("Teknik Dasar Sepak Bola", "Jane Smith", "Rabu, 16:00 - 18:00"),
                Course("Strategi Permainan", "Michael Johnson", "Jumat, 14:00 - 16:00")
            )
        ),
        Sports(
            "Bulutangkis",
            "40",
            R.drawable.badminton_image,
            listOf(
                Course("Pengenalan Bulutangkis", "John Doe", "Selasa, 13:00 - 15:00"),
                Course("Teknik Dasar Bulutangkis", "Jane Smith", "Kamis, 14:00 - 16:00"),
                Course("Strategi Bermain", "Michael Johnson", "Sabtu, 09:00 - 11:00")
            )
        ),
        Sports(
            "Renang",
            "50",
            R.drawable.swimming_image,
            listOf(
                Course("Pengenalan Renang", "John Doe", "Senin, 10:00 - 12:00"),
                Course("Teknik Dasar Renang", "Jane Smith", "Rabu, 11:00 - 13:00"),
                Course("Gaya Kupu-kupu", "Michael Johnson", "Jumat, 08:00 - 10:00")
            )
        )
    )
}