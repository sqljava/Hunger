package uz.itschool.hunger.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.hunger.model.Food
import uz.itschool.hunger.R

class FoodAdapter(var foodlist:List<Food>): RecyclerView.Adapter<FoodAdapter.MyHolder>() {
    public class MyHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        var food_name=itemView.findViewById<TextView>(R.id.food_name)
        var comment=itemView.findViewById<TextView>(R.id.coment)
        var image=itemView.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var temp=foodlist.get(position)
        holder.food_name.text=temp.name
        holder.comment.text=temp.comment
        holder.image.setImageResource(temp.Image)
    }

    override fun getItemCount(): Int {
        return  foodlist.size
        notifyDataSetChanged()
    }
}