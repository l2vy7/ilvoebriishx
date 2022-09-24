package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.re */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9336re extends C9199j {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9305pe f45435d;

    public C9336re(C9305pe peVar) {
        super("internal.logger");
        this.f45435d = peVar;
        this.f45094c.put("log", new C9320qe(this, false, true));
        this.f45094c.put("silent", new C9428xd(this, "silent"));
        ((C9199j) this.f45094c.get("silent")).mo19179e("log", new C9320qe(this, true, true));
        this.f45094c.put("unmonitored", new C9290oe(this, "unmonitored"));
        ((C9199j) this.f45094c.get("unmonitored")).mo19179e("log", new C9320qe(this, false, false));
    }

    /* renamed from: d */
    public final C9306q mo37655d(C9326r4 r4Var, List list) {
        return C9306q.f45372d0;
    }
}
