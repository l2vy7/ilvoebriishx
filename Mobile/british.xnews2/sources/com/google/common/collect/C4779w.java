package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.w */
/* compiled from: ImmutableMapEntrySet */
abstract class C4779w<K, V> extends C4789y<Map.Entry<K, V>> {

    /* renamed from: com.google.common.collect.w$a */
    /* compiled from: ImmutableMapEntrySet */
    private static class C4780a<K, V> implements Serializable {

        /* renamed from: b */
        final C4776v<K, V> f21549b;

        C4780a(C4776v<K, V> vVar) {
            this.f21549b = vVar;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.f21549b.entrySet();
        }
    }

    C4779w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract C4776v<K, V> mo19929H();

    public boolean contains(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = mo19929H().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo19929H().hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo19462q() {
        return mo19929H().mo19856m();
    }

    public int size() {
        return mo19929H().size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C4780a(mo19929H());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo19467z() {
        return mo19929H().mo19913l();
    }
}
