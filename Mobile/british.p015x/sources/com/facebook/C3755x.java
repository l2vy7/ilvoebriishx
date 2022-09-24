package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.x */
/* compiled from: ProgressNoopOutputStream */
class C3755x extends OutputStream implements C3758z {

    /* renamed from: b */
    private final Map<GraphRequest, C3369a0> f13870b = new HashMap();

    /* renamed from: c */
    private final Handler f13871c;

    /* renamed from: d */
    private GraphRequest f13872d;

    /* renamed from: e */
    private C3369a0 f13873e;

    /* renamed from: f */
    private int f13874f;

    C3755x(Handler handler) {
        this.f13871c = handler;
    }

    /* renamed from: c */
    public void mo12614c(GraphRequest graphRequest) {
        this.f13872d = graphRequest;
        this.f13873e = graphRequest != null ? this.f13870b.get(graphRequest) : null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12615d(long j) {
        if (this.f13873e == null) {
            C3369a0 a0Var = new C3369a0(this.f13871c, this.f13872d);
            this.f13873e = a0Var;
            this.f13870b.put(this.f13872d, a0Var);
        }
        this.f13873e.mo11300b(j);
        this.f13874f = (int) (((long) this.f13874f) + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo12616e() {
        return this.f13874f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<GraphRequest, C3369a0> mo12617f() {
        return this.f13870b;
    }

    public void write(byte[] bArr) {
        mo12615d((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo12615d((long) i2);
    }

    public void write(int i) {
        mo12615d(1);
    }
}
