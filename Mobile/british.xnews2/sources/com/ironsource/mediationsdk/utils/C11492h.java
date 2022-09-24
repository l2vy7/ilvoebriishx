package com.ironsource.mediationsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.C11445e;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ironsource.mediationsdk.utils.h */
public final class C11492h implements Runnable {

    /* renamed from: A */
    private final String f51572A = "mcc";

    /* renamed from: B */
    private final String f51573B = "mnc";

    /* renamed from: C */
    private final String f51574C = "icc";

    /* renamed from: D */
    private final String f51575D = "tz";

    /* renamed from: E */
    private final String f51576E = "auid";

    /* renamed from: F */
    private Context f51577F;

    /* renamed from: b */
    private final String f51578b = C11492h.class.getSimpleName();

    /* renamed from: c */
    private final String f51579c = "bundleId";

    /* renamed from: d */
    private final String f51580d = "advertisingId";

    /* renamed from: e */
    private final String f51581e = "isLimitAdTrackingEnabled";

    /* renamed from: f */
    private final String f51582f = "appKey";

    /* renamed from: g */
    private final String f51583g = "deviceOS";

    /* renamed from: h */
    private final String f51584h = "osVersion";

    /* renamed from: i */
    private final String f51585i = "connectionType";

    /* renamed from: j */
    private final String f51586j = "language";

    /* renamed from: k */
    private final String f51587k = "deviceOEM";

    /* renamed from: l */
    private final String f51588l = "deviceModel";

    /* renamed from: m */
    private final String f51589m = "mobileCarrier";

    /* renamed from: n */
    private final String f51590n = "externalFreeMemory";

    /* renamed from: o */
    private final String f51591o = "internalFreeMemory";

    /* renamed from: p */
    private final String f51592p = "battery";

    /* renamed from: q */
    private final String f51593q = "gmtMinutesOffset";

    /* renamed from: r */
    private final String f51594r = "appVersion";

    /* renamed from: s */
    private final String f51595s = "sessionId";

    /* renamed from: t */
    private final String f51596t = "pluginType";

    /* renamed from: u */
    private final String f51597u = "pluginVersion";

    /* renamed from: v */
    private final String f51598v = "plugin_fw_v";

    /* renamed from: w */
    private final String f51599w = "jb";

    /* renamed from: x */
    private final String f51600x = "advertisingIdType";

    /* renamed from: y */
    private final String f51601y = "mt";

    /* renamed from: z */
    private final String f51602z = "firstSession";

    private C11492h() {
    }

