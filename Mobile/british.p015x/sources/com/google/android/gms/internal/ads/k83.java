package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class k83<E> extends a73<E> {

    /* renamed from: i */
    private static final Object[] f20474i;

    /* renamed from: j */
    static final k83<Object> f20475j;

    /* renamed from: d */
    final transient Object[] f20476d;

    /* renamed from: e */
    private final transient int f20477e;

    /* renamed from: f */
    final transient Object[] f20478f;

    /* renamed from: g */
    private final transient int f20479g;

    /* renamed from: h */
    private final transient int f20480h;

    static {
        Object[] objArr = new Object[0];
        f20474i = objArr;
        f20475j = new k83(objArr, 0, objArr, 0, 0);
    }

    k83(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f20476d = objArr;
        this.f20477e = i;
        this.f20478f = objArr2;
        this.f20479g = i2;
        this.f20480h = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo18097A() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18346a(Object[] objArr, int i) {
        System.arraycopy(this.f20476d, 0, objArr, i, this.f20480h);
        return i + this.f20480h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo18463c() {
        return this.f20480h;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f20478f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b = h63.m20519b(obj);
        while (true) {
            int i = b & this.f20479g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo18465e() {
        return 0;
    }

    /* renamed from: g */
    public final s83<E> mo18100g() {
        return mo18099f().listIterator(0);
    }

    public final int hashCode() {
        return this.f20477e;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo18099f().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Object[] mo18467q() {
        return this.f20476d;
    }

    public final int size() {
        return this.f20480h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final p63<E> mo18103t() {
        return p63.m20822v(this.f20476d, this.f20480h);
    }
}
