package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8998s4;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.s4 */
public class C8998s4<M extends C8998s4<M>> extends C9033x4 {

    /* renamed from: c */
    protected C9012u4 f44739c;

    /* renamed from: a */
    public void mo36988a(C8984q4 q4Var) throws IOException {
        if (this.f44739c != null) {
            for (int i = 0; i < this.f44739c.mo37184b(); i++) {
                this.f44739c.mo37185c(i).mo37201b(q4Var);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo36990d() {
        if (this.f44739c != null) {
            for (int i = 0; i < this.f44739c.mo37184b(); i++) {
                this.f44739c.mo37185c(i).mo37202c();
            }
        }
        return 0;
    }

    /* renamed from: g */
    public /* synthetic */ C9033x4 mo36992g() throws CloneNotSupportedException {
        return (C8998s4) clone();
    }

    /* renamed from: h */
    public M clone() throws CloneNotSupportedException {
        M m = (C8998s4) super.clone();
        C9026w4.m42472h(this, m);
        return m;
    }
}
