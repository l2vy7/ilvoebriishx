package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.common.api.internal.f3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7244f3 implements Runnable {

    /* renamed from: b */
    private final C7235d3 f29008b;

    /* renamed from: c */
    final /* synthetic */ C7248g3 f29009c;

    C7244f3(C7248g3 g3Var, C7235d3 d3Var) {
        this.f29009c = g3Var;
        this.f29008b = d3Var;
    }

    public final void run() {
        if (this.f29009c.f29012b) {
            ConnectionResult b = this.f29008b.mo29852b();
            if (b.mo29685F0()) {
                C7248g3 g3Var = this.f29009c;
                g3Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.m29502a(g3Var.getActivity(), (PendingIntent) C4604n.m20098k(b.mo29684E0()), this.f29008b.mo29851a(), false), 1);
                return;
            }
            C7248g3 g3Var2 = this.f29009c;
            if (g3Var2.f29015e.mo29705d(g3Var2.getActivity(), b.mo29682C0(), (String) null) != null) {
                C7248g3 g3Var3 = this.f29009c;
                g3Var3.f29015e.mo29721z(g3Var3.getActivity(), this.f29009c.mLifecycleFragment, b.mo29682C0(), 2, this.f29009c);
            } else if (b.mo29682C0() == 18) {
                C7248g3 g3Var4 = this.f29009c;
                Dialog u = g3Var4.f29015e.mo29716u(g3Var4.getActivity(), this.f29009c);
                C7248g3 g3Var5 = this.f29009c;
                g3Var5.f29015e.mo29717v(g3Var5.getActivity().getApplicationContext(), new C7239e3(this, u));
            } else {
                this.f29009c.m29660a(b, this.f29008b.mo29851a());
            }
        }
    }
}
