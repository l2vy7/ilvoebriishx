package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7346p extends UnsupportedOperationException {

    /* renamed from: b */
    private final Feature f29209b;

    public C7346p(Feature feature) {
        this.f29209b = feature;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f29209b));
    }
}
