package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9076b {

    /* renamed from: a */
    private String f44893a;

    /* renamed from: b */
    private final long f44894b;

    /* renamed from: c */
    private final Map f44895c;

    public C9076b(String str, long j, Map map) {
        this.f44893a = str;
        this.f44894b = j;
        HashMap hashMap = new HashMap();
        this.f44895c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo37370a() {
        return this.f44894b;
    }

    /* renamed from: b */
    public final C9076b clone() {
        return new C9076b(this.f44893a, this.f44894b, new HashMap(this.f44895c));
    }

    /* renamed from: c */
    public final Object mo37372c(String str) {
        if (this.f44895c.containsKey(str)) {
            return this.f44895c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo37374d() {
        return this.f44893a;
    }

    /* renamed from: e */
    public final Map mo37375e() {
        return this.f44895c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9076b)) {
            return false;
        }
        C9076b bVar = (C9076b) obj;
        if (this.f44894b == bVar.f44894b && this.f44893a.equals(bVar.f44893a)) {
            return this.f44895c.equals(bVar.f44895c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo37377f(String str) {
        this.f44893a = str;
    }

    /* renamed from: g */
    public final void mo37378g(String str, Object obj) {
        if (obj == null) {
            this.f44895c.remove(str);
        } else {
            this.f44895c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f44893a.hashCode();
        long j = this.f44894b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f44895c.hashCode();
    }

    public final String toString() {
        String str = this.f44893a;
        long j = this.f44894b;
        String obj = this.f44895c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + obj.length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
