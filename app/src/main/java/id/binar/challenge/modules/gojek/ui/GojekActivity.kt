package id.binar.challenge.modules.gojek.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import id.binar.challenge.R
import id.binar.challenge.databinding.ActivityGojekBinding

class GojekActivity : AppCompatActivity() {

    private var _binding: ActivityGojekBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityGojekBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val bottomNavView = binding?.bottomNavView
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        bottomNavView?.setupWithNavController(navController)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}