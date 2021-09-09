package com.course.crudsqlite.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.course.crudsqlite.R
import com.course.crudsqlite.room.Note
import kotlinx.android.synthetic.main.adapter_note.view.*

class NoteAdapter ( private val notes: ArrayList<Note>) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
            LayoutInflater.from(parent.context).inflate( R.layout.adapter_note, parent, false )
        )
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.view.text_title.text = note.title
    }

    override fun getItemCount() = notes.size

    class NoteViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    fun setData(list: List<Note>) {
        notes.clear()
        notes.addAll(list)
        notifyDataSetChanged()
    }

}