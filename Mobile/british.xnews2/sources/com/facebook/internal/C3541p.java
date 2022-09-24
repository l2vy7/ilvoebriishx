package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: com.facebook.internal.p */
/* compiled from: FragmentWrapper */
public class C3541p {

    /* renamed from: a */
    private Fragment f13231a;

    /* renamed from: b */
    private android.app.Fragment f13232b;

    public C3541p(Fragment fragment) {
        C3489g0.m11687i(fragment, "fragment");
        this.f13231a = fragment;
    }

    /* renamed from: a */
    public final Activity mo12051a() {
        Fragment fragment = this.f13231a;
        if (fragment != null) {
            return fragment.mo3443p();
        }
        return this.f13232b.getActivity();
    }

    /* renamed from: b */
    public android.app.Fragment mo12052b() {
        return this.f13232b;
    }

    /* renamed from: c */
    public Fragment mo12053c() {
        return this.f13231a;
    }

    /* renamed from: d */
    public void mo12054d(Intent intent, int i) {
        Fragment fragment = this.f13231a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            this.f13232b.startActivityForResult(intent, i);
        }
    }

    public C3541p(android.app.Fragment fragment) {
        C3489g0.m11687i(fragment, "fragment");
        this.f13232b = fragment;
    }
}
