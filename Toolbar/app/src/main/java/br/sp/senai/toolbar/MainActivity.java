package br.sp.senai.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_buscar:{
                Toast.makeText(this,"Buscando...", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_carrinho:{
                Toast.makeText(this,"acessando carrinho", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_config:{
                Toast.makeText(this,"settings", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_sobre:{
                Toast.makeText(this,"sobre o app", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
