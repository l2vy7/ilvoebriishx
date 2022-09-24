package com.startapp.sdk.ads.video;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.startapp.C11944hc;
import com.startapp.C12437y;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.components.ComponentLocator;
import java.io.File;
import java.util.Map;

/* compiled from: Sta */
public class VideoUtil {

    /* compiled from: Sta */
    public enum VideoEligibility {
        ELIGIBLE(""),
        INELIGIBLE_NO_STORAGE("Not enough storage for video"),
        INELIGIBLE_MISSING_ACTIVITY("OverlayActivity not declared in AndroidManifest.xml"),
        INELIGIBLE_ERRORS_THRESHOLD_REACHED("Video errors threshold reached.");
        
        private String desctiption;

        /* access modifiers changed from: public */
        VideoEligibility(String str) {
            this.desctiption = str;
        }

        /* renamed from: a */
        public String mo46027a() {
            return this.desctiption;
        }
    }

    /* renamed from: a */
    public static void m53052a(Context context, C11944hc hcVar) {
        if (hcVar != null) {
            for (String b : hcVar.f53044a) {
                C5055a.m23162b(context, b);
            }
        }
    }

    /* renamed from: b */
    public static void m53053b(Context context) {
        C5069e d = ComponentLocator.m23305a(context).mo21217d();
        int i = d.getInt("videoErrorsCount", 0);
        C5069e.C5070a a = d.edit();
        int i2 = i + 1;
        a.mo21101a("videoErrorsCount", Integer.valueOf(i2));
        a.f22385a.putInt("videoErrorsCount", i2);
        a.apply();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0075 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m53051a(android.content.Context r9, java.net.URL r10, java.lang.String r11) {
        /*
            java.lang.String r0 = ".temp"
            r1 = 0
            java.lang.String r2 = m53050a((android.content.Context) r9, (java.lang.String) r11)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            if (r4 != 0) goto L_0x006c
            java.io.InputStream r10 = r10.openStream()     // Catch:{ Exception -> 0x0072, all -> 0x006e }
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0073, all -> 0x0068 }
            r4.<init>(r10)     // Catch:{ Exception -> 0x0073, all -> 0x0068 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r6.<init>()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r6.append(r11)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r6.append(r0)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
            r7 = 0
            java.io.FileOutputStream r6 = r9.openFileOutput(r6, r7)     // Catch:{ Exception -> 0x0066, all -> 0x0064 }
        L_0x0033:
            int r8 = r4.read(r5)     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            if (r8 <= 0) goto L_0x003d
            r6.write(r5, r7, r8)     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            goto L_0x0033
        L_0x003d:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            r7.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            r7.append(r11)     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            r7.append(r0)     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            java.lang.String r7 = m53050a((android.content.Context) r9, (java.lang.String) r7)     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            r5.renameTo(r3)     // Catch:{ Exception -> 0x0075, all -> 0x0062 }
            r10.close()     // Catch:{ Exception -> 0x0060 }
            r4.close()     // Catch:{ Exception -> 0x0060 }
            r1 = r2
            goto L_0x0096
        L_0x0060:
            r1 = r2
            goto L_0x0099
        L_0x0062:
            r9 = move-exception
            goto L_0x009d
        L_0x0064:
            r9 = move-exception
            goto L_0x009e
        L_0x0066:
            r6 = r1
            goto L_0x0075
        L_0x0068:
            r9 = move-exception
            r4 = r1
            r6 = r4
            goto L_0x009b
        L_0x006c:
            throw r1     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            return r2
        L_0x006e:
            r9 = move-exception
            r4 = r1
            r6 = r4
            goto L_0x009c
        L_0x0072:
            r10 = r1
        L_0x0073:
            r4 = r1
            r6 = r4
        L_0x0075:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r3.<init>()     // Catch:{ all -> 0x009a }
            r3.append(r11)     // Catch:{ all -> 0x009a }
            r3.append(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x009a }
            java.lang.String r9 = m53050a((android.content.Context) r9, (java.lang.String) r11)     // Catch:{ all -> 0x009a }
            r2.<init>(r9)     // Catch:{ all -> 0x009a }
            r2.delete()     // Catch:{ all -> 0x009a }
            r10.close()     // Catch:{ Exception -> 0x0099 }
            r4.close()     // Catch:{ Exception -> 0x0099 }
        L_0x0096:
            r6.close()     // Catch:{ Exception -> 0x0099 }
        L_0x0099:
            return r1
        L_0x009a:
            r9 = move-exception
        L_0x009b:
            r1 = r10
        L_0x009c:
            r10 = r1
        L_0x009d:
            r1 = r6
        L_0x009e:
            r10.close()     // Catch:{ Exception -> 0x00a7 }
            r4.close()     // Catch:{ Exception -> 0x00a7 }
            r1.close()     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            goto L_0x00a9
        L_0x00a8:
            throw r9
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.VideoUtil.m53051a(android.content.Context, java.net.URL, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static VideoEligibility m53049a(Context context) {
        VideoEligibility videoEligibility = VideoEligibility.ELIGIBLE;
        boolean z = true;
        if (AdsCommonMetaData.f22242h.mo20877G().mo21008o() >= 0 && ComponentLocator.m23305a(context).mo21217d().getInt("videoErrorsCount", 0) >= AdsCommonMetaData.f22242h.mo20877G().mo21008o()) {
            videoEligibility = VideoEligibility.INELIGIBLE_ERRORS_THRESHOLD_REACHED;
        }
        if (!C5015nb.m22920a(context, (Class<? extends Activity>) OverlayActivity.class)) {
            videoEligibility = VideoEligibility.INELIGIBLE_MISSING_ACTIVITY;
        }
        File filesDir = context.getFilesDir();
        long j = -1;
        Map<Activity, Integer> map = C5015nb.f22145a;
        int i = C12437y.f55146a;
        if (filesDir != null) {
            try {
                if (filesDir.isDirectory()) {
                    if (Build.VERSION.SDK_INT >= 9) {
                        j = filesDir.getFreeSpace();
                    } else {
                        StatFs statFs = new StatFs(filesDir.getPath());
                        j = ((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (j < 0 || j / 1024 <= AdsCommonMetaData.f22242h.mo20877G().mo20998f() * 1024) {
            z = false;
        }
        return !z ? VideoEligibility.INELIGIBLE_NO_STORAGE : videoEligibility;
    }

    /* renamed from: a */
    public static String m53050a(Context context, String str) {
        return context.getFilesDir() + "/" + str;
    }
}
