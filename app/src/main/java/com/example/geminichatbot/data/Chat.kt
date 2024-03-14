package com.example.geminichatbot.data

import android.graphics.Bitmap
import android.hardware.biometrics.BiometricPrompt

data class Chat(
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)
