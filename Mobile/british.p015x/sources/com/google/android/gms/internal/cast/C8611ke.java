package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.ke */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8611ke extends C8722re {
    C8611ke(int i) {
        super(i, (C8611ke) null);
    }

    /* renamed from: b */
    public final void mo36583b() {
        if (!mo36709c()) {
            for (int i = 0; i < mo36712d(); i++) {
                Map.Entry e = mo36713e(i);
                if (((C8609kc) e.getKey()).zzc()) {
                    e.setValue(Collections.unmodifiableList((List) e.getValue()));
                }
            }
            for (Map.Entry entry : mo36716f()) {
                if (((C8609kc) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo36583b();
    }
}
