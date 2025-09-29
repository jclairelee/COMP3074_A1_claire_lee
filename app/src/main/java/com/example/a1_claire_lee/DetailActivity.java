package com.example.a1_claire_lee;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // show Up arrow; actual navigation is handled by parentActivityName in manifest
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ListView listView = findViewById(R.id.listPayments);
        listView.setAdapter(new PaymentAdapter(this, PaymentsRepo.all()));
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
