package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p149t.C6077a;

/* renamed from: com.google.android.gms.internal.measurement.o6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9282o6 implements C9421x5 {

    /* renamed from: b */
    private static final Map f45339b = new C6077a();

    /* renamed from: a */
    private final SharedPreferences f45340a;

    /* renamed from: b */
    static C9282o6 m43325b(Context context, String str) {
        C9282o6 o6Var;
        if (!C9281o5.m43324a()) {
            synchronized (C9282o6.class) {
                o6Var = (C9282o6) f45339b.get((Object) null);
                if (o6Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return o6Var;
        }
        throw null;
    }

    /* renamed from: c */
    static synchronized void m43326c() {
        synchronized (C9282o6.class) {
            Map map = f45339b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C9282o6) it.next()).f45340a;
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final Object mo19172a(String str) {
        throw null;
    }
}
