package com.startapp;

/* renamed from: com.startapp.ob */
/* compiled from: Sta */
public class C12114ob {
    /* renamed from: a */
    public static double m52723a(double d, double d2, double d3) {
        return 1.0d / (Math.exp((d2 - d) * d3) + 1.0d);
    }

    /* renamed from: a */
    public static double m52724a(double d, double d2, double d3, double d4) {
        return (m52723a(d, d2, d3) - d4) / (1.0d - d4);
    }
}
