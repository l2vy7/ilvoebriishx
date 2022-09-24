package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ka */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9224ka extends C9332ra {
    C9224ka(int i) {
        super(i, (C9224ka) null);
    }

    /* renamed from: b */
    public final void mo37693b() {
        if (!mo38009l()) {
            for (int i = 0; i < mo37999c(); i++) {
                Map.Entry h = mo38007h(i);
                if (((C9192i8) h.getKey()).zzc()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo38002d()) {
                if (((C9192i8) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo37693b();
    }
}
