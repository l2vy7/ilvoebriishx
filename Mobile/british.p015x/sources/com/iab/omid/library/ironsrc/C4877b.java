package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.p049b.C4879b;
import com.iab.omid.library.ironsrc.p049b.C4882d;
import com.iab.omid.library.ironsrc.p049b.C4885f;
import com.iab.omid.library.ironsrc.p051d.C4893b;
import com.iab.omid.library.ironsrc.p051d.C4897e;

/* renamed from: com.iab.omid.library.ironsrc.b */
public class C4877b {

    /* renamed from: a */
    private boolean f21794a;

    /* renamed from: b */
    private void m22472b(Context context) {
        C4897e.m22566a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo20292a() {
        return "1.3.12-Ironsrc";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20293a(Context context) {
        m22472b(context);
        if (!mo20295b()) {
            mo20294a(true);
            C4885f.m22515a().mo20330a(context);
            C4879b.m22484a().mo20302a(context);
            C4893b.m22546a(context);
            C4882d.m22495a().mo20311a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20294a(boolean z) {
        this.f21794a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo20295b() {
        return this.f21794a;
    }
}
