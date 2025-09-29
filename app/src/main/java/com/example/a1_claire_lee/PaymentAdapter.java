package com.example.a1_claire_lee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class PaymentAdapter extends ArrayAdapter<Payment> {
    private final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private final SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

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
            String h = stripTrailingZeros(item.hours);
            String r = currency.format(item.rate);
            line1.setText(dateFmt.format(new Date(item.timestamp)) + "  ·  " +
                    "Hours: " + h + "  ·  Rate: " + r);

            line2.setText("Base: " + currency.format(item.basePay) + "  ·  " +
                    "OT: " + currency.format(item.overtimePay) + "  ·  " +
                    "Total: " + currency.format(item.totalPay) + "  ·  " +
                    "Tax: " + currency.format(item.tax));
        }
        return v;
    }

    private static String stripTrailingZeros(double v) {
        if (v == Math.rint(v)) return String.valueOf((long) v);
        return String.valueOf(v);
    }
}

