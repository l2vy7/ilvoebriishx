package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.u6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C4662u6 extends C9344s6 {

    /* renamed from: b */
    private final Object f21259b;

    C4662u6(Object obj) {
        this.f21259b = obj;
    }

    /* renamed from: a */
    public final Object mo19213a() {
        return this.f21259b;
    }

    /* renamed from: b */
    public final boolean mo19214b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof C4662u6) {
            return this.f21259b.equals(((C4662u6) obj).f21259b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21259b.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f21259b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
