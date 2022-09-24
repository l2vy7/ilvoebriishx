package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ki */
/* compiled from: IMASDK */
public final class C4124ki {

    /* renamed from: a */
    private String f17698a;

    /* renamed from: b */
    private Uri f17699b;

    /* renamed from: c */
    private String f17700c;

    /* renamed from: d */
    private final long f17701d = Long.MIN_VALUE;

    /* renamed from: e */
    private List<C4543zw> f17702e;

    /* renamed from: f */
    private List f17703f;

    /* renamed from: g */
    private C4131kp f17704g;

    /* renamed from: h */
    private long f17705h;

    /* renamed from: i */
    private final long f17706i;

    /* renamed from: j */
    private final long f17707j;

    /* renamed from: k */
    private final float f17708k;

    /* renamed from: l */
    private final float f17709l;

    public C4124ki() {
        Collections.emptyList();
        Collections.emptyMap();
        this.f17702e = Collections.emptyList();
        this.f17703f = Collections.emptyList();
        this.f17705h = C6540C.TIME_UNSET;
        this.f17706i = C6540C.TIME_UNSET;
        this.f17707j = C6540C.TIME_UNSET;
        this.f17708k = -3.4028235E38f;
        this.f17709l = -3.4028235E38f;
    }

    /* renamed from: a */
    public final C4129kn mo16139a() {
        C4128km kmVar;
        aup.m14887r(true);
        Uri uri = this.f17699b;
        if (uri != null) {
            kmVar = new C4128km(uri, this.f17700c, (C4126kk) null, (C4123kh) null, this.f17702e, this.f17703f);
            String str = this.f17698a;
            if (str == null) {
                str = uri.toString();
            }
            this.f17698a = str;
        } else {
            kmVar = null;
        }
        C4128km kmVar2 = kmVar;
        String str2 = this.f17698a;
        aup.m14890u(str2);
        C4125kj kjVar = new C4125kj(Long.MIN_VALUE);
        C4127kl klVar = new C4127kl(this.f17705h, this.f17706i, this.f17707j, this.f17708k, this.f17709l);
        C4131kp kpVar = this.f17704g;
        if (kpVar == null) {
            kpVar = C4131kp.f17733a;
        }
        return new C4129kn(str2, kjVar, kmVar2, klVar, kpVar);
    }

    /* renamed from: b */
    public final void mo16140b(long j) {
        this.f17705h = j;
    }

    /* renamed from: c */
    public final void mo16141c(String str) {
        this.f17698a = str;
    }

    /* renamed from: d */
    public final void mo16142d(String str) {
        this.f17700c = str;
    }

    /* renamed from: e */
    public final void mo16143e(List<C4543zw> list) {
        List<C4543zw> list2;
        if (list == null || list.isEmpty()) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(new ArrayList(list));
        }
        this.f17702e = list2;
    }

    /* renamed from: f */
    public final void mo16144f(Uri uri) {
        this.f17699b = uri;
    }

    /* synthetic */ C4124ki(C4129kn knVar) {
        this();
        this.f17698a = knVar.f17728a;
        this.f17704g = knVar.f17731d;
        C4127kl klVar = knVar.f17730c;
        this.f17705h = klVar.f17715a;
        this.f17706i = klVar.f17716b;
        this.f17707j = klVar.f17717c;
        this.f17708k = klVar.f17718d;
        this.f17709l = klVar.f17719e;
        C4128km kmVar = knVar.f17729b;
        if (kmVar != null) {
            this.f17700c = kmVar.f17721b;
            this.f17699b = kmVar.f17720a;
            this.f17702e = kmVar.f17724e;
            this.f17703f = kmVar.f17726g;
        }
    }
}
