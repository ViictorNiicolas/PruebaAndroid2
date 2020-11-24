package cl.santotomas.pruebaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText camptarjet, campmes, campanho, campcod;

    Button boton;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camptarjet=(EditText)findViewById(R.id.etCamptarjet);
        campmes=(EditText)findViewById(R.id.etCampmes);
        campanho=(EditText)findViewById(R.id.etCampanho);
        campcod=(EditText)findViewById(R.id.etCampcod);
    }

    public boolean validar(){
        boolean retorno=true;

        String c1=camptarjet.getText().toString();
        String c2=campmes.getText().toString();
        String c3=campanho.getText().toString();
        String c4=campcod.getText().toString();
        if(c1.isEmpty())
        {
            camptarjet.setError("Debe ingresar el numero de tarjeta");
            retorno=false;
        }
        if(c2.isEmpty())
        {
            campmes.setError("Debe Ingresar el mes");
            retorno=false;
        }
        if(c3.isEmpty())
        {
            campanho.setError("Debe ingresar el anho");
            retorno=false;
        }
        if(c4.isEmpty())
        {
            campcod.setError("Debe ingresar el codigo");
            retorno=false;
        }
            return retorno;
    }

    boton = findViewById(R.id.boton);
    textView = findViewById(R.id.textview);
    textView.setMovementMethod(new ScrollingMovementMethod());

    boton.setOnClickListener(new View.OnClickListener()){
        @Override
        public void OnClickListener(View v){
            for int i=0; i <=1; i++{
                textView.append("Listado"+ i + "\n");
            }
        }

    }

}