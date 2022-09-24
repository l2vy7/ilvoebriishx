package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.ads.va */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8257va {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ConditionVariable f40362c = new ConditionVariable();

    /* renamed from: d */
    protected static volatile j23 f40363d = null;

    /* renamed from: e */
    private static volatile Random f40364e = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8400zb f40365a;

    /* renamed from: b */
    protected volatile Boolean f40366b;

    public C8257va(C8400zb zbVar) {
        this.f40365a = zbVar;
        zbVar.mo36037k().execute(new C8220ua(this));
    }

    /* renamed from: d */
    public static final int m38766d() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return m38767e().nextInt();
        } catch (RuntimeException unused) {
            return m38767e().nextInt();
        }
    }

    /* renamed from: e */
    private static Random m38767e() {
        if (f40364e == null) {
            synchronized (C8257va.class) {
                if (f40364e == null) {
                    f40364e = new Random();
                }
            }
        }
        return f40364e;
    }

    /* renamed from: c */
    public final void mo35394c(int i, int i2, long j, String str, Exception exc) {
        try {
            f40362c.block();
            if (this.f40366b.booleanValue() && f40363d != null) {
                C8040p7 E = C8181t7.m37699E();
                E.mo34092y(this.f40365a.f42394a.getPackageName());
                E.mo34089I(j);
                if (str != null) {
                    E.mo34086B(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    E.mo34090J(stringWriter.toString());
                    E.mo34088H(exc.getClass().getName());
                }
                i23 a = f40363d.mo32819a(((C8181t7) E.mo32424p()).mo33365g());
                a.mo32529a(i);
                if (i2 != -1) {
                    a.mo32530b(i2);
                }
                a.mo32531c();
            }
        } catch (Exception unused) {
        }
    }
}
