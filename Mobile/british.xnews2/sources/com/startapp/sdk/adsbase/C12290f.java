package com.startapp.sdk.adsbase;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.C11925g9;
import com.startapp.C11963i7;
import com.startapp.C12359u3;
import com.startapp.C12442y2;
import com.startapp.C5004d4;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.sdk.adsbase.f */
/* compiled from: Sta */
public class C12290f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f54590a;

    /* renamed from: b */
    public final /* synthetic */ ComponentLocator f54591b;

    /* renamed from: c */
    public final /* synthetic */ C5069e f54592c;

    public C12290f(StartAppSDKInternal startAppSDKInternal, Context context, ComponentLocator componentLocator, C5069e eVar) {
        this.f54590a = context;
        this.f54591b = componentLocator;
        this.f54592c = eVar;
    }

    public void run() {
        Boolean bool;
        C11963i7.C11964a aVar;
        try {
            C11925g9 g9Var = new C11925g9(this.f54590a);
            g9Var.mo46692a(this.f54590a, new AdPreferences());
            C12359u3 k = this.f54591b.mo21224k();
            StringBuilder sb = new StringBuilder();
            MetaData metaData = MetaData.f22407k;
            String str = metaData.trackDownloadHost;
            if (str == null) {
                str = metaData.mo21189c();
            }
            sb.append(str);
            sb.append(AdsConstants.f54492c);
            String sb2 = sb.toString();
            k.getClass();
            bool = null;
            aVar = k.mo46647a(sb2, g9Var, (C12442y2<String, Void>) null);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
            return;
        }
        if (aVar != null) {
            String str2 = aVar.f53099a;
            if (!TextUtils.isEmpty(str2)) {
                String a = C5015nb.m22910a(str2, "@ct@", "@ct@");
                String a2 = C5015nb.m22910a(str2, "@tsc@", "@tsc@");
                String a3 = C5015nb.m22910a(str2, "@apc@", "@apc@");
                try {
                    Integer valueOf = !TextUtils.isEmpty(a) ? Integer.valueOf(Integer.parseInt(a)) : null;
                    Long valueOf2 = !TextUtils.isEmpty(a2) ? Long.valueOf(Long.parseLong(a2)) : null;
                    if (!TextUtils.isEmpty(a3)) {
                        bool = Boolean.valueOf(Boolean.parseBoolean(a3));
                    }
                    Boolean bool2 = bool;
                    if (!(valueOf == null && valueOf2 == null && bool2 == null)) {
                        this.f54591b.mo21219f().mo20652a(valueOf, valueOf2, bool2, false, true);
                    }
                } catch (Throwable th2) {
                    C5004d4.m22887a(th2);
                }
            }
        }
        C5069e.C5070a a4 = this.f54592c.edit();
        a4.mo21101a("shared_prefs_first_init", Boolean.FALSE);
        a4.f22385a.putBoolean("shared_prefs_first_init", false);
        a4.apply();
    }
}
