package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class el1 implements e70<Object> {

    /* renamed from: a */
    private final WeakReference<il1> f31402a;

    /* synthetic */ el1(il1 il1, dl1 dl1) {
        this.f31402a = new WeakReference<>(il1);
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map<String, String> map) {
        il1 il1 = (il1) this.f31402a.get();
        if (il1 != null) {
            il1.f20422h.onAdClicked();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37155m7)).booleanValue()) {
                il1.f20423i.zzq();
            }
        }
    }
}
