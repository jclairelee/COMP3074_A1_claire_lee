package com.example.a1_claire_lee;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private EditText etHours;
    private EditText etRate;
    private TextView tvPay;
    private TextView tvOvertimePay;
    private TextView tvTotalPay;
    private TextView tvTax;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHours = findViewById(R.id.etHours);
        etRate = findViewById(R.id.etRate);
        tvPay = findViewById(R.id.tvPay);
        tvOvertimePay = findViewById(R.id.tvOvertimePay);
        tvTotalPay = findViewById(R.id.tvTotalPay);
        tvTax = findViewById(R.id.tvTax);

        Button btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(v -> calculateAndLog());
    }

    private void calculateAndLog() {
        Double hours = parseDouble(etHours.getText().toString());
        Double rate = parseDouble(etRate.getText().toString());

        if (hours == null || rate == null || hours <= 0.0 || rate <= 0.0) {
            Toast.makeText(this, getString(R.string.msg_invalid), Toast.LENGTH_LONG).show();
            return;
        }

        Toast.makeText(this, getString(R.string.msg_logged), Toast.LENGTH_SHORT).show();
    }

    private static Double parseDouble(String s) {
        try {
            return Double.parseDouble(s.trim());
        } catch (Exception e) {
            return null;
        }
    }
}