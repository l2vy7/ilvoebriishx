package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gk */
/* compiled from: IMASDK */
public final class C4018gk {

    /* renamed from: a */
    protected static volatile apv f17301a = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final ConditionVariable f17302d = new ConditionVariable();

    /* renamed from: e */
    private static volatile Random f17303e = null;

    /* renamed from: b */
    protected volatile Boolean f17304b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4037hc f17305c;

    public C4018gk(C4037hc hcVar) {
        this.f17305c = hcVar;
        hcVar.mo15895c().execute(new C4017gj(this));
    }

    /* renamed from: d */
    public static final int m17236d() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return m17237f().nextInt();
        } catch (RuntimeException unused) {
            return m17237f().nextInt();
        }
    }

    /* renamed from: f */
    private static Random m17237f() {
        if (f17303e == null) {
            synchronized (C4018gk.class) {
                if (f17303e == null) {
                    f17303e = new Random();
                }
            }
        }
        return f17303e;
    }

    /* renamed from: a */
    public final void mo15863a(int i, int i2, long j, String str, Exception exc) {
        try {
            f17302d.block();
            if (this.f17304b.booleanValue() && f17301a != null) {
                C3827a a = C3926d.m16948a();
                a.mo13216a(this.f17305c.f17358a.getPackageName());
                a.mo13219d(j);
                if (str != null) {
                    a.mo13217b(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    bej.m15776c(exc, new PrintWriter(stringWriter));
                    a.mo13220e(stringWriter.toString());
                    a.mo13218c(exc.getClass().getName());
                }
                apu a2 = f17301a.mo14199a(((C3926d) a.mo15385ae()).mo15165aV());
                a2.mo14197b(i);
                if (i2 != -1) {
                    a2.mo14198c(i2);
                }
                a2.mo14196a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final void mo15864e(int i, long j, String str) {
        mo15863a(i, -1, j, str, (Exception) null);
    }
}
