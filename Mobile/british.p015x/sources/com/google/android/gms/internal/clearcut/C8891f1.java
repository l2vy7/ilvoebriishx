package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8891f1;
import com.google.android.gms.internal.clearcut.C8891f1.C8892a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.f1 */
public abstract class C8891f1<MessageType extends C8891f1<MessageType, BuilderType>, BuilderType extends C8892a<MessageType, BuilderType>> extends C8979q<MessageType, BuilderType> {
    private static Map<Object, C8891f1<?, ?>> zzjr = new ConcurrentHashMap();
    protected C9018v3 zzjp = C9018v3.m42416h();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.f1$a */
    public static abstract class C8892a<MessageType extends C8891f1<MessageType, BuilderType>, BuilderType extends C8892a<MessageType, BuilderType>> extends C8986r<MessageType, BuilderType> {

        /* renamed from: b */
        private final MessageType f44512b;

        /* renamed from: c */
        protected MessageType f44513c;

        /* renamed from: d */
        protected boolean f44514d = false;

        protected C8892a(MessageType messagetype) {
            this.f44512b = messagetype;
            this.f44513c = (C8891f1) messagetype.mo36855j(C8896e.f44521d, (Object) null, (Object) null);
        }

        /* renamed from: k */
        private static void m41765k(MessageType messagetype, MessageType messagetype2) {
            C9031x2.m42488a().mo37227d(messagetype).mo36860b(messagetype, messagetype2);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C8892a aVar = (C8892a) this.f44512b.mo36855j(C8896e.f44522e, (Object) null, (Object) null);
            aVar.mo36904h((C8891f1) mo36909q());
            return aVar;
        }

        /* renamed from: f */
        public final /* synthetic */ C8942l2 mo36903f() {
            C8891f1 f1Var = (C8891f1) mo36909q();
            byte byteValue = ((Byte) f1Var.mo36855j(C8896e.f44518a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C9031x2.m42488a().mo37227d(f1Var).mo36862e(f1Var);
                    f1Var.mo36855j(C8896e.f44519b, z ? f1Var : null, (Object) null);
                }
            }
            if (z) {
                return f1Var;
            }
            throw new C9004t3(f1Var);
        }

        /* renamed from: g */
        public final /* synthetic */ C8942l2 mo36897g() {
            return this.f44512b;
        }

