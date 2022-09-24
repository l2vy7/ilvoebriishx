package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.C0608c;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.a6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4650a6 implements C9421x5 {

    /* renamed from: c */
    private static C4650a6 f21229c;
    @Nullable

    /* renamed from: a */
    private final Context f21230a;
    @Nullable

    /* renamed from: b */
    private final ContentObserver f21231b;

    private C4650a6() {
        this.f21230a = null;
        this.f21231b = null;
    }

    private C4650a6(Context context) {
        this.f21230a = context;
        C9450z5 z5Var = new C9450z5(this, (Handler) null);
        this.f21231b = z5Var;
        context.getContentResolver().registerContentObserver(C9266n5.f45300a, true, z5Var);
    }

    /* renamed from: b */
    static C4650a6 m21416b(Context context) {
        C4650a6 a6Var;
        C4650a6 a6Var2;
        synchronized (C4650a6.class) {
            if (f21229c == null) {
                if (C0608c.m3321c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    a6Var2 = new C4650a6(context);
                } else {
                    a6Var2 = new C4650a6();
                }
                f21229c = a6Var2;
            }
            a6Var = f21229c;
        }
        return a6Var;
    }

    /* renamed from: e */
    static synchronized void m21417e() {
        Context context;
        synchronized (C4650a6.class) {
            C4650a6 a6Var = f21229c;
            if (!(a6Var == null || (context = a6Var.f21230a) == null || a6Var.f21231b == null)) {
                context.getContentResolver().unregisterContentObserver(f21229c.f21231b);
            }
            f21229c = null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo19172a(String str) {
        if (this.f21230a == null) {
            return null;
        }
        try {
            return (String) C9390v5.m43754a(new C9436y5(this, str));
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo19174d(String str) {
        return C9266n5.m43240a(this.f21230a.getContentResolver(), str, (String) null);
    }
}
