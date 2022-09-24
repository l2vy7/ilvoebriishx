package com.google.ads.interactivemedia.p039v3.impl.data;

import android.util.Log;
import com.google.ads.interactivemedia.p039v3.internal.bnh;
import com.google.ads.interactivemedia.p039v3.internal.bnj;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ba */
/* compiled from: IMASDK */
public final class C3788ba {
    public double adBreakDuration;
    public String adBreakTime;
    public List<Float> adCuePoints;
    public C3803c adData;
    public double adPeriodDuration;
    public C3804d adPodInfo;
    public int adPosition;
    public long adTimeUpdateMs;
    public double bufferedTime;
    public Map<String, CompanionData> companions;
    public List<C3781au> cuepoints;
    public double currentTime;
    public double duration;
    public boolean enableGks;
    public int errorCode;
    public String errorMessage;
    public String eventId;
    public String innerError;
    public SortedSet<Float> internalCuePoints;

    /* renamed from: ln */
    public String f13896ln;
    public C3786az logData;

    /* renamed from: m */
    public String f13897m;
    public boolean monitorAppLifecycle;

    /* renamed from: n */
    public String f13898n;
    public C3790bc networkRequest;
    public String queryId;
    public ResizeAndPositionVideoMsgData resizeAndPositionVideo;
    public double seekTime;
    public String streamId;
    public String streamUrl;
    public List<HashMap<String, String>> subtitles;
    public int totalAds;
    public String url;
    public String vastEvent;
    public String videoUrl;

    public boolean equals(Object obj) {
        return bnh.m16832c(this, obj, new String[0]);
    }

    public int hashCode() {
        return bnj.m16840b(this, new String[0]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JavaScriptMsgData[");
        for (Field field : C3788ba.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb.append(field.getName());
                sb.append(":");
                sb.append(obj);
                sb.append(",");
            } catch (IllegalArgumentException e) {
                Log.e("IMASDK", "IllegalArgumentException occurred", e);
            } catch (IllegalAccessException e2) {
                Log.e("IMASDK", "IllegalAccessException occurred", e2);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
