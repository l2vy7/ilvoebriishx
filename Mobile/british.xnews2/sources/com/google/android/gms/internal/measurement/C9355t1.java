package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p198d5.C10489b;
import p255u5.C11037l;

/* renamed from: com.google.android.gms.internal.measurement.t1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
final class C9355t1 extends C9217k2 {

    /* renamed from: f */
    final /* synthetic */ String f45452f;

    /* renamed from: g */
    final /* synthetic */ String f45453g;

    /* renamed from: h */
    final /* synthetic */ Context f45454h;

    /* renamed from: i */
    final /* synthetic */ Bundle f45455i;

    /* renamed from: j */
    final /* synthetic */ C9372u2 f45456j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9355t1(C9372u2 u2Var, String str, String str2, Context context, Bundle bundle) {
        super(u2Var, true);
        this.f45456j = u2Var;
        this.f45452f = str;
        this.f45453g = str2;
        this.f45454h = context;
        this.f45455i = bundle;
    }

    /* renamed from: a */
    public final void mo37305a() {
        String str;
        String str2;
        String str3;
        try {
            if (C9372u2.m43682m(this.f45452f, this.f45453g)) {
                String str4 = this.f45453g;
                str2 = this.f45452f;
                str = str4;
                str3 = this.f45456j.f45482a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C4604n.m20098k(this.f45454h);
            C9372u2 u2Var = this.f45456j;
            u2Var.f45490i = u2Var.mo38081s(this.f45454h, true);
            if (this.f45456j.f45490i == null) {
                Log.w(this.f45456j.f45482a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m30155a(this.f45454h, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.m30156c(this.f45454h, ModuleDescriptor.MODULE_ID);
            ((C9140f1) C4604n.m20098k(this.f45456j.f45490i)).initialize(C10489b.m48195m6(this.f45454h), new zzcl(55005, (long) Math.max(a, c), c < a, str3, str2, str, this.f45455i, C11037l.m49435a(this.f45454h)), this.f45115b);
        } catch (Exception e) {
            this.f45456j.m43679j(e, true, false);
        }
    }
}
