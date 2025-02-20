package com.wasana.clean_water;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ReportActivity extends AppCompatActivity {

    EditText etName, etLocation, etDescription, etContactNumber;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        etName = findViewById(R.id.etName);
        etLocation = findViewById(R.id.etLocation);
        etDescription = findViewById(R.id.etDescription);
        etContactNumber = findViewById(R.id.etContactNumber);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            // Handle form submission, e.g., save the data or send it to a server
        });
    }
}
