package com.startapp;

import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.startapp.w9 */
/* compiled from: Sta */
public class C12414w9 {
    /* renamed from: a */
    public static int m53719a(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += (long) list.get(i).intValue();
        }
        return Math.round((float) (j / ((long) list.size())));
    }

    /* renamed from: b */
    public static double m53721b(List<Integer> list) {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += (long) list.get(i).intValue();
        }
        double d = (double) j;
        double size = (double) list.size();
        Double.isNaN(d);
        Double.isNaN(size);
        double d2 = d / size;
        double d3 = 0.0d;
        for (int i2 = 0; i2 < list.size(); i2++) {
            double intValue = (double) list.get(i2).intValue();
            Double.isNaN(intValue);
            d3 += Math.pow(intValue - d2, 2.0d);
        }
        double size2 = (double) list.size();
        Double.isNaN(size2);
        double sqrt = Math.sqrt(d3 / size2);
        if (Double.isNaN(sqrt)) {
            return 0.0d;
        }
        return sqrt;
    }

    /* renamed from: c */
    public static int m53723c(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).intValue() > i) {
                i = list.get(i2).intValue();
            }
        }
        return i;
    }

    /* renamed from: d */
    public static int m53724d(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i));
        }
        Collections.sort(arrayList);
        if (arrayList.size() % 2 != 0) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        double intValue = (double) ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        double intValue2 = (double) ((Integer) arrayList.get((arrayList.size() / 2) - 1)).intValue();
        Double.isNaN(intValue);
        Double.isNaN(intValue2);
        return (int) Math.round((intValue + intValue2) / 2.0d);
    }

    /* renamed from: e */
    public static int m53725e(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0).intValue();
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).intValue() < i) {
                i = list.get(i2).intValue();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m53718a(ArrayList<Integer> arrayList, int i) {
        long round;
        int size = arrayList.size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return arrayList.get(0).intValue();
        }
        double d = (double) i;
        Double.isNaN(d);
        int i2 = size - 1;
        double d2 = (double) i2;
        Double.isNaN(d2);
        double d3 = (d / 100.0d) * d2;
        int i3 = (int) d3;
        double intValue = (double) arrayList.get(i3).intValue();
        double d4 = (double) i3;
        Double.isNaN(d4);
        double d5 = d3 - d4;
        if (i3 == i2 || d5 == 0.0d) {
            round = Math.round(intValue);
        } else {
            double intValue2 = (double) arrayList.get(i3 + 1).intValue();
            Double.isNaN(intValue2);
            Double.isNaN(intValue);
            Double.isNaN(intValue);
            round = Math.round(((intValue2 - intValue) * d5) + intValue);
        }
        return (int) round;
    }

    /* renamed from: b */
    public static void m53722b(ArrayList<?> arrayList, int i) {
        arrayList.ensureCapacity(i);
        while (arrayList.size() < i) {
            arrayList.add((Object) null);
        }
    }

    /* renamed from: a */
    public static MeasurementPointLatency m53720a(long j, RadioInfo radioInfo, long j2) {
        MeasurementPointLatency measurementPointLatency = new MeasurementPointLatency();
        measurementPointLatency.Rtt = (int) j;
        measurementPointLatency.ConnectionType = radioInfo.ConnectionType;
        measurementPointLatency.NetworkType = radioInfo.NetworkType;
        measurementPointLatency.RxLev = radioInfo.RXLevel;
        measurementPointLatency.Delta = j2;
        return measurementPointLatency;
    }
}
