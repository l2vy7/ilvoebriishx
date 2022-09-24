package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ns0 implements e70<mq0> {
    /* renamed from: b */
    private static final Integer m35287b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            co0.zzj(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        ms0 ms0;
        ds0 ds0;
        Map map2 = map;
        mq0 mq0 = (mq0) obj;
        if (co0.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            co0.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        es0 zzy = zzt.zzy();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer b = m35287b(map2, "periodicReportIntervalMs");
            Integer b2 = m35287b(map2, "exoPlayerRenderingIntervalMs");
            Integer b3 = m35287b(map2, "exoPlayerIdleIntervalMs");
            lq0 lq0 = new lq0((String) map2.get("flags"));
            boolean z = lq0.f35197n;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        co0.zzj(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z) {
                    Iterator<ds0> it = zzy.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ds0 = null;
                            break;
                        }
                        ds0 next = it.next();
                        if (next.f30991c == mq0 && str.equals(next.mo31404c())) {
                            ds0 = next;
                            break;
                        }
                    }
                } else {
                    ds0 = zzy.mo31657a(mq0);
                }
                if (ds0 != null) {
                    co0.zzj("Precache task is already running.");
                    return;
                } else if (mq0.zzm() == null) {
                    co0.zzj("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer b4 = m35287b(map2, "player");
                    if (b4 == null) {
                        b4 = 0;
                    }
                    if (b != null) {
                        mq0.mo18719I(b.intValue());
                    }
                    if (b2 != null) {
                        mq0.mo18724N(b2.intValue());
                    }
                    if (b3 != null) {
                        mq0.mo18747e0(b3.intValue());
                    }
                    int intValue = b4.intValue();
                    xr0 xr0 = mq0.zzm().zzc;
                    if (intValue > 0) {
                        int T = cq0.m31089T();
                        if (T < lq0.f35191h) {
                            ms0 = new vs0(mq0, lq0);
                        } else if (T < lq0.f35185b) {
                            ms0 = new ss0(mq0, lq0);
                        } else {
                            ms0 = new qs0(mq0);
                        }
                    } else {
                        ms0 = new ps0(mq0);
                    }
                    new ds0(mq0, ms0, str, strArr).zzb();
                }
            } else {
                ds0 a = zzy.mo31657a(mq0);
                if (a != null) {
                    ms0 = a.f30992d;
                } else {
                    co0.zzj("Precache must specify a source.");
                    return;
                }
            }
            Integer b5 = m35287b(map2, "minBufferMs");
            if (b5 != null) {
                ms0.mo18565q(b5.intValue());
            }
            Integer b6 = m35287b(map2, "maxBufferMs");
            if (b6 != null) {
                ms0.mo18564p(b6.intValue());
            }
            Integer b7 = m35287b(map2, "bufferForPlaybackMs");
            if (b7 != null) {
                ms0.mo18562n(b7.intValue());
            }
            Integer b8 = m35287b(map2, "bufferForPlaybackAfterRebufferMs");
            if (b8 != null) {
                ms0.mo18563o(b8.intValue());
            }
        } else if (!zzy.mo31660e(mq0)) {
            co0.zzj("Precache abort but no precache task running.");
        }
    }
}
