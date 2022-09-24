package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p232m5.C10798b;

/* renamed from: com.google.android.gms.common.internal.r0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C7424r0 extends C10798b implements C7428s0 {
    /* renamed from: b2 */
    public static C7428s0 m30063b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C7428s0 ? (C7428s0) queryLocalInterface : new C7421q0(iBinder);
    }
}
