package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C7408m;

/* renamed from: com.google.android.gms.common.api.internal.o1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7288o1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7220b<?> f29086a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Feature f29087b;

    /* synthetic */ C7288o1(C7220b bVar, Feature feature, C7282n1 n1Var) {
        this.f29086a = bVar;
        this.f29087b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C7288o1)) {
            C7288o1 o1Var = (C7288o1) obj;
            if (!C7408m.m30028a(this.f29086a, o1Var.f29086a) || !C7408m.m30028a(this.f29087b, o1Var.f29087b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f29086a, this.f29087b);
    }

    public final String toString() {
        return C7408m.m30030c(this).mo30140a("key", this.f29086a).mo30140a("feature", this.f29087b).toString();
    }
}
