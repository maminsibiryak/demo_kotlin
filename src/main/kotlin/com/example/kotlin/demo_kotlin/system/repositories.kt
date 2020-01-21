package com.example.kotlin.demo_kotlin.system

import org.springframework.data.repository.*

interface ProductRepository : CrudRepository<Product, Long> // Дает нашему слою работы с данными весь набор CRUD операций