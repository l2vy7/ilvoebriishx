package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class at2 implements pa1 {
    @GuardedBy("this")

    /* renamed from: b */
    private final HashSet<hn0> f29756b = new HashSet<>();

    /* renamed from: c */
    private final Context f29757c;

    /* renamed from: d */
    private final rn0 f29758d;

    public at2(Context context, rn0 rn0) {
        this.f29757c = context;
        this.f29758d = rn0;
    }

    /* renamed from: a */
    public final Bundle mo30488a() {
        return this.f29758d.mo34574j(this.f29757c, this);
    }

    /* renamed from: b */
    public final synchronized void mo30489b(HashSet<hn0> hashSet) {
        this.f29756b.clear();
        this.f29756b.addAll(hashSet);
    }

    /* renamed from: d */
    public final synchronized void mo18436d(zzbew zzbew) {
        if (zzbew.f42935b != 3) {
            this.f29758d.mo34572h(this.f29756b);
        }
    }
}
