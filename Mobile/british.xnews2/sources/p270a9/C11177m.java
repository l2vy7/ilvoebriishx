package p270a9;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p307g8.C12718d;
import p309h8.C12759j;
import p310h9.C12767f;
import p310h9.C12782u;
import p316k9.C12821b;

/* renamed from: a9.m */
/* compiled from: RFC2617Scheme */
public abstract class C11177m extends C11157a {

    /* renamed from: b */
    private Map<String, String> f50233b;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo43463c(C12821b bVar, int i, int i2) throws C12759j {
        C12718d[] a = C12767f.f55439a.mo47858a(bVar, new C12782u(i, bVar.mo47978p()));
        if (a.length != 0) {
            this.f50233b = new HashMap(a.length);
            for (C12718d dVar : a) {
                this.f50233b.put(dVar.getName(), dVar.getValue());
            }
            return;
        }
        throw new C12759j("Authentication challenge is empty");
    }

    /* renamed from: g */
    public String mo43497g() {
        return mo43499j("realm");
    }

    /* renamed from: j */
    public String mo43499j(String str) {
        if (str != null) {
            Map<String, String> map = this.f50233b;
            if (map == null) {
                return null;
            }
            return map.get(str.toLowerCase(Locale.ENGLISH));
        }
        throw new IllegalArgumentException("Parameter name may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Map<String, String> mo43500k() {
        if (this.f50233b == null) {
            this.f50233b = new HashMap();
        }
        return this.f50233b;
    }
}
