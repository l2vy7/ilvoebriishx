package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class j42 implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ f42 f33762b;

    /* renamed from: c */
    public final /* synthetic */ String f33763c;

    /* renamed from: d */
    public final /* synthetic */ nv1 f33764d;

    /* renamed from: e */
    public final /* synthetic */ Activity f33765e;

    /* renamed from: f */
    public final /* synthetic */ nw2 f33766f;

    /* renamed from: g */
    public final /* synthetic */ zzl f33767g;

    public /* synthetic */ j42(f42 f42, String str, nv1 nv1, Activity activity, nw2 nw2, zzl zzl) {
        this.f33762b = f42;
        this.f33763c = str;
        this.f33764d = nv1;
        this.f33765e = activity;
        this.f33766f = nw2;
        this.f33767g = zzl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        f42 f42 = this.f33762b;
        String str = this.f33763c;
        nv1 nv1 = this.f33764d;
        Activity activity = this.f33765e;
        nw2 nw2 = this.f33766f;
        zzl zzl = this.f33767g;
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
