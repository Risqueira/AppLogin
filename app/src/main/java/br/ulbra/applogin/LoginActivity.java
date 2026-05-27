package br.ulbra.applogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edLogin, edPass;
    Button btTelaLogin, btVoltar2;
    DBHelper db;



    protected void onCreate (Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DBHelper(this);
        edLogin = (EditText) findViewById(R.id.edtInserirLogin);
        edPass = (EditText) findViewById(R.id.edtInserirSenha);
        btTelaLogin = (Button) findViewById(R.id.btnTelaLogin);
        btVoltar2 = (Button) findViewById(R.id.btVoltar2);

        btTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = edLogin.getText().toString();
                String password = edPass.getText().toString();

                if (userName.equals("")){
                    Toast.makeText(LoginActivity.this, "Usuário não inserido, tente novamente",
                            Toast.LENGTH_SHORT).show();

                } else if (password.equals("")) {

                    Toast.makeText(LoginActivity.this, "Senha não inserida, tente novamente",
                            Toast.LENGTH_SHORT).show();

                } else {
                    String res = db.validarLogin(userName, password);

                    if (res.equals("OK")) {
                        Toast.makeText(LoginActivity.this, "Login OK!!",
                                Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(LoginActivity.this, "Login ou Senha errados!!",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        LoginActivity.this,
                        MainActivity.class
                );
                startActivity(intent);
            }
        });
    }
}
