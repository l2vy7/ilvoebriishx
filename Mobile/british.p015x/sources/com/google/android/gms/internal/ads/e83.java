package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class e83<E> extends p63<E> {

    /* renamed from: f */
    static final p63<Object> f31267f = new e83(new Object[0], 0);

    /* renamed from: d */
    final transient Object[] f31268d;

    /* renamed from: e */
    private final transient int f31269e;

    e83(Object[] objArr, int i) {
        this.f31268d = objArr;
        this.f31269e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18346a(Object[] objArr, int i) {
        System.arraycopy(this.f31268d, 0, objArr, i, this.f31269e);
        return i + this.f31269e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo18463c() {
        return this.f31269e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo18465e() {
        return 0;
    }

    public final E get(int i) {
        b43.m20204a(i, this.f31269e, "index");
        E e = this.f31268d[i];
        e.getClass();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo18466j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Object[] mo18467q() {
        return this.f31268d;
    }

    public final int size() {
        return this.f31269e;
    }
}
