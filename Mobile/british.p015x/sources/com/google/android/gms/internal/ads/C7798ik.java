package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ik */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7798ik extends C7501af {

    /* renamed from: d */
    private static final Object f33268d = new Object();

    /* renamed from: b */
    private final long f33269b;

    /* renamed from: c */
    private final long f33270c;

    public C7798ik(long j, boolean z) {
        this.f33269b = j;
        this.f33270c = j;
    }

    /* renamed from: a */
    public final int mo30363a(Object obj) {
        return f33268d.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo30364b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo30365c() {
        return 1;
    }

    /* renamed from: d */
    public final C8367ye mo30366d(int i, C8367ye yeVar, boolean z) {
        C8195tl.m37896a(i, 0, 1);
        Object obj = z ? f33268d : null;
        long j = this.f33269b;
        yeVar.f41793a = obj;
        yeVar.f41794b = obj;
        yeVar.f41795c = j;
        return yeVar;
    }

    /* renamed from: e */
    public final C8403ze mo30367e(int i, C8403ze zeVar, boolean z, long j) {
        C8195tl.m37896a(i, 0, 1);
        zeVar.f42441a = this.f33270c;
        return zeVar;
    }
}
