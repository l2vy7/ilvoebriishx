package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.internal.bkj;
import com.google.ads.interactivemedia.p038v3.internal.bkl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bkl */
/* compiled from: IMASDK */
public abstract class bkl<MessageType extends bkl<MessageType, BuilderType>, BuilderType extends bkj<MessageType, BuilderType>> extends bjc<MessageType, BuilderType> {

    /* renamed from: a */
    private static final Map<Object, bkl<?, ?>> f16593a = new ConcurrentHashMap();

    /* renamed from: c */
    protected bmn f16594c = bmn.m16671a();

    /* renamed from: d */
    protected int f16595d = -1;

    /* renamed from: am */
    static <T extends bkl> T m16306am(Class<T> cls) {
        Map<Object, bkl<?, ?>> map = f16593a;
        T t = (bkl) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (bkl) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (bkl) ((bkl) bmv.m16729c(cls)).mo15393av(6);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: an */
    protected static <T extends bkl> void m16307an(Class<T> cls, T t) {
        f16593a.put(cls, t);
    }

    /* renamed from: ao */
    protected static Object m16308ao(bln bln, String str, Object[] objArr) {
        return new blw(bln, str, objArr);
    }

    /* renamed from: ap */
    static Object m16309ap(Method method, Object obj, Object... objArr) {
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

    /* renamed from: aq */
    protected static bkp m16310aq() {
        return bkm.m16328d();
    }

    /* renamed from: ar */
    protected static <E> bkq<E> m16311ar() {
        return blv.m16506d();
    }

    /* renamed from: as */
    protected static <E> bkq<E> m16312as(bkq<E> bkq) {
        int size = bkq.size();
        return bkq.mo15190e(size == 0 ? 10 : size + size);
    }

    /* renamed from: at */
    protected static <T extends bkl<T, ?>> T m16313at(T t, bjq bjq, bka bka) throws bkt {
        try {
            bjs h = bjq.mo15209h();
            T t2 = (bkl) t.mo15393av(4);
            bly c = blu.m16503a().mo15459c(t2);
            c.mo15453g(t2, bju.m16129a(h), bka);
            c.mo15456k(t2);
            h.mo15229e(0);
            m16316d(t2);
            return t2;
        } catch (bkt e) {
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bkt) {
                throw ((bkt) e2.getCause());
            }
            throw new bkt(e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof bkt) {
                throw ((bkt) e3.getCause());
            }
            throw e3;
        } catch (bkt e4) {
            throw e4;
        } catch (bkt e5) {
            throw e5;
        }
    }

    /* renamed from: au */
    protected static <T extends bkl<T, ?>> T m16314au(T t, byte[] bArr, bka bka) throws bkt {
        T aw = m16315aw(t, bArr, bArr.length, bka);
        m16316d(aw);
        return aw;
    }

    /* renamed from: aw */
    static <T extends bkl<T, ?>> T m16315aw(T t, byte[] bArr, int i, bka bka) throws bkt {
        T t2 = (bkl) t.mo15393av(4);
        try {
            bly c = blu.m16503a().mo15459c(t2);
            c.mo15455j(t2, bArr, 0, i, new bjg(bka));
            c.mo15456k(t2);
            if (t2.f16465b == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (bkt e) {
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bkt) {
                throw ((bkt) e2.getCause());
            }
            throw new bkt(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw bkt.m16348a();
        }
    }

    /* renamed from: d */
    private static <T extends bkl<T, ?>> void m16316d(T t) throws bkt {
        if (t != null && !t.mo15391ak()) {
            throw new bkt(new bml().getMessage());
        }
    }

    /* renamed from: aT */
    public final /* bridge */ /* synthetic */ blm mo15169aT() {
        bkj bkj = (bkj) mo15393av(5);
        bkj.mo15388ah(this);
        return bkj;
    }

    /* renamed from: aU */
    public final /* bridge */ /* synthetic */ blm mo15170aU() {
        return (bkj) mo15393av(5);
    }

    /* renamed from: aW */
    public final void mo15171aW(bjw bjw) throws IOException {
        blu.m16503a().mo15459c(this).mo15452f(this, bjx.m16233a(bjw));
    }

    /* renamed from: ag */
    public final /* bridge */ /* synthetic */ bln mo15387ag() {
        return (bkl) mo15393av(6);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ah */
    public final int mo15167ah() {
        return this.f16595d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public final void mo15168ai(int i) {
        this.f16595d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aj */
    public final <MessageType extends bkl<MessageType, BuilderType>, BuilderType extends bkj<MessageType, BuilderType>> BuilderType mo15390aj() {
        return (bkj) mo15393av(5);
    }

    /* renamed from: ak */
    public final boolean mo15391ak() {
        byte byteValue = ((Byte) mo15393av(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean l = blu.m16503a().mo15459c(this).mo15457l(this);
        mo13480b(2);
        return l;
    }

    /* renamed from: al */
    public final int mo15392al() {
        int i = this.f16595d;
        if (i != -1) {
            return i;
        }
        int e = blu.m16503a().mo15459c(this).mo15451e(this);
        this.f16595d = e;
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: av */
    public final Object mo15393av(int i) {
        return mo13480b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo13480b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return blu.m16503a().mo15459c(this).mo15448b(this, (bkl) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f16465b;
        if (i != 0) {
            return i;
        }
        int c = blu.m16503a().mo15459c(this).mo15449c(this);
        this.f16465b = c;
        return c;
    }

    public final String toString() {
        return blr.m16497b(this, super.toString());
    }
}
