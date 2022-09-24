package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C7408m;
import java.security.KeyPair;

/* renamed from: com.google.firebase.iid.k0 */
final class C10439k0 {

    /* renamed from: a */
    private final KeyPair f48891a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f48892b;

    C10439k0(KeyPair keyPair, long j) {
        this.f48891a = keyPair;
        this.f48892b = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final String m48100e() {
        return Base64.encodeToString(this.f48891a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final String m48101f() {
        return Base64.encodeToString(this.f48891a.getPrivate().getEncoded(), 11);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final KeyPair mo41898a() {
        return this.f48891a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10439k0)) {
            return false;
        }
        C10439k0 k0Var = (C10439k0) obj;
        if (this.f48892b != k0Var.f48892b || !this.f48891a.getPublic().equals(k0Var.f48891a.getPublic()) || !this.f48891a.getPrivate().equals(k0Var.f48891a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f48891a.getPublic(), this.f48891a.getPrivate(), Long.valueOf(this.f48892b));
    }
}
