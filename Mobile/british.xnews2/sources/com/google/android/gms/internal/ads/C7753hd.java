package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.hd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7753hd {

    /* renamed from: a */
    private final C8400zb f32704a;

    /* renamed from: b */
    private final String f32705b;

    /* renamed from: c */
    private final String f32706c;

    /* renamed from: d */
    private volatile Method f32707d = null;

    /* renamed from: e */
    private final Class<?>[] f32708e;

    /* renamed from: f */
    private final CountDownLatch f32709f = new CountDownLatch(1);

    public C7753hd(C8400zb zbVar, String str, String str2, Class<?>... clsArr) {
        this.f32704a = zbVar;
        this.f32705b = str;
        this.f32706c = str2;
        this.f32708e = clsArr;
        zbVar.mo36037k().submit(new C7716gd(this));
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m32855b(C7753hd hdVar) {
        CountDownLatch countDownLatch;
        try {
            Class loadClass = hdVar.f32704a.mo36035i().loadClass(hdVar.m32856c(hdVar.f32704a.mo36045u(), hdVar.f32705b));
            if (loadClass == null) {
                countDownLatch = hdVar.f32709f;
            } else {
                hdVar.f32707d = loadClass.getMethod(hdVar.m32856c(hdVar.f32704a.mo36045u(), hdVar.f32706c), hdVar.f32708e);
                if (hdVar.f32707d == null) {
                    countDownLatch = hdVar.f32709f;
                }
                countDownLatch = hdVar.f32709f;
            }
        } catch (C7640eb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = hdVar.f32709f;
        } catch (Throwable th) {
            hdVar.f32709f.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    /* renamed from: c */
    private final String m32856c(byte[] bArr, String str) throws C7640eb, UnsupportedEncodingException {
        return new String(this.f32704a.mo36032e().mo31788b(bArr, str), C6540C.UTF8_NAME);
    }

    /* renamed from: a */
    public final Method mo32386a() {
        if (this.f32707d != null) {
            return this.f32707d;
        }
        try {
            if (!this.f32709f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f32707d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
