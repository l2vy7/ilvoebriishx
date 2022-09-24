package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w94 {

    /* renamed from: a */
    private v94 f40738a = new v94();

    /* renamed from: b */
    private v94 f40739b = new v94();

    /* renamed from: c */
    private boolean f40740c;

    /* renamed from: d */
    private long f40741d = C6540C.TIME_UNSET;

    /* renamed from: e */
    private int f40742e;

    /* renamed from: a */
    public final float mo35598a() {
        if (!this.f40738a.mo35393f()) {
            return -1.0f;
        }
        double a = (double) this.f40738a.mo35388a();
        Double.isNaN(a);
        return (float) (1.0E9d / a);
    }

    /* renamed from: b */
    public final int mo35599b() {
        return this.f40742e;
    }

    /* renamed from: c */
    public final long mo35600c() {
        return this.f40738a.mo35393f() ? this.f40738a.mo35388a() : C6540C.TIME_UNSET;
    }

    /* renamed from: d */
    public final long mo35601d() {
        return this.f40738a.mo35393f() ? this.f40738a.mo35389b() : C6540C.TIME_UNSET;
    }

    /* renamed from: e */
    public final void mo35602e(long j) {
        this.f40738a.mo35390c(j);
        int i = 0;
        if (this.f40738a.mo35393f()) {
            this.f40740c = false;
        } else if (this.f40741d != C6540C.TIME_UNSET) {
            if (!this.f40740c || this.f40739b.mo35392e()) {
                this.f40739b.mo35391d();
                this.f40739b.mo35390c(this.f40741d);
            }
            this.f40740c = true;
            this.f40739b.mo35390c(j);
        }
        if (this.f40740c && this.f40739b.mo35393f()) {
            v94 v94 = this.f40738a;
            this.f40738a = this.f40739b;
            this.f40739b = v94;
            this.f40740c = false;
        }
        this.f40741d = j;
        if (!this.f40738a.mo35393f()) {
            i = this.f40742e + 1;
        }
        this.f40742e = i;
    }

    /* renamed from: f */
    public final void mo35603f() {
        this.f40738a.mo35391d();
        this.f40739b.mo35391d();
        this.f40740c = false;
        this.f40741d = C6540C.TIME_UNSET;
        this.f40742e = 0;
    }

    /* renamed from: g */
    public final boolean mo35604g() {
        return this.f40738a.mo35393f();
    }
}
