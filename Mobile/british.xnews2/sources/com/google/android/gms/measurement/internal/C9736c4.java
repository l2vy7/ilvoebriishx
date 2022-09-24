package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9736c4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f46193a;

    /* renamed from: b */
    final /* synthetic */ C9766f4 f46194b;

    public C9736c4(C9766f4 f4Var, String str) {
        this.f46194b = f4Var;
        C4604n.m20098k(str);
        this.f46193a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f46194b.f21269a.mo19276j().mo19282q().mo38857b(this.f46193a, th);
    }
}
