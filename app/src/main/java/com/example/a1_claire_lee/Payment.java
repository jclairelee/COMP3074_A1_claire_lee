package com.example.a1_claire_lee;

public class Payment {
    public final double hours;
    public final double rate;
    public final double basePay;
    public final double overtimePay;
    public final double totalPay;
    public final double tax;
    public final long timestamp;

    public Payment(double hours, double rate, double basePay, double overtimePay, double totalPay, double tax, long timestamp) {
        this.hours = hours;
        this.rate = rate;
        this.basePay = basePay;
        this.overtimePay = overtimePay;
        this.totalPay = totalPay;
        this.tax = tax;
        this.timestamp = timestamp;
    }

    public Payment(double hours, double rate, double basePay, double overtimePay, double totalPay, double tax) {
        this(hours, rate, basePay, overtimePay, totalPay, tax, System.currentTimeMillis());
    }
}
