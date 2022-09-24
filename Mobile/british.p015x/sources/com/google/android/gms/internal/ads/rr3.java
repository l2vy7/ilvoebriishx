package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rr3 extends cs3 {
    rr3(int i) {
        super(i, (bs3) null);
    }

    /* renamed from: b */
    public final void mo31022b() {
        if (!mo31033l()) {
            for (int i = 0; i < mo31023c(); i++) {
                Map.Entry h = mo31031h(i);
                if (((bp3) h.getKey()).zzc()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo31026d()) {
                if (((bp3) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo31022b();
    }
}
