package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C3642m;
import p134q.C5918d;

/* renamed from: com.facebook.internal.e */
/* compiled from: CustomTab */
public class C3478e {

    /* renamed from: a */
    private Uri f13052a;

    public C3478e(String str, Bundle bundle) {
        bundle = bundle == null ? new Bundle() : bundle;
        String b = C3473c0.m11575b();
        this.f13052a = C3481f0.m11624e(b, C3642m.m12290p() + "/" + "dialog/" + str, bundle);
    }

    /* renamed from: a */
    public void mo11933a(Activity activity, String str) {
        C5918d a = new C5918d.C5919a().mo22909a();
        a.f24786a.setPackage(str);
        a.f24786a.addFlags(1073741824);
        a.mo22908a(activity, this.f13052a);
    }
}
