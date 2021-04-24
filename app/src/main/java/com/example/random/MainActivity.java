package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editNoiDung, editTextNumber1, editTextNumber2;
    Button btnClick;
    TextView txtNumber;
    Button btnrandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Anh xa
        AnhXa();

        btnrandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tao so random
                String chuoi1 = editTextNumber1.getText().toString().trim();
                String chuoi2 = editTextNumber2.getText().toString().trim();


                if(chuoi1.length() == 0||chuoi2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ số!", Toast.LENGTH_SHORT).show();

                }else {
                    //ép kiểu giữ liệu chuỗi sang số
                    int min, max;
                    if(Integer.parseInt(chuoi1) > Integer.parseInt(chuoi2) ){
                        max = Integer.parseInt(chuoi1);
                        min = Integer.parseInt(chuoi2);
                    }else {
                        min = Integer.parseInt(chuoi1);
                        max = Integer.parseInt(chuoi2);
                    }


                    Random random = new Random(); // khởi tạo


                        int number = random.nextInt(max - min + 1) + min;

                    txtNumber.setText(String.valueOf(number));
                }
            }
        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noiDung = editNoiDung.getText().toString();
                Toast.makeText(MainActivity.this, noiDung, Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void AnhXa() {
        editNoiDung = (EditText) findViewById(R.id.editTextTextPersonName);
        btnClick = (Button) findViewById(R.id.button_click);
        txtNumber = (TextView) findViewById(R.id.textViewNumber);
        btnrandom = (Button) findViewById(R.id.button_random);
        editTextNumber1 = (EditText) findViewById(R.id.editTextNumber1);
        editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);

    }
}