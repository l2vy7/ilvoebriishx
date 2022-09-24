package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jr3 {

    /* renamed from: a */
    private final ArrayDeque<eo3> f34025a = new ArrayDeque<>();

    /* synthetic */ jr3(ir3 ir3) {
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ eo3 m33739a(jr3 jr3, eo3 eo3, eo3 eo32) {
        jr3.m33740b(eo3);
        jr3.m33740b(eo32);
        eo3 pop = jr3.f34025a.pop();
        while (!jr3.f34025a.isEmpty()) {
            pop = new nr3(jr3.f34025a.pop(), pop);
        }
        return pop;
    }

    /* renamed from: b */
    private final void m33740b(eo3 eo3) {
        if (eo3.mo31621u()) {
            int c = m33741c(eo3.mo30457q());
            int V = nr3.m35269V(c + 1);
            if (this.f34025a.isEmpty() || this.f34025a.peek().mo30457q() >= V) {
                this.f34025a.push(eo3);
                return;
            }
            int V2 = nr3.m35269V(c);
            eo3 pop = this.f34025a.pop();
            while (!this.f34025a.isEmpty() && this.f34025a.peek().mo30457q() < V2) {
                pop = new nr3(this.f34025a.pop(), pop);
            }
            nr3 nr3 = new nr3(pop, eo3);
            while (!this.f34025a.isEmpty() && this.f34025a.peek().mo30457q() < nr3.m35269V(m33741c(nr3.mo30457q()) + 1)) {
                nr3 = new nr3(this.f34025a.pop(), nr3);
            }
            this.f34025a.push(nr3);
        } else if (eo3 instanceof nr3) {
            nr3 nr32 = (nr3) eo3;
            m33740b(nr32.f36101g);
            m33740b(nr32.f36102h);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(eo3.getClass())));
        }
    }

    /* renamed from: c */
    private static final int m33741c(int i) {
        int binarySearch = Arrays.binarySearch(nr3.f36099k, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
