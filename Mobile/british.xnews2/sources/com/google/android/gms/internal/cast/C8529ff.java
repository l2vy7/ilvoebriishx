package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.ff */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
abstract class C8529ff {

    /* renamed from: a */
    final Unsafe f43476a;

    C8529ff(Unsafe unsafe) {
        this.f43476a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo36435a(Object obj, long j, byte b);

    /* renamed from: b */
    public abstract boolean mo36436b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo36437c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract float mo36438d(Object obj, long j);

    /* renamed from: e */
    public abstract void mo36439e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract double mo36440f(Object obj, long j);

    /* renamed from: g */
    public abstract void mo36441g(Object obj, long j, double d);

    /* renamed from: h */
    public final long mo36528h(Field field) {
        return this.f43476a.objectFieldOffset(field);
    }

    /* renamed from: i */
    public final int mo36529i(Class<?> cls) {
        return this.f43476a.arrayBaseOffset(cls);
    }

    /* renamed from: j */
    public final int mo36530j(Class<?> cls) {
        return this.f43476a.arrayIndexScale(cls);
    }

    /* renamed from: k */
    public final int mo36531k(Object obj, long j) {
        return this.f43476a.getInt(obj, j);
    }

    /* renamed from: l */
    public final void mo36532l(Object obj, long j, int i) {
        this.f43476a.putInt(obj, j, i);
    }

    /* renamed from: m */
    public final long mo36533m(Object obj, long j) {
        return this.f43476a.getLong(obj, j);
    }

    /* renamed from: n */
    public final void mo36534n(Object obj, long j, long j2) {
        this.f43476a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final Object mo36535o(Object obj, long j) {
        return this.f43476a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo36536p(Object obj, long j, Object obj2) {
        this.f43476a.putObject(obj, j, obj2);
    }
}
