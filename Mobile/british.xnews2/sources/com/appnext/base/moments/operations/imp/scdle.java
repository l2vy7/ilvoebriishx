package com.appnext.base.moments.operations.imp;

import com.appnext.base.C3117a;
import com.appnext.base.moments.operations.C3142c;
import com.appnext.base.moments.p027a.C3127a;
import com.appnext.base.moments.p027a.p028a.C3129b;
import com.appnext.base.moments.p027a.p028a.C3130c;
import com.appnext.base.moments.services.p032b.C3147a;
import com.appnext.base.p026b.C3125a;
import java.util.List;

public class scdle extends C3142c {
    /* access modifiers changed from: protected */
    public List<C3129b> getData() {
        try {
            List<C3130c> ai = C3127a.m10579Q().mo10557T().mo10574ai();
            if (ai == null) {
                return null;
            }
            for (C3130c next : ai) {
                if (!next.mo10568ad().equals(scdle.class.getSimpleName()) && next.mo10567ac().equals("once")) {
                    C3147a.m10633b(C3125a.getContext()).mo10591c(next);
                    C3147a.m10633b(C3125a.getContext()).mo10589a(next, true);
                }
            }
            return null;
        } catch (Throwable th) {
            C3117a.m10553a("scdle$getData", th);
            return null;
        }
    }
}
