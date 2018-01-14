package com.example.alish.custom_dialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.showDialog);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                mBuilder.setTitle("Hello");
                View mView = getLayoutInflater().inflate(R.layout.dialog_login,null);
                final EditText memail = (EditText) mView.findViewById(R.id.email);
                final EditText mpass = (EditText) mView.findViewById(R.id.password);
                Button btn = (Button) mView.findViewById(R.id.btn1);

                btn.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        if(!memail.getText().toString().isEmpty() && !mpass.getText().toString().isEmpty())
                        {
                            Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this,"Wrong email or password",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }
}
