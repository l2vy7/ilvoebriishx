package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C9284o8;
import com.google.android.gms.internal.measurement.C9330r8;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.r8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public abstract class C9330r8<MessageType extends C9330r8<MessageType, BuilderType>, BuilderType extends C9284o8<MessageType, BuilderType>> extends C9083b7<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected C9425xa zzc = C9425xa.m43841c();
    protected int zzd = -1;

    /* renamed from: m */
    static Object m43556m(Method method, Object obj, Object... objArr) {
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

    /* renamed from: n */
    protected static Object m43557n(C9409w9 w9Var, String str, Object[] objArr) {
        return new C9164ga(w9Var, str, objArr);
    }

    /* renamed from: o */
    protected static void m43558o(Class cls, C9330r8 r8Var) {
        zza.put(cls, r8Var);
    }

    /* renamed from: r */
    static C9330r8 m43559r(Class cls) {
        Map map = zza;
        C9330r8 r8Var = (C9330r8) map.get(cls);
        if (r8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                r8Var = (C9330r8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (r8Var == null) {
            r8Var = (C9330r8) ((C9330r8) C9165gb.m42954j(cls)).mo37393y(6, (Object) null, (Object) null);
            if (r8Var != null) {
                map.put(cls, r8Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return r8Var;
    }

    /* renamed from: s */
    protected static C9408w8 m43560s() {
        return C9346s8.m43620g();
    }

    /* renamed from: t */
    protected static C9423x8 m43561t() {
        return C9223k9.m43150e();
    }

    /* renamed from: u */
    protected static C9423x8 m43562u(C9423x8 x8Var) {
        int size = x8Var.size();
        return x8Var.mo37688l(size == 0 ? 10 : size + size);
    }

    /* renamed from: v */
    protected static C9438y8 m43563v() {
        return C9149fa.m42884e();
    }

    /* renamed from: w */
    protected static C9438y8 m43564w(C9438y8 y8Var) {
        int size = y8Var.size();
        return y8Var.mo37416s(size == 0 ? 10 : size + size);
    }

    /* renamed from: a */
    public final /* synthetic */ C9394v9 mo37990a() {
        return (C9284o8) mo37393y(5, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final void mo37991b(C9452z7 z7Var) throws IOException {
        C9134ea.m42831a().mo37546b(getClass()).mo37359f(this, C9069a8.m42588l(z7Var));
    }

    /* renamed from: c */
    public final int mo37992c() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza2 = C9134ea.m42831a().mo37546b(getClass()).zza(this);
        this.zzd = zza2;
        return zza2;
    }

    /* renamed from: d */
    public final /* synthetic */ C9394v9 mo37993d() {
        C9284o8 o8Var = (C9284o8) mo37393y(5, (Object) null, (Object) null);
        o8Var.mo37838p(this);
        return o8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C9134ea.m42831a().mo37546b(getClass()).mo37358e(this, (C9330r8) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo37401f() {
        return this.zzd;
    }

    /* renamed from: g */
    public final /* synthetic */ C9409w9 mo37835g() {
        return (C9330r8) mo37393y(6, (Object) null, (Object) null);
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int zzb = C9134ea.m42831a().mo37546b(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo37403k(int i) {
        this.zzd = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C9284o8 mo37996p() {
        return (C9284o8) mo37393y(5, (Object) null, (Object) null);
    }

    /* renamed from: q */
    public final C9284o8 mo37997q() {
        C9284o8 o8Var = (C9284o8) mo37393y(5, (Object) null, (Object) null);
        o8Var.mo37838p(this);
        return o8Var;
    }

    public final String toString() {
        return C9439y9.m43877a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Object mo37393y(int i, Object obj, Object obj2);
}
