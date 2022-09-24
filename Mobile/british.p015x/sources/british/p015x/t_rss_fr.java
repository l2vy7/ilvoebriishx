package british.p015x;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/* renamed from: british.x.t_rss_fr */
public class t_rss_fr extends Fragment {

    /* renamed from: m0 */
    private View f9803m0 = null;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public ArrayList<C1773e1> f9804n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C1764d1 f9805o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public String f9806p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public SharedPreferences f9807q0;

    /* renamed from: r0 */
    C1692config f9808r0;

    /* renamed from: s0 */
    Bundle f9809s0;

    /* renamed from: t0 */
    int f9810t0;

    /* renamed from: british.x.t_rss_fr$a */
    class C2434a implements AdapterView.OnItemClickListener {
        C2434a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            t_rss_fr.this.f9805o0.f7639f = i;
            t_rss_fr.this.f9805o0.notifyDataSetChanged();
            ((t_rss) t_rss_fr.this.mo3443p()).mo8923D(((C1773e1) t_rss_fr.this.f9804n0.get(i)).f7677f);
        }
    }

    /* renamed from: british.x.t_rss_fr$b */
    private class C2435b extends AsyncTask<String, Integer, ArrayList<C1773e1>> {

        /* renamed from: a */
        ProgressBar f9812a;

        private C2435b() {
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
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
            if (r1.f9808r0.f7231O1[r1.f9810t0].f7872N == false) goto L_0x0038;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.util.ArrayList<british.p015x.C1773e1> r6) {
            /*
                r5 = this;
                if (r6 == 0) goto L_0x00b7
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0005:
                int r3 = r6.size()
                if (r1 >= r3) goto L_0x0028
                british.x.t_rss_fr r3 = british.p015x.t_rss_fr.this
                java.util.ArrayList r3 = r3.f9804n0
                java.lang.Object r4 = r6.get(r1)
                british.x.e1 r4 = (british.p015x.C1773e1) r4
                r3.add(r4)
                java.lang.Object r3 = r6.get(r1)
                british.x.e1 r3 = (british.p015x.C1773e1) r3
                java.lang.String r3 = r3.f7672a
                if (r3 == 0) goto L_0x0025
                r2 = 1
            L_0x0025:
                int r1 = r1 + 1
                goto L_0x0005
            L_0x0028:
                if (r2 == 0) goto L_0x0038
                british.x.t_rss_fr r1 = british.p015x.t_rss_fr.this
                british.x.config r2 = r1.f9808r0
                british.x.l[] r2 = r2.f7231O1
                int r1 = r1.f9810t0
                r1 = r2[r1]
                boolean r1 = r1.f7872N
                if (r1 != 0) goto L_0x0040
            L_0x0038:
                british.x.t_rss_fr r1 = british.p015x.t_rss_fr.this
                british.x.d1 r1 = r1.f9805o0
                r1.f7642i = r0
            L_0x0040:
                british.x.t_rss_fr r1 = british.p015x.t_rss_fr.this
                british.x.config r2 = r1.f9808r0
                british.x.l[] r2 = r2.f7231O1
                int r3 = r1.f9810t0
                r2 = r2[r3]
                boolean r2 = r2.f7874O
                if (r2 != 0) goto L_0x0054
                british.x.d1 r1 = r1.f9805o0
                r1.f7643j = r0
            L_0x0054:
                british.x.t_rss_fr r1 = british.p015x.t_rss_fr.this
                british.x.d1 r1 = r1.f9805o0
                r1.notifyDataSetChanged()
                int r1 = r6.size()
                if (r1 <= 0) goto L_0x00b7
                java.lang.Object r1 = r6.get(r0)
                british.x.e1 r1 = (british.p015x.C1773e1) r1
                java.lang.String r1 = r1.f7677f
                if (r1 == 0) goto L_0x00b7
                java.lang.Object r1 = r6.get(r0)
                british.x.e1 r1 = (british.p015x.C1773e1) r1
                java.lang.String r1 = r1.f7677f
                java.lang.String r2 = ""
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b7
                british.x.t_rss_fr r1 = british.p015x.t_rss_fr.this
                android.content.SharedPreferences r1 = r1.f9807q0
                android.content.SharedPreferences$Editor r1 = r1.edit()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "rss_"
                r2.append(r3)
                british.x.t_rss_fr r3 = british.p015x.t_rss_fr.this
                british.x.config r4 = r3.f9808r0
                british.x.l[] r4 = r4.f7231O1
                int r3 = r3.f9810t0
                r3 = r4[r3]
                int r3 = r3.f7964y
                r2.append(r3)
                java.lang.String r3 = "_ultpost"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.Object r6 = r6.get(r0)
                british.x.e1 r6 = (british.p015x.C1773e1) r6
                java.lang.String r6 = r6.f7677f
                r1.putString(r2, r6)
                r1.commit()
            L_0x00b7:
                android.widget.ProgressBar r6 = r5.f9812a     // Catch:{ Exception -> 0x00be }
                r0 = 8
                r6.setVisibility(r0)     // Catch:{ Exception -> 0x00be }
            L_0x00be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: british.p015x.t_rss_fr.C2435b.onPostExecute(java.util.ArrayList):void");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (C1692config.m8153I("#" + t_rss_fr.this.f9806p0)) {
                this.f9812a = (ProgressBar) t_rss_fr.this.mo3443p().findViewById(R.id.pb_rss_inv);
            } else {
                this.f9812a = (ProgressBar) t_rss_fr.this.mo3443p().findViewById(R.id.pb_rss);
            }
            if (Build.VERSION.SDK_INT > 20) {
                C1692config.m8168S0(this.f9812a, t_rss_fr.this.f9808r0.f7368l1);
            }
            this.f9812a.setVisibility(0);
        }
    }

    @TargetApi(13)
    /* renamed from: n0 */
    public void mo3435n0(Bundle bundle) {
        int i;
        super.mo3435n0(bundle);
        new C2435b().execute(new String[]{this.f9808r0.f7231O1[this.f9810t0].f7910e});
        this.f9805o0.f7641h = false;
        Display defaultDisplay = mo3443p().getWindowManager().getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (!((t_rss) mo3443p()).f9789D && i > ((int) ((mo3380N().getDisplayMetrics().density * 500.0f) + 0.5f))) {
            this.f9805o0.f7641h = true;
        }
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1692config config = (C1692config) mo3443p().getApplicationContext();
        this.f9808r0 = config;
        if (config.f7313c1 == null) {
            config.mo7490V0();
        }
        this.f9807q0 = mo3443p().getSharedPreferences("sh", 0);
        Bundle extras = mo3443p().getIntent().getExtras();
        this.f9809s0 = extras;
        this.f9810t0 = extras.getInt("ind");
        View inflate = layoutInflater.inflate(R.layout.t_rss, viewGroup, false);
        this.f9803m0 = inflate;
        ListView listView = (ListView) inflate.findViewById(R.id.postListView);
        listView.setCacheColorHint(0);
        C1855l[] lVarArr = this.f9808r0.f7231O1;
        int i = this.f9810t0;
        String str = lVarArr[i].f7916g;
        this.f9806p0 = str;
        String str2 = lVarArr[i].f7919h;
        String str3 = lVarArr[i].f7949r;
        String str4 = lVarArr[i].f7952s;
        if (!str.equals("") && !this.f9806p0.equals("")) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            listView.setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor("#" + this.f9806p0), Color.parseColor("#" + str2)}));
        }
        this.f9804n0 = new ArrayList<>();
        this.f9805o0 = new C1764d1(this.f9803m0.getContext(), R.layout.rss_item, this.f9804n0);
        if (!str3.equals("")) {
            C1764d1 d1Var = this.f9805o0;
            d1Var.f7644k = Integer.valueOf(Color.parseColor("#" + str3));
        }
        if (!str4.equals("")) {
            C1764d1 d1Var2 = this.f9805o0;
            d1Var2.f7645l = Integer.valueOf(Color.parseColor("#" + str4));
        }
        this.f9805o0.f7640g = mo3380N().getDrawable(R.drawable.item_sel);
        this.f9805o0.f7640g.setColorFilter(Color.parseColor("#FFFFFFFF"), PorterDuff.Mode.MULTIPLY);
        listView.setAdapter(this.f9805o0);
        listView.setOnItemClickListener(new C2434a());
        return this.f9803m0;
    }
}
