package com.example.learn_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.learn_android.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_main_second.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)










         button.setOnClickListener{

            Toast.makeText(this,"your order has been placed",Toast.LENGTH_LONG).show()
            val checkedmeatbuttonid=findViewById<RadioGroup>(R.id.radioGroup).checkedRadioButtonId
            val meat=findViewById<RadioButton>(checkedmeatbuttonid)
            val cheese=findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onion=findViewById<CheckBox>(R.id.cbOnion).isChecked
            val salad=findViewById<CheckBox>(R.id.cbSalad).isChecked




            val orderstring="you order ${meat.text} burger with : \n " +
                    "" +(if(cheese) {"cheese"} else{""})+
                    (if(onion){"\n onion"} else{""})+
                    (if(salad){"salad"}else{""})

            var textview68=findViewById<TextView>(R.id.textView4)
            textview68.text=orderstring



           //****app is crashing here****
            Intent(this,Secondactivity::class.java).also {
                it.putExtra("orderstring",orderstring)
                startActivity(it)
            }






        }








        }




    }
