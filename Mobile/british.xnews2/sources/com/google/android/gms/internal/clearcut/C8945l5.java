package com.google.android.gms.internal.clearcut;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.l5 */
public final class C8945l5 extends C8998s4<C8945l5> implements Cloneable {

    /* renamed from: d */
    private byte[] f44601d = C8852a5.f44392h;

    /* renamed from: e */
    private String f44602e = "";

    /* renamed from: f */
    private byte[][] f44603f = C8852a5.f44391g;

    /* renamed from: g */
    private boolean f44604g = false;

    public C8945l5() {
        this.f44739c = null;
        this.f44796b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C8945l5 clone() {
        try {
            C8945l5 l5Var = (C8945l5) super.clone();
            byte[][] bArr = this.f44603f;
            if (bArr != null && bArr.length > 0) {
                l5Var.f44603f = (byte[][]) bArr.clone();
            }
            return l5Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo36988a(C8984q4 q4Var) throws IOException {
        if (!Arrays.equals(this.f44601d, C8852a5.f44392h)) {
            q4Var.mo37123d(1, this.f44601d);
        }
        byte[][] bArr = this.f44603f;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f44603f;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    q4Var.mo37123d(2, bArr3);
                }
                i++;
            }
        }
        String str = this.f44602e;
        if (str != null && !str.equals("")) {
            q4Var.mo37122c(4, this.f44602e);
        }
        super.mo36988a(q4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo36990d() {
        int d = super.mo36990d();
        if (!Arrays.equals(this.f44601d, C8852a5.f44392h)) {
            d += C8984q4.m42293i(1, this.f44601d);
        }
        byte[][] bArr = this.f44603f;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f44603f;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += C8984q4.m42298s(bArr3);
                }
                i++;
            }
            d = d + i2 + (i3 * 1);
        }
        String str = this.f44602e;
        return (str == null || str.equals("")) ? d : d + C8984q4.m42292h(4, this.f44602e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8945l5)) {
            return false;
        }
        C8945l5 l5Var = (C8945l5) obj;
        if (!Arrays.equals(this.f44601d, l5Var.f44601d)) {
            return false;
        }
        String str = this.f44602e;
        if (str == null) {
            if (l5Var.f44602e != null) {
                return false;
            }
        } else if (!str.equals(l5Var.f44602e)) {
            return false;
        }
        if (!C9026w4.m42473i(this.f44603f, l5Var.f44603f)) {
            return false;
        }
        C9012u4 u4Var = this.f44739c;
        if (u4Var != null && !u4Var.mo37183a()) {
            return this.f44739c.equals(l5Var.f44739c);
        }
        C9012u4 u4Var2 = l5Var.f44739c;
        return u4Var2 == null || u4Var2.mo37183a();
    }

    /* renamed from: g */
    public final /* synthetic */ C9033x4 mo36992g() throws CloneNotSupportedException {
        return (C8945l5) clone();
    }

    /* renamed from: h */
    public final /* synthetic */ C8998s4 mo36993h() throws CloneNotSupportedException {
        return (C8945l5) clone();
    }

    public final int hashCode() {
        int hashCode = (((C8945l5.class.getName().hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f44601d)) * 31;
        String str = this.f44602e;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + C9026w4.m42471g(this.f44603f)) * 31) + 1237) * 31;
        C9012u4 u4Var = this.f44739c;
        if (u4Var != null && !u4Var.mo37183a()) {
            i = this.f44739c.hashCode();
        }
        return hashCode2 + i;
    }
}
