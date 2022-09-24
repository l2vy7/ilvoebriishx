package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.e */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9123e implements Iterator {

    /* renamed from: b */
    private int f44998b = 0;

    /* renamed from: c */
    final /* synthetic */ C4652f f44999c;

    C9123e(C4652f fVar) {
        this.f44999c = fVar;
    }

    public final boolean hasNext() {
        return this.f44998b < this.f44999c.mo19182g();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f44998b < this.f44999c.mo19182g()) {
            C4652f fVar = this.f44999c;
            int i = this.f44998b;
            this.f44998b = i + 1;
            return fVar.mo19183h(i);
        }
        int i2 = this.f44998b;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }
}
