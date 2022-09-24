package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.startapp.networkTest.controller.LocationController;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.TriggerEvents;
import com.startapp.networkTest.enums.voice.CallStates;
import com.startapp.networkTest.results.NetworkInformationResult;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.startapp.v6 */
/* compiled from: Sta */
public class C12388v6 {

    /* renamed from: n */
    private static final String f54889n = "v6";

    /* renamed from: o */
    private static final boolean f54890o = false;

    /* renamed from: p */
    private static final int f54891p = 30000;

    /* renamed from: q */
    private static final String f54892q = "p3insnir";

    /* renamed from: r */
    private static final String f54893r = "P3INS_PFK_NIR_FIRSTCELLID_LATITUDE";

    /* renamed from: s */
    private static final String f54894s = "P3INS_PFK_NIR_FIRSTCELLID_LONGITUDE";

    /* renamed from: t */
    private static final String f54895t = "P3INS_PFK_NIR_FIRSTCELLID_GSMCELLID";

    /* renamed from: a */
    private SharedPreferences f54896a;

    /* renamed from: b */
    private Context f54897b;

    /* renamed from: c */
    private C12408w4 f54898c;

    /* renamed from: d */
    private String f54899d;

    /* renamed from: e */
    private C11849d8 f54900e;

    /* renamed from: f */
    private C11891ed f54901f;

    /* renamed from: g */
    private LocationController f54902g;

    /* renamed from: h */
    private TelephonyManager f54903h;

    /* renamed from: i */
    private C12390b f54904i;

    /* renamed from: j */
    private C12391c f54905j;

    /* renamed from: k */
    private int f54906k = 0;

    /* renamed from: l */
    private int f54907l;

    /* renamed from: m */
    private boolean f54908m;

    /* renamed from: com.startapp.v6$b */
    /* compiled from: Sta */
    public class C12390b {

        /* renamed from: a */
        public String f54909a;

        /* renamed from: b */
        public double f54910b;

        /* renamed from: c */
        public double f54911c;

        public C12390b(String str, double d, double d2) {
            this.f54909a = str;
            this.f54910b = d;
            this.f54911c = d2;
        }
    }

    /* renamed from: com.startapp.v6$c */
    /* compiled from: Sta */
    public class C12391c {

        /* renamed from: a */
        public String f54913a;

        /* renamed from: b */
        public String f54914b;

        /* renamed from: c */
        public String f54915c;

        /* renamed from: d */
        public NetworkTypes f54916d;

        /* renamed from: e */
        public String f54917e;

        /* renamed from: f */
        public String f54918f;

        /* renamed from: g */
        public int f54919g;

        private C12391c() {
            this.f54913a = "";
            this.f54914b = "";
            this.f54915c = "";
            this.f54916d = NetworkTypes.Unknown;
            this.f54917e = "";
            this.f54918f = "";
        }

        /* renamed from: a */
        public void mo46683a(String str, String str2, String str3, NetworkTypes networkTypes, String str4, String str5, int i) {
            this.f54914b = str;
            this.f54913a = str2;
            this.f54915c = str3;
            this.f54916d = networkTypes;
            this.f54917e = str4;
            this.f54918f = str5;
            this.f54919g = i;
        }
    }

    public C12388v6(Context context) {
        int i;
        this.f54897b = context;
        this.f54898c = new C12408w4(context);
        this.f54899d = C12385v4.m53561b().PROJECT_ID();
        this.f54896a = context.getSharedPreferences(f54892q, 0);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.f54903h = telephonyManager;
        if (!(Build.VERSION.SDK_INT < 24 || telephonyManager == null || (i = C12042m2.m52587i(context).SubscriptionId) == -1)) {
            this.f54903h = this.f54903h.createForSubscriptionId(i);
        }
        this.f54900e = new C11849d8(this.f54897b);
        this.f54901f = new C11891ed(this.f54897b);
        this.f54902g = new LocationController(this.f54897b);
        this.f54905j = new C12391c();
        this.f54908m = C12385v4.m53561b().NIR_COLLECT_CELLINFO();
        int NIR_COLLECT_CELLINFO_THRESHOLD = C12385v4.m53561b().NIR_COLLECT_CELLINFO_THRESHOLD();
        this.f54907l = NIR_COLLECT_CELLINFO_THRESHOLD;
        if (NIR_COLLECT_CELLINFO_THRESHOLD <= 0) {
            this.f54907l = 1;
        }
    }

