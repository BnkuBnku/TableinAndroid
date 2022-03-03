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

                if(TV2.getText().toString().isEmpty()){
                    TV2.setText(FullText);
                }
                else{
                    if(TV3.getText().toString().isEmpty()){
                        TV3.setText(FullText);
                    }
                    else{
                        if(TV4.getText().toString().isEmpty()){
                            TV4.setText(FullText);
                        }
                        else{
                            if(TV5.getText().toString().isEmpty()){
                                TV5.setText(FullText);
                            }
                            else{
                                if(TV6.getText().toString().isEmpty()){
                                    TV6.setText(FullText);
                                }
                                else{
                                    if(TV7.getText().toString().isEmpty()){
                                        TV7.setText(FullText);
                                    }
                                    else{
                                        if(TV8.getText().toString().isEmpty()){
                                            TV8.setText(FullText);
                                        }
                                        else{
                                            if(TV9.getText().toString().isEmpty()){
                                                TV9.setText(FullText);
                                            }
                                            else{
                                                if(TV10.getText().toString().isEmpty()){
                                                    TV10.setText(FullText);
                                                }
                                                else{
                                                    Toast.makeText(MainActivity.this, "Table Rows is Full! \n\n You cant add more data.",Toast.LENGTH_SHORT).show();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }


            }
        });
    }
}