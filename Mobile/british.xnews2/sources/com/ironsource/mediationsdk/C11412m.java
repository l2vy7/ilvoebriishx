package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p058c.C4962a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C11421g;
import com.ironsource.mediationsdk.utils.C11484c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.m */
public class C11412m {

    /* renamed from: com.ironsource.mediationsdk.m$f */
    interface C11413f {
        /* renamed from: a */
        void mo43869a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* renamed from: com.ironsource.mediationsdk.m$g */
    interface C11414g {
        /* renamed from: a */
        void mo43866a();

        /* renamed from: a */
        void mo43867a(String str);
    }

    /* renamed from: a */
    static void m51067a(IronSourceBannerLayout ironSourceBannerLayout, C11421g gVar, C11414g gVar2) {
        String str;
        if (!m51072c(ironSourceBannerLayout)) {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = String.format("can't load banner - %s", objArr);
        } else {
            str = null;
        }
        if (gVar == null || TextUtils.isEmpty(gVar.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = gVar == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load banner - %s", objArr2);
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.INTERNAL.error(str);
            gVar2.mo43867a(str);
            return;
        }
        gVar2.mo43866a();
    }

    /* renamed from: a */
    public static void m51068a(String str, Object obj) {
        C4962a.C4964a.f22023a.mo20581a(str, obj);
    }

    /* renamed from: a */
    public static void m51069a(String str, JSONObject jSONObject) {
        C4962a aVar = C4962a.C4964a.f22023a;
        if (jSONObject != null) {
            try {
                Object obj = aVar.f22018a.get(str);
                if (!(obj instanceof JSONObject)) {
                    aVar.mo20581a(str, jSONObject);
                    return;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
                aVar.mo20581a(str, jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m51070a(Map<String, Object> map) {
        C4962a aVar = C4962a.C4964a.f22023a;
        if (map != null) {
            try {
                for (String next : map.keySet()) {
                    if (map.containsKey(next)) {
                        aVar.mo20581a(next, map.get(next));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    static void m51071b(String str, ConcurrentHashMap<String, C11251O> concurrentHashMap, C11413f fVar) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (!C11484c.m51241b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (C11251O next : concurrentHashMap.values()) {
                if (next.mo43923h()) {
                    Map<String, Object> c = next.mo43875c();
                    if (c != null) {
                        hashMap.put(next.mo43926k(), c);
                        sb = new StringBuilder("2");
                    }
                } else if (!next.mo43923h()) {
                    arrayList.add(next.mo43926k());
                    sb = new StringBuilder(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                }
                sb.append(next.mo43926k());
                sb.append(",");
                sb2.append(sb.toString());
            }
        }
        fVar.mo43869a(hashMap, arrayList, sb2);
    }

    /* renamed from: c */
    static boolean m51072c(IronSourceBannerLayout ironSourceBannerLayout) {
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }
}
