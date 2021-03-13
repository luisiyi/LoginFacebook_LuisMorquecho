package gutierrezmorquecho.luis.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BienvenidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)



        var tv_nombre= findViewById(R.id.tv) as TextView

        //El bundle sirve para recibir los datos que nos están mandando de otra activity
        var bundle = intent.extras

        if (bundle != null){
            //Las variables KEY deben de ser iguales a las variables que pusimos para pasar los datos(en este caso de MainActivity)
            var nombre = bundle.getString("nombre")
            var apellido = bundle.getString("apellido")

            tv_nombre.setText("$nombre $apellido")
        }
    }
}