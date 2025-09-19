package com.grupodiniz.kataplumapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.grupodiniz.kataplumapp.databinding.ActivityMainBinding
import com.grupodiniz.kataplumapp.ui.view.fragment.HomeFragmentDirections

class MainActivity : AppCompatActivity() {

    private val tag = MainActivity::class.simpleName
    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        navController = (supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment).navController

        binding.bottomNavigationBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    navController.navigate(R.id.homeFragment)
                }

                R.id.navigation_attraction -> {
                    navController.navigate(R.id.attractionsFragment)
                }

                R.id.navigation_pass -> {

                }

                R.id.navigation_map -> {

                }

                R.id.navigation_food -> {

                }
            }
            true
        }
    }
}