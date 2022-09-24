package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class mc0 {

    /* renamed from: b */
    private static mc0 f35475b;

    /* renamed from: a */
    private final AtomicBoolean f35476a = new AtomicBoolean(false);

    mc0() {
    }

    /* renamed from: a */
    public static mc0 m34753a() {
        if (f35475b == null) {
            f35475b = new mc0();
        }
        return f35475b;
    }

    /* renamed from: b */
    public final Thread mo33525b(Context context, String str) {
        if (!this.f35476a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new kc0(this, context, str));
        thread.start();
        return thread;
    }
}
