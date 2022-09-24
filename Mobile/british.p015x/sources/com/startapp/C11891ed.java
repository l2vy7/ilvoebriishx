package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.enums.WifiStates;
import java.lang.reflect.Method;

/* renamed from: com.startapp.ed */
/* compiled from: Sta */
public class C11891ed {

    /* renamed from: h */
    private static final String f52911h = "ed";

    /* renamed from: i */
    private static final boolean f52912i = false;

    /* renamed from: j */
    public static final int f52913j = -1;

    /* renamed from: a */
    private WifiStates f52914a;

    /* renamed from: b */
    private ConnectivityManager f52915b;

    /* renamed from: c */
    private boolean f52916c = false;

    /* renamed from: d */
    private Context f52917d;

    /* renamed from: e */
    private String f52918e = "";

    /* renamed from: f */
    private boolean f52919f;

    /* renamed from: g */
    private Method f52920g;

    /* renamed from: com.startapp.ed$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C11892a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52921a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.AnonymizationLevel[] r0 = com.startapp.networkTest.enums.AnonymizationLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52921a = r0
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Full     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52921a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Anonymized     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52921a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.None     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11891ed.C11892a.<clinit>():void");
        }
    }

    public C11891ed(Context context) {
        this.f52917d = context.getApplicationContext();
        this.f52915b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f52914a = WifiStates.Unknown;
        m52279a();
    }

    /* renamed from: a */
    private String m52278a(String str) {
        int i;
        if (str.length() == 0 || (i = C11892a.f52921a[C12385v4.m53561b().WIFIINFO_BSSID_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i != 2) {
            return "";
        }
        if (str.length() != 17) {
            return "xx:xx:xx:xx:xx:xx";
        }
        return str.substring(0, 9) + "xx:xx:xx";
    }

    /* renamed from: a */
    private void m52279a() {
    }

    /* renamed from: b */
    private String m52280b(String str) {
        return (str.length() == 0 || C11892a.f52921a[C12385v4.m53561b().WIFIINFO_SSID_RECORDTYPE().ordinal()] == 1) ? str : "";
    }

    /* renamed from: c */
    public WifiInfo mo45333c() {
        WifiInfo wifiInfo = new WifiInfo();
        wifiInfo.MissingPermission = true;
        try {
            this.f52917d.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE");
            return wifiInfo;
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            return wifiInfo;
        }
    }

    /* renamed from: d */
    public long mo45334d() {
        if (this.f52918e.length() == 0) {
            mo45333c();
        }
        if (this.f52918e.length() == 0) {
            return -1;
        }
        return C12433xa.m53755a(this.f52918e);
    }

    /* renamed from: e */
    public long mo45335e() {
        String str = this.f52918e;
        if (str == null || str.length() == 0) {
            mo45333c();
        }
        String str2 = this.f52918e;
        if (str2 == null || str2.length() == 0) {
            return -1;
        }
        return C12433xa.m53758b(this.f52918e);
    }

    /* renamed from: f */
    public void mo45336f() {
    }

    /* renamed from: g */
    public void mo45337g() {
    }

    /* renamed from: b */
    private int[] m52281b() {
        int[] iArr = {-1, 0};
        if (this.f52919f) {
            return iArr;
        }
        String[] a = C12130p9.m52744a("/proc/net/wireless");
        if (a.length == 0) {
            this.f52919f = true;
            return iArr;
        }
        if (a.length > 2) {
            int i = 2;
            while (i < a.length) {
                String[] a2 = C11926ga.m52353a(a[i].trim().split(" "));
                if (a2.length <= 4 || !a2[0].equals("wlan0:")) {
                    i++;
                } else {
                    try {
                        return new int[]{Integer.parseInt(a2[2].replace(".", "")), Integer.parseInt(a2[3].replace(".", ""))};
                    } catch (NumberFormatException unused) {
                        return iArr;
                    }
                }
            }
        }
        return iArr;
    }
}
