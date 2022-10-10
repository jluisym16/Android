package android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //se muestra el layout principal
        Button boton = findViewById(R.id.button); //identifica el botón con el id "button"
        Button boton2 = findViewById(R.id.boton2);
        ImageView capi= findViewById(R.id.capibara);
        boton.setOnClickListener(this); //escucha cuando el botón es pulsado y ejecuta el método "onClick"
        capi.setOnClickListener(this);
        boton2.setOnClickListener(this::clickboton); //escucha el click del boton2 y ejecuta lo que hace el método clickboton
    }

    public void clickboton(View view){

    }

    public void onClick(View view) {
        Toast.makeText(this, "Capibara", Toast.LENGTH_SHORT).show();
        //En el caso de que hubiera mas de 1 Toast, los mostraría en secuecia
    }//Para calcular pixeles cuando quieres redimensionarlas, hay una ecuacion que es px=dp*(dpi/160)


    public boolean onCreateOptionsMenu(Menu menu) {//Para crear el menu
        MenuInflater desplagable = getMenuInflater();
        desplagable.inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {//Para dictar lo que dicen las opciones
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menuopcion1:
                Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuopcion2:
                Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuopcion3:
                Toast.makeText(this, "Opción 3", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}