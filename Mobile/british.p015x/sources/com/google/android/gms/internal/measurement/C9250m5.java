package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9250m5 extends ContentObserver {
    C9250m5(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C9266n5.f45304e.set(true);
    }
}
