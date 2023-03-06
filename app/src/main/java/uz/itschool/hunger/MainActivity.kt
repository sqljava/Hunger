package uz.itschool.hunger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.hunger.databinding.ActivityMainBinding
import uz.itschool.hunger.model.Reklama

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var reklamalar = mutableListOf<Reklama>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun reklamaMassiv(){

    }
}