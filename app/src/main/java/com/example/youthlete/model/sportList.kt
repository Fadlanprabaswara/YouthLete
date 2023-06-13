package com.example.youthlete.model

import com.example.youthlete.R

object sportList {
    val sportss = listOf(
        Sports(
            "Sepak Bola",
            "30",
            R.drawable.soccer_image,
            "sepak bola adalah sebuah cabang olahraga yang menggunakan sebuah bola yang terbuat dari kulit atau karet dan dimainkan oleh dua tim, yang mana masing-masing Tim terdiri dari sebelas pemain dan ada juga beberapa pemain yang berperan sebagai pemain pengganti",
            listOf(
                Course("Pengenalan Sepak Bola"),
                Course("Teknik Dasar Sepak Bola"),
                Course("Strategi Permainan")
            )
        ),
        Sports(
            "Bulutangkis",
            "40",
            R.drawable.badminton_image,
            " Bulu tangkis adalah suatu olahraga raket yang dimainkan oleh dua orang (untuk tunggal) atau dua pasangan (untuk ganda) yang saling berlawanan. Di Indonesia, bulu tangkis termasuk satu di antara olahraga populer.",
            listOf(
                Course("Pengenalan Bulutangkis"),
                Course("Teknik Dasar Bulutangkis"),
                Course("Strategi Bermain")
            )
        ),
        Sports(
            "Renang",
            "50",
            R.drawable.swimming_image,
            " Renang merupakan satu di antara cabang olahraga akuatik. Renang adalah upaya untuk menggerakkan (mengapungkan atau mengangkat) semua bagian tubuh ke atas permukaan air.",
            listOf(
                Course("Pengenalan Renang"),
                Course("Teknik Dasar Renang"),
                Course("Gaya Kupu-kupu")
            )
        )
    )
}