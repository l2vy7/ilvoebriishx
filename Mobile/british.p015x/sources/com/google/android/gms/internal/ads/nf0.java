package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C7046R;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nf0 extends vf0 {

    /* renamed from: c */
    private final Map<String, String> f35997c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f35998d;

    /* renamed from: e */
    private final String f35999e = m35144l("description");

    /* renamed from: f */
    private final long f36000f = m35143k("start_ticks");

    /* renamed from: g */
    private final long f36001g = m35143k("end_ticks");

    /* renamed from: h */
    private final String f36002h = m35144l("summary");

    /* renamed from: i */
    private final String f36003i = m35144l("location");

    public nf0(xt0 xt0, Map<String, String> map) {
        super(xt0, "createCalendarEvent");
        this.f35997c = map;
        this.f35998d = xt0.zzk();
    }

    /* renamed from: k */
    private final long m35143k(String str) {
        String str2 = this.f35997c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: l */
    private final String m35144l(String str) {
        return TextUtils.isEmpty(this.f35997c.get(str)) ? "" : this.f35997c.get(str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: i */
    public final Intent mo33689i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f35999e);
        data.putExtra("eventLocation", this.f36003i);
        data.putExtra("description", this.f36002h);
        long j = this.f36000f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f36001g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: j */
    public final void mo33690j() {
        if (this.f35998d == null) {
            mo35419c("Activity context is not available.");
            return;
        }
        zzt.zzp();
        if (!new C8387yz(this.f35998d).mo35982b()) {
            mo35419c("This feature is not available on the device.");
            return;
        }
        zzt.zzp();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f35998d);
        Resources d = zzt.zzo().mo18580d();
        builder.setTitle(d != null ? d.getString(C7046R.string.f27784s5) : "Create calendar event");
        builder.setMessage(d != null ? d.getString(C7046R.string.f27785s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(d != null ? d.getString(C7046R.string.f27782s3) : RtspHeaders.ACCEPT, new lf0(this));
        builder.setNegativeButton(d != null ? d.getString(C7046R.string.f27783s4) : "Decline", new mf0(this));
        builder.create().show();
    }
}
