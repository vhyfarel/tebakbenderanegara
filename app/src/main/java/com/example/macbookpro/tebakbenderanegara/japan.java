package com.example.macbookpro.tebakbenderanegara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class japan extends AppCompatActivity {
    EditText editText;
    Button btn_proses;
    TextView hasil;
    String benar = "japan";

    protected void onCreate (Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_japan);

        editText = (EditText) findViewById(R.id.editText2);
        btn_proses = (Button) findViewById(R.id.button4);
        hasil = (TextView) findViewById(R.id.textView5);

        btn_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.length()==0){
                    Toast.makeText(getApplicationContext(),"Negara tidak boleh kososng",Toast.LENGTH_SHORT).show();
                }
                else{
                    String jawaban = editText.getText().toString();
                    if(jawaban.equals(benar)){
                        String keterangan = "Anda Benar";
                        hasil.setText(keterangan);
                    }
                    else{
                        String keterangan ="Anda Salah";
                        hasil.setText(keterangan);
                    }
                }
            }
        });
    }
}