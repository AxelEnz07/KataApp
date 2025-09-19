package com.grupodiniz.kataplumapp.ui.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.grupodiniz.kataplumapp.R
import com.grupodiniz.kataplumapp.databinding.ItemAttractionListBinding

class AttractionsViewAdapter(
): RecyclerView.Adapter<AttractionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttractionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AttractionViewHolder(layoutInflater.inflate(R.layout.item_attraction_list, parent, false))
    }

    override fun onBindViewHolder(holder: AttractionViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = 4
}

class AttractionViewHolder(
    view: View
): RecyclerView.ViewHolder(view) {

    private val tag = AttractionViewHolder::class.simpleName
    private val binding = ItemAttractionListBinding.bind(view)

    fun bind() {

    }

}