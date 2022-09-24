package com.google.common.collect;

import com.google.common.collect.C4766t;
import com.google.common.collect.C4776v;
import com.google.common.collect.C4782x;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.u */
/* compiled from: ImmutableListMultimap */
public class C4773u<K, V> extends C4782x<K, V> implements C10389f0<K, V> {

    /* renamed from: com.google.common.collect.u$a */
    /* compiled from: ImmutableListMultimap */
    public static final class C4774a<K, V> extends C4782x.C4783c<K, V> {
        /* renamed from: e */
        public C4773u<K, V> mo19892e() {
            return (C4773u) super.mo19942a();
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public C4774a<K, V> mo19891c(K k, Iterable<? extends V> iterable) {
            super.mo19891c(k, iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public C4774a<K, V> mo19894g(K k, V... vArr) {
            super.mo19944d(k, vArr);
            return this;
        }
    }

    C4773u(C4776v<K, C4766t<V>> vVar, int i) {
        super(vVar, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C4776v.C4777a b = C4776v.m22045b();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C4766t.C4768a v = C4766t.m21986v();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        v.mo19883e(objectInputStream.readObject());
                    }
                    b.mo19923c(readObject, v.mo19884f());
                    i2 += readInt2;
                    i++;
                } else {
                    throw new InvalidObjectException("Invalid value count " + readInt2);
                }
            }
            try {
                C4782x.C4788e.f21565a.mo41848b(this, b.mo19922a());
                C4782x.C4788e.f21566b.mo41847a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            throw new InvalidObjectException("Invalid key count " + readInt);
        }
    }

    /* renamed from: t */
    public static <K, V> C4774a<K, V> m22019t() {
        return new C4774a<>();
    }

    /* renamed from: u */
    static <K, V> C4773u<K, V> m22020u(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        C4766t<E> tVar;
        if (collection.isEmpty()) {
            return m22021w();
        }
        C4776v.C4777a aVar = new C4776v.C4777a(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                tVar = C4766t.m21988y(collection2);
            } else {
                tVar = C4766t.m21983K(comparator, collection2);
            }
            if (!tVar.isEmpty()) {
                aVar.mo19923c(key, tVar);
                i += tVar.size();
            }
        }
        return new C4773u<>(aVar.mo19922a(), i);
    }

    /* renamed from: w */
    public static <K, V> C4773u<K, V> m22021w() {
        return C10403o.f48811h;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C10408x0.m47965e(this, objectOutputStream);
    }

    /* renamed from: v */
    public C4766t<V> mo19889q(@NullableDecl K k) {
        C4766t<V> tVar = (C4766t) this.f21551f.get(k);
        return tVar == null ? C4766t.m21978E() : tVar;
    }
}
