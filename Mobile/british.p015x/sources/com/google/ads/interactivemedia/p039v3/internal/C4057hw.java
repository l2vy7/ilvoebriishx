package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hw */
/* compiled from: IMASDK */
public final class C4057hw extends C4068ig {

    /* renamed from: h */
    private List<Long> f17401h = null;

    public C4057hw(C4037hc hcVar, C4115k kVar, int i) {
        super(hcVar, "tHdRNe/jhDrKe9TJQvcUj84NPZ0s3GzvdUdmVGo+tKBBdeggC8tn8wP69jltn3ho", "39psGfDY061ys4/Wj2pOCaqnZF5wiqQFlwVMT/Ve3NQ=", kVar, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15910a() throws IllegalAccessException, InvocationTargetException {
        this.f17423d.mo16063U(-1);
        this.f17423d.mo16058P(-1);
        if (this.f17401h == null) {
            this.f17401h = (List) this.f17424e.invoke((Object) null, new Object[]{this.f17420a.mo15893a()});
        }
        List<Long> list = this.f17401h;
        if (list != null && list.size() == 2) {
            synchronized (this.f17423d) {
                this.f17423d.mo16063U(this.f17401h.get(0).longValue());
                this.f17423d.mo16058P(this.f17401h.get(1).longValue());
            }
        }
    }
}
