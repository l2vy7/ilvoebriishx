package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class as0 implements e70<mq0> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18854a(Object obj, Map map) {
        mq0 mq0 = (mq0) obj;
        uu0 zzs = mq0.zzs();
        if (zzs == null) {
            try {
                uu0 uu0 = new uu0(mq0, Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION)), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("customControlsAllowed")), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("clickToExpandAllowed")));
                mq0.mo18758k(uu0);
                zzs = uu0;
            } catch (NullPointerException e) {
                e = e;
                co0.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().mo18592s(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                co0.zzh("Unable to parse videoMeta message.", e);
                zzt.zzo().mo18592s(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION));
        boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (co0.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            co0.zze(sb.toString());
        }
        zzs.mo35273o6(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
