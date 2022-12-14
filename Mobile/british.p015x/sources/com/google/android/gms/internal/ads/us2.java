package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.zzbc;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class us2 {
    /* renamed from: a */
    public static zzbew m38443a(Throwable th) {
        if (th instanceof v42) {
            v42 v42 = (v42) th;
            return m38445c(v42.mo35689a(), v42.mo35367b());
        } else if (th instanceof wy1) {
            if (th.getMessage() == null) {
                return m38446d(((wy1) th).mo35689a(), (String) null, (zzbew) null);
            }
            return m38446d(((wy1) th).mo35689a(), th.getMessage(), (zzbew) null);
        } else if (!(th instanceof zzbc)) {
            return m38446d(1, (String) null, (zzbew) null);
        } else {
            zzbc zzbc = (zzbc) th;
            return new zzbew(zzbc.zza(), m43.m20696c(zzbc.getMessage()), MobileAds.ERROR_DOMAIN, (zzbew) null, (IBinder) null);
        }
    }

    /* renamed from: b */
    public static zzbew m38444b(Throwable th, w42 w42) {
        zzbew zzbew;
        zzbew a = m38443a(th);
        int i = a.f42935b;
        if ((i == 3 || i == 0) && (zzbew = a.f42938e) != null && !zzbew.f42937d.equals(MobileAds.ERROR_DOMAIN)) {
            a.f42938e = null;
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37082e6)).booleanValue() && w42 != null) {
            a.f42939f = w42.mo35552a();
        }
        return a;
    }

    /* renamed from: c */
    public static zzbew m38445c(int i, zzbew zzbew) {
        if (i != 0) {
            if (i == 8) {
                if (((Integer) C8311wv.m39277c().mo18570b(p00.f37055b6)).intValue() > 0) {
                    return zzbew;
                }
                i = 8;
            }
            return m38446d(i, (String) null, zzbew);
        }
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r4 = "No fill.";
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzbew m38446d(int r8, java.lang.String r9, com.google.android.gms.internal.ads.zzbew r10) {
        /*
            java.lang.String r0 = "No fill."
            r1 = 0
            if (r9 != 0) goto L_0x0054
            int r9 = r8 + -1
            if (r8 == 0) goto L_0x0053
            switch(r9) {
                case 1: goto L_0x0050;
                case 2: goto L_0x004e;
                case 3: goto L_0x004b;
                case 4: goto L_0x0048;
                case 5: goto L_0x0045;
                case 6: goto L_0x0042;
                case 7: goto L_0x003f;
                case 8: goto L_0x003c;
                case 9: goto L_0x0039;
                case 10: goto L_0x0036;
                case 11: goto L_0x000c;
                case 12: goto L_0x0021;
                case 13: goto L_0x001e;
                case 14: goto L_0x001b;
                case 15: goto L_0x0018;
                case 16: goto L_0x0015;
                case 17: goto L_0x0012;
                case 18: goto L_0x000f;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.String r9 = "Internal error."
            goto L_0x0054
        L_0x000f:
            java.lang.String r9 = "Ad inspector cannot be opened because it is already open."
            goto L_0x0054
        L_0x0012:
            java.lang.String r9 = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information."
            goto L_0x0054
        L_0x0015:
            java.lang.String r9 = "Ad inspector failed to load."
            goto L_0x0054
        L_0x0018:
            java.lang.String r9 = "Ad inspector had an internal error."
            goto L_0x0054
        L_0x001b:
            java.lang.String r9 = "Invalid ad string."
            goto L_0x0054
        L_0x001e:
            java.lang.String r9 = "Mismatch request IDs."
            goto L_0x0054
        L_0x0021:
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r9 = com.google.android.gms.internal.ads.p00.f37091f6
            com.google.android.gms.internal.ads.n00 r2 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r9 = r2.mo18570b(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 > 0) goto L_0x004e
            java.lang.String r9 = "The mediation adapter did not return an ad."
            goto L_0x0054
        L_0x0036:
            java.lang.String r9 = "The ad can not be shown when app is not in foreground."
            goto L_0x0054
        L_0x0039:
            java.lang.String r9 = "The ad has already been shown."
            goto L_0x0054
        L_0x003c:
            java.lang.String r9 = "The ad is not ready."
            goto L_0x0054
        L_0x003f:
            java.lang.String r9 = "A mediation adapter failed to show the ad."
            goto L_0x0054
        L_0x0042:
            java.lang.String r9 = "Invalid request: Invalid ad size."
            goto L_0x0054
        L_0x0045:
            java.lang.String r9 = "Invalid request: Invalid ad unit ID."
            goto L_0x0054
        L_0x0048:
            java.lang.String r9 = "Network error."
            goto L_0x0054
        L_0x004b:
            java.lang.String r9 = "App ID missing."
            goto L_0x0054
        L_0x004e:
            r4 = r0
            goto L_0x0055
        L_0x0050:
            java.lang.String r9 = "Invalid request."
            goto L_0x0054
        L_0x0053:
            throw r1
        L_0x0054:
            r4 = r9
        L_0x0055:
            int r9 = r8 + -1
            com.google.android.gms.internal.ads.zzbew r0 = new com.google.android.gms.internal.ads.zzbew
            if (r8 == 0) goto L_0x00e1
            r1 = 2
            r2 = 1
            r3 = 0
            r5 = 3
            switch(r9) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0098;
                case 2: goto L_0x0096;
                case 3: goto L_0x0091;
                case 4: goto L_0x008f;
                case 5: goto L_0x0098;
                case 6: goto L_0x0098;
                case 7: goto L_0x008c;
                case 8: goto L_0x008f;
                case 9: goto L_0x0098;
                case 10: goto L_0x0096;
                case 11: goto L_0x0099;
                case 12: goto L_0x0075;
                case 13: goto L_0x0070;
                case 14: goto L_0x006b;
                case 15: goto L_0x0099;
                case 16: goto L_0x0098;
                case 17: goto L_0x008f;
                case 18: goto L_0x0096;
                default: goto L_0x0062;
            }
        L_0x0062:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            switch(r8) {
                case 1: goto L_0x00d5;
                case 2: goto L_0x00d2;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00c9;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c3;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00ba;
                case 11: goto L_0x00b7;
                case 12: goto L_0x00b4;
                case 13: goto L_0x00b1;
                case 14: goto L_0x00ae;
                case 15: goto L_0x00ab;
                case 16: goto L_0x00a8;
                case 17: goto L_0x00a5;
                case 18: goto L_0x00a2;
                default: goto L_0x0067;
            }
        L_0x0067:
            java.lang.String r8 = "AD_INSPECTOR_ALREADY_OPEN"
            goto L_0x00d7
        L_0x006b:
            r8 = 11
            r3 = 11
            goto L_0x0099
        L_0x0070:
            r8 = 10
            r3 = 10
            goto L_0x0099
        L_0x0075:
            com.google.android.gms.internal.ads.h00<java.lang.Integer> r8 = com.google.android.gms.internal.ads.p00.f37091f6
            com.google.android.gms.internal.ads.n00 r9 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r8 = r9.mo18570b(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 > 0) goto L_0x0096
            r8 = 9
            r3 = 9
            goto L_0x0099
        L_0x008c:
            r8 = 4
            r3 = 4
            goto L_0x0099
        L_0x008f:
            r3 = 2
            goto L_0x0099
        L_0x0091:
            r8 = 8
            r3 = 8
            goto L_0x0099
        L_0x0096:
            r3 = 3
            goto L_0x0099
        L_0x0098:
            r3 = 1
        L_0x0099:
            r7 = 0
            java.lang.String r5 = "com.google.android.gms.ads"
            r2 = r0
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x00a2:
            java.lang.String r8 = "AD_INSPECTOR_NOT_IN_TEST_MODE"
            goto L_0x00d7
        L_0x00a5:
            java.lang.String r8 = "AD_INSPECTOR_FAILED_TO_LOAD"
            goto L_0x00d7
        L_0x00a8:
            java.lang.String r8 = "AD_INSPECTOR_INTERNAL_ERROR"
            goto L_0x00d7
        L_0x00ab:
            java.lang.String r8 = "INVALID_AD_STRING"
            goto L_0x00d7
        L_0x00ae:
            java.lang.String r8 = "REQUEST_ID_MISMATCH"
            goto L_0x00d7
        L_0x00b1:
            java.lang.String r8 = "MEDIATION_NO_FILL"
            goto L_0x00d7
        L_0x00b4:
            java.lang.String r8 = "INTERNAL_SHOW_ERROR"
            goto L_0x00d7
        L_0x00b7:
            java.lang.String r8 = "APP_NOT_FOREGROUND"
            goto L_0x00d7
        L_0x00ba:
            java.lang.String r8 = "AD_REUSED"
            goto L_0x00d7
        L_0x00bd:
            java.lang.String r8 = "NOT_READY"
            goto L_0x00d7
        L_0x00c0:
            java.lang.String r8 = "MEDIATION_SHOW_ERROR"
            goto L_0x00d7
        L_0x00c3:
            java.lang.String r8 = "INVALID_AD_SIZE"
            goto L_0x00d7
        L_0x00c6:
            java.lang.String r8 = "INVALID_AD_UNIT_ID"
            goto L_0x00d7
        L_0x00c9:
            java.lang.String r8 = "NETWORK_ERROR"
            goto L_0x00d7
        L_0x00cc:
            java.lang.String r8 = "APP_ID_MISSING"
            goto L_0x00d7
        L_0x00cf:
            java.lang.String r8 = "NO_FILL"
            goto L_0x00d7
        L_0x00d2:
            java.lang.String r8 = "INVALID_REQUEST"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r8 = "INTERNAL_ERROR"
        L_0x00d7:
            java.lang.String r10 = "Unknown SdkError: "
            java.lang.String r8 = r10.concat(r8)
            r9.<init>(r8)
            throw r9
        L_0x00e1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.us2.m38446d(int, java.lang.String, com.google.android.gms.internal.ads.zzbew):com.google.android.gms.internal.ads.zzbew");
    }
}
