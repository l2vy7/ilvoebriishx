package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import javax.annotation.concurrent.GuardedBy;
import p187z5.C11148d;

/* renamed from: com.google.android.gms.internal.vision.p6 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public abstract class C9597p6<T> {

    /* renamed from: a */
    private final Context f45826a;

    /* renamed from: b */
    private final Object f45827b = new Object();

    /* renamed from: c */
    private final String f45828c;

    /* renamed from: d */
    private final String f45829d;

    /* renamed from: e */
    private final String f45830e;

    /* renamed from: f */
    private boolean f45831f = false;

    /* renamed from: g */
    private boolean f45832g = false;
    @GuardedBy("lock")

    /* renamed from: h */
    private T f45833h;

    public C9597p6(Context context, String str, String str2) {
        this.f45826a = context;
        this.f45828c = str;
        String valueOf = String.valueOf(str2);
        this.f45829d = valueOf.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(valueOf) : new String("com.google.android.gms.vision.dynamite.");
        this.f45830e = str2;
    }

    /* renamed from: a */
    public final boolean mo38549a() {
        return mo38551e() != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo38489b(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.C7468a;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo38490c() throws RemoteException;

    /* renamed from: d */
    public final void mo38550d() {
        synchronized (this.f45827b) {
            if (this.f45833h != null) {
                try {
                    mo38490c();
                } catch (RemoteException e) {
                    Log.e(this.f45828c, "Could not finalize native handle", e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final T mo38551e() {
        synchronized (this.f45827b) {
            T t = this.f45833h;
            if (t != null) {
                return t;
            }
            DynamiteModule dynamiteModule = null;
            try {
                dynamiteModule = DynamiteModule.m30157e(this.f45826a, DynamiteModule.f29459g, this.f45829d);
            } catch (DynamiteModule.C7468a unused) {
                String format = String.format("%s.%s", new Object[]{"com.google.android.gms.vision", this.f45830e});
                C11148d.m49745a("Cannot load thick client module, fall back to load optional module %s", format);
                try {
                    dynamiteModule = DynamiteModule.m30157e(this.f45826a, DynamiteModule.f29454b, format);
                } catch (DynamiteModule.C7468a e) {
                    C11148d.m49747c(e, "Error loading optional module %s", format);
                    if (!this.f45831f) {
                        C11148d.m49745a("Broadcasting download intent for dependency %s", this.f45830e);
                        String str = this.f45830e;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f45826a.sendBroadcast(intent);
                        this.f45831f = true;
                    }
                }
            }
            if (dynamiteModule != null) {
                try {
                    this.f45833h = mo38489b(dynamiteModule, this.f45826a);
                } catch (RemoteException | DynamiteModule.C7468a e2) {
                    Log.e(this.f45828c, "Error creating remote native handle", e2);
                }
            }
            boolean z = this.f45832g;
            if (!z && this.f45833h == null) {
                Log.w(this.f45828c, "Native handle not yet available. Reverting to no-op handle.");
                this.f45832g = true;
            } else if (z && this.f45833h != null) {
                Log.w(this.f45828c, "Native handle is now available.");
            }
            T t2 = this.f45833h;
            return t2;
        }
    }
}
