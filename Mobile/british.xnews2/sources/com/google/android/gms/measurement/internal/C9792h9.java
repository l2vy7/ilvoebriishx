package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C9216k1;
import p255u5.C11044s;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
final class C9792h9 implements C11044s {

    /* renamed from: a */
    public final C9216k1 f46338a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f46339b;

    C9792h9(AppMeasurementDynamiteService appMeasurementDynamiteService, C9216k1 k1Var) {
        this.f46339b = appMeasurementDynamiteService;
        this.f46338a = k1Var;
    }

    /* renamed from: a */
    public final void mo38980a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f46338a.mo37659u0(str, str2, bundle, j);
        } catch (RemoteException e) {
            C4670h4 h4Var = this.f46339b.f21267b;
            if (h4Var != null) {
                h4Var.mo19276j().mo19287w().mo38857b("Event listener threw exception", e);
            }
        }
    }
}
