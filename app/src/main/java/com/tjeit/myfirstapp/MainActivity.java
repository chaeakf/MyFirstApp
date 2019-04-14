package com.tjeit.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView contentTxtView;
    EditText inputIdEditText;
    EditText inpuPwEditText;
    Button btnLonin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentTxtView = findViewById(R.id.contentTxtView);
        inputIdEditText = findViewById(R.id.inputIdEditText);
        inpuPwEditText = findViewById(R.id.inpuPwEditText);
        btnLonin = findViewById(R.id.btnLonin);

        btnLonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userIdStr = inputIdEditText.getText().toString();
                String userpwStr = inpuPwEditText.getText().toString();

                Toast.makeText(MainActivity.this, userIdStr, Toast.LENGTH_SHORT).show();

                // contentTxtView.setText("ID:" + userIdStr + "   PW:" + userpwStr);
                contentTxtView.setText(String.format("ID %d, PW %D",userIdStr, userpwStr));

            }
        });


    }
}
