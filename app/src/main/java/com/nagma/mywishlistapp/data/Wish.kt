package com.nagma.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
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
