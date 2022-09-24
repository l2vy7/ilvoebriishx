package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C9216k1;
import p255u5.C11043r;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
final class C9782g9 implements C11043r {

    /* renamed from: a */
    public final C9216k1 f46313a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f46314b;

    C9782g9(AppMeasurementDynamiteService appMeasurementDynamiteService, C9216k1 k1Var) {
        this.f46314b = appMeasurementDynamiteService;
        this.f46313a = k1Var;
    }

    /* renamed from: a */
    public final void mo38967a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f46313a.mo37659u0(str, str2, bundle, j);
        } catch (RemoteException e) {
            C4670h4 h4Var = this.f46314b.f21267b;
            if (h4Var != null) {
                h4Var.mo19276j().mo19287w().mo38857b("Event interceptor threw exception", e);
            }
        }
    }
}
