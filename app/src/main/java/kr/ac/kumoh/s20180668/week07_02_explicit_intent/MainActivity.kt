package kr.ac.kumoh.s20180668.week07_02_explicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import kr.ac.kumoh.s20180668.week07_02_explicit_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var view: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(view.root)

        view.btnImplicitIntent.setOnClickListener {
        //    Toast.makeText(this, "눌렀습니다.",
        //        Toast.LENGTH_SHORT).show()
            val uri = Uri.parse("https://www.youtube.com/results?search_query="
            + view.editText.text.toString())
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}