package uz.itschool.hunger.adapter

import android.content.ClipData.Item
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.hunger.R
import uz.itschool.hunger.model.Reklama

class ReklamaAdapter(var reklamalist : MutableList<Reklama>) : RecyclerView.Adapter<ReklamaAdapter.MyHolder>() {

    class MyHolder(item : View) : RecyclerView.ViewHolder(item){

        var name = item.findViewById<TextView>(R.id.reklamaName)
        var img = item.findViewById<ImageView>(R.id.reklamaImg)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.reklama_item, parent, false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.name.text = reklamalist[position].nomi
        holder.img.setImageResource(reklamalist[position].rasm)
    }

    override fun getItemCount(): Int {
        return reklamalist.size
    }
}