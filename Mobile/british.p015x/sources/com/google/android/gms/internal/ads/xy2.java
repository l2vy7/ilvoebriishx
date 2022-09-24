package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xy2 {

    /* renamed from: f */
    private static xy2 f41576f;

    /* renamed from: a */
    private float f41577a = 0.0f;

    /* renamed from: b */
    private final py2 f41578b;

    /* renamed from: c */
    private final ny2 f41579c;

    /* renamed from: d */
    private oy2 f41580d;

    /* renamed from: e */
    private qy2 f41581e;

    public xy2(py2 py2, ny2 ny2) {
        this.f41578b = py2;
        this.f41579c = ny2;
    }

    /* renamed from: b */
    public static xy2 m39683b() {
        if (f41576f == null) {
            f41576f = new xy2(new py2(), new ny2());
        }
        return f41576f;
    }

    /* renamed from: a */
    public final float mo35819a() {
        return this.f41577a;
    }

    /* renamed from: c */
    public final void mo35820c(Context context) {
        this.f41580d = new oy2(new Handler(), context, new my2(), this, (byte[]) null);
    }

    /* renamed from: d */
    public final void mo35821d(float f) {
        this.f41577a = f;
        if (this.f41581e == null) {
            this.f41581e = qy2.m36822a();
        }
        for (fy2 g : this.f41581e.mo34440b()) {
            g.mo31962g().mo31702h(f);
        }
    }

    /* renamed from: e */
    public final void mo35822e() {
        sy2.m37611a().mo34836g(this);
        sy2.m37611a().mo34833d();
        if (sy2.m37611a().mo34835f()) {
            uz2.m38622d().mo35340i();
        }
        this.f41580d.mo34022a();
    }

    /* renamed from: f */
    public final void mo35823f() {
        uz2.m38622d().mo35341j();
        sy2.m37611a().mo34834e();
        this.f41580d.mo34023b();
    }
}
