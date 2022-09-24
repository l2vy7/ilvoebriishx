package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.u2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7318u2 {

    /* renamed from: c */
    public static final Status f29150c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a */
    final Set<BasePendingResult<?>> f29151a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C7313t2 f29152b = new C7313t2(this);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29946a(BasePendingResult<? extends C7341k> basePendingResult) {
        this.f29151a.add(basePendingResult);
        basePendingResult.mo29794p(this.f29152b);
    }

    /* renamed from: b */
    public final void mo29947b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f29151a.toArray(new BasePendingResult[0])) {
            basePendingResult.mo29794p((C7313t2) null);
            if (basePendingResult.mo29793o()) {
                this.f29151a.remove(basePendingResult);
            }
        }
    }
}
