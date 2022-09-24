package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i94 {

    /* renamed from: d */
    public static final b94 f33152d = new b94(0, C6540C.TIME_UNSET, (a94) null);

    /* renamed from: e */
    public static final b94 f33153e = new b94(1, C6540C.TIME_UNSET, (a94) null);

    /* renamed from: f */
    public static final b94 f33154f = new b94(2, C6540C.TIME_UNSET, (a94) null);

    /* renamed from: g */
    public static final b94 f33155g = new b94(3, C6540C.TIME_UNSET, (a94) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f33156a = d13.m20313l("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public c94<? extends d94> f33157b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f33158c;

    public i94(String str) {
    }

    /* renamed from: b */
    public static b94 m33127b(boolean z, long j) {
        return new b94(z ? 1 : 0, j, (a94) null);
    }

    /* renamed from: a */
    public final <T extends d94> long mo32575a(T t, z84<T> z84, int i) {
        Looper myLooper = Looper.myLooper();
        nu1.m20743b(myLooper);
        this.f33158c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new c94(this, myLooper, t, z84, i, elapsedRealtime).mo30866c(0);
        return elapsedRealtime;
    }

    /* renamed from: g */
    public final void mo32576g() {
        c94<? extends d94> c94 = this.f33157b;
        nu1.m20743b(c94);
        c94.mo30864a(false);
    }

    /* renamed from: h */
    public final void mo32577h() {
        this.f33158c = null;
    }

    /* renamed from: i */
    public final void mo32578i(int i) throws IOException {
        IOException iOException = this.f33158c;
        if (iOException == null) {
            c94<? extends d94> c94 = this.f33157b;
            if (c94 != null) {
                c94.mo30865b(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: j */
    public final void mo32579j(f94 f94) {
        c94<? extends d94> c94 = this.f33157b;
        if (c94 != null) {
            c94.mo30864a(true);
        }
        this.f33156a.execute(new g94(f94));
        this.f33156a.shutdown();
    }

    /* renamed from: k */
    public final boolean mo32580k() {
        return this.f33158c != null;
    }

    /* renamed from: l */
    public final boolean mo32581l() {
        return this.f33157b != null;
    }
}
