package com.google.android.gms.cast.framework.media;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;

/* renamed from: com.google.android.gms.cast.framework.media.a */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C7102a {

    /* renamed from: a */
    private final C7130m0 f28667a = new C7140r0(this, (C7138q0) null);

    @Deprecated
    @RecentlyNullable
    /* renamed from: a */
    public WebImage mo29524a(@RecentlyNonNull MediaMetadata mediaMetadata, int i) {
        if (mediaMetadata == null || !mediaMetadata.mo29282I0()) {
            return null;
        }
        return mediaMetadata.mo29278E0().get(0);
    }

    @RecentlyNullable
    /* renamed from: b */
    public WebImage mo29525b(@RecentlyNonNull MediaMetadata mediaMetadata, @RecentlyNonNull ImageHints imageHints) {
        return mo29524a(mediaMetadata, imageHints.mo29468D0());
    }

    /* renamed from: c */
    public final C7130m0 mo29526c() {
        return this.f28667a;
    }
}
