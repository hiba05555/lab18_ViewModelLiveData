package com.example.viewmodellivedatademoenrichi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private CounterViewModel hcViewModel;
    private TextView tvCount, tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        tvInfo = findViewById(R.id.tvInfo);

        MaterialButton btnIncrement = findViewById(R.id.btnIncrement);
        MaterialButton btnDecrement = findViewById(R.id.btnDecrement);
        MaterialButton btnReset = findViewById(R.id.btnReset);
        MaterialButton btnBackground = findViewById(R.id.btnBackground);

        hcViewModel = new ViewModelProvider(this).get(CounterViewModel.class);

        hcViewModel.getHcCount().observe(this, count -> {
            tvCount.setText(String.valueOf(count));
        });

        hcViewModel.getHcStatus().observe(this, status -> {
            tvInfo.setText(status);
        });

        btnIncrement.setOnClickListener(v -> hcViewModel.hcIncrement());
        btnDecrement.setOnClickListener(v -> hcViewModel.hcDecrement());
        btnReset.setOnClickListener(v -> hcViewModel.hcReset());
        btnBackground.setOnClickListener(v -> hcViewModel.hcIncrementFromBackground());
    }
}