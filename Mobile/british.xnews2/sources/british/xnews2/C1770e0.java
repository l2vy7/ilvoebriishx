package british.xnews2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;

/* renamed from: british.xnews2.e0 */
/* compiled from: likes_adapter */
public class C1770e0 extends ArrayAdapter<C1789f0> {

    /* renamed from: b */
    C1692config f7655b;

    /* renamed from: c */
    private Activity f7656c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C1789f0> f7657d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1770e0 f7658e;

    /* renamed from: f */
    private String f7659f;

    /* renamed from: g */
    protected boolean f7660g = true;

    /* renamed from: h */
    File f7661h;

    /* renamed from: i */
    SharedPreferences f7662i;

    /* renamed from: british.xnews2.e0$a */
    /* compiled from: likes_adapter */
    private class C1771a extends AsyncTask<Integer, Void, Integer> {

        /* renamed from: a */
        int f7663a;

        public C1771a(int i) {
            this.f7663a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x00b1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Integer... r7) {
            /*
                r6 = this;
                r7 = -1
                java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x00c0 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c0 }
                r1.<init>()     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r2 = british.xnews2.C1692config.f7108H5     // Catch:{ IOException -> 0x00c0 }
                r1.append(r2)     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r2 = "/srv/imgs/usus/"
                r1.append(r2)     // Catch:{ IOException -> 0x00c0 }
                british.xnews2.e0 r2 = british.xnews2.C1770e0.this     // Catch:{ IOException -> 0x00c0 }
                java.util.ArrayList r2 = r2.f7657d     // Catch:{ IOException -> 0x00c0 }
                int r3 = r6.f7663a     // Catch:{ IOException -> 0x00c0 }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x00c0 }
                british.xnews2.f0 r2 = (british.xnews2.C1789f0) r2     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r2 = r2.f7712f     // Catch:{ IOException -> 0x00c0 }
                r1.append(r2)     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r2 = "_1_p.jpg?v="
                r1.append(r2)     // Catch:{ IOException -> 0x00c0 }
                british.xnews2.e0 r2 = british.xnews2.C1770e0.this     // Catch:{ IOException -> 0x00c0 }
                java.util.ArrayList r2 = r2.f7657d     // Catch:{ IOException -> 0x00c0 }
                int r3 = r6.f7663a     // Catch:{ IOException -> 0x00c0 }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x00c0 }
                british.xnews2.f0 r2 = (british.xnews2.C1789f0) r2     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r2 = r2.f7713g     // Catch:{ IOException -> 0x00c0 }
                r1.append(r2)     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00c0 }
                r0.<init>(r1)     // Catch:{ IOException -> 0x00c0 }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x00c0 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x00c0 }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{ IOException -> 0x00c0 }
                r1 = 5000(0x1388, float:7.006E-42)
                r0.setConnectTimeout(r1)     // Catch:{ IOException -> 0x00c0 }
                r1 = 7000(0x1b58, float:9.809E-42)
                r0.setReadTimeout(r1)     // Catch:{ IOException -> 0x00c0 }
                r0.connect()     // Catch:{ IOException -> 0x00c0 }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x00c0 }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ OutOfMemoryError -> 0x00bb }
                r1.close()     // Catch:{ IOException -> 0x00c0 }
                r0.disconnect()     // Catch:{ IOException -> 0x00c0 }
                if (r2 != 0) goto L_0x0070
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c0 }
                return r7
            L_0x0070:
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00c0 }
                british.xnews2.e0 r1 = british.xnews2.C1770e0.this     // Catch:{ IOException -> 0x00c0 }
                java.io.File r1 = r1.f7661h     // Catch:{ IOException -> 0x00c0 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c0 }
                r3.<init>()     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r4 = "fperfil_"
                r3.append(r4)     // Catch:{ IOException -> 0x00c0 }
                british.xnews2.e0 r4 = british.xnews2.C1770e0.this     // Catch:{ IOException -> 0x00c0 }
                java.util.ArrayList r4 = r4.f7657d     // Catch:{ IOException -> 0x00c0 }
                int r5 = r6.f7663a     // Catch:{ IOException -> 0x00c0 }
                java.lang.Object r4 = r4.get(r5)     // Catch:{ IOException -> 0x00c0 }
                british.xnews2.f0 r4 = (british.xnews2.C1789f0) r4     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r4 = r4.f7712f     // Catch:{ IOException -> 0x00c0 }
                r3.append(r4)     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r4 = ".jpg"
                r3.append(r4)     // Catch:{ IOException -> 0x00c0 }
                java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00c0 }
                r0.<init>(r1, r3)     // Catch:{ IOException -> 0x00c0 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00b6, OutOfMemoryError -> 0x00b1 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00b6, OutOfMemoryError -> 0x00b1 }
                android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00b6, OutOfMemoryError -> 0x00b1 }
                r3 = 90
                r2.compress(r0, r3, r1)     // Catch:{ Exception -> 0x00b6, OutOfMemoryError -> 0x00b1 }
                r0 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00b6, OutOfMemoryError -> 0x00b1 }
                return r7
            L_0x00b1:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c0 }
                return r7
            L_0x00b6:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c0 }
                return r7
            L_0x00bb:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c0 }
                return r7
            L_0x00c0:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: british.xnews2.C1770e0.C1771a.doInBackground(java.lang.Integer[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            ((C1789f0) C1770e0.this.f7657d.get(this.f7663a)).f7707a = false;
            if (num.intValue() == 0) {
                SharedPreferences.Editor edit = C1770e0.this.f7662i.edit();
                edit.putString("fperfil_" + ((C1789f0) C1770e0.this.f7657d.get(this.f7663a)).f7712f, ((C1789f0) C1770e0.this.f7657d.get(this.f7663a)).f7713g);
                edit.commit();
                C1770e0.this.f7658e.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: british.xnews2.e0$b */
    /* compiled from: likes_adapter */
    static class C1772b {

        /* renamed from: a */
        TextView f7665a;

        /* renamed from: b */
        ImageView f7666b;

        /* renamed from: c */
        ImageView f7667c;

        /* renamed from: d */
        LinearLayout f7668d;

        /* renamed from: e */
        LinearLayout f7669e;

        /* renamed from: f */
        FrameLayout f7670f;

        /* renamed from: g */
        ProgressBar f7671g;

        C1772b() {
        }
    }

    public C1770e0(Context context, int i, ArrayList<C1789f0> arrayList, long j) {
        super(context, i, arrayList);
        Activity activity = (Activity) context;
        this.f7656c = activity;
        this.f7655b = (C1692config) activity.getApplicationContext();
        this.f7657d = arrayList;
        this.f7658e = this;
        this.f7661h = context.getFilesDir();
        this.f7662i = context.getSharedPreferences("sh", 0);
        this.f7659f = j + "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0166, code lost:
        if (r5.getString("fperfil_" + r8.f7657d.get(r9).f7712f, com.google.android.exoplayer2.source.rtsp.SessionDescription.SUPPORTED_SDP_VERSION).equals(r8.f7657d.get(r9).f7713g) == false) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x0066
            android.app.Activity r10 = r8.f7656c
            android.view.LayoutInflater r10 = r10.getLayoutInflater()
            r11 = 2131558522(0x7f0d007a, float:1.8742362E38)
            r0 = 0
            android.view.View r10 = r10.inflate(r11, r0)
            british.xnews2.e0$b r11 = new british.xnews2.e0$b
            r11.<init>()
            r0 = 2131362234(0x7f0a01ba, float:1.8344243E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r11.f7670f = r0
            r0 = 2131362438(0x7f0a0286, float:1.8344657E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r11.f7671g = r0
            r0 = 2131362437(0x7f0a0285, float:1.8344655E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r11.f7666b = r0
            r0 = 2131362439(0x7f0a0287, float:1.8344659E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11.f7665a = r0
            r0 = 2131362520(0x7f0a02d8, float:1.8344823E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r11.f7669e = r0
            r0 = 2131362521(0x7f0a02d9, float:1.8344825E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r11.f7668d = r0
            r0 = 2131362436(0x7f0a0284, float:1.8344653E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r11.f7667c = r0
            r10.setTag(r11)
            goto L_0x006c
        L_0x0066:
            java.lang.Object r11 = r10.getTag()
            british.xnews2.e0$b r11 = (british.xnews2.C1770e0.C1772b) r11
        L_0x006c:
            java.util.ArrayList<british.xnews2.f0> r0 = r8.f7657d
            java.lang.Object r0 = r0.get(r9)
            british.xnews2.f0 r0 = (british.xnews2.C1789f0) r0
            boolean r0 = r0.f7709c
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x0087
            android.widget.LinearLayout r9 = r11.f7668d
            r9.setVisibility(r1)
            android.widget.LinearLayout r9 = r11.f7669e
            r9.setVisibility(r2)
            goto L_0x01c3
        L_0x0087:
            android.widget.ImageView r0 = r11.f7667c
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r11.f7668d
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r11.f7669e
            r0.setVisibility(r1)
            java.util.ArrayList<british.xnews2.f0> r0 = r8.f7657d
            java.lang.Object r0 = r0.get(r9)
            british.xnews2.f0 r0 = (british.xnews2.C1789f0) r0
            boolean r0 = r0.f7710d
            if (r0 == 0) goto L_0x00a7
            android.widget.ImageView r0 = r11.f7667c
            r0.setVisibility(r1)
        L_0x00a7:
            boolean r0 = r8.f7660g
            if (r0 != 0) goto L_0x00b2
            android.widget.FrameLayout r0 = r11.f7670f
            r0.setVisibility(r2)
            goto L_0x01b4
        L_0x00b2:
            android.widget.ProgressBar r0 = r11.f7671g
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r11.f7666b
            r0.setVisibility(r1)
            java.util.ArrayList<british.xnews2.f0> r0 = r8.f7657d
            java.lang.Object r0 = r0.get(r9)
            british.xnews2.f0 r0 = (british.xnews2.C1789f0) r0
            boolean r0 = r0.f7708b
            if (r0 != 0) goto L_0x00dc
            android.widget.ImageView r0 = r11.f7666b
            android.app.Activity r1 = r8.f7656c
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131231487(0x7f0802ff, float:1.8079056E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            goto L_0x01b4
        L_0x00dc:
            java.util.ArrayList<british.xnews2.f0> r0 = r8.f7657d
            java.lang.Object r0 = r0.get(r9)
            british.xnews2.f0 r0 = (british.xnews2.C1789f0) r0
            java.lang.String r0 = r0.f7712f
            java.lang.String r3 = r8.f7659f
            boolean r0 = r0.equals(r3)
            r3 = 1
            java.lang.String r4 = "fperfil_"
            if (r0 == 0) goto L_0x00fa
            british.xnews2.config r0 = r8.f7655b
            android.app.Activity r5 = r8.f7656c
            java.io.File r0 = r0.mo7516l0(r5, r3)
            goto L_0x011f
        L_0x00fa:
            java.io.File r0 = new java.io.File
            java.io.File r5 = r8.f7661h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.util.ArrayList<british.xnews2.f0> r7 = r8.f7657d
            java.lang.Object r7 = r7.get(r9)
            british.xnews2.f0 r7 = (british.xnews2.C1789f0) r7
            java.lang.String r7 = r7.f7712f
            r6.append(r7)
            java.lang.String r7 = ".jpg"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.<init>(r5, r6)
        L_0x011f:
            java.util.ArrayList<british.xnews2.f0> r5 = r8.f7657d
            java.lang.Object r5 = r5.get(r9)
            british.xnews2.f0 r5 = (british.xnews2.C1789f0) r5
            java.lang.String r5 = r5.f7712f
            java.lang.String r6 = r8.f7659f
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x01a2
            boolean r5 = r0.exists()
            if (r5 == 0) goto L_0x0168
            android.content.SharedPreferences r5 = r8.f7662i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.util.ArrayList<british.xnews2.f0> r4 = r8.f7657d
            java.lang.Object r4 = r4.get(r9)
            british.xnews2.f0 r4 = (british.xnews2.C1789f0) r4
            java.lang.String r4 = r4.f7712f
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "0"
            java.lang.String r4 = r5.getString(r4, r6)
            java.util.ArrayList<british.xnews2.f0> r5 = r8.f7657d
            java.lang.Object r5 = r5.get(r9)
            british.xnews2.f0 r5 = (british.xnews2.C1789f0) r5
            java.lang.String r5 = r5.f7713g
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01a2
        L_0x0168:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 20
            if (r0 <= r4) goto L_0x0177
            android.widget.ProgressBar r0 = r11.f7671g
            british.xnews2.config r4 = r8.f7655b
            java.lang.String r4 = r4.f7368l1
            british.xnews2.C1692config.m8168S0(r0, r4)
        L_0x0177:
            android.widget.ProgressBar r0 = r11.f7671g
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r11.f7666b
            r0.setVisibility(r2)
            java.util.ArrayList<british.xnews2.f0> r0 = r8.f7657d
            java.lang.Object r0 = r0.get(r9)
            british.xnews2.f0 r0 = (british.xnews2.C1789f0) r0
            boolean r0 = r0.f7707a
            if (r0 != 0) goto L_0x01b4
            java.util.ArrayList<british.xnews2.f0> r0 = r8.f7657d
            java.lang.Object r0 = r0.get(r9)
            british.xnews2.f0 r0 = (british.xnews2.C1789f0) r0
            r0.f7707a = r3
            british.xnews2.e0$a r0 = new british.xnews2.e0$a
            r0.<init>(r9)
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r0.execute(r1)
            goto L_0x01b4
        L_0x01a2:
            android.widget.ImageView r1 = r11.f7666b     // Catch:{ Exception | OutOfMemoryError -> 0x01b4 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception | OutOfMemoryError -> 0x01b4 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01b4 }
            r2 = 2
            android.graphics.Bitmap r0 = british.xnews2.C1692config.m8147C(r0, r2)     // Catch:{ Exception | OutOfMemoryError -> 0x01b4 }
            r1.setImageBitmap(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x01b4 }
        L_0x01b4:
            android.widget.TextView r11 = r11.f7665a
            java.util.ArrayList<british.xnews2.f0> r0 = r8.f7657d
            java.lang.Object r9 = r0.get(r9)
            british.xnews2.f0 r9 = (british.xnews2.C1789f0) r9
            java.lang.String r9 = r9.f7711e
            r11.setText(r9)
        L_0x01c3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: british.xnews2.C1770e0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
