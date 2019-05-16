package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etUser, etPass;
    private Button btLogin;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = (EditText) findViewById(R.id.etuser);
        etPass = (EditText) findViewById(R.id.etpass);
        btLogin= (Button) findViewById(R.id.btnlogin);



        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation(etUser.toString(), etPass.toString());
            }
        });

    }

    private void validation(String user, String pass){
        if ((etUser.equals("admin")) && (etPass.equals("1234"))) {
           Intent intent = new Intent(MainActivity.this, secondActivity.class);
           startActivity(intent);
        }else{
            counter--;
            if (counter==0){
                btLogin.setEnabled(false);
            }
        }
    }
}
