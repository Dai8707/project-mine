package com.modularhub.feature.mine

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.modularhub.feature.mine.databinding.ItemMineMenuBinding

class MineAdapter(private val items: List<MineMenuItem>) :
    RecyclerView.Adapter<MineAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemMineMenuBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMineMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.binding.tvTitle.text = item.title
        holder.binding.tvSubtitle.text = item.subtitle
    }

    override fun getItemCount(): Int = items.size
}
