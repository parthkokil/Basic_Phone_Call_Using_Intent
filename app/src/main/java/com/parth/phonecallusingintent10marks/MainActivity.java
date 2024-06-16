package com.parth.phonecallusingintent10marks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText phoneNumber;
    private Button Call;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber = findViewById(R.id.edtPhoneNumber);
        Call = (Button) findViewById(R.id.btnCall);

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = phoneNumber.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",number,null));
                startActivity(intent);
            }
        });
    }
}