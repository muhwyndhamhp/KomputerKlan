package com.example.muhwyndham.komputerklan.model

import android.arch.lifecycle.MutableLiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao
interface ComponentDao {

    @get:Query("SELECT * FROM components")
    val getAll: List<Component>

    @Query("SELECT * FROM components WHERE category_description =:category")
    fun getComponentsByCategory(category: String) : MutableLiveData<List<Component>>

    @Query("SELECT * FROM components WHERE category_description =:category AND :string IN (category_description, subcategory_description, name, details, brand_description, link_bukalapak, link_shopee, link_toped)")
    fun getComponentsByString(category: String, string: String): MutableLiveData<List<Component>>
}