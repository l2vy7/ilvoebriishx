package com.google.ads.interactivemedia.p039v3.internal;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ov */
/* compiled from: IMASDK */
final class C4245ov implements C4235ol {

    /* renamed from: a */
    final /* synthetic */ C4249oz f18232a;

    /* synthetic */ C4245ov(C4249oz ozVar) {
        this.f18232a = ozVar;
    }

    /* renamed from: a */
    public final void mo16446a(long j) {
        if (this.f18232a.f18276n != null) {
            ((C4253pc) this.f18232a.f18276n).f18298a.f18300c.mo16394d(j);
        }
    }

    /* renamed from: b */
    public final void mo16447b(long j, long j2, long j3, long j4) {
        long C = this.f18232a.m18434T();
        long D = this.f18232a.m18435U();
        StringBuilder sb = new StringBuilder(182);
        sb.append("Spurious audio timestamp (frame position mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(C);
        sb.append(", ");
        sb.append(D);
        Log.w("DefaultAudioSink", sb.toString());
    }

    /* renamed from: c */
    public final void mo16448c(long j, long j2, long j3, long j4) {
        long C = this.f18232a.m18434T();
        long D = this.f18232a.m18435U();
        StringBuilder sb = new StringBuilder(180);
        sb.append("Spurious audio timestamp (system clock mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(C);
        sb.append(", ");
        sb.append(D);
        Log.w("DefaultAudioSink", sb.toString());
    }

    /* renamed from: d */
    public final void mo16449d(long j) {
        StringBuilder sb = new StringBuilder(61);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        Log.w("DefaultAudioSink", sb.toString());
    }

    /* renamed from: e */
    public final void mo16450e(int i, long j) {
        if (this.f18232a.f18276n != null) {
            int i2 = i;
            long j2 = j;
            ((C4253pc) this.f18232a.f18276n).f18298a.f18300c.mo16395e(i2, j2, SystemClock.elapsedRealtime() - this.f18232a.f18259V);
        }
    }
}
