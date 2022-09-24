package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p117n1.C5791b;
import p149t.C6077a;

/* renamed from: androidx.versionedparcelable.a */
/* compiled from: VersionedParcel */
public abstract class C1366a {

    /* renamed from: a */
    protected final C6077a<String, Method> f6066a;

    /* renamed from: b */
    protected final C6077a<String, Method> f6067b;

    /* renamed from: c */
    protected final C6077a<String, Class> f6068c;

    public C1366a(C6077a<String, Method> aVar, C6077a<String, Method> aVar2, C6077a<String, Class> aVar3) {
        this.f6066a = aVar;
        this.f6067b = aVar2;
        this.f6068c = aVar3;
    }

    /* renamed from: N */
    private void m7239N(C5791b bVar) {
        try {
            mo6559I(m7240c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m7240c(Class<? extends C5791b> cls) throws ClassNotFoundException {
        Class cls2 = this.f6068c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f6068c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m7241d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<C1366a> cls = C1366a.class;
        Method method = this.f6066a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f6066a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m7242e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f6067b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m7240c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C1366a.class});
        this.f6067b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo6551A(byte[] bArr);

    /* renamed from: B */
    public void mo6552B(byte[] bArr, int i) {
        mo6583w(i);
        mo6551A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo6553C(CharSequence charSequence);

    /* renamed from: D */
    public void mo6554D(CharSequence charSequence, int i) {
        mo6583w(i);
        mo6553C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo6555E(int i);

    /* renamed from: F */
    public void mo6556F(int i, int i2) {
        mo6583w(i2);
        mo6555E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo6557G(Parcelable parcelable);

    /* renamed from: H */
    public void mo6558H(Parcelable parcelable, int i) {
        mo6583w(i);
        mo6557G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo6559I(String str);

    /* renamed from: J */
    public void mo6560J(String str, int i) {
        mo6583w(i);
        mo6559I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends C5791b> void mo6561K(T t, C1366a aVar) {
        try {
            m7242e(t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6562L(C5791b bVar) {
        if (bVar == null) {
            mo6559I((String) null);
            return;
        }
        m7239N(bVar);
        C1366a b = mo6565b();
        mo6561K(bVar, b);
        b.mo6564a();
    }

    /* renamed from: M */
    public void mo6563M(C5791b bVar, int i) {
        mo6583w(i);
        mo6562L(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6564a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1366a mo6565b();

    /* renamed from: f */
    public boolean mo6566f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo6567g();

    /* renamed from: h */
    public boolean mo6568h(boolean z, int i) {
        if (!mo6573m(i)) {
            return z;
        }
        return mo6567g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo6569i();

    /* renamed from: j */
    public byte[] mo6570j(byte[] bArr, int i) {
        if (!mo6573m(i)) {
            return bArr;
        }
        return mo6569i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo6571k();

    /* renamed from: l */
    public CharSequence mo6572l(CharSequence charSequence, int i) {
        if (!mo6573m(i)) {
            return charSequence;
        }
        return mo6571k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo6573m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends C5791b> T mo6574n(String str, C1366a aVar) {
        try {
            return (C5791b) m7241d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo6575o();

    /* renamed from: p */
    public int mo6576p(int i, int i2) {
        if (!mo6573m(i2)) {
            return i;
        }
        return mo6575o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo6577q();

    /* renamed from: r */
    public <T extends Parcelable> T mo6578r(T t, int i) {
        if (!mo6573m(i)) {
            return t;
        }
        return mo6577q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo6579s();

    /* renamed from: t */
    public String mo6580t(String str, int i) {
        if (!mo6573m(i)) {
            return str;
        }
        return mo6579s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends C5791b> T mo6581u() {
        String s = mo6579s();
        if (s == null) {
            return null;
        }
        return mo6574n(s, mo6565b());
    }

    /* renamed from: v */
    public <T extends C5791b> T mo6582v(T t, int i) {
        if (!mo6573m(i)) {
            return t;
        }
        return mo6581u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo6583w(int i);

    /* renamed from: x */
    public void mo6584x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo6585y(boolean z);

    /* renamed from: z */
    public void mo6586z(boolean z, int i) {
        mo6583w(i);
        mo6585y(z);
    }
}
