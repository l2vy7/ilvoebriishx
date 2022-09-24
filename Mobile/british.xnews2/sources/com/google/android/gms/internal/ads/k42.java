package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbv;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class k42 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ nv1 f34143b;

    /* renamed from: c */
    public final /* synthetic */ Activity f34144c;

    /* renamed from: d */
    public final /* synthetic */ nw2 f34145d;

    /* renamed from: e */
    public final /* synthetic */ f42 f34146e;

    /* renamed from: f */
    public final /* synthetic */ String f34147f;

    /* renamed from: g */
    public final /* synthetic */ zzbv f34148g;

    /* renamed from: h */
    public final /* synthetic */ String f34149h;

    /* renamed from: i */
    public final /* synthetic */ Resources f34150i;

    /* renamed from: j */
    public final /* synthetic */ zzl f34151j;

    public /* synthetic */ k42(nv1 nv1, Activity activity, nw2 nw2, f42 f42, String str, zzbv zzbv, String str2, Resources resources, zzl zzl) {
        this.f34143b = nv1;
        this.f34144c = activity;
        this.f34145d = nw2;
        this.f34146e = f42;
        this.f34147f = str;
        this.f34148g = zzbv;
        this.f34149h = str2;
        this.f34150i = resources;
        this.f34151j = zzl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r0.zzf(p198d5.C10489b.m48195m6(r10), r14, r13) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            com.google.android.gms.internal.ads.nv1 r9 = r1.f34143b
            android.app.Activity r10 = r1.f34144c
            com.google.android.gms.internal.ads.nw2 r11 = r1.f34145d
            com.google.android.gms.internal.ads.f42 r12 = r1.f34146e
            java.lang.String r13 = r1.f34147f
            com.google.android.gms.ads.internal.util.zzbv r0 = r1.f34148g
            java.lang.String r14 = r1.f34149h
            android.content.res.Resources r15 = r1.f34150i
            com.google.android.gms.ads.internal.overlay.zzl r8 = r1.f34151j
            if (r9 == 0) goto L_0x0034
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r2 = "dialog_action"
            java.lang.String r3 = "confirm"
            r7.put(r2, r3)
            java.lang.String r16 = "dialog_click"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r17 = r7
            r7 = r16
            r1 = r8
            r8 = r17
            com.google.android.gms.internal.ads.n42.m35045p6(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0035
        L_0x0034:
            r1 = r8
        L_0x0035:
            d5.a r2 = p198d5.C10489b.m48195m6(r10)     // Catch:{ RemoteException -> 0x0040 }
            boolean r0 = r0.zzf(r2, r14, r13)     // Catch:{ RemoteException -> 0x0040 }
            if (r0 != 0) goto L_0x0055
            goto L_0x0046
        L_0x0040:
            r0 = move-exception
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.internal.ads.co0.zzh(r2, r0)
        L_0x0046:
            r12.mo31746e(r13)
            if (r9 == 0) goto L_0x0055
            java.lang.String r7 = "offline_notification_worker_not_scheduled"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            com.google.android.gms.internal.ads.n42.m35044o6(r2, r3, r4, r5, r6, r7)
        L_0x0055:
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.util.zzae r0 = com.google.android.gms.ads.internal.zzt.zzq()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            int r0 = r0.zzk()
            r2.<init>(r10, r0)
            if (r15 != 0) goto L_0x006a
            java.lang.String r0 = "You'll get a notification with the link when you're back online"
            goto L_0x0070
        L_0x006a:
            int r0 = com.google.android.gms.ads.impl.C7046R.string.offline_opt_in_confirmation
            java.lang.String r0 = r15.getString(r0)
        L_0x0070:
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            com.google.android.gms.internal.ads.i42 r3 = new com.google.android.gms.internal.ads.i42
            r3.<init>(r1)
            r0.setOnCancelListener(r3)
            android.app.AlertDialog r0 = r2.create()
            r0.show()
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            com.google.android.gms.internal.ads.m42 r3 = new com.google.android.gms.internal.ads.m42
            r3.<init>(r0, r2, r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.schedule(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k42.onClick(android.content.DialogInterface, int):void");
    }
}
