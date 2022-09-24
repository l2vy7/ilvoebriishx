package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C7191a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7272l0 extends C7302r0 {

    /* renamed from: c */
    private final ArrayList<C7191a.C7201f> f29056c;

    /* renamed from: d */
    final /* synthetic */ C7306s0 f29057d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7272l0(C7306s0 s0Var, ArrayList<C7191a.C7201f> arrayList) {
        super(s0Var, (C7297q0) null);
        this.f29057d = s0Var;
        this.f29056c = arrayList;
    }

    /* renamed from: a */
    public final void mo29885a() {
        C7306s0 s0Var = this.f29057d;
        s0Var.f29106a.f19988o.f28952p = C7306s0.m29774x(s0Var);
        ArrayList<C7191a.C7201f> arrayList = this.f29056c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7306s0 s0Var2 = this.f29057d;
            arrayList.get(i).getRemoteService(s0Var2.f29120o, s0Var2.f29106a.f19988o.f28952p);
        }
    }
}
