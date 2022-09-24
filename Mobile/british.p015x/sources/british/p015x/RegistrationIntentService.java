package british.p015x;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: british.x.RegistrationIntentService */
public class RegistrationIntentService extends IntentService {

    /* renamed from: b */
    String f6785b = "A";

    /* renamed from: c */
    long f6786c;

    public RegistrationIntentService() {
        super("RegistrationIntentService");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8066a(java.lang.String r7) {
        /*
            r6 = this;
            long r0 = r6.f6786c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
            java.lang.String r0 = ""
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = british.p015x.C1692config.f7109I5
            r0.append(r1)
            java.lang.String r1 = "/srv/guardargcmid.php?idusu="
            r0.append(r1)
            long r1 = r6.f6786c
            r0.append(r1)
            java.lang.String r1 = "&gcmid="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = "&accion="
            r0.append(r7)
            java.lang.String r7 = r6.f6785b
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00b3, all -> 0x00a9 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x00b3, all -> 0x00a9 }
            java.net.URLConnection r7 = r1.openConnection()     // Catch:{ Exception -> 0x00b3, all -> 0x00a9 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x00b3, all -> 0x00a9 }
            r0 = 1
            r7.setDoInput(r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            r1 = 10000(0x2710, float:1.4013E-41)
            r7.setConnectTimeout(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            r7.setReadTimeout(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "Android Vinebre Software"
            r7.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.io.InputStream r1 = r7.getInputStream()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            r1.<init>()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
        L_0x006c:
            java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            if (r3 == 0) goto L_0x0076
            r1.append(r3)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            goto L_0x006c
        L_0x0076:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.lang.String r2 = "ANDROID:OK"
            int r1 = r1.indexOf(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            r2 = -1
            if (r1 == r2) goto L_0x00a1
            java.lang.String r1 = r6.f6785b     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.lang.String r2 = "A"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            if (r1 == 0) goto L_0x00a1
            java.lang.String r1 = "sh"
            r2 = 0
            android.content.SharedPreferences r1 = r6.getSharedPreferences(r1, r2)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            java.lang.String r2 = "SENT_TOKEN_TO_SERVER"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r2, r0)     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
            r0.apply()     // Catch:{ Exception -> 0x00a7, all -> 0x00a5 }
        L_0x00a1:
            r7.disconnect()
            goto L_0x00b9
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ad
        L_0x00a7:
            r0 = r7
            goto L_0x00b4
        L_0x00a9:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x00ad:
            if (r7 == 0) goto L_0x00b2
            r7.disconnect()
        L_0x00b2:
            throw r0
        L_0x00b3:
        L_0x00b4:
            if (r0 == 0) goto L_0x00b9
            r0.disconnect()
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.RegistrationIntentService.m8066a(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        long j = sharedPreferences.getLong("idusu", 0);
        this.f6786c = j;
        if (j > 0) {
            try {
                m8066a(FirebaseInstanceId.m47991a().mo41857b());
            } catch (Exception unused) {
                sharedPreferences.edit().putBoolean("SENT_TOKEN_TO_SERVER", false).apply();
            }
        }
    }
}
