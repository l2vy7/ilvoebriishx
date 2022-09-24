package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class c34 {

    /* renamed from: a */
    private long f30236a;

    /* renamed from: b */
    private long f30237b;

    /* renamed from: c */
    private boolean f30238c;

    c34() {
    }

    /* renamed from: d */
    private final long m30894d(long j) {
        return this.f30236a + Math.max(0, ((this.f30237b - 529) * 1000000) / j);
    }

    /* renamed from: a */
    public final long mo30851a(C8281w wVar) {
        return m30894d((long) wVar.f40633z);
    }

    /* renamed from: b */
    public final long mo30852b(C8281w wVar, s51 s51) {
        if (this.f30237b == 0) {
            this.f30236a = s51.f20812e;
        }
        if (this.f30238c) {
            return s51.f20812e;
        }
        ByteBuffer byteBuffer = s51.f20810c;
        Objects.requireNonNull(byteBuffer);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int c = rc4.m37023c(b);
        if (c == -1) {
            this.f30238c = true;
            this.f30237b = 0;
            this.f30236a = s51.f20812e;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return s51.f20812e;
        }
        long d = m30894d((long) wVar.f40633z);
        this.f30237b += (long) c;
        return d;
    }

    /* renamed from: c */
    public final void mo30853c() {
        this.f30236a = 0;
        this.f30237b = 0;
        this.f30238c = false;
    }
}
