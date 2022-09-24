package com.google.android.gms.cast.framework.media;

import android.net.Uri;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;

/* renamed from: com.google.android.gms.cast.framework.media.c */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C7109c {
    @RecentlyNullable
    /* renamed from: a */
    public static Uri m29363a(MediaInfo mediaInfo, int i) {
        MediaMetadata L0;
        if (mediaInfo == null || (L0 = mediaInfo.mo29227L0()) == null || L0.mo29278E0() == null || L0.mo29278E0().size() <= i) {
            return null;
        }
        return L0.mo29278E0().get(i).mo29998D0();
    }
}
