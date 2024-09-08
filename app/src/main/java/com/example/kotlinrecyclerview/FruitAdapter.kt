package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerview.databinding.ListItemFruitBinding

class FruitAdapter(
    val fruits: ArrayList<Fruit>
) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
//        val itemView = LayoutInflater.from(parent.context).inflate(
//            R.layout.list_item_fruit, parent, false
//        )
//        return FruitViewHolder(itemView)

        val binding =
            ListItemFruitBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        return FruitViewHolder(binding)
    }

    // Longer Syntax OR Default Syntax
//    override fun getItemCount(): Int {
//        return fruits.size
//    }

    // shorter syntax
    override fun getItemCount() = fruits.size


    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
//        holder.itemView.binding.tvFruitName.text = fruits[position].name
//        holder.itemView.binding.tvOrigin.text = fruits[position].origin
//        holder.itemView.binding.tvQuantity.text = fruits[position].quantity.toString()

        // Use the binding object in the holder to set the text of views
        holder.binding.tvFruitName.text = fruits[position].name
        holder.binding.tvOrigin.text = fruits[position].origin
        holder.binding.tvQuantity.text = fruits[position].quantity.toString()

    }

//
//    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class FruitViewHolder(val binding: ListItemFruitBinding) : RecyclerView.ViewHolder(binding.root)
}
