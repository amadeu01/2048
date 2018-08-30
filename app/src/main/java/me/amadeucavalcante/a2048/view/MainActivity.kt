package me.amadeucavalcante.a2048.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import me.amadeucavalcante.a2048.R
import me.amadeucavalcante.a2048.databinding.ActivityMainBinding
import me.amadeucavalcante.a2048.viewmodel.GameViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = GameViewModel()

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
    }
}
