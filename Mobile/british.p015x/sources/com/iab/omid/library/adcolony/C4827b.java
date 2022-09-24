package com.iab.omid.library.adcolony;

import android.content.Context;
import com.iab.omid.library.adcolony.p043b.C4829b;
import com.iab.omid.library.adcolony.p043b.C4832d;
import com.iab.omid.library.adcolony.p043b.C4835f;
import com.iab.omid.library.adcolony.p045d.C4843b;
import com.iab.omid.library.adcolony.p045d.C4847e;

/* renamed from: com.iab.omid.library.adcolony.b */
public class C4827b {

    /* renamed from: a */
    private boolean f21680a;

    /* renamed from: b */
    private void m22251b(Context context) {
        C4847e.m22345a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo20106a() {
        return "1.3.11-Adcolony";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20107a(Context context) {
        m22251b(context);
        if (!mo20109b()) {
            mo20108a(true);
            C4835f.m22294a().mo20144a(context);
            C4829b.m22263a().mo20116a(context);
            C4843b.m22325a(context);
            C4832d.m22274a().mo20125a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20108a(boolean z) {
        this.f21680a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo20109b() {
        return this.f21680a;
    }
}
