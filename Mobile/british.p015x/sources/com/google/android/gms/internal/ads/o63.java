package com.google.android.gms.internal.ads;

import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o63 extends p63 {

    /* renamed from: d */
    final transient int f20603d;

    /* renamed from: e */
    final transient int f20604e;

    /* renamed from: f */
    final /* synthetic */ p63 f20605f;

    o63(p63 p63, int i, int i2) {
        this.f20605f = p63;
        this.f20603d = i;
        this.f20604e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo18463c() {
        return this.f20605f.mo18465e() + this.f20603d + this.f20604e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo18465e() {
        return this.f20605f.mo18465e() + this.f20603d;
    }

    public final Object get(int i) {
        b43.m20204a(i, this.f20604e, "index");
        return this.f20605f.get(i + this.f20603d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo18466j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: q */
    public final Object[] mo18467q() {
        return this.f20605f.mo18467q();
    }

    /* renamed from: r */
    public final p63 mo18601r(int i, int i2) {
        b43.m20209f(i, i2, this.f20604e);
        p63 p63 = this.f20605f;
        int i3 = this.f20603d;
        return p63.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f20604e;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
