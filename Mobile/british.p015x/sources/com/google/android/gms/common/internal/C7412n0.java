package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.n0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
abstract class C7412n0 extends C7442y0<Boolean> {

    /* renamed from: d */
    public final int f29346d;

    /* renamed from: e */
    public final Bundle f29347e;

    /* renamed from: f */
    final /* synthetic */ C7377d f29348f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C7412n0(C7377d dVar, int i, Bundle bundle) {
        super(dVar, Boolean.TRUE);
        this.f29348f = dVar;
        this.f29346d = i;
        this.f29347e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo30143a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f29346d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo30044g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.d r3 = r2.f29348f
            r3.zzp(r0, null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.mo30043f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.d r3 = r2.f29348f
            r3.zzp(r0, null)
            android.os.Bundle r3 = r2.f29347e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f29346d
            r3.<init>(r0, r1)
            r2.mo30043f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C7412n0.mo30143a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30144b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo30043f(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo30044g();
}
