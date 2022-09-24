package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.if */
/* compiled from: IMASDK */
public final class C4067if {

    /* renamed from: a */
    private final C4037hc f17414a;

    /* renamed from: b */
    private final String f17415b;

    /* renamed from: c */
    private final String f17416c;

    /* renamed from: d */
    private volatile Method f17417d = null;

    /* renamed from: e */
    private final Class<?>[] f17418e;

    /* renamed from: f */
    private final CountDownLatch f17419f = new CountDownLatch(1);

    public C4067if(C4037hc hcVar, String str, String str2, Class<?>... clsArr) {
        this.f17414a = hcVar;
        this.f17415b = str;
        this.f17416c = str2;
        this.f17418e = clsArr;
        hcVar.mo15895c().submit(new C4066ie(this));
    }

    /* renamed from: b */
    static /* synthetic */ void m17367b(C4067if ifVar) {
        CountDownLatch countDownLatch;
        try {
            Class loadClass = ifVar.f17414a.mo15896d().loadClass(ifVar.m17368c(ifVar.f17414a.mo15898f(), ifVar.f17415b));
            if (loadClass == null) {
                countDownLatch = ifVar.f17419f;
            } else {
                ifVar.f17417d = loadClass.getMethod(ifVar.m17368c(ifVar.f17414a.mo15898f(), ifVar.f17416c), ifVar.f17418e);
                if (ifVar.f17417d == null) {
                    countDownLatch = ifVar.f17419f;
                }
                countDownLatch = ifVar.f17419f;
            }
        } catch (C4026gs | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = ifVar.f17419f;
        } catch (Throwable th) {
            ifVar.f17419f.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    /* renamed from: c */
    private final String m17368c(byte[] bArr, String str) throws C4026gs, UnsupportedEncodingException {
        return new String(this.f17414a.mo15897e().mo15887b(bArr, str), C6540C.UTF8_NAME);
    }

    /* renamed from: a */
    public final Method mo15916a() {
        if (this.f17417d != null) {
            return this.f17417d;
        }
        try {
            if (!this.f17419f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f17417d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
