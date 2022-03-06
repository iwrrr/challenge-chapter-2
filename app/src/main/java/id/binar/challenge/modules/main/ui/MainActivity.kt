package id.binar.challenge.modules.main.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.binar.challenge.databinding.ActivityMainBinding
import id.binar.challenge.modules.gojek.ui.GojekActivity

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnGojek?.setOnClickListener {
            Toast.makeText(applicationContext, "Ok", Toast.LENGTH_SHORT).show()
            Intent(applicationContext, GojekActivity::class.java).also { intent ->
                startActivity(intent)
            }
        }

        binding?.btnTokopedia?.setOnClickListener {
            Toast.makeText(applicationContext, "Ok", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}