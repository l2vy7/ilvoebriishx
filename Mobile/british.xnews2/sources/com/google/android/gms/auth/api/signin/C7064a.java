package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7372b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p216i4.C10583b;
import p220j4.C10614h;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public final class C7064a {
    /* renamed from: a */
    public static C7065b m28995a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        return new C7065b(activity, (GoogleSignInOptions) C4604n.m20098k(googleSignInOptions));
    }

    /* renamed from: b */
    public static Task<GoogleSignInAccount> m28996b(Intent intent) {
        C10583b a = C10614h.m48379a(intent);
        if (a == null) {
            return Tasks.forException(C7372b.m29987a(Status.f28884i));
        }
        if (!a.mo29527p0().mo29735G0() || a.mo42699a() == null) {
            return Tasks.forException(C7372b.m29987a(a.mo29527p0()));
        }
        return Tasks.forResult(a.mo42699a());
    }
}
