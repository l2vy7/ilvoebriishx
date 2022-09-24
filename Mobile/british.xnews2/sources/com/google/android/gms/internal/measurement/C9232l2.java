package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4604n;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9232l2 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ Bundle f45183f;

    /* renamed from: g */
    final /* synthetic */ Activity f45184g;

    /* renamed from: h */
    final /* synthetic */ C9356t2 f45185h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9232l2(C9356t2 t2Var, Bundle bundle, Activity activity) {
        super(t2Var.f45457b, true);
        this.f45185h = t2Var;
        this.f45183f = bundle;
        this.f45184g = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37305a() throws RemoteException {
        Bundle bundle;
        if (this.f45183f != null) {
            bundle = new Bundle();
            if (this.f45183f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f45183f.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((C9140f1) C4604n.m20098k(this.f45185h.f45457b.f45490i)).onActivityCreated(C10489b.m48195m6(this.f45184g), bundle, this.f45116c);
    }
}
