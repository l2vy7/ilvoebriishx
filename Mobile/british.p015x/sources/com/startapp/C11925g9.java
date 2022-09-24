package com.startapp;

import android.content.Context;
import android.os.Build;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;

/* renamed from: com.startapp.g9 */
/* compiled from: Sta */
public class C11925g9 extends C12403w0 {

    /* renamed from: h0 */
    public C11904f8 f52985h0;

    /* renamed from: i0 */
    public String f52986i0;

    public C11925g9(Context context) {
        super(1);
        this.f52985h0 = C12467z7.m53807a(context);
        this.f52986i0 = C12437y.m53773a(context);
    }

    /* renamed from: a */
    public void mo45384a(C11924g8 g8Var) throws SDKException {
        super.mo45384a(g8Var);
        g8Var.mo45382a(IronSourceConstants.EVENTS_PLACEMENT_NAME, (Object) "INAPP_DOWNLOAD", true, true);
        C11904f8 f8Var = this.f52985h0;
        if (f8Var != null) {
            g8Var.mo45382a("install_referrer", (Object) f8Var.f52948a.getString("install_referrer"), true, true);
            g8Var.mo45382a("referrer_click_timestamp_seconds", (Object) Long.valueOf(this.f52985h0.f52948a.getLong("referrer_click_timestamp_seconds")), true, true);
            g8Var.mo45382a("install_begin_timestamp_seconds", (Object) Long.valueOf(this.f52985h0.f52948a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        g8Var.mo45382a("apkSig", (Object) this.f52986i0, true, true);
        if (Build.VERSION.SDK_INT >= 9) {
            long j = SimpleTokenUtils.f22246c;
            if (j != 0) {
                g8Var.mo45382a("firstInstalledAppTS", (Object) Long.valueOf(j), false, true);
            }
        }
    }
}
