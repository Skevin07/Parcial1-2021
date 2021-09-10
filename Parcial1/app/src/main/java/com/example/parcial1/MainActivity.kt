package com.example.parcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //Ejercicio #1
     private fun sentenciasCondiciones(){

         val miColor = "Rojo"
         val miColor1 = "verde"
         val miColor2 = "Azul"
         val miColor3 = "Amarillo"
         val miColor4 = "Negro"
         val miColor5 = "Blanco"

         if(miColor == "Rojo"){

             println("$miColor")
         }else{
             println("El color especificado no esta contemplado en la variable")
         }

        if(miColor1 == "verde"){

            println("$miColor1")
        }else{
            println("El color especificado no esta contemplado en la variable")
        }

        if(miColor2 == "Azul"){

            println("$miColor2")
        }else{
            println("El color especificado no esta contemplado en la variable")
        }

        if(miColor3 == "Amarillo"){

            println("$miColor3")
        }else{
            println("El color especificado no esta contemplado en la variable")
        }

        if(miColor4 == "Negro"){

            println("$miColor4")
        }else{
            println("El color especificado no esta contemplado en la variable")
        }

        if(miColor5 == "Blanco"){

            println("$miColor5")
        }else{
            println("El color especificado no esta contemplado en la variable")
        }

     }

    //Ejercicio#2
    private fun setenciaWithWhen()
    {

        val Comida  = "pupusa";

        When(Comida)
        {
            "pupusa" ->{
                println("La comida es de El salvador")
            }

            "Wiener Schnitzel" ->{
            println("La comida es de Austria")
           }

            "Pizza" ->{
                println("La comida es de Italia")
            }


            else ->{
            println("No se conoce el tipo de comida")
        }

    }



    }


    //Ejercicio3




}