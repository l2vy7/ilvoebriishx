package com.iab.omid.library.adcolony.p042b;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.adcolony.p045e.C4849a;

/* renamed from: com.iab.omid.library.adcolony.b.c */
public class C4831c {

    /* renamed from: a */
    private final C4849a f21689a;

    /* renamed from: b */
    private final String f21690b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f21691c;

    /* renamed from: d */
    private final String f21692d;

    public C4831c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21689a = new C4849a(view);
        this.f21690b = view.getClass().getCanonicalName();
        this.f21691c = friendlyObstructionPurpose;
        this.f21692d = str;
    }

    /* renamed from: a */
    public C4849a mo20121a() {
        return this.f21689a;
    }

    /* renamed from: b */
    public String mo20122b() {
        return this.f21690b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo20123c() {
        return this.f21691c;
    }

    /* renamed from: d */
    public String mo20124d() {
        return this.f21692d;
    }
}
