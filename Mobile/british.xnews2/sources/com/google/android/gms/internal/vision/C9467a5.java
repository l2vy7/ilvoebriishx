package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.a5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9467a5 extends C9675x4 {
    C9467a5(int i) {
        super(i, (C9467a5) null);
    }

    /* renamed from: n */
    public final void mo38251n() {
        if (!mo38648b()) {
            for (int i = 0; i < mo38657o(); i++) {
                Map.Entry j = mo38656j(i);
                if (((C9569m2) j.getKey()).mo38494Q()) {
                    j.setValue(Collections.unmodifiableList((List) j.getValue()));
                }
            }
            for (Map.Entry entry : mo38658p()) {
                if (((C9569m2) entry.getKey()).mo38494Q()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo38251n();
    }
}
