package com.ironsource.sdk.p286a;

import android.util.Log;
import com.ironsource.p053a.C4922a;
import com.ironsource.p053a.C4924b;
import com.ironsource.sdk.p286a.C11522f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.d */
public final class C11520d {

    /* renamed from: b */
    private static C11520d f51799b;

    /* renamed from: a */
    private C4924b f51800a;

    private C11520d() {
    }

    /* renamed from: a */
    private static C11520d m51357a() {
        if (f51799b == null) {
            f51799b = new C11520d();
        }
        return f51799b;
    }

    /* renamed from: a */
    public static void m51358a(C4922a aVar, C11517b bVar) {
        if (aVar != null) {
            try {
                m51357a().f51800a = new C4924b(aVar, bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m51359a(C11522f.C11523a aVar) {
        m51360a(aVar, (Map<String, Object>) new HashMap());
    }

    /* renamed from: a */
    public static void m51360a(C11522f.C11523a aVar, Map<String, Object> map) {
        C4924b bVar = m51357a().f51800a;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f51825b));
        }
        bVar.mo20424a(aVar.f51824a, map);
    }
}
