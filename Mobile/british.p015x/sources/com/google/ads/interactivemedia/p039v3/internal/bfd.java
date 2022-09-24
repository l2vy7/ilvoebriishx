package com.google.ads.interactivemedia.p039v3.internal;

import java.math.BigInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfd */
/* compiled from: IMASDK */
public final class bfd extends bey {

    /* renamed from: a */
    private final Object f16233a;

    public bfd(Boolean bool) {
        this.f16233a = bool;
    }

    public bfd(Number number) {
        this.f16233a = number;
    }

    public bfd(String str) {
        art.m14632c(str);
        this.f16233a = str;
    }

    /* renamed from: g */
    private static boolean m15801g(bfd bfd) {
        Object obj = bfd.f16233a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo14993a() {
        return this.f16233a instanceof Boolean;
    }

    /* renamed from: b */
    public final boolean mo14994b() {
        if (mo14993a()) {
            return ((Boolean) this.f16233a).booleanValue();
        }
        return Boolean.parseBoolean(mo14999f());
    }

    /* renamed from: c */
    public final boolean mo14995c() {
        return this.f16233a instanceof Number;
    }

    /* renamed from: d */
    public final Number mo14996d() {
        Object obj = this.f16233a;
        return obj instanceof String ? new bga((String) obj) : (Number) obj;
    }

    /* renamed from: e */
    public final boolean mo14997e() {
        return this.f16233a instanceof String;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bfd.class != obj.getClass()) {
            return false;
        }
        bfd bfd = (bfd) obj;
        if (m15801g(this) && m15801g(bfd)) {
            return mo14996d().longValue() == bfd.mo14996d().longValue();
        }
        Object obj2 = this.f16233a;
        if (!(obj2 instanceof Number) || !(bfd.f16233a instanceof Number)) {
            return obj2.equals(bfd.f16233a);
        }
        double doubleValue = mo14996d().doubleValue();
        double doubleValue2 = bfd.mo14996d().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    /* renamed from: f */
    public final String mo14999f() {
        if (mo14995c()) {
            return mo14996d().toString();
        }
        if (mo14993a()) {
            return ((Boolean) this.f16233a).toString();
        }
        return (String) this.f16233a;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (m15801g(this)) {
            doubleToLongBits = mo14996d().longValue();
        } else {
            Object obj = this.f16233a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo14996d().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }
}
