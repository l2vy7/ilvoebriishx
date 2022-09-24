package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class n44<T> extends f44 {

    /* renamed from: g */
    private final HashMap<T, m44<T>> f35903g = new HashMap<>();

    /* renamed from: h */
    private Handler f35904h;

    /* renamed from: i */
    private mt1 f35905i;

    protected n44() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo31767r() {
        for (m44 next : this.f35903g.values()) {
            next.f35398a.mo31762m(next.f35399b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo31768s() {
        for (m44 next : this.f35903g.values()) {
            next.f35398a.mo31756c(next.f35399b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo18989t(mt1 mt1) {
        this.f35905i = mt1;
        this.f35904h = d13.m20307f0((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo18990v() {
        for (m44 next : this.f35903g.values()) {
            next.f35398a.mo31758h(next.f35399b);
            next.f35398a.mo31757e(next.f35400c);
            next.f35398a.mo31760j(next.f35400c);
        }
        this.f35903g.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract c54 mo18991x(T t, c54 c54);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo18992y(T t, f54 f54, gi0 gi0);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo33631z(T t, f54 f54) {
        nu1.m20745d(!this.f35903g.containsKey(t));
        k44 k44 = new k44(this, t);
        l44 l44 = new l44(this, t);
        this.f35903g.put(t, new m44(f54, k44, l44));
        Handler handler = this.f35904h;
        Objects.requireNonNull(handler);
        f54.mo31759i(handler, l44);
        Handler handler2 = this.f35904h;
        Objects.requireNonNull(handler2);
        f54.mo31754a(handler2, l44);
        f54.mo31761l(k44, this.f35905i);
        if (!mo31770w()) {
            f54.mo31762m(k44);
        }
    }

    public void zzv() throws IOException {
        for (m44<T> m44 : this.f35903g.values()) {
            m44.f35398a.zzv();
        }
    }
}
