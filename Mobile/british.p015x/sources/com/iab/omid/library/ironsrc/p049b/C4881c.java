package com.iab.omid.library.ironsrc.p049b;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.ironsrc.p052e.C4899a;

/* renamed from: com.iab.omid.library.ironsrc.b.c */
public class C4881c {

    /* renamed from: a */
    private final C4899a f21803a;

    /* renamed from: b */
    private final String f21804b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f21805c;

    /* renamed from: d */
    private final String f21806d;

    public C4881c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21803a = new C4899a(view);
        this.f21804b = view.getClass().getCanonicalName();
        this.f21805c = friendlyObstructionPurpose;
        this.f21806d = str;
    }

    /* renamed from: a */
    public C4899a mo20307a() {
        return this.f21803a;
    }

    /* renamed from: b */
    public String mo20308b() {
        return this.f21804b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo20309c() {
        return this.f21805c;
    }

    /* renamed from: d */
    public String mo20310d() {
        return this.f21806d;
    }
}
