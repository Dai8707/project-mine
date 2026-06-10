package com.modularhub.feature.mine.standalone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.modularhub.feature.mine.MineFeature

class StandaloneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(android.R.id.content, MineFeature.createFragment())
                .commit()
        }
    }
}
