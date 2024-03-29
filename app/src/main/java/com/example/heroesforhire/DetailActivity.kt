package com.example.heroesforhire

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.heroesforhire.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val SUPERHERO_KEY = "superhero"
        const val BITMAP_KEY = "bitmap"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val superhero = bundle.getParcelable<Superhero>(SUPERHERO_KEY)!!
        val bitmap = bundle.getParcelable<Bitmap>(BITMAP_KEY)!!

        binding.detailImageView.setImageBitmap(bitmap)
        binding.superhero = superhero
    }
}