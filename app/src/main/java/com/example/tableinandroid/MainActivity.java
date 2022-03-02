package com.example.tableinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EditText1;
    EditText EditText2;
    Button Button;
    TextView TV2, TV3, TV4, TV5, TV6, TV7, TV8, TV9, TV10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText1 = findViewById(R.id.EditText1);
        EditText2 = findViewById(R.id.EditText2);
        Button = findViewById(R.id.EnterButton);
        TV2 = findViewById(R.id.TextRow_Two);
        TV3 = findViewById(R.id.TextRow_Three);
        TV4 = findViewById(R.id.TextRow_Four);
        TV5 = findViewById(R.id.TextRow_Five);
        TV6 = findViewById(R.id.TextRow_Six);
        TV7 = findViewById(R.id.TextRow_Seven);
        TV8 = findViewById(R.id.TextRow_Eight);
        TV9 = findViewById(R.id.TextRow_Nine);
        TV10 = findViewById(R.id.TextRow_Ten);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FullText = EditText1.getText().toString() + EditText2.getText().toString();

                if(TV10.getText().toString().isEmpty()){
                    TV2.setText(FullText);
                    TV3.setText(FullText);
                    TV4.setText(FullText);
                    TV5.setText(FullText);
                    TV6.setText(FullText);
                    TV7.setText(FullText);
                    TV8.setText(FullText);
                    TV9.setText(FullText);
                    TV10.setText(FullText);
                }else{
                    Toast.makeText(MainActivity.this, "Table is Full! \n You cannot add more data anymore", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}