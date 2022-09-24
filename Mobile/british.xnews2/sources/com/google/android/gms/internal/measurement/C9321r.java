package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9321r implements C9306q {

    /* renamed from: b */
    private final String f45405b;

    /* renamed from: c */
    private final ArrayList f45406c;

    public C9321r(String str, List list) {
        this.f45405b = str;
        ArrayList arrayList = new ArrayList();
        this.f45406c = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo37964a() {
        return this.f45405b;
    }

    /* renamed from: b */
    public final C9306q mo19177b(String str, C9326r4 r4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    /* renamed from: c */
    public final ArrayList mo37965c() {
        return this.f45406c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9321r)) {
            return false;
        }
        C9321r rVar = (C9321r) obj;
        String str = this.f45405b;
        if (str == null ? rVar.f45405b == null : str.equals(rVar.f45405b)) {
            return this.f45406c.equals(rVar.f45406c);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f45405b;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f45406c.hashCode();
    }

    public final C9306q zzd() {
        return this;
    }

    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final Iterator zzl() {
        return null;
    }
}
