package com.startapp;

import com.appnext.core.C3148Ad;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.startapp.m6 */
/* compiled from: Sta */
public final class C12047m6 {

    /* renamed from: c */
    public static final List<String> f53275c = Arrays.asList(new String[]{C3148Ad.ORIENTATION_PORTRAIT, C3148Ad.ORIENTATION_LANDSCAPE, "none"});

    /* renamed from: a */
    public boolean f53276a;

    /* renamed from: b */
    public int f53277b;

    public C12047m6() {
        this(true, 2);
    }

    /* renamed from: a */
    public static int m52593a(String str) {
        int indexOf = f53275c.indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    public C12047m6(boolean z, int i) {
        this.f53276a = z;
        this.f53277b = i;
    }
}
