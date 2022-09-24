package british.xnews2;

import android.app.IntentService;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class s_cargar_icos extends IntentService {

    /* renamed from: b */
    C1692config f8474b;

    /* renamed from: c */
    Bitmap f8475c;

    public s_cargar_icos() {
        super("s_cargar_icos");
    }

    /* renamed from: a */
    private void m8523a(int i, SharedPreferences.Editor editor) {
        C1692config config = this.f8474b;
        if (config != null && config.f7313c1 != null) {
            C1855l[] lVarArr = config.f7231O1;
            if (lVarArr[i] != null) {
                lVarArr[i].f7871M0 = false;
                if (config.f7427t4 == 1) {
                    config.f7261T1.get(lVarArr[i].f7966z).f7512b = BitmapFactory.decodeResource(getResources(), R.drawable.pixel500por1);
                    C1692config config2 = this.f8474b;
                    config2.f7261T1.get(config2.f7231O1[i].f7966z).f7513c = false;
                    editor.putLong("ico_cargado", System.currentTimeMillis());
                    editor.commit();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x020f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r15) {
        /*
            r14 = this;
            java.lang.String r0 = "_ico"
            java.lang.String r1 = "img_s"
            android.content.Context r2 = r14.getApplicationContext()
            british.xnews2.config r2 = (british.xnews2.C1692config) r2
            r14.f8474b = r2
            java.lang.String r2 = "sh"
            r3 = 0
            android.content.SharedPreferences r2 = r14.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r4 = r2.edit()
            java.lang.String r5 = "ind_submenu"
            r6 = -1
            int r15 = r15.getIntExtra(r5, r6)
            java.lang.String r5 = ""
            java.lang.String r7 = ","
            if (r15 <= r6) goto L_0x004d
            british.xnews2.config r8 = r14.f8474b
            british.xnews2.l[] r8 = r8.f7231O1
            r9 = r8[r15]
            int r9 = r9.f7954t
            r10 = 22
            if (r9 != r10) goto L_0x0037
            java.lang.String r8 = "seccs_ultimas"
            java.lang.String r2 = r2.getString(r8, r5)
            goto L_0x003b
        L_0x0037:
            r2 = r8[r15]
            java.lang.String r2 = r2.f7915f1
        L_0x003b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r2)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
        L_0x004d:
            british.xnews2.config r2 = r14.f8474b
            if (r2 == 0) goto L_0x0223
            british.xnews2.l[] r2 = r2.f7231O1
            if (r2 != 0) goto L_0x0057
            goto L_0x0223
        L_0x0057:
            r2 = 0
        L_0x0058:
            british.xnews2.config r8 = r14.f8474b
            british.xnews2.l[] r9 = r8.f7231O1
            int r10 = r9.length
            if (r2 >= r10) goto L_0x0099
            if (r8 == 0) goto L_0x0096
            r8 = r9[r2]
            if (r8 == 0) goto L_0x0096
            r8 = r9[r2]
            boolean r8 = r8.f7871M0
            if (r8 == 0) goto L_0x0096
            if (r15 != r6) goto L_0x0073
            r8 = r9[r2]
            boolean r8 = r8.f7848B
            if (r8 == 0) goto L_0x0099
        L_0x0073:
            if (r15 <= r6) goto L_0x0096
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            british.xnews2.config r9 = r14.f8474b
            british.xnews2.l[] r9 = r9.f7231O1
            r9 = r9[r2]
            int r9 = r9.f7964y
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r8 = r5.contains(r8)
            if (r8 == 0) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0058
        L_0x0099:
            british.xnews2.config r8 = r14.f8474b
            if (r8 == 0) goto L_0x0223
            british.xnews2.l[] r9 = r8.f7231O1
            if (r9 != 0) goto L_0x00a3
            goto L_0x0223
        L_0x00a3:
            int r10 = r9.length
            if (r2 < r10) goto L_0x00ac
            if (r15 != r6) goto L_0x0223
            r8.f7219M1 = r3
            goto L_0x0223
        L_0x00ac:
            r8 = r9[r2]
            if (r8 != 0) goto L_0x00b2
            goto L_0x0223
        L_0x00b2:
            r8 = r9[r2]
            int r8 = r8.f7875O0
            if (r8 != 0) goto L_0x00e7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = british.xnews2.C1692config.f7108H5
            r8.append(r9)
            java.lang.String r9 = "/srv/imgs/seccs/"
            r8.append(r9)
            british.xnews2.config r9 = r14.f8474b
            british.xnews2.l[] r9 = r9.f7231O1
            r9 = r9[r2]
            int r9 = r9.f7964y
            r8.append(r9)
            java.lang.String r9 = "_ico.png?v="
            r8.append(r9)
            british.xnews2.config r9 = r14.f8474b
            british.xnews2.l[] r9 = r9.f7231O1
            r9 = r9[r2]
            int r9 = r9.f7877P0
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            goto L_0x010a
        L_0x00e7:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = british.xnews2.C1692config.f7108H5
            r8.append(r9)
            java.lang.String r9 = "/android-app-creator/icos_secc/"
            r8.append(r9)
            british.xnews2.config r9 = r14.f8474b
            british.xnews2.l[] r9 = r9.f7231O1
            r9 = r9[r2]
            int r9 = r9.f7875O0
            r8.append(r9)
            java.lang.String r9 = ".png"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
        L_0x010a:
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x021e }
            r9.<init>(r8)     // Catch:{ MalformedURLException -> 0x021e }
            java.net.URLConnection r8 = r9.openConnection()     // Catch:{ IOException -> 0x0219 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ IOException -> 0x0219 }
            r9 = 1
            r8.setDoInput(r9)     // Catch:{ IOException -> 0x0219 }
            r10 = 5000(0x1388, float:7.006E-42)
            r8.setConnectTimeout(r10)     // Catch:{ IOException -> 0x0219 }
            r10 = 7000(0x1b58, float:9.809E-42)
            r8.setReadTimeout(r10)     // Catch:{ IOException -> 0x0219 }
            r8.connect()     // Catch:{ IOException -> 0x0219 }
            java.io.InputStream r8 = r8.getInputStream()     // Catch:{ IOException -> 0x0219 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ IOException -> 0x0219 }
            r14.f8475c = r8     // Catch:{ IOException -> 0x0219 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            r8.<init>()     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            r8.append(r1)     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            british.xnews2.config r10 = r14.f8474b     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            british.xnews2.l[] r10 = r10.f7231O1     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            r10 = r10[r2]     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            int r10 = r10.f7964y     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            r8.append(r10)     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            r8.append(r0)     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            java.io.FileOutputStream r8 = r14.openFileOutput(r8, r3)     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            android.graphics.Bitmap r10 = r14.f8475c     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            r12 = 100
            r10.compress(r11, r12, r8)     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            r8.close()     // Catch:{ Exception -> 0x0214, OutOfMemoryError -> 0x020f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            r8.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            r8.append(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            british.xnews2.config r10 = r14.f8474b     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            british.xnews2.l[] r10 = r10.f7231O1     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            r10 = r10[r2]     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            int r10 = r10.f7964y     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            r8.append(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            java.lang.String r10 = "_ico_g"
            r8.append(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            java.io.FileOutputStream r8 = r14.openFileOutput(r8, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            android.graphics.Bitmap r10 = r14.f8475c     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            int r11 = r10.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            int r11 = british.xnews2.C1692config.m8149E(r14, r11)     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            android.graphics.Bitmap r13 = r14.f8475c     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            int r13 = r13.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            int r13 = british.xnews2.C1692config.m8149E(r14, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r11, r13, r9)     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            r10.compress(r11, r12, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
            r8.close()     // Catch:{ Exception | OutOfMemoryError -> 0x019a }
        L_0x019a:
            british.xnews2.config r8 = r14.f8474b
            if (r8 == 0) goto L_0x0223
            java.lang.String r10 = r8.f7313c1
            if (r10 == 0) goto L_0x0223
            british.xnews2.l[] r8 = r8.f7231O1
            r10 = r8[r2]
            if (r10 == 0) goto L_0x0223
            r10 = r8[r2]
            android.graphics.Bitmap r11 = r14.f8475c
            r10.f7869L0 = r11
            r8 = r8[r2]
            r8.f7871M0 = r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "s"
            r8.append(r10)
            british.xnews2.config r10 = r14.f8474b
            british.xnews2.l[] r10 = r10.f7231O1
            r10 = r10[r2]
            int r10 = r10.f7964y
            r8.append(r10)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r4.putInt(r8, r3)
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = "ico_cargado"
            r4.putLong(r8, r10)
            british.xnews2.config r8 = r14.f8474b
            int r10 = r8.f7427t4
            if (r10 != r9) goto L_0x020a
            british.xnews2.l[] r9 = r8.f7231O1
            r10 = r9[r2]
            boolean r10 = r10.f7848B
            if (r10 != 0) goto L_0x020a
            java.util.ArrayList<british.xnews2.config$m0> r8 = r8.f7261T1
            r9 = r9[r2]
            int r9 = r9.f7966z
            java.lang.Object r8 = r8.get(r9)
            british.xnews2.config$m0 r8 = (british.xnews2.C1692config.C1719m0) r8
            android.graphics.Bitmap r9 = r14.f8475c
            r8.f7512b = r9
            british.xnews2.config r8 = r14.f8474b
            java.util.ArrayList<british.xnews2.config$m0> r9 = r8.f7261T1
            british.xnews2.l[] r8 = r8.f7231O1
            r2 = r8[r2]
            int r2 = r2.f7966z
            java.lang.Object r2 = r9.get(r2)
            british.xnews2.config$m0 r2 = (british.xnews2.C1692config.C1719m0) r2
            r2.f7513c = r3
        L_0x020a:
            r4.commit()
            goto L_0x004d
        L_0x020f:
            r14.m8523a(r2, r4)     // Catch:{ IOException -> 0x0219 }
            goto L_0x004d
        L_0x0214:
            r14.m8523a(r2, r4)     // Catch:{ IOException -> 0x0219 }
            goto L_0x004d
        L_0x0219:
            r14.m8523a(r2, r4)
            goto L_0x004d
        L_0x021e:
            r14.m8523a(r2, r4)
            goto L_0x004d
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.s_cargar_icos.onHandleIntent(android.content.Intent):void");
    }
}
