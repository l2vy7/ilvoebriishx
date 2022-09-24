package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class lz0 {

    /* renamed from: a */
    private int f35315a;

    /* renamed from: a */
    public final void mo33436a(int i) {
        this.f35315a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo18824b() {
        this.f35315a = 0;
    }

    /* renamed from: c */
    public final void mo33437c(int i) {
        this.f35315a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo33438d(int i) {
        return (this.f35315a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo33439e() {
        return mo33438d(268435456);
    }

    /* renamed from: f */
    public final boolean mo33440f() {
        return mo33438d(Integer.MIN_VALUE);
    }

    /* renamed from: g */
    public final boolean mo33441g() {
        return mo33438d(4);
    }

    /* renamed from: h */
    public final boolean mo33442h() {
        return mo33438d(1);
    }
}
