package com.example.musicplayer.data.repository

import com.example.musicplayer.data.ContentResolverHelper
import com.example.musicplayer.data.Inject
import com.example.musicplayer.data.model.Audio
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AudioRepository @Inject
constructor(val contentResolverHelper: ContentResolverHelper) {
    suspend fun getAudioData(): List<Audio> = withContext(Dispatchers.IO){
        contentResolverHelper.getAudioData()
    }
}