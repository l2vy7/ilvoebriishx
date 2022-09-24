package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C7389g {

    /* renamed from: a */
    private static int f29313a = 4225;

    /* renamed from: b */
    private static final Object f29314b = new Object();

    /* renamed from: c */
    private static C7411m1 f29315c = null;

    /* renamed from: d */
    static HandlerThread f29316d = null;

    /* renamed from: e */
    private static boolean f29317e = false;

    /* renamed from: a */
    public static int m29998a() {
        return f29313a;
    }

    /* renamed from: b */
    public static C7389g m29999b(Context context) {
        Looper looper;
        synchronized (f29314b) {
            if (f29315c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f29317e) {
                    looper = m30000c().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f29315c = new C7411m1(applicationContext, looper);
            }
        }
        return f29315c;
    }

    /* renamed from: c */
    public static HandlerThread m30000c() {
        synchronized (f29314b) {
            HandlerThread handlerThread = f29316d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f29316d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f29316d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo30095d(C7398i1 i1Var, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void mo30096e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo30095d(new C7398i1(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo30097f(C7398i1 i1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
