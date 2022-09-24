package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.i1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7398i1 {

    /* renamed from: f */
    private static final Uri f29322f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f29323a;

    /* renamed from: b */
    private final String f29324b;

    /* renamed from: c */
    private final ComponentName f29325c = null;

    /* renamed from: d */
    private final int f29326d;

    /* renamed from: e */
    private final boolean f29327e;

    public C7398i1(String str, String str2, int i, boolean z) {
        C4604n.m20094g(str);
        this.f29323a = str;
        C4604n.m20094g(str2);
        this.f29324b = str2;
        this.f29326d = i;
        this.f29327e = z;
    }

    /* renamed from: a */
    public final int mo30109a() {
        return this.f29326d;
    }

    /* renamed from: b */
    public final ComponentName mo30110b() {
        return this.f29325c;
    }

    /* renamed from: c */
    public final Intent mo30111c(Context context) {
        Bundle bundle;
        String str;
        if (this.f29323a == null) {
            return new Intent().setComponent(this.f29325c);
        }
        Intent intent = null;
        if (this.f29327e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f29323a);
            try {
                bundle = context.getContentResolver().call(f29322f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf = String.valueOf(this.f29323a);
                if (valueOf.length() != 0) {
                    str = "Dynamic lookup for intent failed for action: ".concat(valueOf);
                } else {
                    str = new String("Dynamic lookup for intent failed for action: ");
                }
                Log.w("ConnectionStatusConfig", str);
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f29323a).setPackage(this.f29324b);
    }

    /* renamed from: d */
    public final String mo30112d() {
        return this.f29324b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7398i1)) {
            return false;
        }
        C7398i1 i1Var = (C7398i1) obj;
        return C7408m.m30028a(this.f29323a, i1Var.f29323a) && C7408m.m30028a(this.f29324b, i1Var.f29324b) && C7408m.m30028a(this.f29325c, i1Var.f29325c) && this.f29326d == i1Var.f29326d && this.f29327e == i1Var.f29327e;
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f29323a, this.f29324b, this.f29325c, Integer.valueOf(this.f29326d), Boolean.valueOf(this.f29327e));
    }

    public final String toString() {
        String str = this.f29323a;
        if (str != null) {
            return str;
        }
        C4604n.m20098k(this.f29325c);
        return this.f29325c.flattenToString();
    }
}
