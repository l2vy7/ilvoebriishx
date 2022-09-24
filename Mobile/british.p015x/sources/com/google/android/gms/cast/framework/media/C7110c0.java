package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.c0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7110c0 implements C4580e.C4583c {

    /* renamed from: b */
    private final Status f28688b;

    /* renamed from: c */
    private final JSONObject f28689c;

    /* renamed from: d */
    private final MediaError f28690d;

    C7110c0(Status status, JSONObject jSONObject, MediaError mediaError) {
        this.f28688b = status;
        this.f28689c = jSONObject;
        this.f28690d = mediaError;
    }

    /* renamed from: p0 */
    public final Status mo29527p0() {
        return this.f28688b;
    }
}
