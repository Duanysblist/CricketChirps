package com.example.cricketchirps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    Button btnSubmit;
    TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.numInput);
        btnSubmit = findViewById(R.id.submit);
        tvResults = findViewById(R.id.results);

        tvResults.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userChirps = etID.getText().toString();
                int chirps = Integer.parseInt(userChirps);

                int theTemp = chirps + 40;

                String text = theTemp + " degrees Fahrenheit";

                tvResults.setText(text);

                tvResults.setVisibility(View.VISIBLE);
            }
        });
    }
}
