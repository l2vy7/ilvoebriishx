package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amy */
/* compiled from: IMASDK */
final class amy implements Handler.Callback, C4484xr {

    /* renamed from: a */
    final /* synthetic */ amz f15352a;

    /* renamed from: b */
    private final Handler f15353b;

    public amy(amz amz, C4504yk ykVar) {
        this.f15352a = amz;
        Handler l = amm.m14242l(this);
        this.f15353b = l;
        ykVar.mo16822k(this, l);
    }

    /* renamed from: b */
    private final void m14279b(long j) {
        amz amz = this.f15352a;
        if (this == amz.f15371b) {
            if (j != Long.MAX_VALUE) {
                try {
                    amz.mo14036Y(j);
                } catch (C4089ja e) {
                    this.f15352a.mo16786ak(e);
                }
            } else {
                amz.mo16793av();
            }
        }
    }

    /* renamed from: a */
    public final void mo14025a(long j) {
        if (amm.f15298a < 30) {
            this.f15353b.sendMessageAtFrontOfQueue(Message.obtain(this.f15353b, 0, (int) (j >> 32), (int) j));
            return;
        }
        m14279b(j);
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        m14279b(amm.m14200Q(message.arg1, message.arg2));
        return true;
    }
}
