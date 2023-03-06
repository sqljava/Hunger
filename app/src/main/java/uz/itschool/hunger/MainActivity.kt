package uz.itschool.hunger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        var diyorAdapter = ReklamaAdapter(reklamalar)

        binding.recyclerReklama.adapter = diyorAdapter

        binding.recyclerReklama.layoutManager




    }

    fun reklamaMassiv(){

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