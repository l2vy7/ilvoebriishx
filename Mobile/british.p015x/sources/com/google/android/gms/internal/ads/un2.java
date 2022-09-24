package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class un2 implements ha3 {

    /* renamed from: a */
    public final /* synthetic */ vn2 f39904a;

    /* renamed from: b */
    public final /* synthetic */ st2 f39905b;

    /* renamed from: c */
    public final /* synthetic */ s71 f39906c;

    public /* synthetic */ un2(vn2 vn2, st2 st2, s71 s71) {
        this.f39904a = vn2;
        this.f39905b = st2;
        this.f39906c = s71;
    }

    public final mb3 zza(Object obj) {
        st2 st2 = this.f39905b;
        s71 s71 = this.f39906c;
        ur2 ur2 = (ur2) obj;
        st2.f39061b = ur2;
        Iterator<ir2> it = ur2.f39937b.f39518a.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator<String> it2 = it.next().f33464a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return s71.mo34673h(bb3.m30649i(ur2));
            }
        }
        return bb3.m30649i(null);
    }
}
