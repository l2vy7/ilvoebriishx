package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.unity3d.scar.adapter.common.k */
/* compiled from: Utils */
public class C12495k {
    /* renamed from: a */
    public static void m53835a(Runnable runnable) {
        m53836b(runnable, 0);
    }

    /* renamed from: b */
    public static void m53836b(Runnable runnable, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }
}
