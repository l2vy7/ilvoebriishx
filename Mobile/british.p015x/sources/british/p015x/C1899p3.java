package british.p015x;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: british.x.p3 */
/* compiled from: vistafb_adapter */
public class C1899p3 extends ArrayAdapter<C2046r3> {

    /* renamed from: b */
    C1692config f8047b;

    /* renamed from: c */
    private Activity f8048c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C2046r3> f8049d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1899p3 f8050e = this;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SharedPreferences f8051f = this.f8048c.getSharedPreferences("sh", 0);

    /* renamed from: g */
    private String f8052g = "";

    /* renamed from: h */
    private String f8053h;

    /* renamed from: i */
    private final int f8054i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public File f8055j;

    /* renamed from: k */
    protected boolean f8056k;

    /* renamed from: l */
    protected boolean f8057l;

    /* renamed from: m */
    protected int f8058m;

    /* renamed from: british.x.p3$a */
    /* compiled from: vistafb_adapter */
    private class C1900a extends AsyncTask<Integer, Void, Integer> {

        /* renamed from: a */
        Integer f8059a;

        private C1900a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:26|27|28|29|30|31|32|(1:34)|35|36|37) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0250, code lost:
            return -1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x01f8 */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x021a A[Catch:{ Exception -> 0x0247 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Integer... r14) {
            /*
                r13 = this;
                r0 = 0
                r14 = r14[r0]
                r13.f8059a = r14
                british.x.p3 r14 = british.p015x.C1899p3.this
                java.util.ArrayList r14 = r14.f8049d
                java.lang.Integer r1 = r13.f8059a
                int r1 = r1.intValue()
                java.lang.Object r14 = r14.get(r1)
                british.x.r3 r14 = (british.p015x.C2046r3) r14
                boolean r1 = r14.f8445A
                if (r1 == 0) goto L_0x0022
                r14 = 99
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                return r14
            L_0x0022:
                r1 = 1
                r14.f8445A = r1
                r14.f8470y = r1
                java.lang.String r2 = r14.f8446a
                java.lang.String r3 = "1"
                boolean r2 = r2.equals(r3)
                java.lang.String r4 = "_g.jpg"
                java.lang.String r5 = "fperfil_"
                java.lang.String r6 = ""
                if (r2 == 0) goto L_0x006f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = british.p015x.C1692config.f7108H5
                r2.append(r6)
                java.lang.String r6 = "/srv/imgs/usus/"
                r2.append(r6)
                java.lang.String r6 = r14.f8447b
                r2.append(r6)
                java.lang.String r6 = "_1.jpg?v="
                r2.append(r6)
                java.lang.String r6 = r14.f8450e
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                java.lang.String r7 = r14.f8447b
                r2.append(r7)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                goto L_0x0182
            L_0x006f:
                java.lang.String r2 = r14.f8446a
                java.lang.String r7 = "2"
                boolean r2 = r2.equals(r7)
                java.lang.String r7 = "_"
                java.lang.String r8 = ".jpg"
                if (r2 == 0) goto L_0x00b8
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = british.p015x.C1692config.f7108H5
                r2.append(r6)
                java.lang.String r6 = "/srv/imgs/ususgal/"
                r2.append(r6)
                java.lang.String r6 = r14.f8447b
                r2.append(r6)
                r2.append(r7)
                java.lang.String r6 = r14.f8451f
                r2.append(r6)
                r2.append(r8)
                java.lang.String r6 = r2.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = "fperfilgal_"
                r2.append(r7)
                java.lang.String r7 = r14.f8451f
                r2.append(r7)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                goto L_0x0182
            L_0x00b8:
                java.lang.String r2 = r14.f8446a
                java.lang.String r4 = "3"
                boolean r2 = r2.equals(r4)
                java.lang.String r4 = "_th.jpg"
                if (r2 == 0) goto L_0x00ff
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = british.p015x.C1692config.f7108H5
                r2.append(r6)
                java.lang.String r6 = "/srv/imgs/videos_pro/v"
                r2.append(r6)
                java.lang.String r6 = r14.f8451f
                r2.append(r6)
                r2.append(r7)
                java.lang.String r6 = r14.f8447b
                r2.append(r6)
                r2.append(r4)
                java.lang.String r6 = r2.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "fperfilgalv_"
                r2.append(r4)
                java.lang.String r4 = r14.f8451f
                r2.append(r4)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                goto L_0x0182
            L_0x00ff:
                java.lang.String r2 = r14.f8446a
                java.lang.String r9 = "7"
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x013d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = british.p015x.C1692config.f7108H5
                r2.append(r4)
                java.lang.String r4 = "/android-app-creator/game/promo"
                r2.append(r4)
                java.lang.String r4 = r14.f8451f
                r2.append(r4)
                java.lang.String r4 = "/media/graphics/promo/banners/180x120.jpg"
                r2.append(r4)
                java.lang.String r6 = r2.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "game_banner"
                r2.append(r4)
                java.lang.String r4 = r14.f8451f
                r2.append(r4)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                goto L_0x0182
            L_0x013d:
                java.lang.String r2 = r14.f8446a
                java.lang.String r9 = "9"
                boolean r2 = r2.equals(r9)
                if (r2 == 0) goto L_0x0181
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = british.p015x.C1692config.f7108H5
                r2.append(r6)
                java.lang.String r6 = "/srv/imgs/videos_busc/v"
                r2.append(r6)
                java.lang.String r6 = r14.f8451f
                r2.append(r6)
                r2.append(r7)
                java.lang.String r6 = r14.f8447b
                r2.append(r6)
                r2.append(r4)
                java.lang.String r6 = r2.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "fbuscvideo_"
                r2.append(r4)
                java.lang.String r4 = r14.f8451f
                r2.append(r4)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                goto L_0x0182
            L_0x0181:
                r2 = r6
            L_0x0182:
                r4 = -1
                java.net.URL r7 = new java.net.URL     // Catch:{ IOException -> 0x024c }
                r7.<init>(r6)     // Catch:{ IOException -> 0x024c }
                java.net.URLConnection r6 = r7.openConnection()     // Catch:{ IOException -> 0x024c }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x024c }
                r6.setDoInput(r1)     // Catch:{ IOException -> 0x024c }
                r8 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r8)     // Catch:{ IOException -> 0x024c }
                r9 = 7000(0x1b58, float:9.809E-42)
                r6.setReadTimeout(r9)     // Catch:{ IOException -> 0x024c }
                r6.connect()     // Catch:{ IOException -> 0x024c }
                java.io.InputStream r10 = r6.getInputStream()     // Catch:{ IOException -> 0x024c }
                android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x024c }
                r11.<init>()     // Catch:{ IOException -> 0x024c }
                r11.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x024c }
                r12 = 0
                android.graphics.BitmapFactory.decodeStream(r10, r12, r11)     // Catch:{ IOException -> 0x024c }
                r10.close()     // Catch:{ IOException -> 0x024c }
                r6.disconnect()     // Catch:{ IOException -> 0x024c }
                british.x.p3 r6 = british.p015x.C1899p3.this     // Catch:{ IOException -> 0x024c }
                british.x.config r6 = r6.f8047b     // Catch:{ IOException -> 0x024c }
                r6 = 300(0x12c, float:4.2E-43)
                int r6 = british.p015x.C1692config.m8192m(r11, r6, r6)     // Catch:{ IOException -> 0x024c }
                r11.inSampleSize = r6     // Catch:{ IOException -> 0x024c }
                java.net.URLConnection r6 = r7.openConnection()     // Catch:{ IOException -> 0x024c }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x024c }
                r6.setDoInput(r1)     // Catch:{ IOException -> 0x024c }
                r6.setConnectTimeout(r8)     // Catch:{ IOException -> 0x024c }
                r6.setReadTimeout(r9)     // Catch:{ IOException -> 0x024c }
                r6.connect()     // Catch:{ IOException -> 0x024c }
                java.io.InputStream r1 = r6.getInputStream()     // Catch:{ IOException -> 0x024c }
                r11.inJustDecodeBounds = r0     // Catch:{ IOException -> 0x024c }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r1, r12, r11)     // Catch:{ IOException -> 0x024c }
                r1.close()     // Catch:{ IOException -> 0x024c }
                if (r6 != 0) goto L_0x01e5
                java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x024c }
                return r14
            L_0x01e5:
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x024c }
                r1.<init>()     // Catch:{ IOException -> 0x024c }
                android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x024c }
                r8 = 100
                r6.compress(r7, r8, r1)     // Catch:{ IOException -> 0x024c }
                byte[] r6 = r1.toByteArray()     // Catch:{ IOException -> 0x024c }
                r1.close()     // Catch:{ IOException -> 0x01f8 }
            L_0x01f8:
                int r1 = r6.length     // Catch:{ IOException -> 0x024c }
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r6, r0, r1)     // Catch:{ IOException -> 0x024c }
                java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x024c }
                british.x.p3 r7 = british.p015x.C1899p3.this     // Catch:{ IOException -> 0x024c }
                java.io.File r7 = r7.f8055j     // Catch:{ IOException -> 0x024c }
                r6.<init>(r7, r2)     // Catch:{ IOException -> 0x024c }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0247 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0247 }
                android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0247 }
                r1.compress(r6, r8, r2)     // Catch:{ Exception -> 0x0247 }
                java.lang.String r1 = r14.f8446a     // Catch:{ Exception -> 0x0247 }
                boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x0247 }
                if (r1 == 0) goto L_0x0242
                british.x.p3 r1 = british.p015x.C1899p3.this     // Catch:{ Exception -> 0x0247 }
                android.content.SharedPreferences r1 = r1.f8051f     // Catch:{ Exception -> 0x0247 }
                android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x0247 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0247 }
                r2.<init>()     // Catch:{ Exception -> 0x0247 }
                r2.append(r5)     // Catch:{ Exception -> 0x0247 }
                java.lang.String r3 = r14.f8447b     // Catch:{ Exception -> 0x0247 }
                r2.append(r3)     // Catch:{ Exception -> 0x0247 }
                java.lang.String r3 = "_g"
                r2.append(r3)     // Catch:{ Exception -> 0x0247 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0247 }
                java.lang.String r14 = r14.f8450e     // Catch:{ Exception -> 0x0247 }
                r1.putString(r2, r14)     // Catch:{ Exception -> 0x0247 }
                r1.commit()     // Catch:{ Exception -> 0x0247 }
            L_0x0242:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x024c }
                return r14
            L_0x0247:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x024c }
                return r14
            L_0x024c:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1899p3.C1900a.doInBackground(java.lang.Integer[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            if (num.intValue() != 99) {
                ((C2046r3) C1899p3.this.f8049d.get(this.f8059a.intValue())).f8470y = false;
                if (num.intValue() == -1) {
                    ((C2046r3) C1899p3.this.f8049d.get(this.f8059a.intValue())).f8471z = true;
                }
                C1899p3.this.f8050e.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: british.x.p3$b */
    /* compiled from: vistafb_adapter */
    private class C1901b extends AsyncTask<Integer, Void, Integer> {

        /* renamed from: a */
        Integer f8061a;

        private C1901b() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:6|7|8|9|10|11|12|13|14|15) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x00b2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Integer... r13) {
            /*
                r12 = this;
                java.lang.String r0 = "fperfil_"
                r1 = 0
                r13 = r13[r1]
                r12.f8061a = r13
                british.x.p3 r13 = british.p015x.C1899p3.this
                java.util.ArrayList r13 = r13.f8049d
                java.lang.Integer r2 = r12.f8061a
                int r2 = r2.intValue()
                java.lang.Object r13 = r13.get(r2)
                british.x.r3 r13 = (british.p015x.C2046r3) r13
                java.lang.String r2 = r13.f8447b
                java.lang.String r13 = r13.f8450e
                r3 = -1
                java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x0109 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0109 }
                r5.<init>()     // Catch:{ IOException -> 0x0109 }
                java.lang.String r6 = british.p015x.C1692config.f7108H5     // Catch:{ IOException -> 0x0109 }
                r5.append(r6)     // Catch:{ IOException -> 0x0109 }
                java.lang.String r6 = "/srv/imgs/usus/"
                r5.append(r6)     // Catch:{ IOException -> 0x0109 }
                r5.append(r2)     // Catch:{ IOException -> 0x0109 }
                java.lang.String r6 = "_1_p.jpg?v="
                r5.append(r6)     // Catch:{ IOException -> 0x0109 }
                r5.append(r13)     // Catch:{ IOException -> 0x0109 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0109 }
                r4.<init>(r5)     // Catch:{ IOException -> 0x0109 }
                java.net.URLConnection r5 = r4.openConnection()     // Catch:{ IOException -> 0x0109 }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0109 }
                r6 = 1
                r5.setDoInput(r6)     // Catch:{ IOException -> 0x0109 }
                r7 = 5000(0x1388, float:7.006E-42)
                r5.setConnectTimeout(r7)     // Catch:{ IOException -> 0x0109 }
                r8 = 7000(0x1b58, float:9.809E-42)
                r5.setReadTimeout(r8)     // Catch:{ IOException -> 0x0109 }
                r5.connect()     // Catch:{ IOException -> 0x0109 }
                java.io.InputStream r9 = r5.getInputStream()     // Catch:{ IOException -> 0x0109 }
                android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0109 }
                r10.<init>()     // Catch:{ IOException -> 0x0109 }
                r10.inJustDecodeBounds = r6     // Catch:{ IOException -> 0x0109 }
                r11 = 0
                android.graphics.BitmapFactory.decodeStream(r9, r11, r10)     // Catch:{ IOException -> 0x0109 }
                r9.close()     // Catch:{ IOException -> 0x0109 }
                r5.disconnect()     // Catch:{ IOException -> 0x0109 }
                british.x.p3 r5 = british.p015x.C1899p3.this     // Catch:{ IOException -> 0x0109 }
                british.x.config r5 = r5.f8047b     // Catch:{ IOException -> 0x0109 }
                r5 = 300(0x12c, float:4.2E-43)
                int r5 = british.p015x.C1692config.m8192m(r10, r5, r5)     // Catch:{ IOException -> 0x0109 }
                r10.inSampleSize = r5     // Catch:{ IOException -> 0x0109 }
                java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0109 }
                java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0109 }
                r4.setDoInput(r6)     // Catch:{ IOException -> 0x0109 }
                r4.setConnectTimeout(r7)     // Catch:{ IOException -> 0x0109 }
                r4.setReadTimeout(r8)     // Catch:{ IOException -> 0x0109 }
                r4.connect()     // Catch:{ IOException -> 0x0109 }
                java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x0109 }
                r10.inJustDecodeBounds = r1     // Catch:{ IOException -> 0x0109 }
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4, r11, r10)     // Catch:{ IOException -> 0x0109 }
                r4.close()     // Catch:{ IOException -> 0x0109 }
                if (r5 != 0) goto L_0x009f
                java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0109 }
                return r13
            L_0x009f:
                java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0109 }
                r4.<init>()     // Catch:{ IOException -> 0x0109 }
                android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0109 }
                r7 = 100
                r5.compress(r6, r7, r4)     // Catch:{ IOException -> 0x0109 }
                byte[] r5 = r4.toByteArray()     // Catch:{ IOException -> 0x0109 }
                r4.close()     // Catch:{ IOException -> 0x00b2 }
            L_0x00b2:
                int r4 = r5.length     // Catch:{ IOException -> 0x0109 }
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r5, r1, r4)     // Catch:{ IOException -> 0x0109 }
                java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0109 }
                british.x.p3 r6 = british.p015x.C1899p3.this     // Catch:{ IOException -> 0x0109 }
                java.io.File r6 = r6.f8055j     // Catch:{ IOException -> 0x0109 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0109 }
                r8.<init>()     // Catch:{ IOException -> 0x0109 }
                r8.append(r0)     // Catch:{ IOException -> 0x0109 }
                r8.append(r2)     // Catch:{ IOException -> 0x0109 }
                java.lang.String r9 = ".jpg"
                r8.append(r9)     // Catch:{ IOException -> 0x0109 }
                java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0109 }
                r5.<init>(r6, r8)     // Catch:{ IOException -> 0x0109 }
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0104 }
                r6.<init>(r5)     // Catch:{ Exception -> 0x0104 }
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0104 }
                r4.compress(r5, r7, r6)     // Catch:{ Exception -> 0x0104 }
                british.x.p3 r4 = british.p015x.C1899p3.this     // Catch:{ Exception -> 0x0104 }
                android.content.SharedPreferences r4 = r4.f8051f     // Catch:{ Exception -> 0x0104 }
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Exception -> 0x0104 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
                r5.<init>()     // Catch:{ Exception -> 0x0104 }
                r5.append(r0)     // Catch:{ Exception -> 0x0104 }
                r5.append(r2)     // Catch:{ Exception -> 0x0104 }
                java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0104 }
                r4.putString(r0, r13)     // Catch:{ Exception -> 0x0104 }
                r4.commit()     // Catch:{ Exception -> 0x0104 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0109 }
                return r13
            L_0x0104:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0109 }
                return r13
            L_0x0109:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1899p3.C1901b.doInBackground(java.lang.Integer[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            ((C2046r3) C1899p3.this.f8049d.get(this.f8061a.intValue())).f8469x = false;
            C1899p3.this.f8050e.notifyDataSetChanged();
        }
    }

    /* renamed from: british.x.p3$c */
    /* compiled from: vistafb_adapter */
    static class C1902c {

        /* renamed from: a */
        TextView f8063a;

        /* renamed from: b */
        TextView f8064b;

        /* renamed from: c */
        TextView f8065c;

        /* renamed from: d */
        TextView f8066d;

        /* renamed from: e */
        ImageView f8067e;

        /* renamed from: f */
        ImageView f8068f;

        /* renamed from: g */
        ImageView f8069g;

        /* renamed from: h */
        ImageView f8070h;

        /* renamed from: i */
        ImageView f8071i;

        /* renamed from: j */
        FrameLayout f8072j;

        C1902c() {
        }
    }

    public C1899p3(Context context, int i, ArrayList<C2046r3> arrayList) {
        super(context, i, arrayList);
        Activity activity = (Activity) context;
        this.f8048c = activity;
        this.f8047b = (C1692config) activity.getApplicationContext();
        this.f8049d = arrayList;
        this.f8054i = C1692config.m8149E(context, 40);
        this.f8055j = this.f8048c.getFilesDir();
        this.f8053h = Locale.getDefault().getLanguage();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0585  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7802e(int r58) {
        /*
            r57 = this;
            r0 = r57
            java.util.ArrayList<british.x.r3> r1 = r0.f8049d
            r2 = r58
            java.lang.Object r1 = r1.get(r2)
            british.x.r3 r1 = (british.p015x.C2046r3) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.SharedPreferences r3 = r0.f8051f
            java.lang.String r4 = "idusu"
            r5 = 0
            long r3 = r3.getLong(r4, r5)
            r2.append(r3)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences r3 = r0.f8051f
            java.lang.String r4 = "nick"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            java.lang.String r4 = r1.f8446a
            java.lang.String r5 = r1.f8447b
            java.lang.String r6 = r1.f8451f
            java.lang.String r7 = r1.f8453h
            java.lang.String r8 = r1.f8454i
            java.lang.String r9 = r1.f8448c
            java.lang.String r10 = r1.f8455j
            java.lang.String r11 = r1.f8456k
            java.lang.String r12 = r1.f8457l
            java.lang.String r13 = r1.f8458m
            java.lang.String r14 = r1.f8459n
            java.lang.String r15 = r1.f8450e
            r58 = r7
            java.lang.String r7 = r1.f8460o
            r16 = r6
            java.lang.String r6 = r1.f8461p
            r17 = r6
            java.lang.String r6 = r1.f8462q
            r18 = r6
            java.lang.String r6 = r1.f8463r
            r19 = r6
            java.lang.String r6 = r1.f8464s
            r20 = r6
            java.lang.String r6 = r1.f8465t
            r21 = r6
            java.lang.String r6 = r1.f8466u
            r22 = r6
            java.lang.String r6 = r1.f8467v
            r23 = r6
            java.lang.String r6 = r1.f8468w
            java.lang.String r1 = r1.f8449d
            r24 = r1
            android.content.Intent r1 = new android.content.Intent
            r25 = r6
            android.app.Activity r6 = r0.f8048c
            java.lang.Class<british.x.preinicio> r0 = british.p015x.preinicio.class
            r1.<init>(r6, r0)
            java.lang.String r0 = "4"
            boolean r0 = r4.equals(r0)
            java.lang.String r6 = "abrir_perfilv"
            r26 = r6
            java.lang.String r6 = "1"
            r27 = r6
            java.lang.String r6 = "nombre"
            r28 = r7
            java.lang.String r7 = "abrir_buscvideo_vfoto"
            r29 = r7
            java.lang.String r7 = "abrir_buscvideo_nombre"
            r30 = r7
            java.lang.String r7 = "abrir_buscvideo_idusu"
            r31 = r7
            java.lang.String r7 = "abrir_buscvideo"
            r32 = r7
            java.lang.String r7 = "abrir_idresp"
            r33 = r7
            java.lang.String r7 = "abrir_idcat"
            r34 = r7
            java.lang.String r7 = "fotos_chat"
            r35 = r7
            java.lang.String r7 = "fotos_perfil"
            r36 = r7
            java.lang.String r7 = "privados_chat"
            r37 = r7
            java.lang.String r7 = "galeria"
            r38 = r7
            java.lang.String r7 = "coments_chat"
            r39 = r7
            java.lang.String r7 = "p_dist"
            r40 = r7
            java.lang.String r7 = "p_descr"
            r41 = r7
            java.lang.String r7 = "p_sexo"
            r42 = r7
            java.lang.String r7 = "p_fnac"
            r43 = r7
            java.lang.String r7 = "coments"
            r44 = r15
            java.lang.String r15 = "abrir_perfil"
            r45 = r14
            java.lang.String r14 = "abrir_idtema"
            r46 = r14
            java.lang.String r14 = "abrir_idsecc"
            if (r0 != 0) goto L_0x02dc
            java.lang.String r0 = "5"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00e4
            goto L_0x02dc
        L_0x00e4:
            java.lang.String r0 = "9"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0227
            java.lang.String r0 = "10"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x011a
            r17 = r6
            r18 = r8
            r0 = r16
            r47 = r27
            r48 = r36
            r49 = r37
            r50 = r38
            r51 = r39
            r52 = r40
            r53 = r41
            r54 = r42
            r55 = r43
            r6 = r45
            r16 = r15
            r15 = r44
            r56 = r7
            r7 = r58
            r58 = r56
            goto L_0x024b
        L_0x011a:
            java.lang.String r0 = "6"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0132
            java.lang.String r0 = "8"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x012b
            goto L_0x0132
        L_0x012b:
            r1.putExtra(r15, r5)
            r1.putExtra(r6, r9)
            goto L_0x0138
        L_0x0132:
            r1.putExtra(r15, r2)
            r1.putExtra(r6, r3)
        L_0x0138:
            java.lang.String r0 = "privados"
            r1.putExtra(r0, r8)
            r1.putExtra(r7, r10)
            java.lang.String r0 = "fnac_d"
            r1.putExtra(r0, r11)
            java.lang.String r0 = "fnac_m"
            r1.putExtra(r0, r12)
            java.lang.String r0 = "fnac_a"
            r1.putExtra(r0, r13)
            java.lang.String r0 = "sexo"
            r2 = r45
            r1.putExtra(r0, r2)
            java.lang.String r0 = "vfoto"
            r2 = r44
            r1.putExtra(r0, r2)
            int r0 = java.lang.Integer.parseInt(r28)
            r2 = r43
            r1.putExtra(r2, r0)
            int r0 = java.lang.Integer.parseInt(r17)
            r3 = r42
            r1.putExtra(r3, r0)
            int r0 = java.lang.Integer.parseInt(r18)
            r5 = r41
            r1.putExtra(r5, r0)
            int r0 = java.lang.Integer.parseInt(r19)
            r8 = r40
            r1.putExtra(r8, r0)
            r0 = r20
            r9 = r27
            boolean r0 = r0.equals(r9)
            r10 = r39
            r1.putExtra(r10, r0)
            r0 = r21
            boolean r0 = r0.equals(r9)
            r11 = r38
            r1.putExtra(r11, r0)
            r0 = r22
            boolean r0 = r0.equals(r9)
            r12 = r37
            r1.putExtra(r12, r0)
            int r0 = java.lang.Integer.parseInt(r23)
            r13 = r36
            r1.putExtra(r13, r0)
            int r0 = java.lang.Integer.parseInt(r25)
            r17 = r6
            r6 = r35
            r1.putExtra(r6, r0)
            java.lang.String r0 = "6"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01ee
            r35 = r6
            r0 = r16
            r6 = r26
            r1.putExtra(r6, r0)
            java.lang.String r0 = "abrir_perfilv_formato"
            r4 = r58
            r1.putExtra(r0, r4)
            r55 = r2
            r54 = r3
            r53 = r5
            r58 = r7
            r52 = r8
            r47 = r9
            r51 = r10
            r50 = r11
            r49 = r12
            r48 = r13
            r16 = r15
            r8 = r29
            r5 = r30
            r0 = r31
            goto L_0x02d4
        L_0x01ee:
            r43 = r2
            r35 = r6
            r0 = r16
            r6 = r26
            java.lang.String r2 = "7"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0203
            java.lang.String r2 = "abrir_game"
            r1.putExtra(r2, r0)
        L_0x0203:
            r54 = r3
            r53 = r5
            r26 = r6
            r58 = r7
            r52 = r8
            r47 = r9
            r51 = r10
            r50 = r11
            r49 = r12
            r48 = r13
            r16 = r15
            r8 = r29
            r5 = r30
            r0 = r31
            r7 = r33
            r4 = r34
            r55 = r43
            goto L_0x02d8
        L_0x0227:
            r17 = r6
            r0 = r16
            r47 = r27
            r48 = r36
            r49 = r37
            r50 = r38
            r51 = r39
            r52 = r40
            r53 = r41
            r54 = r42
            r55 = r43
            r6 = r45
            r16 = r15
            r15 = r44
            r56 = r7
            r7 = r58
            r58 = r56
            r18 = r8
        L_0x024b:
            java.lang.String r8 = "-"
            java.lang.String[] r7 = r7.split(r8)
            r8 = 1
            r8 = r7[r8]
            r1.putExtra(r14, r8)
            r8 = r32
            r1.putExtra(r8, r0)
            r0 = 0
            r0 = r7[r0]
            java.lang.String r8 = "abrir_buscvideo_formato"
            r1.putExtra(r8, r0)
            java.lang.String r0 = "9"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x027c
            r0 = r31
            r1.putExtra(r0, r5)
            r5 = r30
            r1.putExtra(r5, r9)
            r8 = r29
            r1.putExtra(r8, r15)
            goto L_0x028d
        L_0x027c:
            r8 = r29
            r5 = r30
            r0 = r31
            r1.putExtra(r0, r2)
            r1.putExtra(r5, r3)
            java.lang.String r2 = "99999999"
            r1.putExtra(r8, r2)
        L_0x028d:
            r2 = 2
            r2 = r7[r2]
            java.lang.String r3 = "abrir_buscvideo_nlikes"
            r1.putExtra(r3, r2)
            r2 = 4
            r2 = r7[r2]
            java.lang.String r3 = "abrir_buscvideo_liked"
            r1.putExtra(r3, r2)
            r2 = 3
            r2 = r7[r2]
            java.lang.String r3 = "abrir_buscvideo_descr"
            r1.putExtra(r3, r2)
            r2 = 5
            r2 = r7[r2]
            java.lang.String r3 = "abrir_buscvideo_nvideos"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "abrir_buscvideo_fcrea"
            r3 = r24
            r1.putExtra(r2, r3)
            java.lang.String r2 = "abrir_buscvideo_coments"
            r1.putExtra(r2, r10)
            java.lang.String r2 = "abrir_buscvideo_fnac_d"
            r1.putExtra(r2, r11)
            java.lang.String r2 = "abrir_buscvideo_fnac_m"
            r1.putExtra(r2, r12)
            java.lang.String r2 = "abrir_buscvideo_fnac_a"
            r1.putExtra(r2, r13)
            java.lang.String r2 = "abrir_buscvideo_sexo"
            r1.putExtra(r2, r6)
            java.lang.String r2 = "abrir_buscvideo_privados"
            r3 = r18
            r1.putExtra(r2, r3)
        L_0x02d4:
            r7 = r33
            r4 = r34
        L_0x02d8:
            r6 = r46
            goto L_0x034d
        L_0x02dc:
            r17 = r6
            r16 = r15
            r47 = r27
            r8 = r29
            r5 = r30
            r0 = r31
            r48 = r36
            r49 = r37
            r50 = r38
            r51 = r39
            r52 = r40
            r53 = r41
            r54 = r42
            r55 = r43
            r56 = r7
            r7 = r58
            r58 = r56
            java.lang.String r2 = "-"
            java.lang.String[] r2 = r7.split(r2)
            r3 = 0
            r3 = r2[r3]
            r1.putExtra(r14, r3)
            java.lang.String r3 = "4"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x032d
            r3 = 1
            r3 = r2[r3]
            r4 = r34
            r1.putExtra(r4, r3)
            r3 = 2
            r3 = r2[r3]
            r6 = r46
            r1.putExtra(r6, r3)
            r3 = 3
            r2 = r2[r3]
            java.lang.String r3 = "idresp_ir"
            r1.putExtra(r3, r2)
            r7 = r33
            goto L_0x034d
        L_0x032d:
            r4 = r34
            r6 = r46
            r3 = 1
            r3 = r2[r3]
            r1.putExtra(r4, r3)
            r3 = 2
            r3 = r2[r3]
            r1.putExtra(r6, r3)
            r3 = 3
            r3 = r2[r3]
            r7 = r33
            r1.putExtra(r7, r3)
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "idcoment_ir"
            r1.putExtra(r3, r2)
        L_0x034d:
            android.os.Bundle r1 = r1.getExtras()
            r2 = 0
            if (r1 == 0) goto L_0x03b1
            java.lang.String r3 = r1.getString(r6)
            if (r3 == 0) goto L_0x03b1
            java.util.ArrayList<java.lang.Integer> r0 = british.p015x.C1692config.f7114N5
            java.lang.String r2 = r1.getString(r14)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.indexOf(r2)
            r3 = r57
            british.x.config r2 = r3.f8047b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.app.Activity r5 = r3.f8048c
            british.x.j r0 = r2.mo7475B(r0, r5)
            android.content.Intent r2 = r0.f7842a
            java.lang.String r0 = r1.getString(r4)
            r2.putExtra(r4, r0)
            java.lang.String r0 = r1.getString(r6)
            r2.putExtra(r6, r0)
            java.lang.String r0 = r1.getString(r7)
            if (r0 == 0) goto L_0x03a4
            java.lang.String r0 = r1.getString(r7)
            r2.putExtra(r7, r0)
            java.lang.String r0 = "idcoment_ir"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r1 = "idcoment_ir"
            r2.putExtra(r1, r0)
            goto L_0x0650
        L_0x03a4:
            java.lang.String r0 = "idresp_ir"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r1 = "idresp_ir"
            r2.putExtra(r1, r0)
            goto L_0x0650
        L_0x03b1:
            r3 = r57
            if (r1 == 0) goto L_0x0486
            r4 = r32
            java.lang.String r6 = r1.getString(r4)
            if (r6 == 0) goto L_0x0486
            java.util.ArrayList<java.lang.Integer> r2 = british.p015x.C1692config.f7114N5
            java.lang.String r6 = r1.getString(r14)
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r2 = r2.indexOf(r6)
            british.x.config r6 = r3.f8047b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.app.Activity r7 = r3.f8048c
            british.x.j r2 = r6.mo7475B(r2, r7)
            android.content.Intent r2 = r2.f7842a
            java.lang.String r6 = r1.getString(r14)
            r2.putExtra(r14, r6)
            java.lang.String r6 = r1.getString(r4)
            r2.putExtra(r4, r6)
            java.lang.String r4 = "abrir_buscvideo_formato"
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r6 = "abrir_buscvideo_formato"
            r2.putExtra(r6, r4)
            java.lang.String r4 = r1.getString(r0)
            r2.putExtra(r0, r4)
            java.lang.String r0 = r1.getString(r5)
            r2.putExtra(r5, r0)
            java.lang.String r0 = "abrir_buscvideo_nlikes"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_nlikes"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_liked"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_liked"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_descr"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_descr"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_nvideos"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_nvideos"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_fcrea"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_fcrea"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_coments"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_coments"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_fnac_d"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_fnac_d"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_fnac_m"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_fnac_m"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_fnac_a"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_fnac_a"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_sexo"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_sexo"
            r2.putExtra(r4, r0)
            java.lang.String r0 = "abrir_buscvideo_privados"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = "abrir_buscvideo_privados"
            r2.putExtra(r4, r0)
            java.lang.String r0 = r1.getString(r8)
            r2.putExtra(r8, r0)
            goto L_0x0650
        L_0x0486:
            if (r1 == 0) goto L_0x0650
            r0 = r16
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L_0x0650
            r4 = r26
            boolean r2 = r1.containsKey(r4)
            if (r2 == 0) goto L_0x04cb
            java.lang.String r2 = "abrir_perfilv_formato"
            java.lang.String r2 = r1.getString(r2)
            r5 = r47
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x04a9
            java.lang.String r2 = "mp4"
            goto L_0x04cd
        L_0x04a9:
            java.lang.String r2 = "abrir_perfilv_formato"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r5 = "2"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x04ba
            java.lang.String r2 = "3gp"
            goto L_0x04cd
        L_0x04ba:
            java.lang.String r2 = "abrir_perfilv_formato"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r5 = "3"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x04cb
            java.lang.String r2 = "webm"
            goto L_0x04cd
        L_0x04cb:
            java.lang.String r2 = ""
        L_0x04cd:
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x0585
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x0585
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = r1.getString(r4)
            android.content.Intent r5 = new android.content.Intent
            android.app.Activity r6 = r3.f8048c
            java.lang.Class<british.x.t_video_pro> r7 = british.p015x.t_video_pro.class
            r5.<init>(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "https://video.e-droid.net/files_pro/v"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = "_"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = "."
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "url"
            r5.putExtra(r6, r2)
            british.x.config r2 = r3.f8047b
            int r2 = r2.f7318d
            java.lang.String r6 = "ind"
            r5.putExtra(r6, r2)
            java.lang.String r2 = "idv"
            r5.putExtra(r2, r4)
            r2 = -1
            java.lang.String r4 = "indv"
            r5.putExtra(r4, r2)
            java.lang.String r2 = "idusu_profile"
            r5.putExtra(r2, r0)
            r2 = r58
            java.lang.String r0 = r1.getString(r2)
            r5.putExtra(r2, r0)
            r4 = r55
            int r0 = r1.getInt(r4)
            r5.putExtra(r4, r0)
            r6 = r54
            int r0 = r1.getInt(r6)
            r5.putExtra(r6, r0)
            r7 = r53
            int r0 = r1.getInt(r7)
            r5.putExtra(r7, r0)
            r8 = r52
            int r0 = r1.getInt(r8)
            r5.putExtra(r8, r0)
            r9 = r51
            boolean r0 = r1.getBoolean(r9)
            r5.putExtra(r9, r0)
            r10 = r50
            boolean r0 = r1.getBoolean(r10)
            r5.putExtra(r10, r0)
            r11 = r49
            boolean r0 = r1.getBoolean(r11)
            r5.putExtra(r11, r0)
            r12 = r48
            int r0 = r1.getInt(r12)
            r5.putExtra(r12, r0)
            r13 = r35
            int r0 = r1.getInt(r13)
            r5.putExtra(r13, r0)
            goto L_0x064f
        L_0x0585:
            r2 = r58
            r13 = r35
            r12 = r48
            r11 = r49
            r10 = r50
            r9 = r51
            r8 = r52
            r7 = r53
            r6 = r54
            r4 = r55
            android.content.Intent r5 = new android.content.Intent
            android.app.Activity r14 = r3.f8048c
            java.lang.Class<british.x.profile> r15 = british.p015x.profile.class
            r5.<init>(r14, r15)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r14 = "id"
            r5.putExtra(r14, r0)
            java.lang.String r0 = "privados"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r14 = "privados"
            r5.putExtra(r14, r0)
            r0 = r17
            java.lang.String r14 = r1.getString(r0)
            r5.putExtra(r0, r14)
            java.lang.String r0 = r1.getString(r2)
            r5.putExtra(r2, r0)
            java.lang.String r0 = "fnac_d"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "fnac_d"
            r5.putExtra(r2, r0)
            java.lang.String r0 = "fnac_m"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "fnac_m"
            r5.putExtra(r2, r0)
            java.lang.String r0 = "fnac_a"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "fnac_a"
            r5.putExtra(r2, r0)
            java.lang.String r0 = "sexo"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "sexo"
            r5.putExtra(r2, r0)
            java.lang.String r0 = "vfoto"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "vfoto"
            r5.putExtra(r2, r0)
            int r0 = r1.getInt(r4)
            r5.putExtra(r4, r0)
            int r0 = r1.getInt(r6)
            r5.putExtra(r6, r0)
            int r0 = r1.getInt(r7)
            r5.putExtra(r7, r0)
            int r0 = r1.getInt(r8)
            r5.putExtra(r8, r0)
            boolean r0 = r1.getBoolean(r9)
            r5.putExtra(r9, r0)
            boolean r0 = r1.getBoolean(r10)
            r5.putExtra(r10, r0)
            boolean r0 = r1.getBoolean(r11)
            r5.putExtra(r11, r0)
            int r0 = r1.getInt(r12)
            r5.putExtra(r12, r0)
            int r0 = r1.getInt(r13)
            r5.putExtra(r13, r0)
            java.lang.String r0 = "abrir_game"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x064f
            java.lang.String r0 = "abrir_game"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r1 = "abrir_game"
            r5.putExtra(r1, r0)
        L_0x064f:
            r2 = r5
        L_0x0650:
            if (r2 == 0) goto L_0x0658
            android.app.Activity r0 = r3.f8048c
            r1 = 0
            r0.startActivityForResult(r2, r1)
        L_0x0658:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1899p3.mo7802e(int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: british.x.p3$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            if (r18 != 0) goto L_0x00d5
            android.app.Activity r2 = r0.f8048c
            android.view.LayoutInflater r2 = r2.getLayoutInflater()
            r3 = 2131558703(0x7f0d012f, float:1.874273E38)
            android.view.View r2 = r2.inflate(r3, r1)
            british.x.p3$c r3 = new british.x.p3$c
            r3.<init>()
            r4 = 2131363236(0x7f0a05a4, float:1.8346275E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f8067e = r4
            r4 = 2131363232(0x7f0a05a0, float:1.8346267E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r3.f8072j = r4
            r4 = 2131363233(0x7f0a05a1, float:1.834627E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f8068f = r4
            r4 = 2131363237(0x7f0a05a5, float:1.8346277E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f8069g = r4
            r4 = 2131363235(0x7f0a05a3, float:1.8346273E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f8070h = r4
            r4 = 2131363234(0x7f0a05a2, float:1.8346271E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f8071i = r4
            r4 = 2131363243(0x7f0a05ab, float:1.834629E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f8063a = r4
            r4 = 2131363246(0x7f0a05ae, float:1.8346295E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f8065c = r4
            r4 = 2131363245(0x7f0a05ad, float:1.8346293E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f8064b = r4
            r4 = 2131363244(0x7f0a05ac, float:1.8346291E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f8066d = r4
            boolean r4 = r0.f8057l
            if (r4 == 0) goto L_0x009b
            android.widget.TextView r4 = r3.f8063a
            int r5 = british.p015x.C1692config.f7101A5
            r4.setTextColor(r5)
            android.widget.TextView r4 = r3.f8064b
            r4.setTextColor(r5)
            android.widget.TextView r4 = r3.f8066d
            r4.setTextColor(r5)
            goto L_0x00ac
        L_0x009b:
            android.widget.TextView r4 = r3.f8063a
            int r5 = british.p015x.C1692config.f7104D5
            r4.setTextColor(r5)
            android.widget.TextView r4 = r3.f8064b
            r4.setTextColor(r5)
            android.widget.TextView r4 = r3.f8066d
            r4.setTextColor(r5)
        L_0x00ac:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 < r5) goto L_0x00d1
            android.app.Activity r4 = r0.f8048c
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131034119(0x7f050007, float:1.7678747E38)
            boolean r4 = r4.getBoolean(r5)
            if (r4 == 0) goto L_0x00d1
            android.widget.TextView r4 = r3.f8063a
            r5 = 4
            r4.setTextDirection(r5)
            android.widget.TextView r4 = r3.f8064b
            r4.setTextDirection(r5)
            android.widget.TextView r4 = r3.f8066d
            r4.setTextDirection(r5)
        L_0x00d1:
            r2.setTag(r3)
            goto L_0x00de
        L_0x00d5:
            java.lang.Object r2 = r18.getTag()
            r3 = r2
            british.x.p3$c r3 = (british.p015x.C1899p3.C1902c) r3
            r2 = r18
        L_0x00de:
            java.util.ArrayList<british.x.r3> r4 = r0.f8049d
            r5 = r17
            java.lang.Object r4 = r4.get(r5)
            british.x.r3 r4 = (british.p015x.C2046r3) r4
            android.widget.TextView r7 = r3.f8064b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "<i>"
            r8.append(r9)
            java.lang.String r9 = r4.f8449d
            r8.append(r9)
            java.lang.String r9 = "</i>"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.text.Spanned r8 = android.text.Html.fromHtml(r8)
            r7.setText(r8)
            boolean r7 = r0.f8056k
            java.lang.String r8 = ""
            java.lang.String r9 = "0"
            java.lang.String r10 = ".jpg"
            java.lang.String r11 = "fperfil_"
            r12 = 8
            r13 = 1
            r14 = 0
            if (r7 != 0) goto L_0x0125
            android.widget.ImageView r7 = r3.f8067e
            r7.setVisibility(r12)
            android.widget.TextView r7 = r3.f8065c
            r7.setVisibility(r12)
            goto L_0x0215
        L_0x0125:
            android.widget.ImageView r7 = r3.f8067e
            r7.setVisibility(r14)
            android.widget.TextView r7 = r3.f8065c
            r7.setVisibility(r14)
            java.lang.String r7 = r4.f8450e
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x013a
        L_0x0137:
            r6 = 1
            goto L_0x01ea
        L_0x013a:
            android.content.SharedPreferences r7 = r0.f8051f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            java.lang.String r6 = r4.f8447b
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            java.lang.String r6 = r7.getString(r6, r8)
            java.lang.String r7 = r4.f8450e
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x01b8
            java.lang.String r6 = r0.f8052g
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r15 = ","
            r7.append(r15)
            java.lang.String r12 = r4.f8447b
            r7.append(r12)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            int r6 = r6.indexOf(r7)
            r7 = -1
            r12 = 2131230895(0x7f0800af, float:1.8077856E38)
            if (r6 != r7) goto L_0x01ae
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r0.f8052g
            r6.append(r7)
            r6.append(r15)
            java.lang.String r7 = r4.f8447b
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            r0.f8052g = r6
            android.widget.ImageView r6 = r3.f8067e
            r6.setImageResource(r12)
            r4.f8469x = r13
            british.x.p3$b r6 = new british.x.p3$b
            r6.<init>()
            java.lang.Integer[] r7 = new java.lang.Integer[r13]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            r7[r14] = r12
            r6.execute(r7)
            goto L_0x01e9
        L_0x01ae:
            boolean r6 = r4.f8469x
            if (r6 == 0) goto L_0x0137
            android.widget.ImageView r6 = r3.f8067e
            r6.setImageResource(r12)
            goto L_0x01e9
        L_0x01b8:
            british.x.config r6 = r0.f8047b
            android.app.Activity r7 = r0.f8048c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r15 = r4.f8447b
            r12.append(r15)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.io.File r6 = r6.mo7517m0(r7, r12)
            british.x.config r7 = r0.f8047b     // Catch:{ Exception -> 0x0137, OutOfMemoryError -> 0x01e9 }
            android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch:{ Exception -> 0x0137, OutOfMemoryError -> 0x01e9 }
            int r12 = r0.f8054i     // Catch:{ Exception -> 0x0137, OutOfMemoryError -> 0x01e9 }
            android.graphics.Bitmap r6 = r7.mo7477D(r6, r12, r12)     // Catch:{ Exception -> 0x0137, OutOfMemoryError -> 0x01e9 }
            android.graphics.Bitmap r6 = british.p015x.C1692config.m8188g0(r6, r13)     // Catch:{ Exception -> 0x0137, OutOfMemoryError -> 0x01e9 }
            android.widget.ImageView r7 = r3.f8067e     // Catch:{ Exception -> 0x0137, OutOfMemoryError -> 0x01e9 }
            r7.setImageBitmap(r6)     // Catch:{ Exception -> 0x0137, OutOfMemoryError -> 0x01e9 }
        L_0x01e9:
            r6 = 0
        L_0x01ea:
            if (r6 == 0) goto L_0x0215
            boolean r6 = r0.f8057l
            if (r6 == 0) goto L_0x0203
            android.widget.ImageView r6 = r3.f8067e
            android.app.Activity r7 = r0.f8048c
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131231485(0x7f0802fd, float:1.8079052E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r12)
            r6.setImageDrawable(r7)
            goto L_0x0215
        L_0x0203:
            android.widget.ImageView r6 = r3.f8067e
            android.app.Activity r7 = r0.f8048c
            android.content.res.Resources r7 = r7.getResources()
            r12 = 2131231487(0x7f0802ff, float:1.8079056E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r12)
            r6.setImageDrawable(r7)
        L_0x0215:
            android.widget.FrameLayout r6 = r3.f8072j
            r7 = 8
            r6.setVisibility(r7)
            android.widget.ImageView r6 = r3.f8069g
            r6.setVisibility(r7)
            android.widget.TextView r6 = r3.f8066d
            r6.setVisibility(r7)
            android.widget.ImageView r6 = r3.f8070h
            r6.setVisibility(r7)
            android.widget.ImageView r6 = r3.f8071i
            r6.setVisibility(r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "<b>"
            r6.append(r7)
            java.lang.String r7 = r4.f8448c
            r6.append(r7)
            java.lang.String r7 = "</b>"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r7 = r4.f8471z
            if (r7 == 0) goto L_0x024e
            goto L_0x070e
        L_0x024e:
            java.lang.String r7 = r4.f8446a
            java.lang.String r12 = "1"
            boolean r7 = r7.equals(r12)
            java.lang.String r12 = "_g.jpg"
            r15 = 2131230896(0x7f0800b0, float:1.8077858E38)
            java.lang.String r13 = " "
            if (r7 == 0) goto L_0x0304
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r13)
            android.app.Activity r6 = r0.f8048c
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131820887(0x7f110157, float:1.9274502E38)
            java.lang.String r6 = r6.getString(r10)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = r4.f8450e
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x070e
            android.content.SharedPreferences r7 = r0.f8051f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            java.lang.String r10 = r4.f8447b
            r9.append(r10)
            java.lang.String r10 = "_g"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r7 = r7.getString(r9, r8)
            java.lang.String r8 = r4.f8450e
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x02cb
            android.widget.ImageView r7 = r3.f8068f
            r7.setImageResource(r15)
            android.widget.FrameLayout r7 = r3.f8072j
            r7.setVisibility(r14)
            boolean r4 = r4.f8445A
            if (r4 != 0) goto L_0x070e
            british.x.p3$a r4 = new british.x.p3$a
            r4.<init>()
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r1[r14] = r5
            r4.execute(r1)
            goto L_0x070e
        L_0x02cb:
            british.x.config r1 = r0.f8047b
            android.app.Activity r5 = r0.f8048c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            java.lang.String r4 = r4.f8447b
            r7.append(r4)
            r7.append(r12)
            java.lang.String r4 = r7.toString()
            java.io.File r1 = r1.mo7517m0(r5, r4)
            british.x.config r4 = r0.f8047b     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.net.Uri r1 = android.net.Uri.fromFile(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r5 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r1 = r4.mo7477D(r1, r5, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r4 = 2
            android.graphics.Bitmap r1 = british.p015x.C1692config.m8147C(r1, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.ImageView r4 = r3.f8068f     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r4.setImageBitmap(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.FrameLayout r1 = r3.f8072j     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r1.setVisibility(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            goto L_0x070e
        L_0x0304:
            java.lang.String r7 = r4.f8446a
            java.lang.String r8 = "2"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x038a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r13)
            android.app.Activity r6 = r0.f8048c
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131820879(0x7f11014f, float:1.9274485E38)
            java.lang.String r6 = r6.getString(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            british.x.config r7 = r0.f8047b
            android.app.Activity r8 = r0.f8048c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "fperfilgal_"
            r9.append(r10)
            java.lang.String r10 = r4.f8451f
            r9.append(r10)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.io.File r7 = r7.mo7517m0(r8, r9)
            boolean r8 = r7.exists()
            if (r8 != 0) goto L_0x0372
            android.widget.ImageView r7 = r3.f8068f
            r7.setImageResource(r15)
            android.widget.FrameLayout r7 = r3.f8072j
            r7.setVisibility(r14)
            boolean r4 = r4.f8445A
            if (r4 != 0) goto L_0x070e
            british.x.p3$a r4 = new british.x.p3$a
            r4.<init>()
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r1[r14] = r5
            r4.execute(r1)
            goto L_0x070e
        L_0x0372:
            british.x.config r1 = r0.f8047b     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.net.Uri r4 = android.net.Uri.fromFile(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r5 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r1 = r1.mo7477D(r4, r5, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.ImageView r4 = r3.f8068f     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r4.setImageBitmap(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.FrameLayout r1 = r3.f8072j     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r1.setVisibility(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            goto L_0x070e
        L_0x038a:
            java.lang.String r7 = r4.f8446a
            java.lang.String r8 = "3"
            boolean r7 = r7.equals(r8)
            r8 = 2131820880(0x7f110150, float:1.9274487E38)
            if (r7 == 0) goto L_0x0415
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r13)
            android.app.Activity r6 = r0.f8048c
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getString(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            british.x.config r7 = r0.f8047b
            android.app.Activity r8 = r0.f8048c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "fperfilgalv_"
            r9.append(r11)
            java.lang.String r11 = r4.f8451f
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.io.File r7 = r7.mo7517m0(r8, r9)
            boolean r8 = r7.exists()
            if (r8 != 0) goto L_0x03f8
            android.widget.ImageView r7 = r3.f8068f
            r7.setImageResource(r15)
            android.widget.FrameLayout r7 = r3.f8072j
            r7.setVisibility(r14)
            boolean r4 = r4.f8445A
            if (r4 != 0) goto L_0x070e
            british.x.p3$a r4 = new british.x.p3$a
            r4.<init>()
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r1[r14] = r5
            r4.execute(r1)
            goto L_0x070e
        L_0x03f8:
            british.x.config r1 = r0.f8047b     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.net.Uri r4 = android.net.Uri.fromFile(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r5 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r1 = r1.mo7477D(r4, r5, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.ImageView r4 = r3.f8068f     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r4.setImageBitmap(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.ImageView r1 = r3.f8069g     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r1.setVisibility(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.FrameLayout r1 = r3.f8072j     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r1.setVisibility(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            goto L_0x070e
        L_0x0415:
            java.lang.String r7 = r4.f8446a
            java.lang.String r9 = "4"
            boolean r7 = r7.equals(r9)
            java.lang.String r9 = "&rdquo;</b>"
            java.lang.String r11 = "<b>&ldquo;"
            if (r7 == 0) goto L_0x0466
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r13)
            android.app.Activity r5 = r0.f8048c
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131820884(0x7f110154, float:1.9274496E38)
            java.lang.String r5 = r5.getString(r6)
            r1.append(r5)
            java.lang.String r6 = r1.toString()
            android.widget.TextView r1 = r3.f8066d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            java.lang.String r4 = r4.f8452g
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = r5.toString()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r3.f8066d
            r1.setVisibility(r14)
            goto L_0x070e
        L_0x0466:
            java.lang.String r7 = r4.f8446a
            java.lang.String r12 = "5"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x04b3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r13)
            android.app.Activity r5 = r0.f8048c
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131820885(0x7f110155, float:1.9274498E38)
            java.lang.String r5 = r5.getString(r6)
            r1.append(r5)
            java.lang.String r6 = r1.toString()
            android.widget.TextView r1 = r3.f8066d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            java.lang.String r4 = r4.f8452g
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = r5.toString()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r3.f8066d
            r1.setVisibility(r14)
            goto L_0x070e
        L_0x04b3:
            java.lang.String r7 = r4.f8446a
            java.lang.String r12 = "6"
            boolean r7 = r7.equals(r12)
            r12 = 2131820882(0x7f110152, float:1.9274491E38)
            if (r7 == 0) goto L_0x0500
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r13)
            android.app.Activity r5 = r0.f8048c
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getString(r12)
            r1.append(r5)
            java.lang.String r6 = r1.toString()
            android.widget.TextView r1 = r3.f8066d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            java.lang.String r4 = r4.f8452g
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = r5.toString()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r3.f8066d
            r1.setVisibility(r14)
            goto L_0x070e
        L_0x0500:
            java.lang.String r7 = r4.f8446a
            java.lang.String r12 = "7"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x058e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r13)
            android.app.Activity r6 = r0.f8048c
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131820888(0x7f110158, float:1.9274504E38)
            java.lang.String r6 = r6.getString(r8)
            r7.append(r6)
            r7.append(r13)
            java.lang.String r6 = r4.f8452g
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            british.x.config r7 = r0.f8047b
            android.app.Activity r8 = r0.f8048c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "game_banner"
            r9.append(r11)
            java.lang.String r11 = r4.f8451f
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.io.File r7 = r7.mo7517m0(r8, r9)
            boolean r8 = r7.exists()
            if (r8 != 0) goto L_0x0576
            android.widget.ImageView r7 = r3.f8068f
            r7.setImageResource(r15)
            android.widget.FrameLayout r7 = r3.f8072j
            r7.setVisibility(r14)
            boolean r4 = r4.f8445A
            if (r4 != 0) goto L_0x070e
            british.x.p3$a r4 = new british.x.p3$a
            r4.<init>()
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r1[r14] = r5
            r4.execute(r1)
            goto L_0x070e
        L_0x0576:
            british.x.config r1 = r0.f8047b     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.net.Uri r4 = android.net.Uri.fromFile(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r5 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r1 = r1.mo7477D(r4, r5, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.ImageView r4 = r3.f8068f     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r4.setImageBitmap(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.FrameLayout r1 = r3.f8072j     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r1.setVisibility(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            goto L_0x070e
        L_0x058e:
            java.lang.String r7 = r4.f8446a
            java.lang.String r12 = "8"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x05db
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r13)
            android.app.Activity r5 = r0.f8048c
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131820881(0x7f110151, float:1.927449E38)
            java.lang.String r5 = r5.getString(r6)
            r1.append(r5)
            java.lang.String r6 = r1.toString()
            android.widget.TextView r1 = r3.f8066d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            java.lang.String r4 = r4.f8452g
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = r5.toString()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r3.f8066d
            r1.setVisibility(r14)
            goto L_0x070e
        L_0x05db:
            java.lang.String r7 = r4.f8446a
            java.lang.String r12 = "9"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x0663
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r13)
            android.app.Activity r6 = r0.f8048c
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getString(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            british.x.config r7 = r0.f8047b
            android.app.Activity r8 = r0.f8048c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "fbuscvideo_"
            r9.append(r11)
            java.lang.String r11 = r4.f8451f
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.io.File r7 = r7.mo7517m0(r8, r9)
            boolean r8 = r7.exists()
            if (r8 != 0) goto L_0x0646
            android.widget.ImageView r7 = r3.f8068f
            r7.setImageResource(r15)
            android.widget.FrameLayout r7 = r3.f8072j
            r7.setVisibility(r14)
            boolean r4 = r4.f8445A
            if (r4 != 0) goto L_0x070e
            british.x.p3$a r4 = new british.x.p3$a
            r4.<init>()
            r1 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r1[r14] = r5
            r4.execute(r1)
            goto L_0x070e
        L_0x0646:
            british.x.config r1 = r0.f8047b     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.net.Uri r4 = android.net.Uri.fromFile(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r5 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r1 = r1.mo7477D(r4, r5, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.ImageView r4 = r3.f8068f     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r4.setImageBitmap(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.ImageView r1 = r3.f8069g     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r1.setVisibility(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            android.widget.FrameLayout r1 = r3.f8072j     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            r1.setVisibility(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x070e }
            goto L_0x070e
        L_0x0663:
            java.lang.String r1 = r4.f8446a
            java.lang.String r5 = "10"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x06af
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r13)
            android.app.Activity r5 = r0.f8048c
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131820882(0x7f110152, float:1.9274491E38)
            java.lang.String r5 = r5.getString(r6)
            r1.append(r5)
            java.lang.String r6 = r1.toString()
            android.widget.TextView r1 = r3.f8066d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            java.lang.String r4 = r4.f8452g
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = r5.toString()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r1.setText(r4)
            android.widget.TextView r1 = r3.f8066d
            r1.setVisibility(r14)
            goto L_0x070e
        L_0x06af:
            java.lang.String r1 = r4.f8446a
            java.lang.String r4 = "11"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x070e
            java.lang.String r1 = r0.f8053h
            if (r1 == 0) goto L_0x06e0
            java.lang.String r4 = "es"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x06cf
            java.lang.String r1 = r0.f8053h
            java.lang.String r4 = "ca"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x06e0
        L_0x06cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "A "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
        L_0x06e0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r13)
            android.app.Activity r4 = r0.f8048c
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131820899(0x7f110163, float:1.9274526E38)
            java.lang.String r4 = r4.getString(r5)
            r1.append(r4)
            java.lang.String r6 = r1.toString()
            boolean r1 = r0.f8057l
            if (r1 == 0) goto L_0x0709
            android.widget.ImageView r1 = r3.f8070h
            r1.setVisibility(r14)
            goto L_0x070e
        L_0x0709:
            android.widget.ImageView r1 = r3.f8071i
            r1.setVisibility(r14)
        L_0x070e:
            android.widget.TextView r1 = r3.f8063a
            android.text.Spanned r3 = android.text.Html.fromHtml(r6)
            r1.setText(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1899p3.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
