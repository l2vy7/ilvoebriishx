package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.x0 */
/* compiled from: Serialization */
final class C10408x0 {

    /* renamed from: com.google.common.collect.x0$b */
    /* compiled from: Serialization */
    static final class C10410b<T> {

        /* renamed from: a */
        private final Field f48816a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo41847a(T t, int i) {
            try {
                this.f48816a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo41848b(T t, Object obj) {
            try {
                this.f48816a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        private C10410b(Field field) {
            this.f48816a = field;
            field.setAccessible(true);
        }
    }

    /* renamed from: a */
    static <T> C10410b<T> m47961a(Class<T> cls, String str) {
        try {
            return new C10410b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    static <K, V> void m47962b(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: c */
    static int m47963c(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* renamed from: d */
    static <K, V> void m47964d(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* renamed from: e */
    static <K, V> void m47965e(C4727j0<K, V> j0Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(j0Var.mo19511b().size());
        for (Map.Entry next : j0Var.mo19511b().entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeInt(((Collection) next.getValue()).size());
            for (Object writeObject : (Collection) next.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }
}
