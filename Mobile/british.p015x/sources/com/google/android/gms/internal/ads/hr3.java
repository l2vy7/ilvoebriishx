package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hr3 extends vn3 {

    /* renamed from: b */
    final lr3 f32817b;

    /* renamed from: c */
    xn3 f32818c = m32929a();

    /* renamed from: d */
    final /* synthetic */ nr3 f32819d;

    hr3(nr3 nr3) {
        this.f32819d = nr3;
        this.f32817b = new lr3(nr3, (kr3) null);
    }

    /* renamed from: a */
    private final xn3 m32929a() {
        if (this.f32817b.hasNext()) {
            return this.f32817b.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f32818c != null;
    }

    public final byte zza() {
        xn3 xn3 = this.f32818c;
        if (xn3 != null) {
            byte zza = xn3.zza();
            if (!this.f32818c.hasNext()) {
                this.f32818c = m32929a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
