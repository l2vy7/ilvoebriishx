package com.google.common.collect;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p159u6.C11052a;
import p159u6.C11054c;
import p159u6.C11055d;

/* renamed from: com.google.common.collect.n */
/* compiled from: ComparisonChain */
public abstract class C4742n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C4742n f21467a = new C4743a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C4742n f21468b = new C4744b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C4742n f21469c = new C4744b(1);

    /* renamed from: com.google.common.collect.n$a */
    /* compiled from: ComparisonChain */
    static class C4743a extends C4742n {
        C4743a() {
            super((C4743a) null);
        }

        /* renamed from: d */
        public C4742n mo19771d(int i, int i2) {
            return mo19777k(C11054c.m49460d(i, i2));
        }

        /* renamed from: e */
        public C4742n mo19772e(long j, long j2) {
            return mo19777k(C11055d.m49466a(j, j2));
        }

        /* renamed from: f */
        public <T> C4742n mo19773f(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return mo19777k(comparator.compare(t, t2));
        }

        /* renamed from: g */
        public C4742n mo19774g(boolean z, boolean z2) {
            return mo19777k(C11052a.m49455a(z, z2));
        }

        /* renamed from: h */
        public C4742n mo19775h(boolean z, boolean z2) {
            return mo19777k(C11052a.m49455a(z2, z));
        }

        /* renamed from: i */
        public int mo19776i() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C4742n mo19777k(int i) {
            if (i < 0) {
                return C4742n.f21468b;
            }
            return i > 0 ? C4742n.f21469c : C4742n.f21467a;
        }
    }

    /* renamed from: com.google.common.collect.n$b */
    /* compiled from: ComparisonChain */
    private static final class C4744b extends C4742n {

        /* renamed from: d */
        final int f21470d;

        C4744b(int i) {
            super((C4743a) null);
            this.f21470d = i;
        }

        /* renamed from: d */
        public C4742n mo19771d(int i, int i2) {
            return this;
        }

        /* renamed from: e */
        public C4742n mo19772e(long j, long j2) {
            return this;
        }

        /* renamed from: f */
        public <T> C4742n mo19773f(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        /* renamed from: g */
        public C4742n mo19774g(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: h */
        public C4742n mo19775h(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: i */
        public int mo19776i() {
            return this.f21470d;
        }
    }

    /* synthetic */ C4742n(C4743a aVar) {
        this();
    }

    /* renamed from: j */
    public static C4742n m21868j() {
        return f21467a;
    }

    /* renamed from: d */
    public abstract C4742n mo19771d(int i, int i2);

    /* renamed from: e */
    public abstract C4742n mo19772e(long j, long j2);

    /* renamed from: f */
    public abstract <T> C4742n mo19773f(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    /* renamed from: g */
    public abstract C4742n mo19774g(boolean z, boolean z2);

    /* renamed from: h */
    public abstract C4742n mo19775h(boolean z, boolean z2);

    /* renamed from: i */
    public abstract int mo19776i();

    private C4742n() {
    }
}
