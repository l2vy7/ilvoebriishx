package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g64 implements o54 {

    /* renamed from: a */
    private final xc1 f32172a;

    /* renamed from: b */
    private int f32173b = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;

    /* renamed from: c */
    private final f64 f32174c;

    /* renamed from: d */
    private final u84 f32175d = new u84(-1);

    /* renamed from: e */
    private final c24 f32176e = new c24();

    public g64(xc1 xc1, cc4 cc4) {
        f64 f64 = new f64(cc4);
        this.f32172a = xc1;
        this.f32174c = f64;
    }

    /* renamed from: a */
    public final g64 mo32023a(int i) {
        this.f32173b = i;
        return this;
    }

    /* renamed from: b */
    public final i64 mo32024b(C7764ho hoVar) {
        Objects.requireNonNull(hoVar.f32786b);
        return new i64(hoVar, this.f32172a, this.f32174c, l24.f34812a, this.f32175d, this.f32173b, (h64) null, (byte[]) null);
    }
}
