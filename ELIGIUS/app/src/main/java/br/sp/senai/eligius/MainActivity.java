package br.sp.senai.eligius;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtEmail;
    private EditText txtSenha;
    private Button btnLogin;
    private TextInputLayout layoutTxtEmail;
    private TextInputLayout layoutTxtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = findViewById(R.id.txt_email);
        txtSenha = findViewById(R.id.txt_senha);
        btnLogin = findViewById(R.id.btn_login);
        layoutTxtEmail = findViewById(R.id.layout_txt_email);
        layoutTxtSenha = findViewById(R.id.layout_txt_senha);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtEmail.getText().toString().isEmpty()){
                    layoutTxtEmail.setErrorEnabled(true);
                    layoutTxtEmail.setError("O email é obrigatório");
                }else {
                    layoutTxtEmail.setErrorEnabled(false);
                }
            }
        });
    }
}
