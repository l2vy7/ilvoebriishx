package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q94 implements yd1 {

    /* renamed from: a */
    private final yd1 f37943a;

    /* renamed from: b */
    private long f37944b;

    /* renamed from: c */
    private Uri f37945c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f37946d = Collections.emptyMap();

    public q94(yd1 yd1) {
        Objects.requireNonNull(yd1);
        this.f37943a = yd1;
    }

    /* renamed from: b */
    public final int mo30477b(byte[] bArr, int i, int i2) throws IOException {
        int b = this.f37943a.mo30477b(bArr, i, i2);
        if (b != -1) {
            this.f37944b += (long) b;
        }
        return b;
    }

    /* renamed from: h */
    public final void mo30796h(mt1 mt1) {
        Objects.requireNonNull(mt1);
        this.f37943a.mo30796h(mt1);
    }

    /* renamed from: i */
    public final long mo30478i(ci1 ci1) throws IOException {
        this.f37945c = ci1.f30390a;
        this.f37946d = Collections.emptyMap();
        long i = this.f37943a.mo30478i(ci1);
        Uri zzi = zzi();
        Objects.requireNonNull(zzi);
        this.f37945c = zzi;
        this.f37946d = zza();
        return i;
    }

    /* renamed from: j */
    public final Uri mo34288j() {
        return this.f37945c;
    }

    /* renamed from: k */
    public final Map<String, List<String>> mo34289k() {
        return this.f37946d;
    }

    public final Map<String, List<String>> zza() {
        return this.f37943a.zza();
    }

    public final long zzc() {
        return this.f37944b;
    }

    public final Uri zzi() {
        return this.f37943a.zzi();
    }

    public final void zzj() throws IOException {
        this.f37943a.zzj();
    }
}
