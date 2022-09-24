package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.aa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9071aa implements C9179ha {

    /* renamed from: a */
    private final C9409w9 f44884a;

    /* renamed from: b */
    private final C9410wa f44885b;

    /* renamed from: c */
    private final boolean f44886c;

    /* renamed from: d */
    private final C9147f8 f44887d;

    private C9071aa(C9410wa waVar, C9147f8 f8Var, C9409w9 w9Var) {
        this.f44885b = waVar;
        this.f44886c = f8Var.mo37563c(w9Var);
        this.f44887d = f8Var;
        this.f44884a = w9Var;
    }

    /* renamed from: g */
    static C9071aa m42625g(C9410wa waVar, C9147f8 f8Var, C9409w9 w9Var) {
        return new C9071aa(waVar, f8Var, w9Var);
    }

    /* renamed from: a */
    public final void mo37354a(Object obj) {
        this.f44885b.mo38128g(obj);
        this.f44887d.mo37562b(obj);
    }

    /* renamed from: b */
    public final boolean mo37355b(Object obj) {
        this.f44887d.mo37561a(obj);
        throw null;
    }

    /* renamed from: c */
    public final void mo37356c(Object obj, byte[] bArr, int i, int i2, C9131e7 e7Var) throws IOException {
        C9330r8 r8Var = (C9330r8) obj;
        if (r8Var.zzc == C9425xa.m43841c()) {
            r8Var.zzc = C9425xa.m43843e();
        }
        C9299p8 p8Var = (C9299p8) obj;
        throw null;
    }

    /* renamed from: d */
    public final void mo37357d(Object obj, Object obj2) {
        C9209ja.m43119f(this.f44885b, obj, obj2);
        if (this.f44886c) {
            C9209ja.m43118e(this.f44887d, obj, obj2);
        }
    }

    /* renamed from: e */
    public final boolean mo37358e(Object obj, Object obj2) {
        if (!this.f44885b.mo38124c(obj).equals(this.f44885b.mo38124c(obj2))) {
            return false;
        }
        if (!this.f44886c) {
            return true;
        }
        this.f44887d.mo37561a(obj);
        this.f44887d.mo37561a(obj2);
        throw null;
    }

    /* renamed from: f */
    public final void mo37359f(Object obj, C9069a8 a8Var) throws IOException {
        this.f44887d.mo37561a(obj);
        throw null;
    }

    public final int zza(Object obj) {
        C9410wa waVar = this.f44885b;
        int b = waVar.mo38123b(waVar.mo38124c(obj));
        if (!this.f44886c) {
            return b;
        }
        this.f44887d.mo37561a(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.f44885b.mo38124c(obj).hashCode();
        if (!this.f44886c) {
            return hashCode;
        }
        this.f44887d.mo37561a(obj);
        throw null;
    }

    public final Object zze() {
        return this.f44884a.mo37990a().mo37841x();
    }
}
