package com.startapp;

import java.lang.Comparable;
import java.util.regex.Pattern;

/* renamed from: com.startapp.tb */
/* compiled from: Sta */
public class C12349tb<T extends Comparable<T>> implements Comparable<C12349tb<T>> {

    /* renamed from: c */
    public static Pattern f54775c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* renamed from: d */
    public static Pattern f54776d = Pattern.compile("((\\d{1,2})|(100))%");

    /* renamed from: a */
    public final String f54777a;

    /* renamed from: b */
    public final T f54778b;

    public C12349tb(String str, T t) {
        this.f54777a = str;
        this.f54778b = t;
    }

    /* renamed from: a */
    public static boolean m53509a(String str) {
        return f54775c.matcher(str).matches();
    }

    /* renamed from: b */
    public static Integer m53510b(String str) {
        String[] split = str.split(":");
        if (split.length != 3) {
            return null;
        }
        try {
            return Integer.valueOf((Integer.parseInt(split[1]) * 60 * 1000) + (Integer.parseInt(split[0]) * 60 * 60 * 1000) + ((int) (Float.parseFloat(split[2]) * 1000.0f)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int compareTo(Object obj) {
        return this.f54778b.compareTo(((C12349tb) obj).f54778b);
    }
}
