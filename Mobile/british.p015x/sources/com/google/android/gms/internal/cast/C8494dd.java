package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.dd */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C8494dd {

    /* renamed from: c */
    private static final C8542gc f43419c = C8542gc.m40939a();

    /* renamed from: a */
    protected volatile C8782vd f43420a;

    /* renamed from: b */
    private volatile C8796wb f43421b;

    /* renamed from: a */
    public final int mo36430a() {
        if (this.f43421b != null) {
            return ((C8765ub) this.f43421b).f44122f.length;
        }
        if (this.f43420a != null) {
            return this.f43420a.zzr();
        }
        return 0;
    }

    /* renamed from: b */
    public final C8796wb mo36431b() {
        if (this.f43421b != null) {
            return this.f43421b;
        }
        synchronized (this) {
            if (this.f43421b != null) {
                C8796wb wbVar = this.f43421b;
                return wbVar;
            }
            if (this.f43420a == null) {
                this.f43421b = C8796wb.f44177c;
            } else {
                this.f43421b = this.f43420a.zzm();
            }
            C8796wb wbVar2 = this.f43421b;
            return wbVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36432c(com.google.android.gms.internal.cast.C8782vd r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.cast.vd r0 = r1.f43420a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.cast.vd r0 = r1.f43420a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f43420a = r2     // Catch:{ bd -> 0x0011 }
            com.google.android.gms.internal.cast.wb r0 = com.google.android.gms.internal.cast.C8796wb.f44177c     // Catch:{ bd -> 0x0011 }
            r1.f43421b = r0     // Catch:{ bd -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f43420a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.cast.wb r2 = com.google.android.gms.internal.cast.C8796wb.f44177c     // Catch:{ all -> 0x001b }
            r1.f43421b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C8494dd.mo36432c(com.google.android.gms.internal.cast.vd):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8494dd)) {
            return false;
        }
        C8494dd ddVar = (C8494dd) obj;
        C8782vd vdVar = this.f43420a;
        C8782vd vdVar2 = ddVar.f43420a;
        if (vdVar == null && vdVar2 == null) {
            return mo36431b().equals(ddVar.mo36431b());
        }
        if (vdVar != null && vdVar2 != null) {
            return vdVar.equals(vdVar2);
        }
        if (vdVar != null) {
            ddVar.mo36432c(vdVar.zzs());
            return vdVar.equals(ddVar.f43420a);
        }
        mo36432c(vdVar2.zzs());
        return this.f43420a.equals(vdVar2);
    }

    public int hashCode() {
        return 1;
    }
}
