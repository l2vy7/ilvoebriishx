package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class ps3 {

    /* renamed from: a */
    final Unsafe f37764a;

    ps3(Unsafe unsafe) {
        this.f37764a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo33738a(long j);

    /* renamed from: b */
    public abstract double mo33739b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo33740c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo33741d(long j, byte[] bArr, long j2, long j3);

    /* renamed from: e */
    public abstract void mo33742e(Object obj, long j, boolean z);

    /* renamed from: f */
    public abstract void mo33743f(Object obj, long j, byte b);

    /* renamed from: g */
    public abstract void mo33744g(Object obj, long j, double d);

    /* renamed from: h */
    public abstract void mo33745h(Object obj, long j, float f);

    /* renamed from: i */
    public abstract boolean mo33746i(Object obj, long j);

    /* renamed from: j */
    public final int mo34181j(Class<?> cls) {
        return this.f37764a.arrayBaseOffset(cls);
    }

    /* renamed from: k */
    public final int mo34182k(Class<?> cls) {
        return this.f37764a.arrayIndexScale(cls);
    }

    /* renamed from: l */
    public final int mo34183l(Object obj, long j) {
        return this.f37764a.getInt(obj, j);
    }

    /* renamed from: m */
    public final long mo34184m(Object obj, long j) {
        return this.f37764a.getLong(obj, j);
    }

    /* renamed from: n */
    public final long mo34185n(Field field) {
        return this.f37764a.objectFieldOffset(field);
    }

    /* renamed from: o */
    public final Object mo34186o(Object obj, long j) {
        return this.f37764a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo34187p(Object obj, long j, int i) {
        this.f37764a.putInt(obj, j, i);
    }

    /* renamed from: q */
    public final void mo34188q(Object obj, long j, long j2) {
        this.f37764a.putLong(obj, j, j2);
    }

    /* renamed from: r */
    public final void mo34189r(Object obj, long j, Object obj2) {
        this.f37764a.putObject(obj, j, obj2);
    }
}
