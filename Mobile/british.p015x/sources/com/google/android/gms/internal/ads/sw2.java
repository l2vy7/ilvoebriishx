package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sw2 {

    /* renamed from: a */
    public final String f39084a;

    /* renamed from: b */
    public final String f39085b;

    public sw2(String str, String str2) {
        this.f39084a = str;
        this.f39085b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw2)) {
            return false;
        }
        sw2 sw2 = (sw2) obj;
        return this.f39084a.equals(sw2.f39084a) && this.f39085b.equals(sw2.f39085b);
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.f39084a);
        String valueOf2 = String.valueOf(this.f39085b);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
