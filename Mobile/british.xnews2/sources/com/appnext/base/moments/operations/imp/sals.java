package com.appnext.base.moments.operations.imp;

import com.appnext.base.C3117a;
import com.appnext.base.moments.operations.C3142c;
import com.appnext.base.moments.p027a.C3127a;
import com.appnext.base.moments.p027a.p028a.C3129b;
import com.appnext.base.p026b.C3125a;
import com.appnext.core.C3198g;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

public class sals extends C3142c {
    /* access modifiers changed from: protected */
    public List<C3129b> getData() {
        try {
            String a = C3198g.m10777a(C3125a.getContext(), "https://cdn.appnext.com/tools/services/4.7.3/plist.json", (HashMap<String, String>) null, 60000);
            C3127a.m10579Q().mo10555R().mo10572ag();
            C3127a.m10579Q().mo10555R().mo10571a(new JSONArray(a));
        } catch (Throwable th) {
            th.getMessage();
            C3117a.m10553a("sals$getData", th);
        }
        return null;
    }
}
