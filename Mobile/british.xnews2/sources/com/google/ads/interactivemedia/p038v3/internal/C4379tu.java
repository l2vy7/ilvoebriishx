package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tu */
/* compiled from: IMASDK */
final class C4379tu implements C4377ts {

    /* renamed from: a */
    private final int f18850a;

    /* renamed from: b */
    private final int f18851b;

    /* renamed from: c */
    private final alw f18852c;

    public C4379tu(C4374tp tpVar, C4120ke keVar) {
        alw alw = tpVar.f18835a;
        this.f18852c = alw;
        alw.mo13951i(12);
        int C = alw.mo13934C();
        if (MimeTypes.AUDIO_RAW.equals(keVar.f17681l)) {
            int aa = amm.m14211aa(keVar.f17664A, keVar.f17694y);
            if (C == 0 || C % aa != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(aa);
                sb.append(", stsz sample size: ");
                sb.append(C);
                Log.w("AtomParsers", sb.toString());
                C = aa;
            }
        }
        this.f18850a = C == 0 ? -1 : C;
        this.f18851b = alw.mo13934C();
    }

    /* renamed from: a */
    public final int mo16663a() {
        return this.f18851b;
    }

    /* renamed from: b */
    public final int mo16664b() {
        return this.f18850a;
    }

    /* renamed from: c */
    public final int mo16665c() {
        int i = this.f18850a;
        return i == -1 ? this.f18852c.mo13934C() : i;
    }
}
