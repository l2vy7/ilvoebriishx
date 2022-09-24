package com.google.android.gms.internal.measurement;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.measurement.o5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9281o5 {

    /* renamed from: a */
    private static volatile boolean f45338a = (!m43324a());

    /* renamed from: a */
    public static boolean m43324a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
