package p302d9;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p333v8.C12916a;
import p333v8.C12928m;

/* renamed from: d9.d */
/* compiled from: BasicClientCookie */
public class C12656d implements C12928m, C12916a, Cloneable, Serializable {

    /* renamed from: b */
    private final String f55295b;

    /* renamed from: c */
    private Map<String, String> f55296c;

    /* renamed from: d */
    private String f55297d;

    /* renamed from: e */
    private String f55298e;

    /* renamed from: f */
    private String f55299f;

    /* renamed from: g */
    private Date f55300g;

    /* renamed from: h */
    private String f55301h;

    /* renamed from: i */
    private boolean f55302i;

    /* renamed from: j */
    private int f55303j;

    public C12656d(String str, String str2) {
        if (str != null) {
            this.f55295b = str;
            this.f55296c = new HashMap();
            this.f55297d = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    /* renamed from: C */
    public void mo47659C(String str, String str2) {
        this.f55296c.put(str, str2);
    }

    /* renamed from: a */
    public boolean mo47660a() {
        return this.f55302i;
    }

    /* renamed from: b */
    public String mo47661b(String str) {
        return this.f55296c.get(str);
    }

    /* renamed from: c */
    public int mo47662c() {
        return this.f55303j;
    }

    public Object clone() throws CloneNotSupportedException {
        C12656d dVar = (C12656d) super.clone();
        dVar.f55296c = new HashMap(this.f55296c);
        return dVar;
    }

    /* renamed from: d */
    public void mo47663d(int i) {
        this.f55303j = i;
    }

    /* renamed from: g */
    public void mo47664g(boolean z) {
        this.f55302i = z;
    }

    public String getName() {
        return this.f55295b;
    }

    public String getValue() {
        return this.f55297d;
    }

    /* renamed from: h */
    public void mo47667h(String str) {
        this.f55301h = str;
    }

    /* renamed from: i */
    public boolean mo47668i(String str) {
        return this.f55296c.get(str) != null;
    }

    /* renamed from: l */
    public int[] mo47656l() {
        return null;
    }

    /* renamed from: m */
    public void mo47669m(Date date) {
        this.f55300g = date;
    }

    /* renamed from: n */
    public void mo47670n(String str) {
        this.f55298e = str;
    }

    /* renamed from: p */
    public void mo47671p(String str) {
        if (str != null) {
            this.f55299f = str.toLowerCase(Locale.ENGLISH);
        } else {
            this.f55299f = null;
        }
    }

    /* renamed from: s */
    public boolean mo47658s(Date date) {
        if (date != null) {
            Date date2 = this.f55300g;
            return date2 != null && date2.getTime() <= date.getTime();
        }
        throw new IllegalArgumentException("Date may not be null");
    }

    public String toString() {
        return "[version: " + Integer.toString(this.f55303j) + "]" + "[name: " + this.f55295b + "]" + "[value: " + this.f55297d + "]" + "[domain: " + this.f55299f + "]" + "[path: " + this.f55301h + "]" + "[expiry: " + this.f55300g + "]";
    }

    /* renamed from: w */
    public String mo47673w() {
        return this.f55299f;
    }

    /* renamed from: y */
    public String mo47674y() {
        return this.f55301h;
    }
}
