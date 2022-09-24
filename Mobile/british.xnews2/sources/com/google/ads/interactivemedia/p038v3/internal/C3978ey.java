package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.p038v3.api.AdEvent;
import com.google.ads.interactivemedia.p038v3.api.CuePoint;
import com.google.ads.interactivemedia.p038v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p038v3.api.StreamManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ey */
/* compiled from: IMASDK */
public final class C3978ey extends C3933dg implements StreamManager {

    /* renamed from: a */
    private final String f17020a;

    /* renamed from: b */
    private List<CuePoint> f17021b = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3978ey(String str, C3958ee eeVar, StreamDisplayContainer streamDisplayContainer, C3982fb fbVar, C3907ch chVar, C3973et etVar, C3940dn dnVar, Context context, String str2, boolean z) {
        super(str, eeVar, fbVar, streamDisplayContainer, chVar, etVar, dnVar, context, z);
        this.f17020a = str2;
        fbVar.mo15773l();
    }

    /* renamed from: b */
    public final void mo15645b(C3955eb ebVar) {
        C3982fb fbVar = (C3982fb) mo15668e();
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = ebVar.f16958a.ordinal();
        if (ordinal == 3) {
            fbVar.mo15775n();
        } else if (ordinal == 4) {
            this.f17021b = ebVar.f16961d;
        } else if (ordinal == 14) {
            double d = ebVar.f16963f;
            StringBuilder sb = new StringBuilder(54);
            sb.append("Seek time when ad is skipped: ");
            sb.append(d);
            Log.i("IMASDK", sb.toString());
            fbVar.mo15772k(Math.round(ebVar.f16963f * 1000.0d));
        } else if (ordinal != 15) {
            switch (ordinal) {
                case 23:
                    fbVar.mo15768b();
                    break;
                case 24:
                    fbVar.mo15769e();
                    break;
                case 25:
                    fbVar.mo15770g();
                    break;
                case 26:
                    fbVar.mo15771j();
                    break;
            }
        } else {
            fbVar.mo15774m(ebVar.f16959b);
        }
        super.mo15645b(ebVar);
    }

    public final void destroy() {
        super.destroy();
        mo15670g(C3948dv.contentComplete);
        mo15669f();
    }

    public final double getContentTimeForStreamTime(double d) {
        double d2 = d;
        for (CuePoint next : this.f17021b) {
            if (next.getStartTime() > next.getEndTime()) {
                return 0.0d;
            }
            if (d >= next.getEndTime()) {
                d2 -= next.getEndTime() - next.getStartTime();
            } else if (d < next.getEndTime() && d > next.getStartTime()) {
                d2 -= d - next.getStartTime();
            }
        }
        return d2;
    }

    public final List<CuePoint> getCuePoints() {
        return Collections.unmodifiableList(this.f17021b);
    }

    public final CuePoint getPreviousCuePointForStreamTime(double d) {
        CuePoint cuePoint = null;
        for (CuePoint next : this.f17021b) {
            if (next.getStartTime() < d) {
                cuePoint = next;
            }
        }
        return cuePoint;
    }

    public final String getStreamId() {
        return this.f17020a;
    }

    public final double getStreamTimeForContentTime(double d) {
        double d2 = d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        for (CuePoint next : this.f17021b) {
            if (next.getStartTime() > next.getEndTime()) {
                return 0.0d;
            }
            d3 += next.getStartTime() - d4;
            if (d3 > d) {
                return d2;
            }
            d2 += next.getEndTime() - next.getStartTime();
            d4 = next.getEndTime();
        }
        return d2;
    }

    public final boolean isCustomPlaybackUsed() {
        return true;
    }

    public final void replaceAdTagParameters(Map<String, String> map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("adTagParameters", map);
            mo15671h(C3947du.adsManager, C3948dv.replaceAdTagParameters, hashMap);
        }
    }
}
