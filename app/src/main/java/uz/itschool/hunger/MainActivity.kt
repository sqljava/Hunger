package uz.itschool.hunger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import uz.itschool.hunger.adapter.FoodTypesAdapter
import uz.itschool.hunger.databinding.ActivityMainBinding
import uz.itschool.hunger.model.Food

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = FoodTypesAdapter(list())
        var manager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false)
        binding.recycle.layoutManager = manager
        binding.recycle.adapter = adapter





    }
    private fun list():List<Food>{
        var list = arrayListOf<Food>()

        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.donut,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.donut,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))
        list.add(Food("gamburger","burger",5.5f,R.drawable.img,"yaxshi"))

        return list
    }
}