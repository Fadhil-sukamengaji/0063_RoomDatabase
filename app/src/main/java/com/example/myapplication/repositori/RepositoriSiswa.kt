package com.example.myapplication.repositori

import com.example.myapplication.room.Siswa
import com.example.myapplication.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>

    suspend fun insertSiswa(siswa: Siswa)
}

