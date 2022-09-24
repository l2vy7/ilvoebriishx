package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.C7046R;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0026i;
import p006a5.C6492o;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n42 extends lg0 {

    /* renamed from: b */
    private final Context f35898b;

    /* renamed from: c */
    private final nv1 f35899c;

    /* renamed from: d */
    private final io0 f35900d;

    /* renamed from: e */
    private final f42 f35901e;

    /* renamed from: f */
    private final nw2 f35902f;

    public n42(Context context, f42 f42, io0 io0, nv1 nv1, nw2 nw2) {
        this.f35898b = context;
        this.f35899c = nv1;
        this.f35900d = io0;
        this.f35901e = f42;
        this.f35902f = nw2;
    }

    /* renamed from: o6 */
    public static void m35044o6(Context context, nv1 nv1, nw2 nw2, f42 f42, String str, String str2) {
        m35045p6(context, nv1, nw2, f42, str, str2, new HashMap());
    }

    /* renamed from: p6 */
    public static void m35045p6(Context context, nv1 nv1, nw2 nw2, f42 f42, String str, String str2, Map<String, String> map) {
        String str3;
        String str4 = "offline";
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue()) {
            mw2 b = mw2.m34936b(str2);
            b.mo33603a("gqi", str);
            zzt.zzp();
            if (true == com.google.android.gms.ads.internal.util.zzt.zzJ(context)) {
                str4 = "online";
            }
            b.mo33603a("device_connectivity", str4);
            b.mo33603a("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            for (Map.Entry next : map.entrySet()) {
                b.mo33603a((String) next.getKey(), (String) next.getValue());
            }
            str3 = nw2.mo31049b(b);
        } else {
            mv1 a = nv1.mo33772a();
            a.mo33597b("gqi", str);
            a.mo33597b("action", str2);
            zzt.zzp();
            if (true == com.google.android.gms.ads.internal.util.zzt.zzJ(context)) {
                str4 = "online";
            }
            a.mo33597b("device_connectivity", str4);
            a.mo33597b("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            for (Map.Entry next2 : map.entrySet()) {
                a.mo33597b((String) next2.getKey(), (String) next2.getValue());
            }
            str3 = a.mo33600e();
        }
        f42.mo31747f(new h42(zzt.zzA().currentTimeMillis(), str, str3, 2));
    }

    /* renamed from: q6 */
    public static void m35046q6(Activity activity, zzl zzl, zzbv zzbv, f42 f42, nv1 nv1, nw2 nw2, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        zzt.zzp();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, zzt.zzq().zzk());
        Resources d = zzt.zzo().mo18580d();
        if (d == null) {
            str3 = "Open ad when you're back online.";
        } else {
            str3 = d.getString(C7046R.string.offline_opt_in_title);
        }
        AlertDialog.Builder title = builder.setTitle(str3);
        if (d == null) {
            str4 = "We'll send you a notification with a link to the advertiser site.";
        } else {
            str4 = d.getString(C7046R.string.offline_opt_in_message);
        }
        AlertDialog.Builder message = title.setMessage(str4);
        if (d == null) {
            str5 = "OK";
        } else {
            str5 = d.getString(C7046R.string.offline_opt_in_confirm);
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton(str5, new k42(nv1, activity, nw2, f42, str, zzbv, str2, d, zzl));
        if (d == null) {
            str6 = "No thanks";
        } else {
            str6 = d.getString(C7046R.string.offline_opt_in_decline);
        }
        f42 f422 = f42;
        String str7 = str;
        nv1 nv12 = nv1;
        Activity activity2 = activity;
        nw2 nw22 = nw2;
        zzl zzl2 = zzl;
        positiveButton.setNegativeButton(str6, new l42(f422, str7, nv12, activity2, nw22, zzl2)).setOnCancelListener(new j42(f422, str7, nv12, activity2, nw22, zzl2));
        builder.create().show();
    }

    /* renamed from: r6 */
    private final void m35047r6(String str, String str2, Map<String, String> map) {
        m35045p6(this.f35898b, this.f35899c, this.f35902f, this.f35901e, str, str2, map);
    }

    /* renamed from: i0 */
    public final void mo33079i0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            zzt.zzp();
            boolean zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.f35898b);
            HashMap hashMap = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == zzJ) {
                    c = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f35898b;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            m35047r6(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f35901e.getWritableDatabase();
                if (c == 1) {
                    this.f35901e.mo31749j(writableDatabase, this.f35900d, stringExtra2);
                } else {
                    f42.m32035l(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                co0.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    /* renamed from: l0 */
    public final void mo33080l0(C10487a aVar, String str, String str2) {
        String str3;
        String str4;
        Context context = (Context) C10489b.m48194f3(aVar);
        zzt.zzp();
        if (C6492o.m28288k()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i = f33.f20322a;
        PendingIntent a = f33.m20442a(context, 0, intent, i | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a2 = f33.m20442a(context, 0, intent2, i | 1073741824, 0);
        Resources d = zzt.zzo().mo18580d();
        C0026i.C0034e eVar = new C0026i.C0034e(context, "offline_notification_channel");
        if (d == null) {
            str3 = "View the ad you saved when you were offline";
        } else {
            str3 = d.getString(C7046R.string.offline_notification_title);
        }
        C0026i.C0034e q = eVar.mo85q(str3);
        if (d == null) {
            str4 = "Tap to open ad";
        } else {
            str4 = d.getString(C7046R.string.offline_notification_text);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, q.mo84p(str4).mo78j(true).mo87s(a2).mo83o(a).mo63B(context.getApplicationInfo().icon).mo73c());
        m35047r6(str2, "offline_notification_impression", new HashMap());
    }

    public final void zzf() {
        this.f35901e.mo31748g(new y32(this.f35900d));
    }
}
