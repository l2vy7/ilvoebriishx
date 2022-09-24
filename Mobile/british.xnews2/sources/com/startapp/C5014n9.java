package com.startapp;

import android.app.Activity;
import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.C5073c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.startapp.n9 */
/* compiled from: Sta */
public class C5014n9 {

    /* renamed from: d */
    public static final C5014n9 f22141d = new C5014n9();

    /* renamed from: a */
    public String f22142a = "";

    /* renamed from: b */
    public long f22143b = 0;

    /* renamed from: c */
    public MetaDataRequest.RequestReason f22144c = MetaDataRequest.RequestReason.LAUNCH;

    /* renamed from: a */
    public String mo20677a() {
        return this.f22142a;
    }

    /* renamed from: b */
    public long mo20679b() {
        return this.f22143b;
    }

    /* renamed from: a */
    public synchronized void mo20678a(Context context, MetaDataRequest.RequestReason requestReason) {
        this.f22142a = UUID.randomUUID().toString();
        this.f22143b = System.currentTimeMillis();
        this.f22144c = requestReason;
        Map<Activity, Integer> map = C5015nb.f22145a;
        C5003d dVar = C5003d.f22119d;
        dVar.f22120a.clear();
        dVar.f22121b.clear();
        dVar.f22122c.clear();
        MetaData.f22407k.mo21185a(context, new AdPreferences(), requestReason, false, (C5073c) null, true);
    }
}
