package uz.itschool.hunger.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import uz.itschool.hunger.R
import uz.itschool.hunger.model.FoodTypes

class FoodTypesAdapter(var listFoods:List<FoodTypes>): RecyclerView.Adapter<FoodTypesAdapter.MyHolder>() {
    class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var name = itemView.findViewById<TextView>(R.id.name)
        var img = itemView.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_food, parent, false)

        return MyHolder(view)

    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {

        var cort = listFoods.get(position)

        holder.img.setImageResource(cort.img)
        holder.name.text = cort.naem

    }

    override fun getItemCount(): Int {
        return listFoods.size
    }

}