    /* renamed from: d */
    private void m53572d() {
        String string = this.f54896a.getString(f54895t, "");
        if (!string.isEmpty()) {
            this.f54904i = new C12390b(string, Double.longBitsToDouble(this.f54896a.getLong(f54893r, 0)), Double.longBitsToDouble(this.f54896a.getLong(f54894s, 0)));
        }
    }

    /* renamed from: a */
    public NetworkInformationResult mo46675a(TriggerEvents triggerEvents, boolean z) {
        return mo46674a(this.f54902g.mo45580c(), triggerEvents, z);
    }

    /* renamed from: b */
    public void mo46679b(C11886e8 e8Var) {
        C11849d8 d8Var = this.f54900e;
        if (d8Var != null) {
            d8Var.mo45246b(e8Var);
        }
    }

    /* renamed from: c */
    public void mo46680c() {
        LocationController locationController = this.f54902g;
        if (locationController != null) {
            locationController.mo45579a((LocationController.C12083c) null);
        }
    }

    /* renamed from: e */
    public void mo46681e() {
        this.f54902g.mo45578a(LocationController.ProviderMode.Passive);
        this.f54900e.mo45266x();
        this.f54901f.mo45336f();
    }

    /* renamed from: f */
    public void mo46682f() {
        this.f54902g.mo45582f();
        this.f54900e.mo45267y();
        this.f54901f.mo45337g();
    }

