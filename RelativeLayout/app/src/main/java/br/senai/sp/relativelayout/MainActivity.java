package br.senai.sp.relativelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnFoto;
    private static final int CODIGO_RETORNO_DA_FOTO = 666;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFoto = findViewById(R.id.btn_button);

        btnFoto.setOnClickListener(new View.OnClickListener() {

            @Override
            public boolean onContextClick(View view) {

                Intent abrirGaleria = new Intent();
                abrirGaleria.setType("image/*");
                abrirGaleria.setAction(Intent.ACTION_PICK);
                startActivityForResult(abrirGaleria, CODIGO_RETORNO_DA_FOTO);
            }
        });
    }
}
