package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9305pe;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9973z3 implements C9305pe {

    /* renamed from: a */
    final /* synthetic */ C9726b4 f46914a;

    C9973z3(C9726b4 b4Var) {
        this.f46914a = b4Var;
    }

    /* renamed from: a */
    public final void mo37951a(int i, String str, List list, boolean z, boolean z2) {
        C9725b3 b3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            b3Var = this.f46914a.f21269a.mo19276j().mo19281p();
        } else if (i2 != 1) {
            if (i2 == 3) {
                b3Var = this.f46914a.f21269a.mo19276j().mo19286v();
            } else if (i2 != 4) {
                b3Var = this.f46914a.f21269a.mo19276j().mo19285u();
            } else if (z) {
                b3Var = this.f46914a.f21269a.mo19276j().mo19289y();
            } else if (!z2) {
                b3Var = this.f46914a.f21269a.mo19276j().mo19288x();
            } else {
                b3Var = this.f46914a.f21269a.mo19276j().mo19287w();
            }
        } else if (z) {
            b3Var = this.f46914a.f21269a.mo19276j().mo19284t();
        } else if (!z2) {
            b3Var = this.f46914a.f21269a.mo19276j().mo19283s();
        } else {
            b3Var = this.f46914a.f21269a.mo19276j().mo19282q();
        }
        int size = list.size();
        if (size == 1) {
            b3Var.mo38857b(str, list.get(0));
        } else if (size == 2) {
            b3Var.mo38858c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            b3Var.mo38856a(str);
        } else {
            b3Var.mo38859d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
