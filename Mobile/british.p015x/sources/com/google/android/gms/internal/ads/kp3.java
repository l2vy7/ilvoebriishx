package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.hp3;
import com.google.android.gms.internal.ads.kp3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class kp3<MessageType extends kp3<MessageType, BuilderType>, BuilderType extends hp3<MessageType, BuilderType>> extends ln3<MessageType, BuilderType> {
    private static final Map<Object, kp3<?, ?>> zzb = new ConcurrentHashMap();
    protected hs3 zzc = hs3.m32931c();
    protected int zzd = -1;

    /* renamed from: A */
    protected static <T extends kp3<T, ?>> T m34055A(T t, byte[] bArr) throws wp3 {
        T l = m34059l(t, bArr, 0, bArr.length, wo3.m39219a());
        m34058k(l);
        return l;
    }

    /* renamed from: B */
    protected static <T extends kp3<T, ?>> T m34056B(T t, eo3 eo3, wo3 wo3) throws wp3 {
        T t2;
        try {
            mo3 z = eo3.mo30462z();
            t2 = (kp3) t.mo30379D(4, (Object) null, (Object) null);
            or3<?> b = dr3.m31600a().mo31400b(t2.getClass());
            b.mo33999e(t2, no3.m35230D(z), wo3);
            b.mo33996a(t2);
            z.mo32174A(0);
            m34058k(t2);
            return t2;
        } catch (wp3 e) {
            e = e;
            if (e.mo35655l()) {
                e = new wp3((IOException) e);
            }
            e.mo35653h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof wp3) {
                throw ((wp3) e2.getCause());
            }
            wp3 wp3 = new wp3(e2);
            wp3.mo35653h(t2);
            throw wp3;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof wp3) {
                throw ((wp3) e3.getCause());
            }
            throw e3;
        } catch (wp3 e4) {
            e4.mo35653h(t2);
            throw e4;
        } catch (wp3 e5) {
            throw e5;
        }
    }

    /* renamed from: C */
    protected static <T extends kp3<T, ?>> T m34057C(T t, byte[] bArr, wo3 wo3) throws wp3 {
        T l = m34059l(t, bArr, 0, bArr.length, wo3);
        m34058k(l);
        return l;
    }

    /* renamed from: k */
    private static <T extends kp3<T, ?>> T m34058k(T t) throws wp3 {
        if (t == null || t.mo33146u()) {
            return t;
        }
        wp3 wp3 = new wp3(new fs3(t).getMessage());
        wp3.mo35653h(t);
        throw wp3;
    }

    /* renamed from: l */
    static <T extends kp3<T, ?>> T m34059l(T t, byte[] bArr, int i, int i2, wo3 wo3) throws wp3 {
        T t2 = (kp3) t.mo30379D(4, (Object) null, (Object) null);
        try {
            or3<?> b = dr3.m31600a().mo31400b(t2.getClass());
            b.mo34001g(t2, bArr, 0, i2, new on3(wo3));
            b.mo33996a(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (wp3 e) {
            e = e;
            if (e.mo35655l()) {
                e = new wp3((IOException) e);
            }
            e.mo35653h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof wp3) {
                throw ((wp3) e2.getCause());
            }
            wp3 wp3 = new wp3(e2);
            wp3.mo35653h(t2);
            throw wp3;
        } catch (IndexOutOfBoundsException unused) {
            wp3 j = wp3.m39230j();
            j.mo35653h(t2);
            throw j;
        }
    }

    /* renamed from: m */
    protected static pp3 m34060m() {
        return lp3.m34523g();
    }

    /* renamed from: n */
    protected static pp3 m34061n(pp3 pp3) {
        int size = pp3.size();
        return pp3.mo33381k(size == 0 ? 10 : size + size);
    }

    /* renamed from: o */
    protected static sp3 m34062o() {
        return jq3.m33683g();
    }

    /* renamed from: p */
    protected static <E> tp3<E> m34063p() {
        return er3.m31921e();
    }

    /* renamed from: q */
    protected static <E> tp3<E> m34064q(tp3<E> tp3) {
        int size = tp3.size();
        return tp3.mo30784s(size == 0 ? 10 : size + size);
    }

    /* renamed from: r */
    static Object m34065r(Method method, Object obj, Object... objArr) {
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

    /* renamed from: s */
    protected static Object m34066s(uq3 uq3, String str, Object[] objArr) {
        return new fr3(uq3, str, objArr);
    }

    /* renamed from: t */
    protected static <T extends kp3> void m34067t(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: y */
    static <T extends kp3> T m34068y(Class<T> cls) {
        Map<Object, kp3<?, ?>> map = zzb;
        T t = (kp3) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (kp3) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (kp3) ((kp3) qs3.m36723o(cls)).mo30379D(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: z */
    protected static <T extends kp3<T, ?>> T m34069z(T t, eo3 eo3) throws wp3 {
        T t2;
        wo3 a = wo3.m39219a();
        try {
            mo3 z = eo3.mo30462z();
            t2 = (kp3) t.mo30379D(4, (Object) null, (Object) null);
            or3<?> b = dr3.m31600a().mo31400b(t2.getClass());
            b.mo33999e(t2, no3.m35230D(z), a);
            b.mo33996a(t2);
            z.mo32174A(0);
            m34058k(t2);
            m34058k(t2);
            return t2;
        } catch (wp3 e) {
            e = e;
            if (e.mo35655l()) {
                e = new wp3((IOException) e);
            }
            e.mo35653h(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof wp3) {
                throw ((wp3) e2.getCause());
            }
            wp3 wp3 = new wp3(e2);
            wp3.mo35653h(t2);
            throw wp3;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof wp3) {
                throw ((wp3) e3.getCause());
            }
            throw e3;
        } catch (wp3 e4) {
            e4.mo35653h(t2);
            throw e4;
        } catch (wp3 e5) {
            throw e5;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract Object mo30379D(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final int mo33137a() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = dr3.m31600a().mo31400b(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    /* renamed from: b */
    public final void mo33138b(ro3 ro3) throws IOException {
        dr3.m31600a().mo31400b(getClass()).mo34000f(this, so3.m37467l(ro3));
    }

    /* renamed from: d */
    public final /* synthetic */ uq3 mo32419d() {
        return (kp3) mo30379D(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo33139e() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return dr3.m31600a().mo31400b(getClass()).mo34002h(this, (kp3) obj);
        }
        return false;
    }

    /* renamed from: h */
    public final /* synthetic */ tq3 mo33141h() {
        return (hp3) mo30379D(5, (Object) null, (Object) null);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = dr3.m31600a().mo31400b(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    /* renamed from: i */
    public final /* synthetic */ tq3 mo33143i() {
        hp3 hp3 = (hp3) mo30379D(5, (Object) null, (Object) null);
        hp3.mo32422n(this);
        return hp3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo33144j(int i) {
        this.zzd = i;
    }

    public final String toString() {
        return wq3.m39236a(this, super.toString());
    }

    /* renamed from: u */
    public final boolean mo33146u() {
        byte byteValue = ((Byte) mo30379D(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = dr3.m31600a().mo31400b(getClass()).mo33997c(this);
        mo30379D(2, true != c ? null : this, (Object) null);
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final <MessageType extends kp3<MessageType, BuilderType>, BuilderType extends hp3<MessageType, BuilderType>> BuilderType mo33147w() {
        return (hp3) mo30379D(5, (Object) null, (Object) null);
    }

    /* renamed from: x */
    public final BuilderType mo33148x() {
        BuilderType buildertype = (hp3) mo30379D(5, (Object) null, (Object) null);
        buildertype.mo32422n(this);
        return buildertype;
    }
}
