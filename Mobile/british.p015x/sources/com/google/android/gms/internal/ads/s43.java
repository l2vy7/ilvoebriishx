package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class s43 extends k73 {

    /* renamed from: b */
    final /* synthetic */ u43 f20808b;

    s43(u43 u43) {
        this.f20808b = u43;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map mo18473c() {
        return this.f20808b;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.f20808b.f20914d.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Iterator<Map.Entry> iterator() {
        return new t43(this.f20808b);
    }

    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        i53.m20531q(this.f20808b.f20915e, entry.getKey());
        return true;
    }
}
