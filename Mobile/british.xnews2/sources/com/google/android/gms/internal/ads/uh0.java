package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class uh0 {
    @Nonnull

    /* renamed from: a */
    private final View f20919a;

    /* renamed from: b */
    private final Map<String, WeakReference<View>> f20920b;

    /* renamed from: c */
    private final wm0 f20921c;

    public uh0(th0 th0) {
        View a = th0.f20844a;
        this.f20919a = a;
        Map<String, WeakReference<View>> d = th0.f20845b;
        this.f20920b = d;
        wm0 a2 = qh0.m36474a(th0.f20844a.getContext());
        this.f20921c = a2;
        if (a2 != null && !d.isEmpty()) {
            try {
                a2.zzf(new zzcco(C10489b.m48195m6(a).asBinder(), C10489b.m48195m6(d).asBinder()));
            } catch (RemoteException unused) {
                co0.zzg("Failed to call remote method.");
            }
        }
    }

    /* renamed from: a */
    public final void mo18886a(MotionEvent motionEvent) {
        wm0 wm0 = this.f20921c;
        if (wm0 != null) {
            try {
                wm0.zzh(C10489b.m48195m6(motionEvent));
            } catch (RemoteException unused) {
                co0.zzg("Failed to call remote method.");
            }
        } else {
            co0.zze("Failed to get internal reporting info generator.");
        }
    }

    /* renamed from: b */
    public final void mo18887b(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.f20921c == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f20921c.zzi(new ArrayList(Arrays.asList(new Uri[]{uri})), C10489b.m48195m6(this.f20919a), new sh0(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    /* renamed from: c */
    public final void mo18888c(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.f20921c == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f20921c.zzj(list, C10489b.m48195m6(this.f20919a), new rh0(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