        /* renamed from: i */
        public final BuilderType mo36904h(MessageType messagetype) {
            mo36906l();
            m41765k(this.f44513c, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo36906l() {
            if (this.f44514d) {
                MessageType messagetype = (C8891f1) this.f44513c.mo36855j(C8896e.f44521d, (Object) null, (Object) null);
                m41765k(messagetype, this.f44513c);
                this.f44513c = messagetype;
                this.f44514d = false;
            }
        }

        /* renamed from: m */
        public MessageType mo36909q() {
            if (this.f44514d) {
                return this.f44513c;
            }
            MessageType messagetype = this.f44513c;
            C9031x2.m42488a().mo37227d(messagetype).mo36866i(messagetype);
            this.f44514d = true;
            return this.f44513c;
        }

        /* renamed from: n */
        public final MessageType mo36908n() {
            MessageType messagetype = (C8891f1) mo36909q();
            byte byteValue = ((Byte) messagetype.mo36855j(C8896e.f44518a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C9031x2.m42488a().mo37227d(messagetype).mo36862e(messagetype);
                    messagetype.mo36855j(C8896e.f44519b, z ? messagetype : null, (Object) null);
                }
            }
            if (z) {
                return messagetype;
            }
            throw new C9004t3(messagetype);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$b */
    public static class C8893b<T extends C8891f1<T, ?>> extends C8993s<T> {

        /* renamed from: b */
        private T f44515b;

        public C8893b(T t) {
            this.f44515b = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$c */
    public static abstract class C8894c<MessageType extends C8894c<MessageType, BuilderType>, BuilderType> extends C8891f1<MessageType, BuilderType> implements C8961n2 {
        protected C9022w0<C8895d> zzjv = C9022w0.m42434k();
    }

    /* renamed from: com.google.android.gms.internal.clearcut.f1$d */
    static final class C8895d implements C9043z0<C8895d> {

        /* renamed from: b */
        final int f44516b;

        /* renamed from: c */
        final C8930j4 f44517c;

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f44516b - ((C8895d) obj).f44516b;
        }

        /* renamed from: f */
        public final C8970o4 mo36911f() {
            return this.f44517c.mo36982d();
        }

        /* renamed from: g */
        public final boolean mo36912g() {
            return false;
        }

        /* renamed from: l0 */
        public final C8989r2 mo36913l0(C8989r2 r2Var, C8989r2 r2Var2) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: r */
        public final C8930j4 mo36914r() {
            return this.f44517c;
        }

        /* renamed from: t */
        public final C8954m2 mo36915t(C8954m2 m2Var, C8942l2 l2Var) {
            return ((C8892a) m2Var).mo36904h((C8891f1) l2Var);
        }

        /* renamed from: v */
        public final boolean mo36916v() {
            return false;
        }

        public final int zzc() {
            return this.f44516b;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.clearcut.f1$e */
    public static final class C8896e {

        /* renamed from: a */
        public static final int f44518a = 1;

        /* renamed from: b */
        public static final int f44519b = 2;

        /* renamed from: c */
        public static final int f44520c = 3;

        /* renamed from: d */
        public static final int f44521d = 4;

        /* renamed from: e */
        public static final int f44522e = 5;

        /* renamed from: f */
        public static final int f44523f = 6;

        /* renamed from: g */
        public static final int f44524g = 7;

        /* renamed from: h */
        private static final /* synthetic */ int[] f44525h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i */
        public static final int f44526i = 1;

        /* renamed from: j */
        public static final int f44527j = 2;

        /* renamed from: k */
        private static final /* synthetic */ int[] f44528k = {1, 2};

        /* renamed from: l */
        public static final int f44529l = 1;

        /* renamed from: m */
        public static final int f44530m = 2;

        /* renamed from: n */
        private static final /* synthetic */ int[] f44531n = {1, 2};

        /* renamed from: a */
        public static int[] m41780a() {
            return (int[]) f44525h.clone();
        }
    }

    /* renamed from: i */
    private static <T extends C8891f1<T, ?>> T m41750i(T t, byte[] bArr) throws C8941l1 {
        T t2 = (C8891f1) t.mo36855j(C8896e.f44521d, (Object) null, (Object) null);
        try {
            C9031x2.m42488a().mo37227d(t2).mo36867j(t2, bArr, 0, bArr.length, new C9021w());
            C9031x2.m42488a().mo37227d(t2).mo36866i(t2);
            if (t2.zzex == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C8941l1) {
                throw ((C8941l1) e.getCause());
            }
            throw new C8941l1(e.getMessage()).mo36995f(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw C8941l1.m41909a().mo36995f(t2);
        }
    }

    /* renamed from: k */
    protected static Object m41751k(C8942l2 l2Var, String str, Object[] objArr) {
        return new C9045z2(l2Var, str, objArr);
    }

    /* renamed from: l */
    static Object m41752l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: m */
    protected static <T extends C8891f1<?, ?>> void m41753m(Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    /* renamed from: n */
    protected static <T extends C8891f1<T, ?>> T m41754n(T t, byte[] bArr) throws C8941l1 {
        T i = m41750i(t, bArr);
        if (i != null) {
            byte byteValue = ((Byte) i.mo36855j(C8896e.f44518a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C9031x2.m42488a().mo37227d(i).mo36862e(i);
                    i.mo36855j(C8896e.f44519b, z ? i : null, (Object) null);
                }
            }
            if (!z) {
                throw new C8941l1(new C9004t3(i).getMessage()).mo36995f(i);
            }
        }
        return i;
    }

    /* renamed from: o */
    protected static <E> C8934k1<E> m41755o() {
        return C9038y2.m42505e();
    }

    /* renamed from: p */
    static <T extends C8891f1<?, ?>> T m41756p(Class<T> cls) {
        T t = (C8891f1) zzjr.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C8891f1) zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    /* renamed from: a */
    public final int mo36891a() {
        if (this.zzjq == -1) {
            this.zzjq = C9031x2.m42488a().mo37227d(this).mo36865h(this);
        }
        return this.zzjq;
    }

    /* renamed from: b */
    public final /* synthetic */ C8954m2 mo36892b() {
        C8892a aVar = (C8892a) mo36855j(C8896e.f44522e, (Object) null, (Object) null);
        aVar.mo36904h(this);
        return aVar;
    }

    /* renamed from: c */
    public final void mo36893c(C8947m0 m0Var) throws IOException {
        C9031x2.m42488a().mo37226b(getClass()).mo36864g(this, C8966o0.m42113e(m0Var));
    }

    /* renamed from: d */
    public final /* synthetic */ C8954m2 mo36894d() {
        return (C8892a) mo36855j(C8896e.f44522e, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo36895e(int i) {
        this.zzjq = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C8891f1) mo36855j(C8896e.f44523f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C9031x2.m42488a().mo37227d(this).mo36859a(this, (C8891f1) obj);
    }

    /* renamed from: g */
    public final /* synthetic */ C8942l2 mo36897g() {
        return (C8891f1) mo36855j(C8896e.f44523f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo36898h() {
        return this.zzjq;
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int f = C9031x2.m42488a().mo37227d(this).mo36863f(this);
        this.zzex = f;
        return f;
    }

    public final boolean isInitialized() {
        byte byteValue = ((Byte) mo36855j(C8896e.f44518a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = C9031x2.m42488a().mo37227d(this).mo36862e(this);
        mo36855j(C8896e.f44519b, e ? this : null, (Object) null);
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Object mo36855j(int i, Object obj, Object obj2);

    public String toString() {
        return C8968o2.m42155a(this, super.toString());
    }
}
