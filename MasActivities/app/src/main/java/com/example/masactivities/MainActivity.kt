package com.example.masactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity<intent> : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLlamar:Button=findViewById(R.id.btn_llamar)
        btnLlamar.setOnClickListener(this)

        val btnNuevaActivity: Button = findViewById(R.id.btn_nueva_activity)
        btnNuevaActivity.setOnClickListener(this)

        val btnTerceraActivity:Button = findViewById(R.id.btn_tercera_activity)
        btnTerceraActivity.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if (v?.id == R.id.btn_llamar){
            llamar()

        }else if(v?.id==R.id.btn_nueva_activity){
            nuevaActivity()
        }else if (v?.id== R.id.btn_tercera_activity){
            esperarResultado()
        }
    }

    fun llamar(){
        val intent : intent = intent(intent.ACTION_DIAL)
        startActivity(intent)
    }


     fun nuevaActivity(){
         val intent:intent = intent(this, segundaActivity::class.java)
         startActivity(intent)
     }

     fun esperarResultado(){
         val intent: intent = intent (this, terceraActivity::class.java)
         intent.putExtra("NUM1", 5)
         intent.putExtra("NUM2", 3)
         startActivity(intent, 10)
     }


    override fun onActivityReenter(resultCode: Int, data: Intent?) {
        super.onActivityReenter(resultCode, data)
        var resultado: Int?
        resultado = data?.getIntExtra("RESULTADO",8)
        Toast.makeText(this, "el resultado es"+resultado, Toast.LENGTH_SHORT).show()
    }
}
