package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.e0 */
/* compiled from: Iterators */
public final class C4708e0 {

    /* renamed from: com.google.common.collect.e0$a */
    /* compiled from: Iterators */
    static class C4709a extends C10388e1<T> {

        /* renamed from: b */
        boolean f21419b;

        /* renamed from: c */
        final /* synthetic */ Object f21420c;

        C4709a(Object obj) {
            this.f21420c = obj;
        }

        public boolean hasNext() {
            return !this.f21419b;
        }

        public T next() {
            if (!this.f21419b) {
                this.f21419b = true;
                return this.f21420c;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.common.collect.e0$b */
    /* compiled from: Iterators */
    private static final class C4710b<T> extends C10382a<T> {

        /* renamed from: f */
        static final C10390f1<Object> f21421f = new C4710b(new Object[0], 0, 0, 0);

        /* renamed from: d */
        private final T[] f21422d;

        /* renamed from: e */
        private final int f21423e;

        C4710b(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f21422d = tArr;
            this.f21423e = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo19669a(int i) {
            return this.f21422d[this.f21423e + i];
        }
    }

    /* renamed from: com.google.common.collect.e0$c */
    /* compiled from: Iterators */
    private enum C4711c implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C10393j.m47931c(false);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m21761a(Collection<T> collection, Iterator<? extends T> it) {
        C6073k.m26688k(collection);
        C6073k.m26688k(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    static void m21762b(Iterator<?> it) {
        C6073k.m26688k(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21763c(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = p148s6.C6069h.m26674a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C4708e0.m21763c(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: d */
    static <T> C10388e1<T> m21764d() {
        return m21765e();
    }

    /* renamed from: e */
    static <T> C10390f1<T> m21765e() {
        return C4710b.f21421f;
    }

    /* renamed from: f */
    static <T> Iterator<T> m21766f() {
        return C4711c.INSTANCE;
    }

    /* renamed from: g */
    public static <T> T m21767g(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    /* renamed from: h */
    public static <T> T m21768h(Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? it.next() : t;
    }

    @NullableDecl
    /* renamed from: i */
    static <T> T m21769i(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public static boolean m21770j(Iterator<?> it, Collection<?> collection) {
        C6073k.m26688k(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public static <T> C10388e1<T> m21771k(@NullableDecl T t) {
        return new C4709a(t);
    }

    /* renamed from: l */
    public static String m21772l(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }
}
