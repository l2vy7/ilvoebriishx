package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.ou */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4617ou {

    /* renamed from: a */
    private Bundle f20618a = new Bundle();

    /* renamed from: b */
    private List<String> f20619b = new ArrayList();

    /* renamed from: c */
    private boolean f20620c = false;

    /* renamed from: d */
    private int f20621d = -1;

    /* renamed from: e */
    private final Bundle f20622e = new Bundle();

    /* renamed from: f */
    private final Bundle f20623f = new Bundle();

    /* renamed from: g */
    private final List<String> f20624g = new ArrayList();

    /* renamed from: h */
    private int f20625h = -1;

    /* renamed from: i */
    private String f20626i = null;

    /* renamed from: j */
    private final List<String> f20627j = new ArrayList();

    /* renamed from: k */
    private int f20628k = 60000;

    /* renamed from: a */
    public final zzbfd mo18612a() {
        return new zzbfd(8, -1, this.f20618a, -1, this.f20619b, this.f20620c, this.f20621d, false, (String) null, (zzbkm) null, (Location) null, (String) null, this.f20622e, this.f20623f, this.f20624g, (String) null, (String) null, false, (zzbeu) null, this.f20625h, this.f20626i, this.f20627j, this.f20628k, (String) null);
    }

    /* renamed from: b */
    public final C4617ou mo18613b(Bundle bundle) {
        this.f20618a = bundle;
        return this;
    }

    /* renamed from: c */
    public final C4617ou mo18614c(int i) {
        this.f20628k = i;
        return this;
    }

    /* renamed from: d */
    public final C4617ou mo18615d(boolean z) {
        this.f20620c = z;
        return this;
    }

    /* renamed from: e */
    public final C4617ou mo18616e(List<String> list) {
        this.f20619b = list;
        return this;
    }

    /* renamed from: f */
    public final C4617ou mo18617f(String str) {
        this.f20626i = str;
        return this;
    }

    /* renamed from: g */
    public final C4617ou mo18618g(int i) {
        this.f20621d = i;
        return this;
    }

    /* renamed from: h */
    public final C4617ou mo18619h(int i) {
        this.f20625h = i;
        return this;
    }
}
