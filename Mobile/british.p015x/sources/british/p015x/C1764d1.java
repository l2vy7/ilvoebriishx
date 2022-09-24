package british.p015x;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: british.x.d1 */
/* compiled from: rss_adapter */
public class C1764d1 extends ArrayAdapter<C1773e1> {

    /* renamed from: b */
    C1692config f7635b;

    /* renamed from: c */
    private Activity f7636c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C1773e1> f7637d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1764d1 f7638e;

    /* renamed from: f */
    protected int f7639f = -1;

    /* renamed from: g */
    protected Drawable f7640g;

    /* renamed from: h */
    protected boolean f7641h = false;

    /* renamed from: i */
    protected boolean f7642i = true;

    /* renamed from: j */
    protected boolean f7643j = true;

    /* renamed from: k */
    Integer f7644k;

    /* renamed from: l */
    Integer f7645l;

    /* renamed from: british.x.d1$a */
    /* compiled from: rss_adapter */
    private class C1765a extends AsyncTask<Integer, Void, Integer> {
        private C1765a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|17) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00b3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Integer... r12) {
            /*
                r11 = this;
                r0 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r12 = r12[r0]
                r2 = -1
                java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x00cb }
                british.x.d1 r4 = british.p015x.C1764d1.this     // Catch:{ IOException -> 0x00cb }
                java.util.ArrayList r4 = r4.f7637d     // Catch:{ IOException -> 0x00cb }
                int r5 = r12.intValue()     // Catch:{ IOException -> 0x00cb }
                java.lang.Object r4 = r4.get(r5)     // Catch:{ IOException -> 0x00cb }
                british.x.e1 r4 = (british.p015x.C1773e1) r4     // Catch:{ IOException -> 0x00cb }
                java.lang.String r4 = r4.f7672a     // Catch:{ IOException -> 0x00cb }
                java.lang.String r5 = " "
                java.lang.String r6 = "%20"
                java.lang.String r4 = r4.replace(r5, r6)     // Catch:{ IOException -> 0x00cb }
                r3.<init>(r4)     // Catch:{ IOException -> 0x00cb }
                java.net.URLConnection r4 = r3.openConnection()     // Catch:{ IOException -> 0x00cb }
                java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x00cb }
                r5 = 1
                r4.setDoInput(r5)     // Catch:{ IOException -> 0x00cb }
                r6 = 5000(0x1388, float:7.006E-42)
                r4.setConnectTimeout(r6)     // Catch:{ IOException -> 0x00cb }
                r7 = 7000(0x1b58, float:9.809E-42)
                r4.setReadTimeout(r7)     // Catch:{ IOException -> 0x00cb }
                r4.connect()     // Catch:{ IOException -> 0x00cb }
                java.io.InputStream r8 = r4.getInputStream()     // Catch:{ IOException -> 0x00cb }
                android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x00cb }
                r9.<init>()     // Catch:{ IOException -> 0x00cb }
                r9.inJustDecodeBounds = r5     // Catch:{ IOException -> 0x00cb }
                r10 = 0
                android.graphics.BitmapFactory.decodeStream(r8, r10, r9)     // Catch:{ IOException -> 0x00cb }
                r8.close()     // Catch:{ IOException -> 0x00cb }
                r4.disconnect()     // Catch:{ IOException -> 0x00cb }
                int r4 = r9.outWidth     // Catch:{ IOException -> 0x00cb }
                if (r4 != r5) goto L_0x006e
                int r4 = r9.outHeight     // Catch:{ IOException -> 0x00cb }
                if (r4 != r5) goto L_0x006e
                british.x.d1 r0 = british.p015x.C1764d1.this     // Catch:{ IOException -> 0x00cb }
                java.util.ArrayList r0 = r0.f7637d     // Catch:{ IOException -> 0x00cb }
                int r12 = r12.intValue()     // Catch:{ IOException -> 0x00cb }
                java.lang.Object r12 = r0.get(r12)     // Catch:{ IOException -> 0x00cb }
                british.x.e1 r12 = (british.p015x.C1773e1) r12     // Catch:{ IOException -> 0x00cb }
                r12.f7672a = r10     // Catch:{ IOException -> 0x00cb }
                return r1
            L_0x006e:
                british.x.d1 r4 = british.p015x.C1764d1.this     // Catch:{ IOException -> 0x00cb }
                british.x.config r4 = r4.f7635b     // Catch:{ IOException -> 0x00cb }
                r4 = 300(0x12c, float:4.2E-43)
                int r4 = british.p015x.C1692config.m8192m(r9, r4, r4)     // Catch:{ IOException -> 0x00cb }
                r9.inSampleSize = r4     // Catch:{ IOException -> 0x00cb }
                java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException -> 0x00cb }
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00cb }
                r3.setDoInput(r5)     // Catch:{ IOException -> 0x00cb }
                r3.setConnectTimeout(r6)     // Catch:{ IOException -> 0x00cb }
                r3.setReadTimeout(r7)     // Catch:{ IOException -> 0x00cb }
                r3.connect()     // Catch:{ IOException -> 0x00cb }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x00cb }
                r9.inJustDecodeBounds = r0     // Catch:{ IOException -> 0x00cb }
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r10, r9)     // Catch:{ IOException -> 0x00cb }
                r3.close()     // Catch:{ IOException -> 0x00cb }
                if (r4 != 0) goto L_0x00a0
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x00cb }
                return r12
            L_0x00a0:
                java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00cb }
                r3.<init>()     // Catch:{ IOException -> 0x00cb }
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x00cb }
                r6 = 100
                r4.compress(r5, r6, r3)     // Catch:{ IOException -> 0x00cb }
                byte[] r4 = r3.toByteArray()     // Catch:{ IOException -> 0x00cb }
                r3.close()     // Catch:{ IOException -> 0x00b3 }
            L_0x00b3:
                british.x.d1 r3 = british.p015x.C1764d1.this     // Catch:{ IOException -> 0x00cb }
                java.util.ArrayList r3 = r3.f7637d     // Catch:{ IOException -> 0x00cb }
                int r12 = r12.intValue()     // Catch:{ IOException -> 0x00cb }
                java.lang.Object r12 = r3.get(r12)     // Catch:{ IOException -> 0x00cb }
                british.x.e1 r12 = (british.p015x.C1773e1) r12     // Catch:{ IOException -> 0x00cb }
                int r3 = r4.length     // Catch:{ IOException -> 0x00cb }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r4, r0, r3)     // Catch:{ IOException -> 0x00cb }
                r12.f7673b = r0     // Catch:{ IOException -> 0x00cb }
                return r1
            L_0x00cb:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.C1764d1.C1765a.doInBackground(java.lang.Integer[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                C1764d1.this.f7638e.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: british.x.d1$b */
    /* compiled from: rss_adapter */
    static class C1766b {

        /* renamed from: a */
        TextView f7647a;

        /* renamed from: b */
        TextView f7648b;

        /* renamed from: c */
        ImageView f7649c;

        /* renamed from: d */
        ImageView f7650d;

        /* renamed from: e */
        ImageView f7651e;

        C1766b() {
        }
    }

    public C1764d1(Context context, int i, ArrayList<C1773e1> arrayList) {
        super(context, i, arrayList);
        Activity activity = (Activity) context;
        this.f7636c = activity;
        this.f7635b = (C1692config) activity.getApplicationContext();
        this.f7637d = arrayList;
        this.f7638e = this;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C1766b bVar;
        if (view == null) {
            view = this.f7636c.getLayoutInflater().inflate(R.layout.rss_item, (ViewGroup) null);
            bVar = new C1766b();
            bVar.f7649c = (ImageView) view.findViewById(R.id.postThumb);
            TextView textView = (TextView) view.findViewById(R.id.postTitleLabel);
            bVar.f7647a = textView;
            Integer num = this.f7644k;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            if (Build.VERSION.SDK_INT >= 17 && this.f7636c.getResources().getBoolean(R.bool.es_rtl)) {
                bVar.f7647a.setTextDirection(4);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.postDateLabel);
            bVar.f7648b = textView2;
            Integer num2 = this.f7645l;
            if (num2 != null) {
                textView2.setTextColor(num2.intValue());
            }
            bVar.f7650d = (ImageView) view.findViewById(R.id.iv_item_sel);
            bVar.f7651e = (ImageView) view.findViewById(R.id.iv_item_der);
            view.setTag(bVar);
        } else {
            bVar = (C1766b) view.getTag();
        }
        if (!this.f7642i) {
            bVar.f7649c.setVisibility(8);
        } else if (this.f7637d.get(i).f7672a == null) {
            bVar.f7649c.setImageResource(17170445);
        } else if (this.f7637d.get(i).f7673b == null) {
            bVar.f7649c.setImageResource(R.drawable.loader_g);
            if (!this.f7637d.get(i).f7674c) {
                this.f7637d.get(i).f7674c = true;
                new C1765a().execute(new Integer[]{Integer.valueOf(i)});
            }
        } else {
            bVar.f7649c.setImageBitmap(this.f7637d.get(i).f7673b);
        }
        bVar.f7647a.setText(this.f7637d.get(i).f7675d);
        if (!this.f7643j || this.f7637d.get(i).f7676e == null || this.f7637d.get(i).f7676e.equals("")) {
            bVar.f7648b.setVisibility(8);
        } else {
            bVar.f7648b.setText(this.f7637d.get(i).f7676e);
        }
        if (!this.f7641h) {
            bVar.f7651e.setVisibility(8);
        } else if (i == this.f7639f) {
            bVar.f7650d.setImageDrawable(this.f7640g);
            bVar.f7650d.setVisibility(0);
        } else {
            bVar.f7650d.setVisibility(8);
        }
        return view;
    }
}