    public C11492h(Context context) {
        this.f51577F = context.getApplicationContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0212  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.Object> m51276a() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSessionId()
            java.lang.String r3 = "sessionId"
            r1.put(r3, r2)
            java.lang.String r2 = r9.m51280e()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = "bundleId"
            r1.put(r3, r2)
            android.content.Context r3 = r9.f51577F
            java.lang.String r2 = com.ironsource.environment.C4961c.m22745c(r3, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = "appVersion"
            r1.put(r3, r2)
        L_0x0030:
            com.ironsource.mediationsdk.E r2 = com.ironsource.mediationsdk.C11232E.m50103a()
            java.lang.String r2 = r2.f50417j
            java.lang.String r3 = "appKey"
            r1.put(r3, r2)
            r2 = 1
            r3 = 0
            android.content.Context r4 = r9.f51577F     // Catch:{ Exception -> 0x005a }
            java.lang.String[] r4 = com.ironsource.environment.C4979h.m22787a((android.content.Context) r4)     // Catch:{ Exception -> 0x005a }
            r5 = r4[r3]     // Catch:{ Exception -> 0x005a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x005a }
            if (r5 != 0) goto L_0x004e
            r5 = r4[r3]     // Catch:{ Exception -> 0x005a }
            goto L_0x004f
        L_0x004e:
            r5 = r0
        L_0x004f:
            r4 = r4[r2]     // Catch:{ Exception -> 0x005b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x005b }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x005b }
            goto L_0x005c
        L_0x005a:
            r5 = r0
        L_0x005b:
            r4 = 0
        L_0x005c:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0065
            java.lang.String r0 = "GAID"
            goto L_0x0073
        L_0x0065:
            android.content.Context r5 = r9.f51577F
            java.lang.String r5 = com.ironsource.environment.C4979h.m22833y(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0073
            java.lang.String r0 = "UUID"
        L_0x0073:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x008c
            java.lang.String r6 = "advertisingId"
            r1.put(r6, r5)
            java.lang.String r5 = "advertisingIdType"
            r1.put(r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.String r4 = "isLimitAdTrackingEnabled"
            r1.put(r4, r0)
        L_0x008c:
            java.lang.String r0 = "deviceOS"
            java.lang.String r4 = "Android"
            r1.put(r0, r4)
            java.lang.String r0 = m51281f()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = m51281f()
            java.lang.String r4 = "osVersion"
            r1.put(r4, r0)
        L_0x00a6:
            android.content.Context r0 = r9.f51577F
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getConnectionType(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00b7
            java.lang.String r4 = "connectionType"
            r1.put(r4, r0)
        L_0x00b7:
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()
            java.lang.String r4 = "sdkVersion"
            r1.put(r4, r0)
            java.lang.String r0 = m51282g()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00cf
            java.lang.String r4 = "language"
            r1.put(r4, r0)
        L_0x00cf:
            java.lang.String r0 = m51283h()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00de
            java.lang.String r4 = "deviceOEM"
            r1.put(r4, r0)
        L_0x00de:
            java.lang.String r0 = m51284i()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00ed
            java.lang.String r4 = "deviceModel"
            r1.put(r4, r0)
        L_0x00ed:
            java.lang.String r0 = r9.m51285j()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x00fc
            java.lang.String r4 = "mobileCarrier"
            r1.put(r4, r0)
        L_0x00fc:
            long r4 = m51287l()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "internalFreeMemory"
            r1.put(r4, r0)
            boolean r0 = m51286k()
            if (r0 == 0) goto L_0x012d
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            android.os.StatFs r4 = new android.os.StatFs
            java.lang.String r0 = r0.getPath()
            r4.<init>(r0)
            int r0 = r4.getBlockSize()
            long r5 = (long) r0
            int r0 = r4.getAvailableBlocks()
            long r7 = (long) r0
            long r7 = r7 * r5
            r4 = 1048576(0x100000, double:5.180654E-318)
            long r7 = r7 / r4
            goto L_0x012f
        L_0x012d:
            r7 = -1
        L_0x012f:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.String r4 = "externalFreeMemory"
            r1.put(r4, r0)
            int r0 = r9.m51288m()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "battery"
            r1.put(r4, r0)
            int r0 = r9.m51289n()
            r4 = 840(0x348, float:1.177E-42)
            if (r0 > r4) goto L_0x0156
            r4 = -720(0xfffffffffffffd30, float:NaN)
            if (r0 < r4) goto L_0x0156
            int r4 = r0 % 15
            if (r4 != 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r2 = 0
        L_0x0157:
            if (r2 == 0) goto L_0x0162
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "gmtMinutesOffset"
            r1.put(r2, r0)
        L_0x0162:
            java.lang.String r0 = m51277b()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0171
            java.lang.String r2 = "pluginType"
            r1.put(r2, r0)
        L_0x0171:
            java.lang.String r0 = m51278c()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0180
            java.lang.String r2 = "pluginVersion"
            r1.put(r2, r0)
        L_0x0180:
            java.lang.String r0 = m51279d()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x018f
            java.lang.String r2 = "plugin_fw_v"
            r1.put(r2, r0)
        L_0x018f:
            boolean r0 = com.ironsource.environment.C4979h.m22809j()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01a2
            java.lang.String r2 = "jb"
            r1.put(r2, r0)
        L_0x01a2:
            com.ironsource.mediationsdk.E r0 = com.ironsource.mediationsdk.C11232E.m50103a()
            java.lang.String r0 = r0.f50425o
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01b3
            java.lang.String r2 = "mt"
            r1.put(r2, r0)
        L_0x01b3:
            android.content.Context r0 = r9.f51577F
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSession(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01c8
            java.lang.String r2 = "firstSession"
            r1.put(r2, r0)
        L_0x01c8:
            android.content.Context r0 = r9.f51577F
            java.lang.String r0 = com.ironsource.environment.C4979h.m22834z(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "auid"
            r1.put(r2, r0)
        L_0x01d9:
            android.content.Context r0 = r9.f51577F
            int r0 = com.ironsource.environment.C4952a.C49531.m22727c((android.content.Context) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "mcc"
            r1.put(r2, r0)
            android.content.Context r0 = r9.f51577F
            int r0 = com.ironsource.environment.C4952a.C49531.m22730d(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "mnc"
            r1.put(r2, r0)
            android.content.Context r0 = r9.f51577F
            java.lang.String r0 = com.ironsource.environment.C4979h.m22811k(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0208
            java.lang.String r2 = "icc"
            r1.put(r2, r0)
        L_0x0208:
            java.lang.String r0 = com.ironsource.environment.C4979h.m22791c()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0217
            java.lang.String r2 = "tz"
            r1.put(r2, r0)
        L_0x0217:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "collecting data for events: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.info(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C11492h.m51276a():java.util.Map");
    }

    /* renamed from: b */
    private static String m51277b() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    /* renamed from: c */
    private static String m51278c() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    /* renamed from: d */
    private static String m51279d() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    /* renamed from: e */
    private String m51280e() {
        try {
            return this.f51577F.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    private static String m51281f() {
        try {
            String str = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            return i + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    private static String m51282g() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: h */
    private static String m51283h() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    private static String m51284i() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: j */
    private String m51285j() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f51577F.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f51578b + ":getMobileCarrier()", e);
            return "";
        }
    }

    /* renamed from: k */
    private static boolean m51286k() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static long m51287l() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1048576;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: m */
    private int m51288m() {
        try {
            Intent registerReceiver = this.f51577F.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("scale", -1);
            }
            if (intExtra == -1 || i == -1) {
                return -1;
            }
            return (int) ((((float) intExtra) / ((float) i)) * 100.0f);
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f51578b + ":getBatteryLevel()", e);
            return -1;
        }
    }

    /* renamed from: n */
    private int m51289n() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round((float) (((timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15)) * 15;
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f51578b + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    public final void run() {
        try {
            C11445e.m51160a().mo44498a(m51276a());
            IronSourceUtils.m51227n(this.f51577F, C11445e.m51160a().mo44499b());
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "Thread name = " + C11492h.class.getSimpleName(), e);
        }
    }
}
