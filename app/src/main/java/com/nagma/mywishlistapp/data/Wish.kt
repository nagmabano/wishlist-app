package com.nagma.mywishlistapp.data

data class Wish(
    val id: Long = 0,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf<Wish>(
        Wish(title = "Google watch", description = "pixel density of"),
        Wish(title = "Book", description = "dune trilogy"),
        Wish(title = "mobile", description = "iphone latest series"),
        Wish(title = "Google watch", description = "pixel density of"),
        Wish(title = "Google watch", description = "pixel density of"),
    )
}
