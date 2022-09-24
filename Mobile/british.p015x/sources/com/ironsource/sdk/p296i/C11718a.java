package com.ironsource.sdk.p296i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.C11618w;
import com.ironsource.sdk.p290d.C11675b;
import com.ironsource.sdk.p294g.C11703d;
import com.ironsource.sdk.utils.C11756b;

/* renamed from: com.ironsource.sdk.i.a */
public final class C11718a {

    /* renamed from: com.ironsource.sdk.i.a$a */
    static /* synthetic */ class C11719a {

        /* renamed from: a */
        static final /* synthetic */ int[] f52438a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.p294g.C11703d.C11704a.m51825a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52438a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.p294g.C11703d.C11704a.f52400a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f52438a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.p294g.C11703d.C11704a.f52401b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f52438a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.p294g.C11703d.C11704a.f52402c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p296i.C11718a.C11719a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m51847a(Activity activity) {
        int parseInt = Integer.parseInt(C11756b.m51963a().f52501a.getString("back_button_state", "2"));
        if (C11719a.f52438a[(parseInt == 0 ? C11703d.C11704a.f52400a : parseInt == 1 ? C11703d.C11704a.f52401b : C11703d.C11704a.f52402c) - 1] != 3) {
            return false;
        }
        try {
            C11618w wVar = (C11618w) C11675b.m51709a((Context) activity).f52282a.f51962a;
            if (wVar != null) {
                wVar.mo44787b(C11618w.m51601b("nativeNavigationPressed", C11618w.m51598a("action", "back", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
