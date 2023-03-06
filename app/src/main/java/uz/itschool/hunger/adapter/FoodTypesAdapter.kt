package uz.itschool.hunger.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import uz.itschool.hunger.R
import uz.itschool.hunger.model.FoodTypes

class FoodTypesAdapter(var listFoods:List<FoodTypes>): RecyclerView.Adapter<FoodTypesAdapter.MyHolder>() {
    class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var name = itemView.findViewById<TextView>(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return listFoods.size
    }

}