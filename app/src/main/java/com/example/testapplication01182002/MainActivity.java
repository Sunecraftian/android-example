package com.example.testapplication01182002;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.testapplication01182002.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.inputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = binding.inputField;
                TextView t = binding.output;
                String text = input.getText().toString();
                t.setText(text);
            }
        });


    }
}