package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qy2 {

    /* renamed from: c */
    private static final qy2 f38354c = new qy2();

    /* renamed from: a */
    private final ArrayList<fy2> f38355a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<fy2> f38356b = new ArrayList<>();

    private qy2() {
    }

    /* renamed from: a */
    public static qy2 m36822a() {
        return f38354c;
    }

    /* renamed from: b */
    public final Collection<fy2> mo34440b() {
        return Collections.unmodifiableCollection(this.f38356b);
    }

    /* renamed from: c */
    public final Collection<fy2> mo34441c() {
        return Collections.unmodifiableCollection(this.f38355a);
    }

    /* renamed from: d */
    public final void mo34442d(fy2 fy2) {
        this.f38355a.add(fy2);
    }

    /* renamed from: e */
    public final void mo34443e(fy2 fy2) {
        boolean g = mo34445g();
        this.f38355a.remove(fy2);
        this.f38356b.remove(fy2);
        if (g && !mo34445g()) {
            xy2.m39683b().mo35823f();
        }
    }

    /* renamed from: f */
    public final void mo34444f(fy2 fy2) {
        boolean g = mo34445g();
        this.f38356b.add(fy2);
        if (!g) {
            xy2.m39683b().mo35822e();
        }
    }

    /* renamed from: g */
    public final boolean mo34445g() {
        return this.f38356b.size() > 0;
    }
}
