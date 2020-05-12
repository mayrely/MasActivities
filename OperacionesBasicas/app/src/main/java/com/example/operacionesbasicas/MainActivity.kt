package com.example.operacionesbasicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.math.floor
import kotlin.math.ln1p

class MainActivity : AppCompatActivity(), view.OnClickListener {

    var Num1 : float = null
    var Num2 : float = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bsuma.setOnClickListener(this)
        bresta.setOnClickListener(this)
        bmulti.setOnClickListener(this)
        bdivision.setOnClickListener(this)
    }

    override fun OnClick(v: view?){
        if (textUtils.isEmpty(editNum1.text.toString())){
            editNum1.error ="ingrese un numero"
            editNum1.requestFocus()
            return

            else
            {
                Num1 = editNum1.text.toString().toFloat()
            }
            if (textUtils.isEmpty(editNum2.text.toString())){
                editNum2.error ="ingrese un numero"
                editNum2.requestFocus()
                return

                else
                {
                    Num2 = editNum2.text.toString().toFloat()
                }
        }

            when(v?.id){
                R.id.bsuma > (textResult.text = Num1?.plus(Num2!!).toString()
            }
                R.id.bresta > (textResult.text = Num1?.plus(Num2!!).toString()
            }
                R.id.bmulti > (textResult.text = Num1?.plus(Num2!!).toString()
            }
                R.id.bdivision > (textResult.text = Num1?.plus(Num2!!).toString()


        }










    }
}
