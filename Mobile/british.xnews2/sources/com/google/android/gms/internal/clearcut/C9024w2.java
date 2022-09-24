package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.C4586a;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7210g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7215a;
import com.google.android.gms.common.api.internal.C7301r;
import p249s4.C10968a;

/* renamed from: com.google.android.gms.internal.clearcut.w2 */
public final class C9024w2 extends C4591e<C7191a.C7195d.C7199d> implements C10968a {
    private C9024w2(Context context) {
        super(context, C4586a.f19938p, null, (C7301r) new C7215a());
    }

    /* renamed from: g */
    public static C10968a m42450g(Context context) {
        return new C9024w2(context);
    }

    /* renamed from: d */
    public final C7210g<Status> mo37218d(zze zze) {
        return doBestEffortWrite(new C8957m5(zze, asGoogleApiClient()));
    }
}
