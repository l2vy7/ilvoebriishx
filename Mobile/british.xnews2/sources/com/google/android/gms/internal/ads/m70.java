package com.google.android.gms.internal.ads;

import com.appnext.core.C3148Ad;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import p006a5.C6484f;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m70 implements e70<xt0> {

    /* renamed from: d */
    static final Map<String, Integer> f35430d = C6484f.m28255e(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a */
    private final zzb f35431a;

    /* renamed from: b */
    private final pf0 f35432b;

    /* renamed from: c */
    private final wf0 f35433c;

    public m70(zzb zzb, pf0 pf0, wf0 wf0) {
        this.f35431a = zzb;
        this.f35432b = pf0;
        this.f35433c = wf0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        int intValue = f35430d.get((String) map.get("a")).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.f35431a.zzc()) {
                    this.f35431a.zzb((String) null);
                    return;
                } else if (intValue == 1) {
                    this.f35432b.mo34117i(map);
                    return;
                } else if (intValue == 3) {
                    new sf0(xt0, map).mo34702i();
                    return;
                } else if (intValue == 4) {
                    new nf0(xt0, map).mo33690j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f35432b.mo34116h(true);
                        return;
                    } else if (intValue != 7) {
                        co0.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f35433c.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (xt0 == null) {
            co0.zzj("AdWebView is null");
            return;
        }
        if (C3148Ad.ORIENTATION_PORTRAIT.equalsIgnoreCase(str)) {
            i = 7;
        } else if (!C3148Ad.ORIENTATION_LANDSCAPE.equalsIgnoreCase(str)) {
            if (z) {
                i = -1;
            } else {
                i = zzt.zzq().zzg();
            }
        }
        xt0.mo18731R(i);
    }
}
