package com.example.macbookpro.tebakbenderanegara;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt_tebak_negara (View view) {
        Toast.makeText(MainActivity.this, "aplikasi tebak negara" , Toast.LENGTH_SHORT).show();
    }

    public  void btn_soal1(View view){
        Intent soal1 = new Intent(MainActivity.this, japan.class);
        startActivity(soal1);
    }

    public  void btn_soal2(View view){
        Intent soal2= new Intent(MainActivity.this, filipin.class);
        startActivity(soal2);
    }
    public  void btn_soal3(View view){
        Intent soal3 = new Intent(MainActivity.this, thailand.class);
        startActivity(soal3);
    }
    public  void btn_soal4(View view){
        Intent soal4 = new Intent(MainActivity.this, Indonesia.class);
        startActivity(soal4);
    }
}
