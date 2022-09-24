package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ly0 implements ow1 {

    /* renamed from: a */
    private final uz0 f35292a;

    /* renamed from: b */
    private final ry0 f35293b;

    /* renamed from: c */
    private Long f35294c;

    /* renamed from: d */
    private String f35295d;

    /* synthetic */ ly0(uz0 uz0, ry0 ry0, jy0 jy0) {
        this.f35292a = uz0;
        this.f35293b = ry0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ow1 mo33418a(long j) {
        this.f35294c = Long.valueOf(j);
        return this;
    }

    public final /* synthetic */ ow1 zza(String str) {
        Objects.requireNonNull(str);
        this.f35295d = str;
        return this;
    }

    public final rw1 zzc() {
        cv3.m31157c(this.f35294c, Long.class);
        cv3.m31157c(this.f35295d, String.class);
        return new ny0(this.f35292a, this.f35293b, this.f35294c, this.f35295d, (my0) null);
    }
}
