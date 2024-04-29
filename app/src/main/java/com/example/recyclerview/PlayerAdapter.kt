package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemListBinding

class PlayerAdapter (private val playerList: ArrayList<Player>):RecyclerView.Adapter<PlayerAdapter.MyViewHolder>() {
    class MyViewHolder(val binding: ItemListBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val player = playerList[position]
        holder.binding.apply{
            profileName.text = player.playerName
            profileDetails.text = player.playerDetails
            profileImage.setImageResource(player.playerImage)
        }
    }
}