package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m54 {

    /* renamed from: a */
    public final int f35410a;

    /* renamed from: b */
    public final c54 f35411b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<l54> f35412c;

    public m54() {
        this(new CopyOnWriteArrayList(), 0, (c54) null, 0);
    }

    private m54(CopyOnWriteArrayList<l54> copyOnWriteArrayList, int i, c54 c54, long j) {
        this.f35412c = copyOnWriteArrayList;
        this.f35410a = i;
        this.f35411b = c54;
    }

    /* renamed from: n */
    private static final long m34693n(long j) {
        long d = xy3.m39692d(j);
        return d == C6540C.TIME_UNSET ? C6540C.TIME_UNSET : d;
    }

    /* renamed from: a */
    public final m54 mo33481a(int i, c54 c54, long j) {
        return new m54(this.f35412c, i, c54, 0);
    }

    /* renamed from: b */
    public final void mo33482b(Handler handler, n54 n54) {
        this.f35412c.add(new l54(handler, n54));
    }

    /* renamed from: c */
    public final void mo33483c(z44 z44) {
        Iterator<l54> it = this.f35412c.iterator();
        while (it.hasNext()) {
            l54 next = it.next();
            d13.m20322u(next.f34914a, new k54(this, next.f34915b, z44));
        }
    }

    /* renamed from: d */
    public final void mo33484d(int i, C8281w wVar, int i2, Object obj, long j) {
        mo33483c(new z44(1, i, wVar, 0, (Object) null, m34693n(j), C6540C.TIME_UNSET));
    }

    /* renamed from: e */
    public final void mo33485e(u44 u44, z44 z44) {
        Iterator<l54> it = this.f35412c.iterator();
        while (it.hasNext()) {
            l54 next = it.next();
            d13.m20322u(next.f34914a, new g54(this, next.f34915b, u44, z44));
        }
    }

    /* renamed from: f */
    public final void mo33486f(u44 u44, int i, int i2, C8281w wVar, int i3, Object obj, long j, long j2) {
        u44 u442 = u44;
        mo33485e(u44, new z44(1, -1, (C8281w) null, 0, (Object) null, m34693n(j), m34693n(j2)));
    }

    /* renamed from: g */
    public final void mo33487g(u44 u44, z44 z44) {
        Iterator<l54> it = this.f35412c.iterator();
        while (it.hasNext()) {
            l54 next = it.next();
            d13.m20322u(next.f34914a, new h54(this, next.f34915b, u44, z44));
        }
    }

    /* renamed from: h */
    public final void mo33488h(u44 u44, int i, int i2, C8281w wVar, int i3, Object obj, long j, long j2) {
        u44 u442 = u44;
        mo33487g(u44, new z44(1, -1, (C8281w) null, 0, (Object) null, m34693n(j), m34693n(j2)));
    }

    /* renamed from: i */
    public final void mo33489i(u44 u44, z44 z44, IOException iOException, boolean z) {
        Iterator<l54> it = this.f35412c.iterator();
        while (it.hasNext()) {
            l54 next = it.next();
            d13.m20322u(next.f34914a, new j54(this, next.f34915b, u44, z44, iOException, z));
        }
    }

    /* renamed from: j */
    public final void mo33490j(u44 u44, int i, int i2, C8281w wVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        u44 u442 = u44;
        mo33489i(u44, new z44(1, -1, (C8281w) null, 0, (Object) null, m34693n(j), m34693n(j2)), iOException, z);
    }

    /* renamed from: k */
    public final void mo33491k(u44 u44, z44 z44) {
        Iterator<l54> it = this.f35412c.iterator();
        while (it.hasNext()) {
            l54 next = it.next();
            d13.m20322u(next.f34914a, new i54(this, next.f34915b, u44, z44));
        }
    }

    /* renamed from: l */
    public final void mo33492l(u44 u44, int i, int i2, C8281w wVar, int i3, Object obj, long j, long j2) {
        u44 u442 = u44;
        mo33491k(u44, new z44(1, -1, (C8281w) null, 0, (Object) null, m34693n(j), m34693n(j2)));
    }

    /* renamed from: m */
    public final void mo33493m(n54 n54) {
        Iterator<l54> it = this.f35412c.iterator();
        while (it.hasNext()) {
            l54 next = it.next();
            if (next.f34915b == n54) {
                this.f35412c.remove(next);
            }
        }
    }
}
