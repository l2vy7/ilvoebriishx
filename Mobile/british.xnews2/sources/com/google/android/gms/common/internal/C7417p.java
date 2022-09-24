package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import p251t4.C11015e;

/* renamed from: com.google.android.gms.common.internal.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C7417p {

    /* renamed from: a */
    private final Resources f29354a;

    /* renamed from: b */
    private final String f29355b;

    public C7417p(Context context) {
        C4604n.m20098k(context);
        Resources resources = context.getResources();
        this.f29354a = resources;
        this.f29355b = resources.getResourcePackageName(C11015e.f49970a);
    }

    /* renamed from: a */
    public String mo30148a(String str) {
        int identifier = this.f29354a.getIdentifier(str, "string", this.f29355b);
        if (identifier == 0) {
            return null;
        }
        return this.f29354a.getString(identifier);
    }
}
