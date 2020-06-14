package com.example.masactivities

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_tercera.view.*

class terceraActivity : AppCompatActivity(), View.OnClickListener {

    private var num1: int = 0
    private var num2: int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)


        val intent: intent = getIntent()
        num1 = intent.getIntExtra("num1", 0)
        num2 = intent.getIntExtra("num2", 0)

        val btnResultado: Button = findViewById(R.id.btn_resultado)
        btnResultado.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val intent: intent = intent()
        val resultado: int = num1+num2
        intent.putExtra("RESULTADO", resultado)
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}
