package uz.itschool.hunger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import uz.itschool.hunger.adapter.FoodTypesAdapter
import uz.itschool.hunger.adapter.ReklamaAdapter
import uz.itschool.hunger.databinding.ActivityMainBinding
import uz.itschool.hunger.model.Food
import uz.itschool.hunger.model.Reklama

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var reklamalar = mutableListOf<Reklama>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        reklamaMassiv()

        var reklamaAdapter = ReklamaAdapter(reklamalar)
        var rekmanager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerReklama.adapter = reklamaAdapter
        binding.recyclerReklama.layoutManager = rekmanager



        var adapter = FoodTypesAdapter(foods())
        var manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.recycle.layoutManager = manager
        binding.recycle.adapter = adapter


    }

    fun reklamaMassiv(){

        reklamalar.add(Reklama("kjhfgid shgklhgsk", R.drawable.donut))
        reklamalar.add(Reklama("kjhfgid shgklhgsk", R.drawable.donut))
        reklamalar.add(Reklama("kjhfgid shgklhgsk", R.drawable.donut))
        reklamalar.add(Reklama("kjhfgid shgklhgsk", R.drawable.donut))
        reklamalar.add(Reklama("kjhfgid shgklhgsk", R.drawable.donut))
        reklamalar.add(Reklama("kjhfgid shgklhgsk", R.drawable.donut))


    }

    fun foods():List<Food>{
        var list = arrayListOf<Food>()
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("donut","donut",5.5f,R.drawable.donut,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        list.add(Food("hamburger","burger",5.5f,R.drawable.img,"yaxshi yeb olmaysan"))
        return list

    }
}