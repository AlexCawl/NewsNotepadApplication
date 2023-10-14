package org.alexcawl.newsnotepadapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.alexcawl.feature.FeatureActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, FeatureActivity::class.java))
        }
    }
}