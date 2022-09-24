package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gc2 implements ad1 {

    /* renamed from: b */
    private final AtomicReference<C7555by> f20344b = new AtomicReference<>();

    /* renamed from: a */
    public final void mo18349a(C7555by byVar) {
        this.f20344b.set(byVar);
    }

    /* renamed from: g */
    public final void mo18104g(zzbfk zzbfk) {
        io2.m33342a(this.f20344b, new ec2(zzbfk));
    }
}
