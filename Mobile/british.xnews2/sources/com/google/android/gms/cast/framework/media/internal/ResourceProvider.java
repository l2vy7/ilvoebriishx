package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p114m4.C10761i;
import p114m4.C10764j;
import p114m4.C10770m;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class ResourceProvider {

    /* renamed from: a */
    private static final Map<String, Integer> f28713a;

    /* renamed from: b */
    public static final /* synthetic */ int f28714b = 0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("smallIconDrawableResId", Integer.valueOf(C10764j.f49407l));
        hashMap.put("stopLiveStreamDrawableResId", Integer.valueOf(C10764j.f49408m));
        hashMap.put("pauseDrawableResId", Integer.valueOf(C10764j.f49400e));
        hashMap.put("playDrawableResId", Integer.valueOf(C10764j.f49401f));
        hashMap.put("skipNextDrawableResId", Integer.valueOf(C10764j.f49405j));
        hashMap.put("skipPrevDrawableResId", Integer.valueOf(C10764j.f49406k));
        hashMap.put("forwardDrawableResId", Integer.valueOf(C10764j.f49397b));
        hashMap.put("forward10DrawableResId", Integer.valueOf(C10764j.f49398c));
        hashMap.put("forward30DrawableResId", Integer.valueOf(C10764j.f49399d));
        hashMap.put("rewindDrawableResId", Integer.valueOf(C10764j.f49402g));
        hashMap.put("rewind10DrawableResId", Integer.valueOf(C10764j.f49403h));
        hashMap.put("rewind30DrawableResId", Integer.valueOf(C10764j.f49404i));
        hashMap.put("disconnectDrawableResId", Integer.valueOf(C10764j.f49396a));
        hashMap.put("notificationImageSizeDimenResId", Integer.valueOf(C10761i.f49395a));
        hashMap.put("castingToDeviceStringResId", Integer.valueOf(C10770m.f49451b));
        hashMap.put("stopLiveStreamStringResId", Integer.valueOf(C10770m.f49469u));
        hashMap.put("pauseStringResId", Integer.valueOf(C10770m.f49461m));
        hashMap.put("playStringResId", Integer.valueOf(C10770m.f49462n));
        hashMap.put("skipNextStringResId", Integer.valueOf(C10770m.f49466r));
        hashMap.put("skipPrevStringResId", Integer.valueOf(C10770m.f49467s));
        hashMap.put("forwardStringResId", Integer.valueOf(C10770m.f49456h));
        hashMap.put("forward10StringResId", Integer.valueOf(C10770m.f49457i));
        hashMap.put("forward30StringResId", Integer.valueOf(C10770m.f49458j));
        hashMap.put("rewindStringResId", Integer.valueOf(C10770m.f49463o));
        hashMap.put("rewind10StringResId", Integer.valueOf(C10770m.f49464p));
        hashMap.put("rewind30StringResId", Integer.valueOf(C10770m.f49465q));
        hashMap.put("disconnectStringResId", Integer.valueOf(C10770m.f49454e));
        f28713a = Collections.unmodifiableMap(hashMap);
    }

    @RecentlyNonNull
    @Keep
    public static Integer findResourceByName(@RecentlyNonNull String str) {
        if (str == null) {
            return null;
        }
        return f28713a.get(str);
    }
}
