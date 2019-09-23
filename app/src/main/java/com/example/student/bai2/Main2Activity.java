package com.example.student.bai2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtkq;
    Button btnQuaylai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtkq=findViewById(R.id.txtkq);
        btnQuaylai=findViewById(R.id.btnQuayLai);
        Intent intent=getIntent();
        txtkq.setText(intent.getStringExtra("kq"));
        btnQuaylai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
