package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sn3 extends vn3 {

    /* renamed from: b */
    private int f39012b = 0;

    /* renamed from: c */
    private final int f39013c;

    /* renamed from: d */
    final /* synthetic */ eo3 f39014d;

    sn3(eo3 eo3) {
        this.f39014d = eo3;
        this.f39013c = eo3.mo30457q();
    }

    public final boolean hasNext() {
        return this.f39012b < this.f39013c;
    }

    public final byte zza() {
        int i = this.f39012b;
        if (i < this.f39013c) {
            this.f39012b = i + 1;
            return this.f39014d.mo30456i(i);
        }
        throw new NoSuchElementException();
    }
}
