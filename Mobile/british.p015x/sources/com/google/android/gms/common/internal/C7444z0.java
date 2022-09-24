package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.z0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7444z0 extends C7415o0 {

    /* renamed from: b */
    private C7377d f29378b;

    /* renamed from: c */
    private final int f29379c;

    public C7444z0(C7377d dVar, int i) {
        this.f29378b = dVar;
        this.f29379c = i;
    }

    /* renamed from: J3 */
    public final void mo30131J3(int i, IBinder iBinder, zzj zzj) {
        C7377d dVar = this.f29378b;
        C4604n.m20099l(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C4604n.m20098k(zzj);
        C7377d.zzj(dVar, zzj);
        mo30133t3(i, iBinder, zzj.f29394b);
    }

    /* renamed from: k2 */
    public final void mo30132k2(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    /* renamed from: t3 */
    public final void mo30133t3(int i, IBinder iBinder, Bundle bundle) {
        C4604n.m20099l(this.f29378b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f29378b.onPostInitHandler(i, iBinder, bundle, this.f29379c);
        this.f29378b = null;
    }
}
