package british.p015x;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: british.x.alarma_rss */
public class alarma_rss extends BroadcastReceiver {

    /* renamed from: a */
    public SharedPreferences f6840a;

    /* renamed from: british.x.alarma_rss$a */
    private class C1597a extends AsyncTask<String, Integer, ArrayList<C1773e1>> {

        /* renamed from: a */
        private String f6841a;

        /* renamed from: b */
        private int f6842b;

        /* renamed from: c */
        private Context f6843c;

        public C1597a(Context context, String str, int i) {
            this.f6843c = context;
            this.f6841a = str;
            this.f6842b = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C1773e1> doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                return C1692config.m8191l1(httpURLConnection.getInputStream());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.util.ArrayList<british.p015x.C1773e1> r19) {
            /*
                r18 = this;
                r1 = r18
                r2 = r19
                if (r2 == 0) goto L_0x016b
                int r0 = r19.size()
                if (r0 <= 0) goto L_0x016b
                r3 = 0
                java.lang.Object r0 = r2.get(r3)
                british.x.e1 r0 = (british.p015x.C1773e1) r0
                java.lang.String r0 = r0.f7677f
                if (r0 == 0) goto L_0x016b
                java.lang.Object r0 = r2.get(r3)
                british.x.e1 r0 = (british.p015x.C1773e1) r0
                java.lang.String r0 = r0.f7677f
                java.lang.String r4 = ""
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L_0x016b
                java.lang.Object r0 = r2.get(r3)
                british.x.e1 r0 = (british.p015x.C1773e1) r0
                java.lang.String r0 = r0.f7677f
                british.x.alarma_rss r5 = british.p015x.alarma_rss.this
                android.content.SharedPreferences r5 = r5.f6840a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "rss_"
                r6.append(r7)
                java.lang.String r8 = r1.f6841a
                r6.append(r8)
                java.lang.String r8 = "_ultpost"
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r5 = r5.getString(r6, r4)
                boolean r0 = r0.equals(r5)
                if (r0 != 0) goto L_0x016b
                r5 = 1
                android.content.Context r0 = r1.f6843c     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r6 = "sh"
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r6, r3)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r6 = "rss_i"
                int r6 = r0.getInt(r6, r3)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r9 = "rss_n"
                int r9 = r0.getInt(r9, r3)     // Catch:{ Exception -> 0x009e }
                java.lang.String r10 = "rss_t"
                java.lang.String r10 = r0.getString(r10, r4)     // Catch:{ Exception -> 0x009b }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x0099 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
                r11.<init>()     // Catch:{ Exception -> 0x0099 }
                r11.append(r7)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r7 = r1.f6841a     // Catch:{ Exception -> 0x0099 }
                r11.append(r7)     // Catch:{ Exception -> 0x0099 }
                r11.append(r8)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r7 = r11.toString()     // Catch:{ Exception -> 0x0099 }
                java.lang.Object r8 = r2.get(r3)     // Catch:{ Exception -> 0x0099 }
                british.x.e1 r8 = (british.p015x.C1773e1) r8     // Catch:{ Exception -> 0x0099 }
                java.lang.String r8 = r8.f7677f     // Catch:{ Exception -> 0x0099 }
                r0.putString(r7, r8)     // Catch:{ Exception -> 0x0099 }
                r0.commit()     // Catch:{ Exception -> 0x0099 }
                r11 = r10
                r0 = 1
                goto L_0x00aa
            L_0x0099:
                r0 = move-exception
                goto L_0x00a5
            L_0x009b:
                r0 = move-exception
                r10 = r4
                goto L_0x00a5
            L_0x009e:
                r0 = move-exception
                r10 = r4
                goto L_0x00a4
            L_0x00a1:
                r0 = move-exception
                r10 = r4
                r6 = 0
            L_0x00a4:
                r9 = 0
            L_0x00a5:
                r0.printStackTrace()
                r11 = r10
                r0 = 0
            L_0x00aa:
                if (r0 == 0) goto L_0x016b
                if (r6 <= 0) goto L_0x016b
                boolean r0 = r11.equals(r4)
                if (r0 != 0) goto L_0x016b
                android.content.Context r0 = r1.f6843c
                java.lang.String r4 = "notification"
                java.lang.Object r0 = r0.getSystemService(r4)
                android.app.NotificationManager r0 = (android.app.NotificationManager) r0
                if (r9 != r5) goto L_0x00c2
                r4 = 1
                goto L_0x00c3
            L_0x00c2:
                r4 = 0
            L_0x00c3:
                int r6 = android.os.Build.VERSION.SDK_INT
                r7 = 26
                if (r6 < r7) goto L_0x00d9
                a0.i$e r7 = new a0.i$e
                android.content.Context r8 = r1.f6843c
                android.app.NotificationChannel r9 = british.p015x.C1692config.m8206y(r8, r4)
                java.lang.String r9 = r9.getId()
                r7.<init>(r8, r9)
                goto L_0x00e0
            L_0x00d9:
                a0.i$e r7 = new a0.i$e
                android.content.Context r8 = r1.f6843c
                r7.<init>(r8)
            L_0x00e0:
                r8 = 2131231398(0x7f0802a6, float:1.8078876E38)
                a0.i$e r8 = r7.mo63B(r8)
                a0.i$e r8 = r8.mo85q(r11)
                java.lang.Object r9 = r2.get(r3)
                british.x.e1 r9 = (british.p015x.C1773e1) r9
                java.lang.String r9 = r9.f7675d
                a0.i$e r8 = r8.mo84p(r9)
                r8.mo78j(r5)
                android.content.Context r8 = r1.f6843c
                android.graphics.Bitmap r8 = british.p015x.C1692config.m8196p0(r8)
                if (r8 == 0) goto L_0x0105
                r7.mo89v(r8)
            L_0x0105:
                if (r4 != r5) goto L_0x010b
                r4 = 5
                r7.mo86r(r4)
            L_0x010b:
                android.content.Intent r4 = new android.content.Intent
                android.content.Context r5 = r1.f6843c
                java.lang.Class<british.x.preinicio> r8 = british.p015x.preinicio.class
                r4.<init>(r5, r8)
                java.lang.String r5 = "notif_id"
                java.lang.String r8 = "0"
                r4.putExtra(r5, r8)
                java.lang.String r5 = "notif_tipo"
                java.lang.String r8 = "1"
                r4.putExtra(r5, r8)
                java.lang.String r5 = r1.f6841a
                java.lang.String r8 = "notif_idelem"
                r4.putExtra(r8, r5)
                android.content.Context r10 = r1.f6843c
                java.lang.Object r2 = r2.get(r3)
                british.x.e1 r2 = (british.p015x.C1773e1) r2
                java.lang.String r12 = r2.f7675d
                int r2 = r1.f6842b
                int r14 = r2 + 100
                r15 = 3
                java.lang.String r16 = "0"
                java.lang.String r17 = "0"
                r13 = r4
                british.p015x.C1692config.m8146A(r10, r11, r12, r13, r14, r15, r16, r17)
                r2 = 23
                if (r6 < r2) goto L_0x0151
                android.content.Context r2 = r1.f6843c
                int r3 = r1.f6842b
                int r3 = r3 + 100
                r5 = 201326592(0xc000000, float:9.8607613E-32)
                android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r3, r4, r5)
                goto L_0x015d
            L_0x0151:
                android.content.Context r2 = r1.f6843c
                int r3 = r1.f6842b
                int r3 = r3 + 100
                r5 = 134217728(0x8000000, float:3.85186E-34)
                android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r3, r4, r5)
            L_0x015d:
                r7.mo83o(r2)
                int r2 = r1.f6842b
                int r2 = r2 + 100
                android.app.Notification r3 = r7.mo73c()
                r0.notify(r2, r3)
            L_0x016b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.alarma_rss.C1597a.onPostExecute(java.util.ArrayList):void");
        }
    }

    /* renamed from: a */
    public void mo7300a(Context context, int i) {
        PendingIntent pendingIntent;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, alarma_rss.class);
        if (Build.VERSION.SDK_INT >= 23) {
            pendingIntent = PendingIntent.getBroadcast(context, 1, intent, 201326592);
        } else {
            pendingIntent = PendingIntent.getBroadcast(context, 1, intent, 134217728);
        }
        PendingIntent pendingIntent2 = pendingIntent;
        if (i == 0) {
            alarmManager.cancel(pendingIntent2);
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.add(13, 60);
        alarmManager.setInexactRepeating(1, instance.getTimeInMillis(), (long) (i * 3600000), pendingIntent2);
    }

    public void onReceive(Context context, Intent intent) {
        this.f6840a = context.getSharedPreferences("sh", 0);
        if (System.currentTimeMillis() - this.f6840a.getLong("f_ult_rss", 0) >= 120000) {
            SharedPreferences.Editor edit = this.f6840a.edit();
            edit.putLong("f_ult_rss", System.currentTimeMillis());
            edit.commit();
            String string = this.f6840a.getString("idseccs", "");
            if (!string.equals("")) {
                String[] split = string.split(",");
                int i = 0;
                for (int i2 = 0; i2 < split.length; i2++) {
                    SharedPreferences sharedPreferences = this.f6840a;
                    if (sharedPreferences.getInt("s" + split[i2] + "_tipo", 0) == 8) {
                        String str = split[i2];
                        i++;
                        SharedPreferences sharedPreferences2 = this.f6840a;
                        if (!sharedPreferences2.getString("rss_" + str + "_ultpost", "").equals("")) {
                            SharedPreferences sharedPreferences3 = this.f6840a;
                            String string2 = sharedPreferences3.getString("s" + str + "_url", "");
                            if (!string2.equals("")) {
                                new C1597a(context, str, i).execute(new String[]{string2});
                            }
                        }
                    }
                }
            }
        }
    }
}
