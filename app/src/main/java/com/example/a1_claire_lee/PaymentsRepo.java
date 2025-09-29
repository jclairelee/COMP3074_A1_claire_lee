package com.example.a1_claire_lee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PaymentsRepo {
    private static final List<Payment> ITEMS = new ArrayList<>();

    private PaymentsRepo() {}

    public static void add(Payment p) {
        // newest first
        ITEMS.add(0, p);
    }

    public static List<Payment> all() {
        return Collections.unmodifiableList(ITEMS);
    }
}
