package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmb */
/* compiled from: IMASDK */
final class bmb extends bmi {
    bmb(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo15464a() {
        if (!mo15486c()) {
            for (int i = 0; i < mo15489d(); i++) {
                Map.Entry e = mo15490e(i);
                if (((bkd) e.getKey()).mo15369c()) {
                    e.setValue(Collections.unmodifiableList((List) e.getValue()));
                }
            }
            for (Map.Entry entry : mo15493f()) {
                if (((bkd) entry.getKey()).mo15369c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo15464a();
    }
}
