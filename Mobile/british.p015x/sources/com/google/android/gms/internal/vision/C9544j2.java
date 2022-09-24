package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9643v2;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.j2 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9544j2 extends C9528h2<C9643v2.C9646c> {
    C9544j2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo38413a(Map.Entry<?, ?> entry) {
        return ((C9643v2.C9646c) entry.getKey()).f45910b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object mo38414b(C9511f2 f2Var, C9522g4 g4Var, int i) {
        return f2Var.mo38386a(g4Var, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo38415c(C9540i6 i6Var, Map.Entry<?, ?> entry) throws IOException {
        C9643v2.C9646c cVar = (C9643v2.C9646c) entry.getKey();
        if (cVar.f45912d) {
            switch (C9536i2.f45674a[cVar.f45911c.ordinal()]) {
                case 1:
                    C9683y4.m44877e(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 2:
                    C9683y4.m44883k(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 3:
                    C9683y4.m44887o(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 4:
                    C9683y4.m44890r(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 5:
                    C9683y4.m44896x(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 6:
                    C9683y4.m44893u(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 7:
                    C9683y4.m44848F(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 8:
                    C9683y4.m44852J(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 9:
                    C9683y4.m44897y(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 10:
                    C9683y4.m44849G(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 11:
                    C9683y4.m44894v(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 12:
                    C9683y4.m44847E(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 13:
                    C9683y4.m44891s(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 14:
                    C9683y4.m44896x(cVar.f45910b, (List) entry.getValue(), i6Var, false);
                    return;
                case 15:
                    C9683y4.m44881i(cVar.f45910b, (List) entry.getValue(), i6Var);
                    return;
                case 16:
                    C9683y4.m44873c(cVar.f45910b, (List) entry.getValue(), i6Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C9683y4.m44882j(cVar.f45910b, (List) entry.getValue(), i6Var, C9628t4.m44591b().mo38580a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C9683y4.m44875d(cVar.f45910b, (List) entry.getValue(), i6Var, C9628t4.m44591b().mo38580a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C9536i2.f45674a[cVar.f45911c.ordinal()]) {
                case 1:
                    i6Var.mo38366p(cVar.f45910b, ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    i6Var.mo38367q(cVar.f45910b, ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    i6Var.mo38351a(cVar.f45910b, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    i6Var.zza(cVar.f45910b, ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    i6Var.mo38355e(cVar.f45910b, ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    i6Var.mo38359i(cVar.f45910b, ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    i6Var.mo38375y(cVar.f45910b, ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    i6Var.mo38372v(cVar.f45910b, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    i6Var.mo38340D(cVar.f45910b, ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    i6Var.mo38341E(cVar.f45910b, ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    i6Var.mo38353c(cVar.f45910b, ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    i6Var.mo38346J(cVar.f45910b, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    i6Var.mo38356f(cVar.f45910b, ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    i6Var.mo38355e(cVar.f45910b, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    i6Var.mo38349M(cVar.f45910b, (C9552k1) entry.getValue());
                    return;
                case 16:
                    i6Var.mo38352b(cVar.f45910b, (String) entry.getValue());
                    return;
                case 17:
                    i6Var.mo38342F(cVar.f45910b, entry.getValue(), C9628t4.m44591b().mo38580a(entry.getValue().getClass()));
                    return;
                case 18:
                    i6Var.mo38338B(cVar.f45910b, entry.getValue(), C9628t4.m44591b().mo38580a(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo38416d(C9522g4 g4Var) {
        return g4Var instanceof C9643v2.C9647d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C9553k2<C9643v2.C9646c> mo38417e(Object obj) {
        return ((C9643v2.C9647d) obj).zzyg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C9553k2<C9643v2.C9646c> mo38418f(Object obj) {
        return ((C9643v2.C9647d) obj).mo38619s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo38419g(Object obj) {
        mo38417e(obj).mo38480p();
    }
}
