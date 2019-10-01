package br.sp.senai.calculadoraimc;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNome;
    private  EditText txtPeso;
    private EditText txtAltura;
    private Button btnCalcular;
    private TextInputLayout layoutTxtNome;
    private TextInputLayout layoutTxtPeso;
    private TextInputLayout layoutTxtAltura;
    private TextView txtResultado;
    private double imc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txt_nome);
        txtPeso = findViewById(R.id.txt_peso);
        txtAltura = findViewById(R.id.txt_altura);
        btnCalcular = findViewById(R.id.btn_calcular);
        layoutTxtNome = findViewById(R.id.layout_txt_nome);
        layoutTxtPeso = findViewById(R.id.layout_txt_peso);
        layoutTxtAltura = findViewById(R.id.layout_txt_altura);
        txtResultado = findViewById(R.id.txt_resultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(txtNome.getText().toString().isEmpty() || txtPeso.getText().toString().isEmpty() || txtAltura.getText().toString().isEmpty()){
                    layoutTxtNome.setErrorEnabled(true);
                    layoutTxtPeso.setErrorEnabled(true);
                    layoutTxtAltura.setErrorEnabled(true);

                    layoutTxtNome.setError("Todos os valores devem ser preenchidos");
                    layoutTxtPeso.setError("Todos os valores devem ser preenchidos");
                    layoutTxtAltura.setError("Todos os valores devem ser preenchidos");
                }else{
                    layoutTxtNome.setErrorEnabled(false);
                    layoutTxtPeso.setErrorEnabled(false);
                    layoutTxtAltura.setErrorEnabled(false);

                    double peso = Double.parseDouble(txtPeso.getText());



                }

            }
        });
    }
}
