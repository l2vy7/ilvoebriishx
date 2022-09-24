package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* renamed from: com.google.android.material.internal.d */
/* compiled from: ManufacturerUtils */
public class C10193d {
    /* renamed from: a */
    public static boolean m47020a() {
        return m47021b() || m47023d();
    }

    /* renamed from: b */
    public static boolean m47021b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }

    /* renamed from: c */
    public static boolean m47022c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    /* renamed from: d */
    public static boolean m47023d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung");
    }
}
