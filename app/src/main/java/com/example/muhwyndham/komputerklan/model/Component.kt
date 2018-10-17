package com.example.muhwyndham.komputerklan.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "components", indices = [Index(value = ["id"], unique = true)])
data class Component(
        @field:PrimaryKey
        val id: Int,
        val name: String,
        val details: String,
        val brand: Int,
        val category: Int,
        val subcategory: Int,
        val brand_description: String,
        val category_description: String,
        val subcategory_description: String,
        val price: Long,
        val weight: Long,
        val quantity: Int,
        val stock_type: Int,
        val link_toped: String,
        val link_shopee: String,
        val link_bukalapak: String
)
