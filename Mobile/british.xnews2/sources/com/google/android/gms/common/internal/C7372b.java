package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.common.api.C7340j;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7372b {
    /* renamed from: a */
    public static C7203b m29987a(Status status) {
        if (status.mo29734F0()) {
            return new C7340j(status);
        }
        return new C7203b(status);
    }
}
