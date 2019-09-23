package com.example.student.bai2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText soa;
    EditText sob;
    EditText soc;
    Button giai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soa=findViewById(R.id.soa);
        sob=findViewById(R.id.sob);
        soc=findViewById(R.id.soc);
        giai=findViewById(R.id.btnGui);
        giai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int a=Integer.parseInt(soa.getText().toString());
                    int b=Integer.parseInt(sob.getText().toString());
                    int c=Integer.parseInt(soc.getText().toString());
                    String kq="";
                    if(a==0){
                        kq="Phương trình có 1 nghiệm "+((float)-c/b);
                    } else {
                        double delta=b*b-4*a*c;
                        if(delta<0){
                            kq = "Phương trình vô nghiệm";
                        } else if(delta==0) {
                            kq = "Phương trình có 1 nghiệm "+((float)-b/2*a);
                        } else {
                            kq = "x1 = "+ ((-b+Math.sqrt(delta))/2*a) + "\n";
                            kq += "x2 = "+ ((-b-Math.sqrt(delta))/2*a) + "\n";
                        }

                    }
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("kq",kq);
                    startActivity(intent);
                } catch (Exception ex){
                    Toast.makeText(MainActivity.this,"Chỉ chấp nhận số",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
