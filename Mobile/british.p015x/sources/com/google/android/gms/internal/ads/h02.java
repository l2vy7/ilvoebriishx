package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h02 implements uu3<g02> {

    /* renamed from: a */
    private final iv3<uv0> f32559a;

    /* renamed from: b */
    private final iv3<Context> f32560b;

    /* renamed from: c */
    private final iv3<zzcjf> f32561c;

    /* renamed from: d */
    private final iv3<bs2> f32562d;

    /* renamed from: e */
    private final iv3<Executor> f32563e;

    /* renamed from: f */
    private final iv3<String> f32564f;

    /* renamed from: g */
    private final iv3<id1> f32565g;

    /* renamed from: h */
    private final iv3<md1> f32566h;

    public h02(iv3<uv0> iv3, iv3<Context> iv32, iv3<zzcjf> iv33, iv3<bs2> iv34, iv3<Executor> iv35, iv3<String> iv36, iv3<id1> iv37, iv3<md1> iv38) {
        this.f32559a = iv3;
        this.f32560b = iv32;
        this.f32561c = iv33;
        this.f32562d = iv34;
        this.f32563e = iv35;
        this.f32564f = iv36;
        this.f32565g = iv37;
        this.f32566h = iv38;
    }

    /* renamed from: a */
    public final g02 zzb() {
        Context a = ((et2) this.f32560b).mo31664a();
        zzcjf a2 = ((kw0) this.f32561c).mo33191a();
        bs2 a3 = ((da1) this.f32562d).mo31191a();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new g02(this.f32559a.zzb(), a, a2, a3, nb3, this.f32564f.zzb(), ((jd1) this.f32565g).zzb(), ((nd1) this.f32566h).zzb());
    }
}
