package com.example.a403.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.button1;
import static com.example.a403.cal.R.id.button2;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    TextView tv1;
    String myStr1, myStr2;
    double num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2) ;
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
       tv1= (TextView)findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                myStr1 = ed1.getText().toString();
                myStr2 = ed2.getText().toString();
                if(myStr1.isEmpty() || myStr2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요",Toast.LENGTH_SHORT).show();

                }else {
                    num = Double.parseDouble(myStr1) + Double.parseDouble(myStr2);
                    tv1.setText("계산 결과:" +num);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                myStr1 = ed1.getText().toString();
                myStr2 = ed2.getText().toString();
                if(myStr1.isEmpty() || myStr2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요",Toast.LENGTH_SHORT).show();

                }else {
                    num = Double.parseDouble(myStr1) - Double.parseDouble(myStr2);
                    tv1.setText("계산 결과:" +num);
                }
            }
        });

       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               myStr1 = ed1.getText().toString();
               myStr2 = ed2.getText().toString();
               if(myStr1.isEmpty() || myStr2.isEmpty()){
                   Toast.makeText(getApplicationContext(), "값을 입력하세요",Toast.LENGTH_SHORT).show();

               }else {
                   num = Double.parseDouble(myStr1) * Double.parseDouble(myStr2);
                   tv1.setText("계산 결과:" +num);
               }

           }
       });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStr1=ed1.getText().toString();
                myStr2=ed2.getText().toString();
                if(myStr1.isEmpty() || myStr2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요",Toast.LENGTH_SHORT).show();

                }else if (Double.parseDouble(myStr2) == 0) {
                    Toast.makeText(getApplicationContext(), "나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                }else{

                    num = Double.parseDouble(myStr1) / Double.parseDouble(myStr2);
                    tv1.setText("계산 결과:" +num);
                }
            }


        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStr1=ed1.getText().toString();
                myStr2=ed2.getText().toString();
                if(myStr1.isEmpty() || myStr2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "값을 입력하세요",Toast.LENGTH_SHORT).show();

                }else {
                    num = Double.parseDouble(myStr1) % Double.parseDouble(myStr2);
                    tv1.setText("계산 결과:" +num);
                }
            }
        });
    }
}
