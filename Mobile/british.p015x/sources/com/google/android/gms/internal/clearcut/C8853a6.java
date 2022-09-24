package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.a6 */
final class C8853a6 extends ContentObserver {
    C8853a6(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C9048z5.f44815e.set(true);
    }
}
