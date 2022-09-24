package com.google.ads.interactivemedia.p039v3.internal;

import android.os.IBinder;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.Hide;
import java.lang.reflect.Field;

@Hide
/* renamed from: com.google.ads.interactivemedia.v3.internal.apj */
/* compiled from: IMASDK */
public final class apj<T> extends aph {

    /* renamed from: a */
    private final T f15528a;

    private apj(T t) {
        this.f15528a = t;
    }

    /* renamed from: c */
    public static <T> C3847api m14499c(T t) {
        return new apj(t);
    }

    /* renamed from: d */
    public static <T> T m14500d(C3847api api) {
        if (api instanceof apj) {
            return ((apj) api).f15528a;
        }
        IBinder asBinder = api.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!((Field) C4604n.m20098k(field)).isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
