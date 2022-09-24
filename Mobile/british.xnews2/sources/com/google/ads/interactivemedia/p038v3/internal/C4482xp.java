package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xp */
/* compiled from: IMASDK */
final class C4482xp {

    /* renamed from: a */
    private long f19583a;

    /* renamed from: b */
    private long f19584b;

    /* renamed from: c */
    private boolean f19585c;

    C4482xp() {
    }

    /* renamed from: a */
    public final void mo16776a() {
        this.f19583a = 0;
        this.f19584b = 0;
        this.f19585c = false;
    }

    /* renamed from: b */
    public final long mo16777b(C4120ke keVar, C4269ps psVar) {
        if (this.f19585c) {
            return psVar.f18399d;
        }
        ByteBuffer byteBuffer = psVar.f18397b;
        aup.m14890u(byteBuffer);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int b2 = C4256pf.m18510b(b);
        if (b2 == -1) {
            this.f19585c = true;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return psVar.f18399d;
        }
        long j = this.f19583a;
        if (j == 0) {
            long j2 = psVar.f18399d;
            this.f19584b = j2;
            this.f19583a = ((long) b2) - 529;
            return j2;
        }
        long j3 = (1000000 * j) / ((long) keVar.f17695z);
        this.f19583a = j + ((long) b2);
        return this.f19584b + j3;
    }
}
