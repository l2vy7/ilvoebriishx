package com.google.android.gms.internal.cast;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.cast.a1 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C4633a1<E> extends C4645u0<E> implements Set<E> {
    @NullableDecl

    /* renamed from: c */
    private transient C4647y0<E> f21179c;

    C4633a1() {
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: g */
    public C4647y0<E> mo19100g() {
        C4647y0<E> y0Var = this.f21179c;
        if (y0Var != null) {
            return y0Var;
        }
        C4647y0<E> j = mo19102j();
        this.f21179c = j;
        return j;
    }

    public final int hashCode() {
        return C8548h1.m40981a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C4647y0<E> mo19102j() {
        return C4647y0.m21386j(toArray());
    }
}
