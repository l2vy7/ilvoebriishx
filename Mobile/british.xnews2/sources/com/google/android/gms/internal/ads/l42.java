package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class l42 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ f42 f34896b;

    /* renamed from: c */
    public final /* synthetic */ String f34897c;

    /* renamed from: d */
    public final /* synthetic */ nv1 f34898d;

    /* renamed from: e */
    public final /* synthetic */ Activity f34899e;

    /* renamed from: f */
    public final /* synthetic */ nw2 f34900f;

    /* renamed from: g */
    public final /* synthetic */ zzl f34901g;

    public /* synthetic */ l42(f42 f42, String str, nv1 nv1, Activity activity, nw2 nw2, zzl zzl) {
        this.f34896b = f42;
        this.f34897c = str;
        this.f34898d = nv1;
        this.f34899e = activity;
        this.f34900f = nw2;
        this.f34901g = zzl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        f42 f42 = this.f34896b;
        String str = this.f34897c;
        nv1 nv1 = this.f34898d;
        Activity activity = this.f34899e;
        nw2 nw2 = this.f34900f;
        zzl zzl = this.f34901g;
        f42.mo31746e(str);
        if (nv1 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            n42.m35045p6(activity, nv1, nw2, f42, str, "dialog_click", hashMap);
        }
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
