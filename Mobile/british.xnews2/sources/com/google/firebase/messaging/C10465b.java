package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0600b;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.b */
final class C10465b {

    /* renamed from: c */
    private static final AtomicInteger f48972c = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a */
    private final Context f48973a;

    /* renamed from: b */
    private Bundle f48974b;

    public C10465b(Context context) {
        this.f48973a = context.getApplicationContext();
    }

    /* renamed from: a */
    static String m48180a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* renamed from: b */
    private static void m48181b(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    /* renamed from: c */
    private final Bundle m48182c() {
        Bundle bundle;
        Bundle bundle2 = this.f48974b;
        if (bundle2 != null) {
            return bundle2;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.f48973a.getPackageManager().getApplicationInfo(this.f48973a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return Bundle.EMPTY;
        }
        this.f48974b = bundle;
        return bundle;
    }

    /* renamed from: d */
    static String m48183d(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        return m48180a(bundle, "_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    @TargetApi(26)
    /* renamed from: e */
    private final boolean m48184e(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.f48973a.getResources().getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: f */
    static Object[] m48185f(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String a = m48180a(bundle, "_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a);
            int length = jSONArray.length();
            Object[] objArr = new String[length];
            for (int i = 0; i < length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return objArr;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(str);
            String substring = ("_loc_args".length() != 0 ? valueOf2.concat("_loc_args") : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(a);
            sb.append("  Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    /* renamed from: g */
    private final String m48186g(Bundle bundle, String str) {
        String a = m48180a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String d = m48183d(bundle, str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        Resources resources = this.f48973a.getResources();
        int identifier = resources.getIdentifier(d, "string", this.f48973a.getPackageName());
        if (identifier == 0) {
            String valueOf = String.valueOf(str);
            String substring = ("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(d).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(d);
            sb.append(" Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        Object[] f = m48185f(bundle, str);
        if (f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f);
        } catch (MissingFormatArgumentException e) {
            String arrays = Arrays.toString(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(d);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("FirebaseMessaging", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: h */
    static boolean m48187h(Bundle bundle) {
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(m48180a(bundle, "gcm.n.e")) || m48180a(bundle, "gcm.n.icon") != null;
    }

    /* renamed from: i */
    static Uri m48188i(Bundle bundle) {
        String a = m48180a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = m48180a(bundle, "gcm.n.link");
        }
        if (!TextUtils.isEmpty(a)) {
            return Uri.parse(a);
        }
        return null;
    }

    /* renamed from: k */
    static String m48189k(Bundle bundle) {
        String a = m48180a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a) ? m48180a(bundle, "gcm.n.sound") : a;
    }

    /* renamed from: l */
    private final Integer m48190l(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Color ");
                sb.append(str);
                sb.append(" not valid. Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = m48182c().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0600b.m3292d(this.f48973a, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0279  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41946j(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "gcm.n.noui"
            java.lang.String r2 = m48180a(r1, r2)
            java.lang.String r3 = "1"
            boolean r2 = r3.equals(r2)
            r4 = 1
            if (r2 == 0) goto L_0x0014
            return r4
        L_0x0014:
            android.content.Context r2 = r0.f48973a
            java.lang.String r5 = "keyguard"
            java.lang.Object r2 = r2.getSystemService(r5)
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2
            boolean r2 = r2.inKeyguardRestrictedInputMode()
            r5 = 0
            if (r2 != 0) goto L_0x0060
            boolean r2 = p006a5.C6492o.m28285h()
            if (r2 != 0) goto L_0x0030
            r6 = 10
            android.os.SystemClock.sleep(r6)
        L_0x0030:
            int r2 = android.os.Process.myPid()
            android.content.Context r6 = r0.f48973a
            java.lang.String r7 = "activity"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto L_0x0060
            java.util.Iterator r6 = r6.iterator()
        L_0x0048:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0060
            java.lang.Object r7 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7
            int r8 = r7.pid
            if (r8 != r2) goto L_0x0048
            int r2 = r7.importance
            r6 = 100
            if (r2 != r6) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x0064
            return r5
        L_0x0064:
            java.lang.String r2 = "gcm.n.title"
            java.lang.String r2 = r0.m48186g(r1, r2)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0080
            android.content.Context r2 = r0.f48973a
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            android.content.Context r6 = r0.f48973a
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.CharSequence r2 = r2.loadLabel(r6)
        L_0x0080:
            java.lang.String r6 = "gcm.n.body"
            java.lang.String r6 = r0.m48186g(r1, r6)
            java.lang.String r7 = "gcm.n.icon"
            java.lang.String r7 = m48180a(r1, r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r9 = "FirebaseMessaging"
            if (r8 != 0) goto L_0x00e7
            android.content.Context r8 = r0.f48973a
            android.content.res.Resources r8 = r8.getResources()
            android.content.Context r10 = r0.f48973a
            java.lang.String r10 = r10.getPackageName()
            java.lang.String r11 = "drawable"
            int r10 = r8.getIdentifier(r7, r11, r10)
            if (r10 == 0) goto L_0x00af
            boolean r11 = r0.m48184e(r10)
            if (r11 == 0) goto L_0x00af
            goto L_0x0112
        L_0x00af:
            android.content.Context r10 = r0.f48973a
            java.lang.String r10 = r10.getPackageName()
            java.lang.String r11 = "mipmap"
            int r10 = r8.getIdentifier(r7, r11, r10)
            if (r10 == 0) goto L_0x00c4
            boolean r8 = r0.m48184e(r10)
            if (r8 == 0) goto L_0x00c4
            goto L_0x0112
        L_0x00c4:
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            int r8 = r8 + 61
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            java.lang.String r8 = "Icon resource "
            r10.append(r8)
            r10.append(r7)
            java.lang.String r7 = " not found. Notification will use default icon."
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            android.util.Log.w(r9, r7)
        L_0x00e7:
            android.os.Bundle r7 = r16.m48182c()
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_icon"
            int r7 = r7.getInt(r8, r5)
            if (r7 == 0) goto L_0x00f9
            boolean r8 = r0.m48184e(r7)
            if (r8 != 0) goto L_0x0101
        L_0x00f9:
            android.content.Context r7 = r0.f48973a
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()
            int r7 = r7.icon
        L_0x0101:
            if (r7 == 0) goto L_0x010c
            boolean r8 = r0.m48184e(r7)
            if (r8 != 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r10 = r7
            goto L_0x0112
        L_0x010c:
            r7 = 17301651(0x1080093, float:2.4979667E-38)
            r10 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0112:
            java.lang.String r7 = "gcm.n.color"
            java.lang.String r7 = m48180a(r1, r7)
            java.lang.Integer r7 = r0.m48190l(r7)
            java.lang.String r8 = m48189k(r17)
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 == 0) goto L_0x0128
            r8 = 0
            goto L_0x0180
        L_0x0128:
            java.lang.String r11 = "default"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x017b
            android.content.Context r11 = r0.f48973a
            android.content.res.Resources r11 = r11.getResources()
            android.content.Context r13 = r0.f48973a
            java.lang.String r13 = r13.getPackageName()
            java.lang.String r14 = "raw"
            int r11 = r11.getIdentifier(r8, r14, r13)
            if (r11 == 0) goto L_0x017b
            android.content.Context r11 = r0.f48973a
            java.lang.String r11 = r11.getPackageName()
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r13 = r13.length()
            int r13 = r13 + 24
            java.lang.String r14 = java.lang.String.valueOf(r8)
            int r14 = r14.length()
            int r13 = r13 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            java.lang.String r13 = "android.resource://"
            r14.append(r13)
            r14.append(r11)
            java.lang.String r11 = "/raw/"
            r14.append(r11)
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x0180
        L_0x017b:
            r8 = 2
            android.net.Uri r8 = android.media.RingtoneManager.getDefaultUri(r8)
        L_0x0180:
            java.lang.String r11 = "gcm.n.click_action"
            java.lang.String r11 = m48180a(r1, r11)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L_0x01a0
            android.content.Intent r13 = new android.content.Intent
            r13.<init>(r11)
            android.content.Context r11 = r0.f48973a
            java.lang.String r11 = r11.getPackageName()
            r13.setPackage(r11)
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            r13.setFlags(r11)
            goto L_0x01d1
        L_0x01a0:
            android.net.Uri r11 = m48188i(r17)
            if (r11 == 0) goto L_0x01ba
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r14 = "android.intent.action.VIEW"
            r13.<init>(r14)
            android.content.Context r14 = r0.f48973a
            java.lang.String r14 = r14.getPackageName()
            r13.setPackage(r14)
            r13.setData(r11)
            goto L_0x01d1
        L_0x01ba:
            android.content.Context r11 = r0.f48973a
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            android.content.Context r13 = r0.f48973a
            java.lang.String r13 = r13.getPackageName()
            android.content.Intent r13 = r11.getLaunchIntentForPackage(r13)
            if (r13 != 0) goto L_0x01d1
            java.lang.String r11 = "No activity found to launch app"
            android.util.Log.w(r9, r11)
        L_0x01d1:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r13 != 0) goto L_0x01d7
            r12 = 0
            goto L_0x021b
        L_0x01d7:
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            r13.addFlags(r14)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r1)
            com.google.firebase.messaging.FirebaseMessagingService.m48170k(r14)
            r13.putExtras(r14)
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x01ef:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x020f
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r12 = "gcm.n."
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x020b
            java.lang.String r12 = "gcm.notification."
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x01ef
        L_0x020b:
            r13.removeExtra(r15)
            goto L_0x01ef
        L_0x020f:
            android.content.Context r12 = r0.f48973a
            java.util.concurrent.atomic.AtomicInteger r14 = f48972c
            int r14 = r14.incrementAndGet()
            android.app.PendingIntent r12 = android.app.PendingIntent.getActivity(r12, r14, r13, r11)
        L_0x021b:
            if (r1 != 0) goto L_0x021f
            r3 = 0
            goto L_0x0229
        L_0x021f:
            java.lang.String r13 = "google.c.a.e"
            java.lang.String r13 = r1.getString(r13)
            boolean r3 = r3.equals(r13)
        L_0x0229:
            if (r3 == 0) goto L_0x025b
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r13 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r3.<init>(r13)
            m48181b(r3, r1)
            java.lang.String r13 = "pending_intent"
            r3.putExtra(r13, r12)
            android.content.Context r12 = r0.f48973a
            java.util.concurrent.atomic.AtomicInteger r13 = f48972c
            int r14 = r13.incrementAndGet()
            android.app.PendingIntent r12 = com.google.firebase.iid.C10434i.m48057a(r12, r14, r3, r11)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r14 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r3.<init>(r14)
            m48181b(r3, r1)
            android.content.Context r14 = r0.f48973a
            int r13 = r13.incrementAndGet()
            android.app.PendingIntent r3 = com.google.firebase.iid.C10434i.m48057a(r14, r13, r3, r11)
            goto L_0x025c
        L_0x025b:
            r3 = 0
        L_0x025c:
            java.lang.String r11 = "gcm.n.android_channel_id"
            java.lang.String r11 = m48180a(r1, r11)
            boolean r13 = p006a5.C6492o.m28288k()
            r14 = 3
            java.lang.String r15 = "fcm_fallback_notification_channel"
            if (r13 == 0) goto L_0x02ee
            android.content.Context r13 = r0.f48973a
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo()
            int r13 = r13.targetSdkVersion
            r5 = 26
            if (r13 >= r5) goto L_0x0279
            goto L_0x02ee
        L_0x0279:
            android.content.Context r5 = r0.f48973a
            java.lang.Class<android.app.NotificationManager> r13 = android.app.NotificationManager.class
            java.lang.Object r5 = r5.getSystemService(r13)
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L_0x02b4
            android.app.NotificationChannel r13 = r5.getNotificationChannel(r11)
            if (r13 == 0) goto L_0x0291
            r15 = r11
            goto L_0x02ef
        L_0x0291:
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r13 = r13.length()
            int r13 = r13 + 122
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r13)
            java.lang.String r13 = "Notification Channel requested ("
            r4.append(r13)
            r4.append(r11)
            java.lang.String r11 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r9, r4)
        L_0x02b4:
            android.os.Bundle r4 = r16.m48182c()
            java.lang.String r11 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r4 = r4.getString(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L_0x02d2
            android.app.NotificationChannel r11 = r5.getNotificationChannel(r4)
            if (r11 == 0) goto L_0x02cc
            r15 = r4
            goto L_0x02ef
        L_0x02cc:
            java.lang.String r4 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r9, r4)
            goto L_0x02d7
        L_0x02d2:
            java.lang.String r4 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r9, r4)
        L_0x02d7:
            android.app.NotificationChannel r4 = r5.getNotificationChannel(r15)
            if (r4 != 0) goto L_0x02ef
            android.app.NotificationChannel r4 = new android.app.NotificationChannel
            android.content.Context r11 = r0.f48973a
            int r13 = p240o7.C10861c.f49644a
            java.lang.String r11 = r11.getString(r13)
            r4.<init>(r15, r11, r14)
            r5.createNotificationChannel(r4)
            goto L_0x02ef
        L_0x02ee:
            r15 = 0
        L_0x02ef:
            a0.i$e r4 = new a0.i$e
            android.content.Context r5 = r0.f48973a
            r4.<init>(r5)
            r5 = 1
            a0.i$e r4 = r4.mo78j(r5)
            a0.i$e r4 = r4.mo63B(r10)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x0308
            r4.mo85q(r2)
        L_0x0308:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x031d
            r4.mo84p(r6)
            a0.i$c r2 = new a0.i$c
            r2.<init>()
            a0.i$c r2 = r2.mo61m(r6)
            r4.mo65D(r2)
        L_0x031d:
            if (r7 == 0) goto L_0x0326
            int r2 = r7.intValue()
            r4.mo81m(r2)
        L_0x0326:
            if (r8 == 0) goto L_0x032b
            r4.mo64C(r8)
        L_0x032b:
            if (r12 == 0) goto L_0x0330
            r4.mo83o(r12)
        L_0x0330:
            if (r3 == 0) goto L_0x0335
            r4.mo87s(r3)
        L_0x0335:
            if (r15 == 0) goto L_0x033a
            r4.mo80l(r15)
        L_0x033a:
            android.app.Notification r2 = r4.mo73c()
            java.lang.String r3 = "gcm.n.tag"
            java.lang.String r1 = m48180a(r1, r3)
            boolean r3 = android.util.Log.isLoggable(r9, r14)
            if (r3 == 0) goto L_0x034f
            java.lang.String r3 = "Showing notification"
            android.util.Log.d(r9, r3)
        L_0x034f:
            android.content.Context r3 = r0.f48973a
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0376
            long r4 = android.os.SystemClock.uptimeMillis()
            r1 = 37
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            java.lang.String r1 = "FCM-Notification:"
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = r6.toString()
        L_0x0376:
            r4 = 0
            r3.notify(r1, r4, r2)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C10465b.mo41946j(android.os.Bundle):boolean");
    }
}
