package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aki */
/* compiled from: IMASDK */
public final class aki implements akj {

    /* renamed from: a */
    public static final akc f15145a = m13929b(false, C6540C.TIME_UNSET);

    /* renamed from: b */
    public static final akc f15146b = new akc(2, C6540C.TIME_UNSET);

    /* renamed from: c */
    public static final akc f15147c = new akc(3, C6540C.TIME_UNSET);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ExecutorService f15148d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public akd<? extends ake> f15149e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public IOException f15150f;

    public aki(String str) {
        String str2;
        if (str.length() != 0) {
            str2 = "ExoPlayer:Loader:".concat(str);
        } else {
            str2 = new String("ExoPlayer:Loader:");
        }
        this.f15148d = amm.m14246p(str2);
    }

    /* renamed from: b */
    public static akc m13929b(boolean z, long j) {
        return new akc(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public final void mo13518a() throws IOException {
        mo13848j(Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public final boolean mo13841c() {
        return this.f15150f != null;
    }

    /* renamed from: d */
    public final void mo13842d() {
        this.f15150f = null;
    }

    /* renamed from: e */
    public final <T extends ake> long mo13843e(T t, akb<T> akb, int i) {
        Looper myLooper = Looper.myLooper();
        aup.m14889t(myLooper);
        this.f15150f = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new akd(this, myLooper, t, akb, i, elapsedRealtime).mo13836b(0);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final boolean mo13844f() {
        return this.f15149e != null;
    }

    /* renamed from: g */
    public final void mo13845g() {
        akd<? extends ake> akd = this.f15149e;
        aup.m14889t(akd);
        akd.mo13837c(false);
    }

    /* renamed from: h */
    public final void mo13846h() {
        mo13847i((akf) null);
    }

    /* renamed from: i */
    public final void mo13847i(akf akf) {
        akd<? extends ake> akd = this.f15149e;
        if (akd != null) {
            akd.mo13837c(true);
        }
        if (akf != null) {
            this.f15148d.execute(new akg(akf));
        }
        this.f15148d.shutdown();
    }

    /* renamed from: j */
    public final void mo13848j(int i) throws IOException {
        IOException iOException = this.f15150f;
        if (iOException == null) {
            akd<? extends ake> akd = this.f15149e;
            if (akd != null) {
                if (i == Integer.MIN_VALUE) {
                    i = akd.f15134a;
                }
                akd.mo13835a(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}
