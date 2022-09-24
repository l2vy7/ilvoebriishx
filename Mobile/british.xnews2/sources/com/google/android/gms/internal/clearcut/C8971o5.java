package com.google.android.gms.internal.clearcut;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.o5 */
public final class C8971o5 extends C8998s4<C8971o5> implements Cloneable {

    /* renamed from: f */
    private static volatile C8971o5[] f44688f;

    /* renamed from: d */
    private String f44689d = "";

    /* renamed from: e */
    private String f44690e = "";

    public C8971o5() {
        this.f44739c = null;
        this.f44796b = -1;
    }

    /* renamed from: i */
    public static C8971o5[] m42159i() {
        if (f44688f == null) {
            synchronized (C9026w4.f44777c) {
                if (f44688f == null) {
                    f44688f = new C8971o5[0];
                }
            }
        }
        return f44688f;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final C8971o5 clone() {
        try {
            return (C8971o5) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo36988a(C8984q4 q4Var) throws IOException {
        String str = this.f44689d;
        if (str != null && !str.equals("")) {
            q4Var.mo37122c(1, this.f44689d);
        }
        String str2 = this.f44690e;
        if (str2 != null && !str2.equals("")) {
            q4Var.mo37122c(2, this.f44690e);
        }
        super.mo36988a(q4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo36990d() {
        int d = super.mo36990d();
        String str = this.f44689d;
        if (str != null && !str.equals("")) {
            d += C8984q4.m42292h(1, this.f44689d);
        }
        String str2 = this.f44690e;
        return (str2 == null || str2.equals("")) ? d : d + C8984q4.m42292h(2, this.f44690e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8971o5)) {
            return false;
        }
        C8971o5 o5Var = (C8971o5) obj;
        String str = this.f44689d;
        if (str == null) {
            if (o5Var.f44689d != null) {
                return false;
            }
        } else if (!str.equals(o5Var.f44689d)) {
            return false;
        }
        String str2 = this.f44690e;
        if (str2 == null) {
            if (o5Var.f44690e != null) {
                return false;
            }
        } else if (!str2.equals(o5Var.f44690e)) {
            return false;
        }
        C9012u4 u4Var = this.f44739c;
        if (u4Var != null && !u4Var.mo37183a()) {
            return this.f44739c.equals(o5Var.f44739c);
        }
        C9012u4 u4Var2 = o5Var.f44739c;
        return u4Var2 == null || u4Var2.mo37183a();
    }

    /* renamed from: g */
    public final /* synthetic */ C9033x4 mo36992g() throws CloneNotSupportedException {
        return (C8971o5) clone();
    }

    /* renamed from: h */
    public final /* synthetic */ C8998s4 mo36993h() throws CloneNotSupportedException {
        return (C8971o5) clone();
    }

    public final int hashCode() {
        int hashCode = (C8971o5.class.getName().hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f44689d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f44690e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9012u4 u4Var = this.f44739c;
        if (u4Var != null && !u4Var.mo37183a()) {
            i = this.f44739c.hashCode();
        }
        return hashCode3 + i;
    }
}
