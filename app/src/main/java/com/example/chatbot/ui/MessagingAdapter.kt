package com.example.chatbot.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chatbot.data.Message
import com.example.chatbot.databinding.MessageItemBinding
import com.example.chatbot.utils.Constants.RECEIVE_ID
import com.example.chatbot.utils.Constants.SEND_ID

class MessagingAdapter : RecyclerView.Adapter<MessagingAdapter.MessageViewHolder>() {

    var messagesList = mutableListOf<Message>()

    inner class MessageViewHolder(val binding: MessageItemBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                removeMessage(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val binding = MessageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MessageViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return messagesList.size
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val currentMessage = messagesList[position]
        with(holder.binding) {
            if (currentMessage.id == SEND_ID) {
                tvMessage.text = currentMessage.message
                tvMessage.visibility = android.view.View.VISIBLE
                tvBotMessage.visibility = android.view.View.GONE
            } else if (currentMessage.id == RECEIVE_ID) {
                tvBotMessage.text = currentMessage.message
                tvBotMessage.visibility = android.view.View.VISIBLE
                tvMessage.visibility = android.view.View.GONE
            }
        }
    }

    fun insertMessage(message: Message) {
        messagesList.add(message)
        notifyItemInserted(messagesList.size - 1)
    }

    private fun removeMessage(position: Int) {
        if (position != RecyclerView.NO_POSITION) {
            messagesList.removeAt(position)
            notifyItemRemoved(position)
        }
    }
}
