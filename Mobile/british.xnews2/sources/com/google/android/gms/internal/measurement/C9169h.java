package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9169h implements C9306q {

    /* renamed from: b */
    private final C9306q f45064b;

    /* renamed from: c */
    private final String f45065c;

    public C9169h() {
        throw null;
    }

    public C9169h(String str) {
        this.f45064b = C9306q.f45372d0;
        this.f45065c = str;
    }

    public C9169h(String str, C9306q qVar) {
        this.f45064b = qVar;
        this.f45065c = str;
    }

    /* renamed from: a */
    public final C9306q mo37612a() {
        return this.f45064b;
    }

    /* renamed from: b */
    public final C9306q mo19177b(String str, C9326r4 r4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    /* renamed from: c */
    public final String mo37613c() {
        return this.f45065c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9169h)) {
            return false;
        }
        C9169h hVar = (C9169h) obj;
        return this.f45065c.equals(hVar.f45065c) && this.f45064b.equals(hVar.f45064b);
    }

    public final int hashCode() {
        return (this.f45065c.hashCode() * 31) + this.f45064b.hashCode();
    }

    public final C9306q zzd() {
        return new C9169h(this.f45065c, this.f45064b.zzd());
    }

    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    public final Iterator zzl() {
        return null;
    }
}
