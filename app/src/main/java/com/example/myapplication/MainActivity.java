package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText login;
    EditText password;
    Button enter,button2;
    TextView rezult,rezult1;
    String L, P;
    boolean a;
    public static final String log = "Я не знаю логин";
    public static final String pas = "Пароль";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        enter = findViewById(R.id.enter);
        rezult = findViewById(R.id.rezult);
        rezult1 = findViewById(R.id.rezult1);
        button2 = findViewById(R.id.button2);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String logA = login.getText().toString();
                String pasA = login.getText().toString();
                if (logA.equals("") || pasA.equals("")) {
                    rezult.setText("Вы ничего не ввели");
                } else {
                    if (logA== log&& pasA== pas) {
                        rezult1.setText("Верно");
                    } else rezult.setText("Вы ошиблись в логине или пароле");
                }
                login.setText("");
                password.setText("");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                class Activity extends AppCompatActivity {
                    @Override
                    protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.registration);
                    }
                }
            }
        });

    }
}
