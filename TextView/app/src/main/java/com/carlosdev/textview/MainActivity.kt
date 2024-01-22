package com.carlosdev.textview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Indicamos que definiremos la variable luego, de momento solo la iniciamos
    lateinit var myText : TextView

    // Otra forma de inicializar la variable es asignandole un valor null
//    var myText : TextView? = null;

    // Este método es parte del ciclo de vida de la actividad, se inicia antes de que se muestre
    // en la pantalla la vista
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Con este código podemos buscar el elemento que queremos modificar de la activity
        myText = findViewById(R.id.text_example)

        // Métodos para configurar directamente la propiedad de
        // color del text
        myText.setTextColor(Color.CYAN)
        myText.setText("Hello from onCreate Function")
//        myText.text = "Hello from onCreate Function"

        // De esta forma estamos utilizando una función lambda para especificar que acción se hará
        // después de hacer click en el botón
        myText.setOnClickListener {
            myText.setTextColor(Color.GRAY)
        }

    }
}