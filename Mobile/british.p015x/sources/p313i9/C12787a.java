package p313i9;

/* renamed from: i9.a */
/* compiled from: AbstractHttpParams */
public abstract class C12787a implements C12790d {
    protected C12787a() {
    }

    /* renamed from: a */
    public C12790d mo47927a(String str, int i) {
        mo43552c(str, new Integer(i));
        return this;
    }

    /* renamed from: b */
    public int mo47928b(String str, int i) {
        Object i2 = mo43553i(str);
        if (i2 == null) {
            return i;
        }
        return ((Integer) i2).intValue();
    }

    /* renamed from: d */
    public boolean mo47929d(String str) {
        return !mo47931h(str, false);
    }

    /* renamed from: g */
    public C12790d mo47930g(String str, boolean z) {
        mo43552c(str, z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    /* renamed from: h */
    public boolean mo47931h(String str, boolean z) {
        Object i = mo43553i(str);
        if (i == null) {
            return z;
        }
        return ((Boolean) i).booleanValue();
    }

    /* renamed from: k */
    public boolean mo47932k(String str) {
        return mo47931h(str, false);
    }
}
