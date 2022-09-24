package com.google.android.gms.common.api;

import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.common.api.t */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7350t<R extends C7341k> extends BasePendingResult<R> {

    /* renamed from: r */
    private final R f29211r;

    public C7350t(C7206f fVar, R r) {
        super(fVar);
        this.f29211r = r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final R mo29539e(Status status) {
        return this.f29211r;
    }
}
