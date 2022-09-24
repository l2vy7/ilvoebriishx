package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.fb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
abstract class C9150fb {

    /* renamed from: a */
    final Unsafe f45030a;

    C9150fb(Unsafe unsafe) {
        this.f45030a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo37508a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo37509b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo37510c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo37511d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo37512e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo37513f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo37514g(Object obj, long j);

    /* renamed from: h */
    public final int mo37568h(Class cls) {
        return this.f45030a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo37569i(Class cls) {
        return this.f45030a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo37570j(Object obj, long j) {
        return this.f45030a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo37571k(Object obj, long j) {
        return this.f45030a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo37572l(Field field) {
        return this.f45030a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo37573m(Object obj, long j) {
        return this.f45030a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo37574n(Object obj, long j, int i) {
        this.f45030a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo37575o(Object obj, long j, long j2) {
        this.f45030a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo37576p(Object obj, long j, Object obj2) {
        this.f45030a.putObject(obj, j, obj2);
    }
}
