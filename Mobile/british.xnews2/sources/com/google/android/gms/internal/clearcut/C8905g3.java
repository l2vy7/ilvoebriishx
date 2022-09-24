package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.g3 */
final class C8905g3 extends C8898f3 {
    C8905g3(int i) {
        super(i, (C8905g3) null);
    }

    /* renamed from: s */
    public final void mo36943s() {
        if (!mo36929b()) {
            for (int i = 0; i < mo36938n(); i++) {
                Map.Entry h = mo36936h(i);
                if (((C9043z0) h.getKey()).mo36912g()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo36939o()) {
                if (((C9043z0) entry.getKey()).mo36912g()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo36943s();
    }
}
