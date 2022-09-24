package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.C8673oc;
import com.google.android.gms.internal.cast.C8705qc;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.cast.qc */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C8705qc<MessageType extends C8705qc<MessageType, BuilderType>, BuilderType extends C8673oc<MessageType, BuilderType>> extends C8608kb<MessageType, BuilderType> {
    private static final Map<Object, C8705qc<?, ?>> zzb = new ConcurrentHashMap();
    protected C8799we zzc = C8799we.m41395a();
    protected int zzd = -1;

    /* renamed from: f */
    static <T extends C8705qc> T m41245f(Class<T> cls) {
        Map<Object, C8705qc<?, ?>> map = zzb;
        T t = (C8705qc) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C8705qc) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C8705qc) ((C8705qc) C8545gf.m40954h(cls)).mo36369d(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: g */
    protected static <T extends C8705qc> void m41246g(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: h */
    protected static Object m41247h(C8782vd vdVar, String str, Object[] objArr) {
        return new C8544ge(vdVar, str, objArr);
    }

    /* renamed from: i */
    static Object m41248i(Method method, Object obj, Object... objArr) {
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

    /* renamed from: j */
    protected static C8781vc m41249j() {
        return C8720rc.m41273e();
    }

    /* renamed from: k */
    protected static C8813xc m41250k() {
        return C8610kd.m41098e();
    }

    /* renamed from: l */
    protected static <E> C8843zc<E> m41251l() {
        return C8528fe.m40899e();
    }

    /* renamed from: a */
    public final void mo36672a(C8509ec ecVar) throws IOException {
        C8511ee.m40831a().mo36471b(getClass()).mo36374e(this, C8526fc.m40863j(ecVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo36567b() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo36568c(int i) {
        this.zzd = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo36369d(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final <MessageType extends C8705qc<MessageType, BuilderType>, BuilderType extends C8673oc<MessageType, BuilderType>> BuilderType mo36673e() {
        return (C8673oc) mo36369d(5, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C8511ee.m40831a().mo36471b(getClass()).mo36375f(this, (C8705qc) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = C8511ee.m40831a().mo36471b(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return C8829yd.m41443a(this, super.toString());
    }

    public final /* bridge */ /* synthetic */ C8767ud zzA() {
        C8673oc ocVar = (C8673oc) mo36369d(5, (Object) null, (Object) null);
        ocVar.mo36635k(this);
        return ocVar;
    }

    public final int zzr() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int c = C8511ee.m40831a().mo36471b(getClass()).mo36372c(this);
        this.zzd = c;
        return c;
    }

    public final /* bridge */ /* synthetic */ C8782vd zzs() {
        return (C8705qc) mo36369d(6, (Object) null, (Object) null);
    }
}
