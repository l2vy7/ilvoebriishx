package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p229l5.C10717e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f29245a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static HashSet<Uri> f29246b = new HashSet<>();

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: b */
        private final Uri f29247b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final ArrayList<C7367d> f29248c;

        /* renamed from: d */
        final /* synthetic */ ImageManager f29249d;

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = this.f29249d;
            ImageManager.m29962i(imageManager).execute(new C7365b(imageManager, this.f29247b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Context m29954a(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ Handler m29955b(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ C10717e m29956c(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ Map m29959f(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ Map m29960g(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ Map m29961h(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: i */
    static /* bridge */ /* synthetic */ ExecutorService m29962i(ImageManager imageManager) {
        throw null;
    }
}
