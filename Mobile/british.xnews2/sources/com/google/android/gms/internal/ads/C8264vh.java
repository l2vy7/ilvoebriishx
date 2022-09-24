package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.p039ts.PsExtractor;

/* renamed from: com.google.android.gms.internal.ads.vh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8264vh implements C8156sh {

    /* renamed from: a */
    private final C7544bm f40423a;

    /* renamed from: b */
    private final int f40424b;

    /* renamed from: c */
    private final int f40425c;

    /* renamed from: d */
    private int f40426d;

    /* renamed from: e */
    private int f40427e;

    public C8264vh(C8050ph phVar) {
        C7544bm bmVar = phVar.f37635P0;
        this.f40423a = bmVar;
        bmVar.mo30725v(12);
        this.f40425c = bmVar.mo30712i() & 255;
        this.f40424b = bmVar.mo30712i();
    }

    public final int zza() {
        return this.f40424b;
    }

    public final int zzb() {
        int i = this.f40425c;
        if (i == 8) {
            return this.f40423a.mo30710g();
        }
        if (i == 16) {
            return this.f40423a.mo30713j();
        }
        int i2 = this.f40426d;
        this.f40426d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f40427e & 15;
        }
        int g = this.f40423a.mo30710g();
        this.f40427e = g;
        return (g & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }

    public final boolean zzc() {
        return false;
    }
}
