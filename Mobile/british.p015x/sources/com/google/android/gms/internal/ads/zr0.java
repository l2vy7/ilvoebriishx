package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.zzcl;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zr0 implements e70<mq0> {

    /* renamed from: a */
    private boolean f42559a;

    /* renamed from: b */
    private static int m40437b(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                C8241uv.m38463b();
                i = vn0.m38860s(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                co0.zzj(sb.toString());
            }
        }
        if (zze.zzc()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 48 + String.valueOf(str2).length());
            sb2.append("Parse pixels for ");
            sb2.append(str);
            sb2.append(", got string ");
            sb2.append(str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            zze.zza(sb2.toString());
        }
        return i;
    }

    /* renamed from: c */
    private static void m40438c(zp0 zp0, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zp0.mo19063A(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                co0.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            zp0.mo19085z(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zp0.mo19083x(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zp0.mo19084y(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zp0.mo19065b(Integer.parseInt(str5));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        mq0 mq0 = (mq0) obj;
        String str5 = (String) map.get("action");
        if (str5 == null) {
            co0.zzj("Action missing from video GMSG.");
            return;
        }
        if (co0.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str5.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str5);
            sb.append(" ");
            sb.append(jSONObject2);
            co0.zze(sb.toString());
        }
        if ("background".equals(str5)) {
            String str6 = (String) map.get(TtmlNode.ATTR_TTS_COLOR);
            if (TextUtils.isEmpty(str6)) {
                co0.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                mq0.setBackgroundColor(Color.parseColor(str6));
            } catch (IllegalArgumentException unused) {
                co0.zzj("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str5)) {
            String str7 = (String) map.get(TtmlNode.ATTR_TTS_COLOR);
            if (TextUtils.isEmpty(str7)) {
                co0.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                mq0.mo18722M(Color.parseColor(str7));
            } catch (IllegalArgumentException unused2) {
                co0.zzj("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str5)) {
                String str8 = (String) map.get("mimeTypes");
                if (str8 == null) {
                    co0.zzj("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    mq0.mo18321Z("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str9 : str8.split(",")) {
                    hashMap2.put(str9, zzcl.zza(str9.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                mq0.mo18321Z("onVideoEvent", hashMap3);
                return;
            }
            aq0 s0 = mq0.mo18787s0();
            if (s0 == null) {
                co0.zzj("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str5);
            boolean equals2 = "position".equals(str5);
            if (equals || equals2) {
                Context context = mq0.getContext();
                int b = m40437b(context, map, "x", 0);
                int b2 = m40437b(context, map, "y", 0);
                int b3 = m40437b(context, map, "w", -1);
                h00 h00 = p00.f37236w2;
                if (!((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue()) {
                    if (zze.zzc()) {
                        int zzj = mq0.zzj();
                        StringBuilder sb2 = new StringBuilder(110);
                        sb2.append("Calculate width with original width ");
                        sb2.append(b3);
                        sb2.append(", videoHost.getVideoBoundingWidth() ");
                        sb2.append(zzj);
                        sb2.append(", x ");
                        sb2.append(b);
                        sb2.append(".");
                        zze.zza(sb2.toString());
                    }
                    i = Math.min(b3, mq0.zzj() - b);
                } else if (b3 == -1) {
                    i = mq0.zzj();
                } else {
                    i = Math.min(b3, mq0.zzj());
                }
                int b4 = m40437b(context, map, "h", -1);
                if (!((Boolean) C8311wv.m39277c().mo18570b(h00)).booleanValue()) {
                    if (zze.zzc()) {
                        int zzi = mq0.zzi();
                        StringBuilder sb3 = new StringBuilder(113);
                        sb3.append("Calculate height with original height ");
                        sb3.append(b4);
                        sb3.append(", videoHost.getVideoBoundingHeight() ");
                        sb3.append(zzi);
                        sb3.append(", y ");
                        sb3.append(b2);
                        sb3.append(".");
                        zze.zza(sb3.toString());
                    }
                    i2 = Math.min(b4, mq0.zzi() - b2);
                } else if (b4 == -1) {
                    i2 = mq0.zzi();
                } else {
                    i2 = Math.min(b4, mq0.zzi());
                }
                int i4 = i2;
                try {
                    i3 = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused3) {
                    i3 = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || s0.mo30464a() != null) {
                    s0.mo30465b(b, b2, i, i4);
                    return;
                }
                s0.mo30466c(b, b2, i, i4, i3, parseBoolean, new lq0((String) map.get("flags")));
                zp0 a = s0.mo30464a();
                if (a != null) {
                    m40438c(a, map);
                    return;
                }
                return;
            }
            uu0 zzs = mq0.zzs();
            if (zzs != null) {
                if ("timeupdate".equals(str5)) {
                    String str10 = (String) map.get("currentTime");
                    if (str10 == null) {
                        co0.zzj("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzs.mo35277s6(Float.parseFloat(str10));
                        return;
                    } catch (NumberFormatException unused4) {
                        if (str10.length() != 0) {
                            str4 = "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str10);
                        } else {
                            str4 = new String("Could not parse currentTime parameter from timeupdate video GMSG: ");
                        }
                        co0.zzj(str4);
                        return;
                    }
                } else if ("skip".equals(str5)) {
                    zzs.mo35272n();
                    return;
                }
            }
            zp0 a2 = s0.mo30464a();
            if (a2 == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event", "no_video_view");
                mq0.mo18321Z("onVideoEvent", hashMap4);
            } else if ("click".equals(str5)) {
                Context context2 = mq0.getContext();
                int b5 = m40437b(context2, map, "x", 0);
                int b6 = m40437b(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) b5, (float) b6, 0);
                a2.mo19082w(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str5)) {
                String str11 = (String) map.get("time");
                if (str11 == null) {
                    co0.zzj("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    a2.mo19081v((int) (Float.parseFloat(str11) * 1000.0f));
                } catch (NumberFormatException unused5) {
                    if (str11.length() != 0) {
                        str3 = "Could not parse time parameter from currentTime video GMSG: ".concat(str11);
                    } else {
                        str3 = new String("Could not parse time parameter from currentTime video GMSG: ");
                    }
                    co0.zzj(str3);
                }
            } else if ("hide".equals(str5)) {
                a2.setVisibility(4);
            } else if ("load".equals(str5)) {
                a2.mo19076q();
            } else if ("loadControl".equals(str5)) {
                m40438c(a2, map);
            } else if ("muted".equals(str5)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    a2.mo19077r();
                } else {
                    a2.mo19071i();
                }
            } else if ("pause".equals(str5)) {
                a2.mo19079t();
            } else if ("play".equals(str5)) {
                a2.mo19080u();
            } else if ("show".equals(str5)) {
                a2.setVisibility(0);
            } else if ("src".equals(str5)) {
                String str12 = (String) map.get("src");
                Integer num = null;
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused6) {
                        co0.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                    }
                }
                String[] strArr = {str12};
                String str13 = (String) map.get("demuxed");
                if (str13 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str13);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            strArr2[i5] = jSONArray.getString(i5);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused7) {
                        if (str13.length() != 0) {
                            str2 = "Malformed demuxed URL list for playback: ".concat(str13);
                        } else {
                            str2 = new String("Malformed demuxed URL list for playback: ");
                        }
                        co0.zzj(str2);
                        strArr = new String[]{str12};
                    }
                }
                if (num != null) {
                    mq0.mo18719I(num.intValue());
                }
                a2.mo19066c(str12, strArr);
            } else if ("touchMove".equals(str5)) {
                Context context3 = mq0.getContext();
                a2.mo19070h((float) m40437b(context3, map, "dx", 0), (float) m40437b(context3, map, "dy", 0));
                if (!this.f42559a) {
                    mq0.mo18784r();
                    this.f42559a = true;
                }
            } else if ("volume".equals(str5)) {
                String str14 = (String) map.get("volume");
                if (str14 == null) {
                    co0.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    a2.mo19068f(Float.parseFloat(str14));
                } catch (NumberFormatException unused8) {
                    if (str14.length() != 0) {
                        str = "Could not parse volume parameter from volume video GMSG: ".concat(str14);
                    } else {
                        str = new String("Could not parse volume parameter from volume video GMSG: ");
                    }
                    co0.zzj(str);
                }
            } else if ("watermark".equals(str5)) {
                a2.mo19072n();
            } else {
                co0.zzj(str5.length() != 0 ? "Unknown video action: ".concat(str5) : new String("Unknown video action: "));
            }
        }
    }
}
