package com.example.geminichatbot

import android.graphics.Bitmap

sealed class ChatUiEvent {
    data class UpdatedPrompt(val newPrompt: String) : ChatUiEvent()
    data class SendPrompt(
        val prompt: String,
        val bitmap: Bitmap?
    ) : ChatUiEvent()

}