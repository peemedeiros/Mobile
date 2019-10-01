package br.sp.senai.layoutrelative;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnFoto;
    private Bitmap bitmap;
    private ImageView imgFoto;
    private static final int CODIGO_RETORNO_DA_FOTO = 666;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFoto = findViewById(R.id.btn_button);
        imgFoto = findViewById(R.id.img_foto);

        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(activity2);

//                Intent abrirGaleria = new Intent();
//                abrirGaleria.setType("image/*");
//                abrirGaleria.setAction(Intent.ACTION_PICK);
//                startActivityForResult(abrirGaleria, CODIGO_RETORNO_DA_FOTO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1){
            Uri caminhoDaFoto = data.getData();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),caminhoDaFoto);
                imgFoto.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}