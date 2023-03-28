package org.d3if4075.persegiku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import org.d3if4075.persegiku.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { hitungPersegi() }
    }

    private fun hitungPersegi() {
        val sisi = binding.persegiInp.text.toString()
        if (TextUtils.isEmpty(sisi)) {
            Toast.makeText(this, R.string.sisi_invalid, Toast.LENGTH_LONG).show()
            return
        }
        else{
            val luas = sisi.toDouble() * sisi.toDouble()
            binding.hasil.text = luas.toString()
        }
    }
}