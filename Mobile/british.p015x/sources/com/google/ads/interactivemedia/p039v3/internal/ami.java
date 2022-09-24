package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ami */
/* compiled from: IMASDK */
final class ami implements alb {

    /* renamed from: a */
    private static final List<amh> f15287a = new ArrayList(50);

    /* renamed from: b */
    private final Handler f15288b;

    public ami(Handler handler) {
        this.f15288b = handler;
    }

    /* renamed from: l */
    static /* synthetic */ void m14156l(amh amh) {
        List<amh> list = f15287a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(amh);
            }
        }
    }

    /* renamed from: m */
    private static amh m14157m() {
        amh amh;
        List<amh> list = f15287a;
        synchronized (list) {
            if (list.isEmpty()) {
                amh = new amh((byte[]) null);
            } else {
                amh = list.remove(list.size() - 1);
            }
        }
        return amh;
    }

    /* renamed from: a */
    public final ala mo13880a(int i) {
        amh m = m14157m();
        m.mo13987c(this.f15288b.obtainMessage(i));
        return m;
    }

    /* renamed from: b */
    public final ala mo13881b(int i, Object obj) {
        amh m = m14157m();
        m.mo13987c(this.f15288b.obtainMessage(i, obj));
        return m;
    }

    /* renamed from: c */
    public final ala mo13882c(int i, int i2, int i3, Object obj) {
        amh m = m14157m();
        m.mo13987c(this.f15288b.obtainMessage(1, 1036, 0, obj));
        return m;
    }

    /* renamed from: d */
    public final boolean mo13883d() {
        return this.f15288b.hasMessages(0);
    }

    /* renamed from: e */
    public final ala mo13884e(int i, int i2) {
        amh m = m14157m();
        m.mo13987c(this.f15288b.obtainMessage(1, i, i2));
        return m;
    }

    /* renamed from: f */
    public final void mo13885f(Runnable runnable) {
        this.f15288b.post(runnable);
    }

    /* renamed from: g */
    public final void mo13886g() {
        this.f15288b.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: h */
    public final void mo13887h() {
        this.f15288b.removeMessages(2);
    }

    /* renamed from: i */
    public final void mo13888i(int i) {
        this.f15288b.sendEmptyMessage(i);
    }

    /* renamed from: j */
    public final void mo13889j(long j) {
        this.f15288b.sendEmptyMessageAtTime(2, j);
    }

    /* renamed from: k */
    public final void mo13890k(ala ala) {
        ((amh) ala).mo13986b(this.f15288b);
    }
}
