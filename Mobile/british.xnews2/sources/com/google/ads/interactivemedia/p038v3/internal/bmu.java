package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmu */
/* compiled from: IMASDK */
abstract class bmu {

    /* renamed from: a */
    final Unsafe f16709a;

    bmu(Unsafe unsafe) {
        this.f16709a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo15532a(Object obj, long j, byte b);

    /* renamed from: b */
    public abstract boolean mo15533b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo15534c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract float mo15535d(Object obj, long j);

    /* renamed from: e */
    public abstract void mo15536e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract double mo15537f(Object obj, long j);

    /* renamed from: g */
    public abstract void mo15538g(Object obj, long j, double d);

    /* renamed from: h */
    public final int mo15539h(Class<?> cls) {
        return this.f16709a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo15540i(Class<?> cls) {
        return this.f16709a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public boolean mo15541j() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = this.f16709a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getInt", new Class[]{cls, cls3});
                cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
                cls2.getMethod("getObject", new Class[]{cls, cls3});
                cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
                return true;
            } catch (Throwable th) {
                bmv.m16745s(th);
            }
        }
        return false;
    }

    /* renamed from: k */
    public final int mo15542k(Object obj, long j) {
        return this.f16709a.getInt(obj, j);
    }

    /* renamed from: l */
    public final void mo15543l(Object obj, long j, int i) {
        this.f16709a.putInt(obj, j, i);
    }

    /* renamed from: m */
    public final long mo15544m(Object obj, long j) {
        return this.f16709a.getLong(obj, j);
    }

    /* renamed from: n */
    public final void mo15545n(Object obj, long j, long j2) {
        this.f16709a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final Object mo15546o(Object obj, long j) {
        return this.f16709a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo15547p(Object obj, long j, Object obj2) {
        this.f16709a.putObject(obj, j, obj2);
    }

    /* renamed from: q */
    public boolean mo15548q() {
        Unsafe unsafe = this.f16709a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return bmv.m16720B() != null;
            } catch (Throwable th) {
                bmv.m16745s(th);
            }
        }
        return false;
    }

    /* renamed from: r */
    public final void mo15549r(Field field) {
        this.f16709a.objectFieldOffset(field);
    }
}
