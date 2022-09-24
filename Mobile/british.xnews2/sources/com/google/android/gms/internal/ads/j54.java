package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class j54 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ m54 f33775b;

    /* renamed from: c */
    public final /* synthetic */ n54 f33776c;

    /* renamed from: d */
    public final /* synthetic */ u44 f33777d;

    /* renamed from: e */
    public final /* synthetic */ z44 f33778e;

    /* renamed from: f */
    public final /* synthetic */ IOException f33779f;

    /* renamed from: g */
    public final /* synthetic */ boolean f33780g;

    public /* synthetic */ j54(m54 m54, n54 n54, u44 u44, z44 z44, IOException iOException, boolean z) {
        this.f33775b = m54;
        this.f33776c = n54;
        this.f33777d = u44;
        this.f33778e = z44;
        this.f33779f = iOException;
        this.f33780g = z;
    }

    public final void run() {
        m54 m54 = this.f33775b;
        this.f33776c.mo18024J(m54.f35410a, m54.f35411b, this.f33777d, this.f33778e, this.f33779f, this.f33780g);
    }
}
