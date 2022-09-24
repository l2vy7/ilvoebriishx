package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C11010o;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.l0 */
/* compiled from: Multimaps */
public final class C4738l0 {

    /* renamed from: com.google.common.collect.l0$b */
    /* compiled from: Multimaps */
    static abstract class C4739b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        C4739b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C4727j0<K, V> mo19685c();

        public void clear() {
            mo19685c().clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo19685c().mo19673c(entry.getKey(), entry.getValue());
        }

        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo19685c().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return mo19685c().size();
        }
    }

    /* renamed from: com.google.common.collect.l0$a */
    /* compiled from: Multimaps */
    private static class C4740a<K, V> extends C4687c<K, V> {

        /* renamed from: h */
        transient C11010o<? extends List<V>> f21465h;

        C4740a(Map<K, Collection<V>> map, C11010o<? extends List<V>> oVar) {
            super(map);
            this.f21465h = (C11010o) C6073k.m26688k(oVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f21465h = (C11010o) objectInputStream.readObject();
            mo19529z((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f21465h);
            objectOutputStream.writeObject(mo19522s());
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public List<V> mo19524t() {
            return (List) this.f21465h.get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map<K, Collection<V>> mo19675e() {
            return mo19526v();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Set<K> mo19676g() {
            return mo19528w();
        }
    }

    /* renamed from: a */
    static boolean m21858a(C4727j0<?, ?> j0Var, @NullableDecl Object obj) {
        if (obj == j0Var) {
            return true;
        }
        if (obj instanceof C4727j0) {
            return j0Var.mo19511b().equals(((C4727j0) obj).mo19511b());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> C10389f0<K, V> m21859b(Map<K, Collection<V>> map, C11010o<? extends List<V>> oVar) {
        return new C4740a(map, oVar);
    }
}
