package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;

/* renamed from: com.google.android.exoplayer2.upstream.cache.c */
/* compiled from: ContentMetadata */
public final /* synthetic */ class C6995c {
    /* renamed from: a */
    public static long m28728a(ContentMetadata contentMetadata) {
        return contentMetadata.get(ContentMetadata.KEY_CONTENT_LENGTH, -1);
    }

    /* renamed from: b */
    public static Uri m28729b(ContentMetadata contentMetadata) {
        String str = contentMetadata.get(ContentMetadata.KEY_REDIRECTED_URI, (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }
}
