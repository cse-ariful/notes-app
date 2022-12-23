package com.nightcoder.notesapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nightcoder.notesapplication.databinding.ItemNotesListBinding
import com.nightcoder.notesapplication.domain.models.NotesModel
import java.text.SimpleDateFormat

class NotesListAdapter : RecyclerView.Adapter<NotesListAdapter.ViewHolder>() {
    private val items = mutableListOf<NotesModel>()

    class ViewHolder(private val itemBinding: ItemNotesListBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: NotesModel) {
            itemBinding.title.text = item.title
            itemBinding.summary.text = item.note
            itemBinding.createDate.text = item.createdAt.formatAsDate()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemNotesListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun setItems(data: Iterable<NotesModel>) {
        items.clear()
        items.addAll(data)
        notifyDataSetChanged()
    }
}

val formatter = SimpleDateFormat("MMM, dd yyyy");
private fun Long.formatAsDate(): String? {
    return formatter.format(this)
}
