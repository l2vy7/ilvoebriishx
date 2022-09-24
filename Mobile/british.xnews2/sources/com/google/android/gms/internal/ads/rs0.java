package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rs0 {

    /* renamed from: a */
    private final ArrayList<C7799il> f38766a = new ArrayList<>();

    /* renamed from: b */
    private long f38767b;

    rs0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo34592a() {
        Iterator<C7799il> it = this.f38766a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> zze = it.next().zze();
            if (zze != null) {
                for (Map.Entry next : zze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.f38767b = Math.max(this.f38767b, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f38767b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34593b(C7799il ilVar) {
        this.f38766a.add(ilVar);
    }
}
