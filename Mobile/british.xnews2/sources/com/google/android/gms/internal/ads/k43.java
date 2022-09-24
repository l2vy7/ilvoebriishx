package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class k43 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final m33 f34152a;

    /* renamed from: b */
    private final j43 f34153b;

    private k43(j43 j43) {
        l33 l33 = l33.f34817b;
        this.f34153b = j43;
        this.f34152a = l33;
    }

    /* renamed from: b */
    public static k43 m33840b(int i) {
        return new k43(new g43(4000));
    }

    /* renamed from: c */
    public static k43 m33841c(m33 m33) {
        return new k43(new e43(m33));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final Iterator<String> m33843g(CharSequence charSequence) {
        return this.f34153b.mo31472a(this, charSequence);
    }

    /* renamed from: d */
    public final Iterable<String> mo33028d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new h43(this, charSequence);
    }

    /* renamed from: f */
    public final List<String> mo33029f(CharSequence charSequence) {
        Iterator<String> g = m33843g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
