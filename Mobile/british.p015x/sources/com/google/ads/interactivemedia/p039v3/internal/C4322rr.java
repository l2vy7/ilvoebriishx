package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rr */
/* compiled from: IMASDK */
public final class C4322rr {

    /* renamed from: a */
    public final C4325ru f18534a;

    /* renamed from: b */
    public final C4325ru f18535b;

    public C4322rr(C4325ru ruVar, C4325ru ruVar2) {
        this.f18534a = ruVar;
        this.f18535b = ruVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4322rr.class == obj.getClass()) {
            C4322rr rrVar = (C4322rr) obj;
            return this.f18534a.equals(rrVar.f18534a) && this.f18535b.equals(rrVar.f18535b);
        }
    }

    public final int hashCode() {
        return (this.f18534a.hashCode() * 31) + this.f18535b.hashCode();
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f18534a);
        if (this.f18534a.equals(this.f18535b)) {
            str = "";
        } else {
            String valueOf2 = String.valueOf(this.f18535b);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 2);
            sb.append(", ");
            sb.append(valueOf2);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + String.valueOf(str).length());
        sb2.append("[");
        sb2.append(valueOf);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
