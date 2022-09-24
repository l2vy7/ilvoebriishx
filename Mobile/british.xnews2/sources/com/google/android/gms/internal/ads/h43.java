package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class h43 implements Iterable<String> {

    /* renamed from: b */
    final /* synthetic */ CharSequence f32610b;

    /* renamed from: c */
    final /* synthetic */ k43 f32611c;

    h43(k43 k43, CharSequence charSequence) {
        this.f32611c = k43;
        this.f32610b = charSequence;
    }

    public final Iterator<String> iterator() {
        return this.f32611c.m33843g(this.f32610b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(q33.m20838a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(q33.m20838a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
