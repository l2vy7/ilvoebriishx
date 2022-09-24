package com.google.ads.interactivemedia.p039v3.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ap */
/* compiled from: IMASDK */
public final class C3846ap extends C3841al {

    /* renamed from: a */
    private static final Pattern f15511a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final C3844an f15512b;

    /* renamed from: c */
    private final List<C3871az> f15513c = new ArrayList();

    /* renamed from: d */
    private C3882bj f15514d;

    /* renamed from: e */
    private boolean f15515e = false;

    /* renamed from: f */
    private boolean f15516f = false;

    /* renamed from: g */
    private final String f15517g;

    /* renamed from: h */
    private C3903cd f15518h;

    C3846ap(C3842am amVar, C3844an anVar) {
        this.f15512b = anVar;
        this.f15517g = UUID.randomUUID().toString();
        m14483l((View) null);
        if (anVar.mo14065h() == C3845ao.HTML || anVar.mo14065h() == C3845ao.JAVASCRIPT) {
            this.f15514d = new C3883bk(anVar.mo14062e());
        } else {
            this.f15514d = new C3885bm(anVar.mo14061d());
        }
        this.f15514d.mo15148a();
        C3855aw.m14982a().mo14648b(this);
        C3875bc.m15575a().mo14880b(this.f15514d.mo15151d(), amVar.mo13979a());
    }

    /* renamed from: l */
    private final void m14483l(View view) {
        this.f15518h = new C3903cd(view);
    }

    /* renamed from: a */
    public final void mo13874a() {
        if (!this.f15515e) {
            this.f15515e = true;
            C3855aw.m14982a().mo14649c(this);
            this.f15514d.mo15157j(C3876bd.m15693a().mo14939f());
            this.f15514d.mo15155h(this, this.f15512b);
        }
    }

    /* renamed from: b */
    public final void mo13875b(View view) {
        if (!this.f15516f) {
            C4038hd.m17319e(view, "AdView is null");
            if (mo14173j() != view) {
                m14483l(view);
                this.f15514d.mo15158k();
                Collection<C3846ap> e = C3855aw.m14982a().mo14651e();
                if (e != null && e.size() > 0) {
                    for (C3846ap next : e) {
                        if (next != this && next.mo14173j() == view) {
                            next.f15518h.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo13876c() {
        if (!this.f15516f) {
            this.f15518h.clear();
            mo13878e();
            this.f15516f = true;
            C3875bc.m15575a().mo14882d(this.f15514d.mo15151d());
            C3855aw.m14982a().mo14650d(this);
            this.f15514d.mo15149b();
            this.f15514d = null;
        }
    }

    /* renamed from: d */
    public final void mo13877d(View view, C3850ar arVar, String str) {
        C3871az azVar;
        if (this.f15516f) {
            return;
        }
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        } else if (str == null || (str.length() <= 50 && f15511a.matcher(str).matches())) {
            Iterator<C3871az> it = this.f15513c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    azVar = null;
                    break;
                }
                azVar = it.next();
                if (azVar.mo14777d().get() == view) {
                    break;
                }
            }
            if (azVar == null) {
                this.f15513c.add(new C3871az(view, arVar, str));
            }
        } else {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: e */
    public final void mo13878e() {
        if (!this.f15516f) {
            this.f15513c.clear();
        }
    }

    /* renamed from: g */
    public final List<C3871az> mo14170g() {
        return this.f15513c;
    }

    /* renamed from: h */
    public final C3882bj mo14171h() {
        return this.f15514d;
    }

    /* renamed from: i */
    public final String mo14172i() {
        return this.f15517g;
    }

    /* renamed from: j */
    public final View mo14173j() {
        return (View) this.f15518h.get();
    }

    /* renamed from: k */
    public final boolean mo14174k() {
        return this.f15515e && !this.f15516f;
    }
}
