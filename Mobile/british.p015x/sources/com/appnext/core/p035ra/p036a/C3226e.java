package com.appnext.core.p035ra.p036a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.core.p035ra.database.C3229a;
import com.appnext.core.p035ra.database.RecentAppsDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;

/* renamed from: com.appnext.core.ra.a.e */
public class C3226e extends C3222b {
    public C3226e(Context context, Bundle bundle) {
        super(context, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aM */
    public final void mo10834aM() {
        try {
            Bundle aP = mo10837aP();
            if (aP != null) {
                String string = aP.getString("more_data");
                if (!TextUtils.isEmpty(string)) {
                    JSONArray jSONArray = new JSONArray(string);
                    if (jSONArray.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        String format = C3222b.m10860aQ().format(new Date());
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string2 = jSONArray.getString(i);
                            if (string2.matches("^[a-z][a-z0-9_]*(\\.[a-z0-9_]+)+[0-9a-z_]$")) {
                                C3229a aVar = new C3229a();
                                aVar.f12414eQ = string2;
                                aVar.f12415eR = format;
                                aVar.f12416eS = false;
                                arrayList.add(aVar);
                            }
                        }
                        long[] b = RecentAppsDatabase.getInstance(getContext()).recentAppDao().mo10848b(arrayList);
                        if (b != null) {
                            Arrays.toString(b);
                        }
                        RecentAppsDatabase.getInstance(getContext()).recentAppDao().mo10846aR().toString();
                    }
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("StoreRecentAppsAction$doUniqueAction", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aN */
    public final boolean mo10835aN() {
        return true;
    }
}
