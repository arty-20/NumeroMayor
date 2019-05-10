package com.example.numeromayor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    var num1 :Int = 0
    var num2 :Int = 0
    var res:Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton_izquierdo = findViewById<Button>(R.id.btn_izquierdo)
        val boton_derecho   = findViewById<Button>(R.id.btn_derecho)
        val aleatorio = Random()
        num1 = aleatorio.nextInt(10)
        num2 = aleatorio.nextInt(10)
        if (num1 != num2) {
            boton_izquierdo.text = num1.toString()
            boton_derecho.text = num2.toString()
        } else {
            var num1 = 0;
            var num2 = 0;
            while (num1 == num2) {
                num1 = aleatorio.nextInt(10)
                num2 = aleatorio.nextInt(10)
            }
            boton_izquierdo.text = num1.toString()
            boton_derecho.text = num2.toString()
        }


    }
    fun clickBotonIzquierdo(view: View){
        val boton_izquierdo = findViewById<Button>(R.id.btn_izquierdo)
        val boton_derecho   = findViewById<Button>(R.id.btn_derecho)
        val puntaje = findViewById<TextView>(R.id.puntaje)
        var a = boton_izquierdo.text.toString().toInt()
        var b = boton_derecho.text.toString().toInt()
        comparar(a,b)
        puntaje.text = res.toString()
        val aleatorio = Random()

        num1 = aleatorio.nextInt(10)
        num2 = aleatorio.nextInt(10)

        if (num1 != num2) {
            boton_izquierdo.text = num1.toString()
            boton_derecho.text = num2.toString()
        } else {
            var num1 = 0;
            var num2 = 0;
            while (num1 == num2) {
                num1 = aleatorio.nextInt(10)
                num2 = aleatorio.nextInt(10)
            }
            boton_izquierdo.text = num1.toString()
            boton_derecho.text = num2.toString()
        }
    }
    fun clickBotonDerecho(view: View) {
        val boton_izquierdo = findViewById<Button>(R.id.btn_izquierdo)
        val boton_derecho   = findViewById<Button>(R.id.btn_derecho)
        val puntaje = findViewById<TextView>(R.id.puntaje)
        var a = boton_izquierdo.text.toString().toInt()
        var b = boton_derecho.text.toString().toInt()
        comparar(b,a)
        puntaje.text = res.toString()
        val aleatorio = Random()

        num1 = aleatorio.nextInt(10)
        num2 = aleatorio.nextInt(10)

        if (num1 != num2) {
            boton_izquierdo.text = num1.toString()
            boton_derecho.text = num2.toString()
        } else {
            var num1 = 0;
            var num2 = 0;
            while (num1 == num2) {
                num1 = aleatorio.nextInt(10)
                num2 = aleatorio.nextInt(10)
            }
            boton_izquierdo.text = num1.toString()
            boton_derecho.text = num2.toString()
        }

    }
    fun comparar(a:Int, b:Int){

            if (a>b && res>=0){
                res+=1
            }else{
                if(a<b &&res>0){
                    res-=1
                }
            }

    }
}
