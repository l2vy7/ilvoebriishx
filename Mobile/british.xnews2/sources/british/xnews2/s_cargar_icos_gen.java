package british.xnews2;

import android.app.IntentService;
import android.graphics.Bitmap;

public class s_cargar_icos_gen extends IntentService {

    /* renamed from: b */
    C1692config f8476b;

    /* renamed from: c */
    Bitmap f8477c;

    public s_cargar_icos_gen() {
        super("s_cargar_icos_gen");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r10) {
        /*
            r9 = this;
            android.content.Context r0 = r9.getApplicationContext()
            british.xnews2.config r0 = (british.xnews2.C1692config) r0
            r9.f8476b = r0
            r0 = 0
            r1 = 0
        L_0x000a:
            r2 = 6
            if (r1 >= r2) goto L_0x0193
            if (r1 != 0) goto L_0x0019
            java.lang.String r2 = "act_ico_perfil"
            boolean r2 = r10.getBooleanExtra(r2, r0)
            if (r2 != 0) goto L_0x0019
            goto L_0x018f
        L_0x0019:
            r2 = 1
            if (r1 != r2) goto L_0x0026
            java.lang.String r3 = "act_ico_privados"
            boolean r3 = r10.getBooleanExtra(r3, r0)
            if (r3 != 0) goto L_0x0026
            goto L_0x018f
        L_0x0026:
            r3 = 2
            if (r1 != r3) goto L_0x0033
            java.lang.String r4 = "act_ico_foto"
            boolean r4 = r10.getBooleanExtra(r4, r0)
            if (r4 != 0) goto L_0x0033
            goto L_0x018f
        L_0x0033:
            r4 = 3
            if (r1 != r4) goto L_0x0040
            java.lang.String r5 = "act_ico_video"
            boolean r5 = r10.getBooleanExtra(r5, r0)
            if (r5 != 0) goto L_0x0040
            goto L_0x018f
        L_0x0040:
            r5 = 4
            if (r1 != r5) goto L_0x004d
            java.lang.String r6 = "act_ico_emotic"
            boolean r6 = r10.getBooleanExtra(r6, r0)
            if (r6 != 0) goto L_0x004d
            goto L_0x018f
        L_0x004d:
            r6 = 5
            if (r1 != r6) goto L_0x005a
            java.lang.String r7 = "act_ico_enviar"
            boolean r7 = r10.getBooleanExtra(r7, r0)
            if (r7 != 0) goto L_0x005a
            goto L_0x018f
        L_0x005a:
            java.lang.String r7 = ""
            if (r1 != 0) goto L_0x007d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "2260177_ico_perfil.png?v="
            r3.append(r4)
            british.xnews2.config r4 = r9.f8476b
            int r4 = r4.f7169E
            r3.append(r4)
            java.lang.String r7 = r3.toString()
            british.xnews2.config r3 = r9.f8476b
            int r3 = r3.f7169E
            java.lang.String r4 = "ico_perfil"
            java.lang.String r5 = "v_ico_perfil_act"
            goto L_0x0121
        L_0x007d:
            if (r1 != r2) goto L_0x009e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "2260177_ico_privados.png?v="
            r3.append(r4)
            british.xnews2.config r4 = r9.f8476b
            int r4 = r4.f7175F
            r3.append(r4)
            java.lang.String r7 = r3.toString()
            british.xnews2.config r3 = r9.f8476b
            int r3 = r3.f7175F
            java.lang.String r4 = "ico_privados"
            java.lang.String r5 = "v_ico_privados_act"
            goto L_0x0121
        L_0x009e:
            if (r1 != r3) goto L_0x00be
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "2260177_ico_foto.png?v="
            r3.append(r4)
            british.xnews2.config r4 = r9.f8476b
            int r4 = r4.f7181G
            r3.append(r4)
            java.lang.String r7 = r3.toString()
            british.xnews2.config r3 = r9.f8476b
            int r3 = r3.f7181G
            java.lang.String r4 = "ico_foto"
            java.lang.String r5 = "v_ico_foto_act"
            goto L_0x0121
        L_0x00be:
            if (r1 != r4) goto L_0x00de
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "2260177_ico_video.png?v="
            r3.append(r4)
            british.xnews2.config r4 = r9.f8476b
            int r4 = r4.f7187H
            r3.append(r4)
            java.lang.String r7 = r3.toString()
            british.xnews2.config r3 = r9.f8476b
            int r3 = r3.f7187H
            java.lang.String r4 = "ico_video"
            java.lang.String r5 = "v_ico_video_act"
            goto L_0x0121
        L_0x00de:
            if (r1 != r5) goto L_0x00fe
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "2260177_ico_emotic.png?v="
            r3.append(r4)
            british.xnews2.config r4 = r9.f8476b
            int r4 = r4.f7193I
            r3.append(r4)
            java.lang.String r7 = r3.toString()
            british.xnews2.config r3 = r9.f8476b
            int r3 = r3.f7193I
            java.lang.String r4 = "ico_emotic"
            java.lang.String r5 = "v_ico_emotic_act"
            goto L_0x0121
        L_0x00fe:
            if (r1 != r6) goto L_0x011e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "2260177_ico_enviar.png?v="
            r3.append(r4)
            british.xnews2.config r4 = r9.f8476b
            int r4 = r4.f7199J
            r3.append(r4)
            java.lang.String r7 = r3.toString()
            british.xnews2.config r3 = r9.f8476b
            int r3 = r3.f7199J
            java.lang.String r4 = "ico_enviar"
            java.lang.String r5 = "v_ico_enviar_act"
            goto L_0x0121
        L_0x011e:
            r4 = r7
            r5 = r4
            r3 = 0
        L_0x0121:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = british.xnews2.C1692config.f7108H5
            r6.append(r8)
            java.lang.String r8 = "/srv/imgs/gen/"
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 0
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0140 }
            r8.<init>(r6)     // Catch:{ MalformedURLException -> 0x0140 }
            r7 = r8
            r6 = 1
            goto L_0x0141
        L_0x0140:
            r6 = 0
        L_0x0141:
            if (r6 == 0) goto L_0x018f
            java.net.URLConnection r7 = r7.openConnection()     // Catch:{ IOException -> 0x0174 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x0174 }
            r7.setDoInput(r2)     // Catch:{ IOException -> 0x0174 }
            r2 = 5000(0x1388, float:7.006E-42)
            r7.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0174 }
            r2 = 7000(0x1b58, float:9.809E-42)
            r7.setReadTimeout(r2)     // Catch:{ IOException -> 0x0174 }
            r7.connect()     // Catch:{ IOException -> 0x0174 }
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ IOException -> 0x0174 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ IOException -> 0x0174 }
            r9.f8477c = r2     // Catch:{ IOException -> 0x0174 }
            java.io.FileOutputStream r2 = r9.openFileOutput(r4, r0)     // Catch:{  }
            android.graphics.Bitmap r4 = r9.f8477c     // Catch:{  }
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{  }
            r8 = 100
            r4.compress(r7, r8, r2)     // Catch:{  }
            r2.close()     // Catch:{  }
            goto L_0x0175
        L_0x0174:
            r6 = 0
        L_0x0175:
            british.xnews2.config r2 = r9.f8476b
            if (r2 == 0) goto L_0x018f
            java.lang.String r2 = r2.f7313c1
            if (r2 == 0) goto L_0x018f
            if (r6 == 0) goto L_0x018f
            java.lang.String r2 = "sh"
            android.content.SharedPreferences r2 = r9.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putInt(r5, r3)
            r2.commit()
        L_0x018f:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.s_cargar_icos_gen.onHandleIntent(android.content.Intent):void");
    }
}
