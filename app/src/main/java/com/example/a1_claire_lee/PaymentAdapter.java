package com.example.a1_claire_lee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PaymentAdapter extends ArrayAdapter<Payment> {

    public PaymentAdapter(Context context, List<Payment> data) {
        super(context, 0, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.item_payment, parent, false);
        }

        Payment item = getItem(position);
        TextView line1 = v.findViewById(R.id.tvLine1);
        TextView line2 = v.findViewById(R.id.tvLine2);

        if (item != null) {
            // Skeleton commit: just raw values, no formatting yet
            line1.setText("Hours: " + item.hours + " · Rate: " + item.rate);
            line2.setText("Base: " + item.basePay + " · OT: " + item.overtimePay +
                    " · Total: " + item.totalPay + " · Tax: " + item.tax);
        }
        return v;
    }
}
