package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.Field;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avp */
/* compiled from: IMASDK */
final class avp<T> {

    /* renamed from: a */
    private final Field f15811a;

    /* synthetic */ avp(Field field) {
        this.f15811a = field;
        field.setAccessible(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14621a(T t, Object obj) {
        try {
            this.f15811a.set(t, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14622b(T t, int i) {
        try {
            this.f15811a.set(t, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
