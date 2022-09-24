package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.avc */
/* compiled from: IMASDK */
final class avc<K, V> extends arx<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    transient arv<? extends List<V>> f15785a;

    avc(Map<K, Collection<V>> map, arv<? extends List<V>> arv) {
        super(map);
        this.f15785a = arv;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f15785a = (arv) objectInputStream.readObject();
        mo14370d((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f15785a);
        objectOutputStream.writeObject(mo14371e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Collection mo14250c() {
        return (List) this.f15785a.mo14153a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Set<K> mo14375i() {
        return mo14376j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Map<K, Collection<V>> mo14379m() {
        return mo14380n();
    }
}
