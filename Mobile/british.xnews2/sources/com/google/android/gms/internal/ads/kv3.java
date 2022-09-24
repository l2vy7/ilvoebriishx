package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p133q.C5911c;
import p133q.C5920e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kv3 extends C5920e {

    /* renamed from: c */
    private final WeakReference<o10> f34495c;

    public kv3(o10 o10, byte[] bArr) {
        this.f34495c = new WeakReference<>(o10);
    }

    /* renamed from: a */
    public final void mo22912a(ComponentName componentName, C5911c cVar) {
        o10 o10 = (o10) this.f34495c.get();
        if (o10 != null) {
            o10.mo18596c(cVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        o10 o10 = (o10) this.f34495c.get();
        if (o10 != null) {
            o10.mo18597d();
        }
    }
}
