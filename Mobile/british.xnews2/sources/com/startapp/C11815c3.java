package com.startapp;

import android.os.AsyncTask;
import android.os.Build;
import com.startapp.networkTest.data.IspInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.net.WebApiClient;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.HashMap;

/* renamed from: com.startapp.c3 */
/* compiled from: Sta */
public class C11815c3 {

    /* renamed from: e */
    private static final String f52644e = "c3";

    /* renamed from: f */
    private static final String f52645f = "ispinfo";

    /* renamed from: g */
    private static final String f52646g = "anonymize";

    /* renamed from: h */
    private static C11815c3 f52647h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f52648a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f52649b = false;

    /* renamed from: c */
    private HashMap<String, IspInfo> f52650c = new HashMap<>();

    /* renamed from: d */
    private IspInfo f52651d;

    /* renamed from: com.startapp.c3$a */
    /* compiled from: Sta */
    public class C11816a extends AsyncTask<WifiInfo, Void, IspInfo> {
        public C11816a() {
        }

        /* renamed from: a */
        public IspInfo doInBackground(WifiInfo... wifiInfoArr) {
            return C11815c3.this.mo45180a(wifiInfoArr[0]);
        }

        public void onPreExecute() {
            super.onPreExecute();
            boolean unused = C11815c3.this.f52648a = true;
        }

        /* renamed from: a */
        public void onPostExecute(IspInfo ispInfo) {
            super.onPostExecute(ispInfo);
            boolean unused = C11815c3.this.f52648a = false;
        }
    }

    /* renamed from: com.startapp.c3$b */
    /* compiled from: Sta */
    public class C11817b extends AsyncTask<Void, Void, IspInfo> {
        public C11817b() {
        }

        /* renamed from: a */
        public IspInfo doInBackground(Void... voidArr) {
            return C11815c3.this.mo45180a((WifiInfo) null);
        }

        public void onPreExecute() {
            super.onPreExecute();
            boolean unused = C11815c3.this.f52649b = true;
        }

        /* renamed from: a */
        public void onPostExecute(IspInfo ispInfo) {
            super.onPostExecute(ispInfo);
            boolean unused = C11815c3.this.f52649b = false;
        }
    }

    private C11815c3() {
    }

    /* renamed from: a */
    public static C11815c3 m52088a() {
        if (f52647h == null) {
            f52647h = new C11815c3();
        }
        return f52647h;
    }

    /* renamed from: b */
    public IspInfo mo45183b(WifiInfo wifiInfo, boolean z) {
        String str;
        C11800b5 b5Var;
        IspInfo ispInfo = new IspInfo();
        if (z) {
            try {
                str = C12385v4.m53561b().GEOIP_URL() + f52645f;
            } catch (Throwable th) {
                C12356u2.m53522a(th);
            }
        } else {
            str = C12385v4.m53561b().GEOIP_URL() + f52645f + "?" + f52646g + "=false";
        }
        C11808bd a = WebApiClient.m52650a(WebApiClient.RequestMethod.GET, str);
        if (a.f52633b.length() > 0 && (b5Var = (C11800b5) C12028l5.m52556a(a.f52633b, C11800b5.class)) != null) {
            ispInfo.AutonomousSystemNumber = C11926ga.m52349a(b5Var.AutonomousSystemNumber);
            ispInfo.AutonomousSystemOrganization = C11926ga.m52349a(b5Var.AutonomousSystemOrganization);
            ispInfo.IpAddress = C11926ga.m52349a(b5Var.IpAddress);
            ispInfo.IspName = C11926ga.m52349a(b5Var.IspName);
            ispInfo.IspOrganizationalName = C11926ga.m52349a(b5Var.IspOrganizationalName);
            ispInfo.SuccessfulIspLookup = true;
            if (wifiInfo != null) {
                synchronized (this.f52650c) {
                    this.f52650c.put(wifiInfo.WifiBSSID_Full, ispInfo);
                }
            } else {
                this.f52651d = ispInfo;
            }
        }
        return ispInfo;
    }

    /* renamed from: a */
    public IspInfo mo45181a(WifiInfo wifiInfo, boolean z) {
        IspInfo ispInfo;
        synchronized (this.f52650c) {
            ispInfo = this.f52650c.get(wifiInfo.WifiBSSID_Full);
        }
        if (ispInfo != null) {
            return ispInfo;
        }
        if (z && !this.f52648a) {
            if (Build.VERSION.SDK_INT < 11) {
                new C11816a().execute(new WifiInfo[]{wifiInfo});
            } else {
                new C11816a().executeOnExecutor(ThreadManager.m52679b().mo45624a(), new WifiInfo[]{wifiInfo});
            }
        }
        return new IspInfo();
    }

    /* renamed from: a */
    public IspInfo mo45182a(boolean z, boolean z2) {
        IspInfo ispInfo = this.f52651d;
        if ((z && !this.f52649b && ispInfo == null) || (z && !this.f52649b && z2)) {
            if (Build.VERSION.SDK_INT < 11) {
                new C11817b().execute(new Void[0]);
            } else {
                new C11817b().executeOnExecutor(ThreadManager.m52679b().mo45624a(), new Void[0]);
            }
        }
        return ispInfo == null ? new IspInfo() : ispInfo;
    }

    /* renamed from: a */
    public IspInfo mo45180a(WifiInfo wifiInfo) {
        return mo45183b(wifiInfo, true);
    }
}
