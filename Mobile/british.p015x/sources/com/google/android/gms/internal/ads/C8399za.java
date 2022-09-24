package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.za */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8399za extends C8363ya {
    protected C8399za(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: o */
    public static C8399za m40249o(String str, Context context, boolean z) {
        C8363ya.m39826l(context, false);
        return new C8399za(context, str, false);
    }

    @Deprecated
    /* renamed from: p */
    public static C8399za m40250p(String str, Context context, boolean z, int i) {
        C8363ya.m39826l(context, z);
        return new C8399za(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final List<Callable<Void>> mo35899j(C8400zb zbVar, Context context, C7600d8 d8Var, C8288w7 w7Var) {
        if (zbVar.mo36037k() == null || !this.f41764v) {
            return super.mo35899j(zbVar, context, d8Var, (C8288w7) null);
        }
        int a = zbVar.mo36028a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo35899j(zbVar, context, d8Var, (C8288w7) null));
        arrayList.add(new C8045pc(zbVar, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", d8Var, a, 24));
        return arrayList;
    }
}