    /* renamed from: a */
    public NetworkInformationResult mo46674a(LocationInfo locationInfo, TriggerEvents triggerEvents, boolean z) {
        String str;
        C12390b bVar;
        C12390b bVar2;
        C12390b bVar3;
        C12390b bVar4;
        NetworkInformationResult networkInformationResult = new NetworkInformationResult(this.f54899d, this.f54898c.mo46775p());
        if (locationInfo != null) {
            networkInformationResult.LocationInfo = locationInfo;
        } else {
            networkInformationResult.LocationInfo = this.f54902g.mo45580c();
        }
        TimeInfo e = C12112oa.m52717e();
        networkInformationResult.TimeInfo = e;
        networkInformationResult.Timestamp = e.TimestampTableau;
        networkInformationResult.timestampMillis = e.TimestampMillis;
        networkInformationResult.NirId = C12140q3.m52770a(e, networkInformationResult.GUID);
        networkInformationResult.WifiInfo = this.f54901f.mo45333c();
        networkInformationResult.TriggerEvent = triggerEvents;
        networkInformationResult.ScreenState = C12042m2.m52586h(this.f54897b);
        networkInformationResult.CallState = m53570a();
        if (this.f54908m) {
            int i = this.f54906k;
            this.f54906k = i + 1;
            if (i % this.f54907l == 0 || z) {
                networkInformationResult.CellInfo = new ArrayList<>(Arrays.asList(this.f54900e.mo45248c()));
            }
        }
        networkInformationResult.RadioInfo = this.f54900e.mo45255h();
        String str2 = "";
        synchronized (this) {
            if (this.f54904i == null) {
                m53572d();
            }
            if (!networkInformationResult.RadioInfo.GsmCellId.isEmpty()) {
                if (networkInformationResult.LocationInfo.LocationAge < 30000 && ((bVar4 = this.f54904i) == null || !bVar4.f54909a.equals(networkInformationResult.RadioInfo.GsmCellId))) {
                    String str3 = networkInformationResult.RadioInfo.GsmCellId;
                    LocationInfo locationInfo2 = networkInformationResult.LocationInfo;
                    C12390b bVar5 = new C12390b(str3, locationInfo2.LocationLatitude, locationInfo2.LocationLongitude);
                    this.f54904i = bVar5;
                    networkInformationResult.CellIdDeltaDistance = 0.0d;
                    m53571a(bVar5);
                }
                str2 = networkInformationResult.RadioInfo.GsmCellId;
            } else if (!networkInformationResult.RadioInfo.CdmaBaseStationId.isEmpty()) {
                if (networkInformationResult.LocationInfo.LocationAge < 30000 && ((bVar3 = this.f54904i) == null || !bVar3.f54909a.equals(networkInformationResult.RadioInfo.CdmaBaseStationId))) {
                    String str4 = networkInformationResult.RadioInfo.CdmaBaseStationId;
                    LocationInfo locationInfo3 = networkInformationResult.LocationInfo;
                    C12390b bVar6 = new C12390b(str4, locationInfo3.LocationLatitude, locationInfo3.LocationLongitude);
                    this.f54904i = bVar6;
                    networkInformationResult.CellIdDeltaDistance = 0.0d;
                    m53571a(bVar6);
                }
                str2 = networkInformationResult.RadioInfo.CdmaBaseStationId;
            }
            str = str2;
        }
        if ((!networkInformationResult.RadioInfo.GsmCellId.isEmpty() && networkInformationResult.CellIdDeltaDistance == -1.0d && (bVar2 = this.f54904i) != null && bVar2.f54909a.equals(networkInformationResult.RadioInfo.GsmCellId)) || (!networkInformationResult.RadioInfo.CdmaBaseStationId.isEmpty() && networkInformationResult.CellIdDeltaDistance == -1.0d && (bVar = this.f54904i) != null && bVar.f54909a.equals(networkInformationResult.RadioInfo.CdmaBaseStationId))) {
            C12390b bVar7 = this.f54904i;
            double d = bVar7.f54910b;
            double d2 = bVar7.f54911c;
            LocationInfo locationInfo4 = networkInformationResult.LocationInfo;
            networkInformationResult.CellIdDeltaDistance = C12123p2.m52740a(d, d2, locationInfo4.LocationLatitude, locationInfo4.LocationLongitude);
        }
        if (!str.isEmpty() && !str.equals(this.f54905j.f54913a)) {
            C12391c cVar = this.f54905j;
            networkInformationResult.PrevNirId = cVar.f54914b;
            networkInformationResult.PrevCellId = cVar.f54913a;
            networkInformationResult.PrevLAC = cVar.f54915c;
            networkInformationResult.PrevNetworkType = cVar.f54916d;
            networkInformationResult.PrevMCC = cVar.f54917e;
            networkInformationResult.PrevMNC = cVar.f54918f;
            networkInformationResult.PrevRXLevel = cVar.f54919g;
        }
        C12391c cVar2 = this.f54905j;
        String str5 = networkInformationResult.NirId;
        RadioInfo radioInfo = networkInformationResult.RadioInfo;
        cVar2.mo46683a(str5, str, radioInfo.GsmLAC, radioInfo.NetworkType, radioInfo.MCC, radioInfo.MNC, radioInfo.RXLevel);
        return networkInformationResult;
    }

    /* renamed from: b */
    public C11849d8 mo46678b() {
        return this.f54900e;
    }

    /* renamed from: a */
    private CallStates m53570a() {
        if (this.f54903h == null) {
            return CallStates.Unknown;
        }
        if (Build.VERSION.SDK_INT >= 31 && this.f54897b.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            return CallStates.Unknown;
        }
        int callState = this.f54903h.getCallState();
        if (callState == 0) {
            return CallStates.Idle;
        }
        if (callState == 1) {
            return CallStates.Ringing;
        }
        if (callState != 2) {
            return CallStates.Unknown;
        }
        return CallStates.Offhook;
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    private void m53571a(C12390b bVar) {
        this.f54896a.edit().putString(f54895t, bVar.f54909a).commit();
        this.f54896a.edit().putLong(f54893r, Double.doubleToRawLongBits(bVar.f54910b)).commit();
        this.f54896a.edit().putLong(f54894s, Double.doubleToRawLongBits(bVar.f54911c)).commit();
    }

    /* renamed from: a */
    public void mo46677a(LocationController.C12083c cVar) {
        LocationController locationController = this.f54902g;
        if (locationController != null) {
            locationController.mo45579a(cVar);
        }
    }

    /* renamed from: a */
    public void mo46676a(C11886e8 e8Var) {
        C11849d8 d8Var = this.f54900e;
        if (d8Var != null) {
            d8Var.mo45241a(e8Var);
        }
    }
}
