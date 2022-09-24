package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yv2 implements y42 {

    /* renamed from: b */
    private static final List<xu2> f42012b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f42013a;

    public yv2(Handler handler) {
        this.f42013a = handler;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m40030b(xu2 xu2) {
        List<xu2> list = f42012b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(xu2);
            }
        }
    }

    /* renamed from: h */
    private static xu2 m40031h() {
        xu2 xu2;
        List<xu2> list = f42012b;
        synchronized (list) {
            if (list.isEmpty()) {
                xu2 = new xu2((wt2) null);
            } else {
                xu2 = list.remove(list.size() - 1);
            }
        }
        return xu2;
    }

    /* renamed from: a */
    public final boolean mo35872a(int i, long j) {
        return this.f42013a.sendEmptyMessageAtTime(2, j);
    }

    /* renamed from: c */
    public final void mo35873c(Object obj) {
        this.f42013a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: d */
    public final boolean mo35874d(Runnable runnable) {
        return this.f42013a.post(runnable);
    }

    /* renamed from: e */
    public final x32 mo35875e(int i, Object obj) {
        xu2 h = m40031h();
        h.mo35799a(this.f42013a.obtainMessage(i, obj), this);
        return h;
    }

    /* renamed from: f */
    public final x32 mo35876f(int i, int i2, int i3) {
        xu2 h = m40031h();
        h.mo35799a(this.f42013a.obtainMessage(1, i2, i3), this);
        return h;
    }

    /* renamed from: g */
    public final boolean mo35877g(x32 x32) {
        return ((xu2) x32).mo35800b(this.f42013a);
    }

    /* renamed from: l */
    public final void mo35878l(int i) {
        this.f42013a.removeMessages(2);
    }

    /* renamed from: m */
    public final x32 mo35879m(int i) {
        xu2 h = m40031h();
        h.mo35799a(this.f42013a.obtainMessage(i), this);
        return h;
    }

    /* renamed from: p */
    public final boolean mo35880p(int i) {
        return this.f42013a.sendEmptyMessage(i);
    }

    public final boolean zzf(int i) {
        return this.f42013a.hasMessages(0);
    }
}
