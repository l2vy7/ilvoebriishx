package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p148s6.C11010o;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.k0 */
/* compiled from: MultimapBuilder */
public abstract class C10394k0<K0, V0> {

    /* renamed from: com.google.common.collect.k0$a */
    /* compiled from: MultimapBuilder */
    static class C10395a extends C10399e<Object> {

        /* renamed from: a */
        final /* synthetic */ int f48805a;

        C10395a(int i) {
            this.f48805a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public <K, V> Map<K, Collection<V>> mo41835c() {
            return C10405q0.m47952c(this.f48805a);
        }
    }

    /* renamed from: com.google.common.collect.k0$b */
    /* compiled from: MultimapBuilder */
    static class C10396b extends C10399e<K0> {

        /* renamed from: a */
        final /* synthetic */ Comparator f48806a;

        C10396b(Comparator comparator) {
            this.f48806a = comparator;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public <K extends K0, V> Map<K, Collection<V>> mo41835c() {
            return new TreeMap(this.f48806a);
        }
    }

    /* renamed from: com.google.common.collect.k0$c */
    /* compiled from: MultimapBuilder */
    private static final class C10397c<V> implements C11010o<List<V>>, Serializable {

        /* renamed from: b */
        private final int f48807b;

        C10397c(int i) {
            this.f48807b = C10393j.m47930b(i, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f48807b);
        }
    }

    /* renamed from: com.google.common.collect.k0$d */
    /* compiled from: MultimapBuilder */
    public static abstract class C10398d<K0, V0> extends C10394k0<K0, V0> {
        C10398d() {
            super((C10395a) null);
        }

        /* renamed from: e */
        public abstract <K extends K0, V extends V0> C10389f0<K, V> mo41837e();
    }

    /* renamed from: com.google.common.collect.k0$e */
    /* compiled from: MultimapBuilder */
    public static abstract class C10399e<K0> {

        /* renamed from: com.google.common.collect.k0$e$a */
        /* compiled from: MultimapBuilder */
        class C10400a extends C10398d<K0, Object> {

            /* renamed from: a */
            final /* synthetic */ int f48808a;

            C10400a(int i) {
                this.f48808a = i;
            }

            /* renamed from: e */
            public <K extends K0, V> C10389f0<K, V> mo41837e() {
                return C4738l0.m21859b(C10399e.this.mo41835c(), new C10397c(this.f48808a));
            }
        }

        C10399e() {
        }

        /* renamed from: a */
        public C10398d<K0, Object> mo41838a() {
            return mo41839b(2);
        }

        /* renamed from: b */
        public C10398d<K0, Object> mo41839b(int i) {
            C10393j.m47930b(i, "expectedValuesPerKey");
            return new C10400a(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo41835c();
    }

    /* synthetic */ C10394k0(C10395a aVar) {
        this();
    }

    /* renamed from: a */
    public static C10399e<Object> m47932a() {
        return m47933b(8);
    }

    /* renamed from: b */
    public static C10399e<Object> m47933b(int i) {
        C10393j.m47930b(i, "expectedKeys");
        return new C10395a(i);
    }

    /* renamed from: c */
    public static C10399e<Comparable> m47934c() {
        return m47935d(C4755p0.m21938c());
    }

    /* renamed from: d */
    public static <K0> C10399e<K0> m47935d(Comparator<K0> comparator) {
        C6073k.m26688k(comparator);
        return new C10396b(comparator);
    }

    private C10394k0() {
    }
}
