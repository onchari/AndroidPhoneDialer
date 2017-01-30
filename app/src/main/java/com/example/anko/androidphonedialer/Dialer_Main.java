package com.example.anko.androidphonedialer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dialer_Main extends AppCompatActivity implements View.OnClickListener {

    Button dialBtn;
    EditText numTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer__main);

        dialBtn = (Button) findViewById(R.id.btn_dialer);
        numTxt = (EditText) findViewById(R.id.edtxt_phone);

        dialBtn.setOnClickListener(this);

        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:03000000000"));
        startActivity(intent);

        dialBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        try{
                            if(numTxt !=null && (numTxt.getText().length() == 10) || numTxt.getText().length() == 11){

                                Intent 
                                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel : " + numTxt.getText())));
                            }

                        }
                         catch (Exception e){

                         }
                    }
                }
        );
    }

}
