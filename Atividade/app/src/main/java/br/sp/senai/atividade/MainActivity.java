package br.sp.senai.atividade;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtSenha;
    private Button btnLogin;
    private TextInputLayout layoutEmail;
    private TextInputLayout layoutSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);
        layoutEmail = findViewById(R.id.layout_email);
        layoutSenha = findViewById(R.id.layout_senha);


        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtEmail.getText().toString().isEmpty()){
                    layoutEmail.setErrorEnabled(true);
                    layoutEmail.setError("O email é obrigatório");
                }else if(txtSenha.getText().toString().isEmpty()){
                    layoutSenha.setErrorEnabled(true);
                    layoutSenha.setError("Você deve digitar sua senha");
                }else{
                    Intent activity2 = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(activity2);
                }
            }
        });
    }
}
