package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.LocationMetadata;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.ja */
/* compiled from: Sta */
public class C11992ja extends C12344t7<C11969ia> {

    /* renamed from: j */
    public final C5001b2 f53173j;

    /* renamed from: k */
    public final C12462z2<TelephonyMetadata> f53174k;

    /* renamed from: l */
    public final C12462z2<LocationMetadata> f53175l;

    /* renamed from: m */
    public final TelephonyManager.CellInfoCallback f53176m;

    /* renamed from: com.startapp.ja$a */
    /* compiled from: Sta */
    public class C11993a extends TelephonyManager.CellInfoCallback {
        public C11993a() {
        }

        public void onCellInfo(List<CellInfo> list) {
            C11992ja.this.mo45483b(false);
        }
    }

    /* renamed from: com.startapp.ja$b */
    /* compiled from: Sta */
    public class C11994b implements Comparator<CellInfo> {
        public C11994b(C11992ja jaVar) {
        }

        public int compare(Object obj, Object obj2) {
            CellInfo cellInfo = (CellInfo) obj;
            CellInfo cellInfo2 = (CellInfo) obj2;
            if (cellInfo.isRegistered() == cellInfo2.isRegistered()) {
                return C11992ja.m52506a(cellInfo2) - C11992ja.m52506a(cellInfo);
            }
            if (cellInfo.isRegistered()) {
                return -1;
            }
            return cellInfo2.isRegistered() ? 1 : 0;
        }
    }

    public C11992ja(Context context, C5069e eVar, C12071n3 n3Var, C5001b2 b2Var, C12462z2<TelephonyMetadata> z2Var, C12462z2<LocationMetadata> z2Var2) {
        super(context, eVar, n3Var, "c9c194d3e01bcf14", "086ea3852ae4e475");
        this.f53173j = b2Var;
        this.f53174k = z2Var;
        this.f53175l = z2Var2;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f53176m = new C11993a();
        } else {
            this.f53176m = null;
        }
    }

    /* renamed from: a */
    public final void mo45481a(C11969ia iaVar, CellLocation cellLocation) {
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            iaVar.mo45454a(4, C11760a.m51986b(String.valueOf(gsmCellLocation.getCid())));
            iaVar.mo45454a(3, C11760a.m51986b(String.valueOf(gsmCellLocation.getLac())));
        } else if (cellLocation instanceof CdmaCellLocation) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            iaVar.mo45454a(1, C11760a.m51986b(String.valueOf(cdmaCellLocation.getBaseStationLatitude())));
            iaVar.mo45454a(2, C11760a.m51986b(String.valueOf(cdmaCellLocation.getBaseStationLongitude())));
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public void mo45483b(boolean z) {
        TelephonyMetadata call;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f52927a.getSystemService("phone");
            C11969ia iaVar = new C11969ia(new JSONObject());
            iaVar.mo45454a(7, Integer.valueOf(telephonyManager.getSimState()));
            iaVar.mo45454a(8, telephonyManager.getSimOperator());
            iaVar.mo45454a(9, telephonyManager.getSimOperatorName());
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                iaVar.mo45454a(15, String.valueOf(telephonyManager.getSimCarrierId()));
                iaVar.mo45454a(16, String.valueOf(telephonyManager.getSimCarrierIdName()));
            }
            iaVar.mo45454a(10, Integer.valueOf(telephonyManager.getPhoneType()));
            iaVar.mo45454a(11, C11760a.m51986b(telephonyManager.getNetworkOperator()));
            iaVar.mo45454a(12, C11760a.m51986b(telephonyManager.getNetworkOperatorName()));
            LocationMetadata call2 = this.f53175l.call();
            if ((call2 == null || !call2.mo46332a()) ? false : C12437y.m53782a(this.f52927a, "android.permission.ACCESS_FINE_LOCATION")) {
                if (i >= 29 && z && (call = this.f53174k.call()) != null && call.mo46432d()) {
                    telephonyManager.requestCellInfoUpdate(this.f54761f, this.f53176m);
                }
                if (i >= 17) {
                    List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                    if (allCellInfo != null) {
                        mo45482a(iaVar, allCellInfo);
                    }
                } else {
                    mo45481a(iaVar, telephonyManager.getCellLocation());
                }
            }
            mo46638b(iaVar);
        } catch (Throwable th) {
            C5004d4.m22887a(th);
        }
    }

    /* renamed from: c */
    public String mo45484c(Object obj) {
        return ((C11969ia) obj).f53116a.toString();
    }

    /* renamed from: d */
    public long mo45393d() {
        return 60000;
    }

    /* renamed from: f */
    public boolean mo45394f() {
        TelephonyMetadata call;
        if (!this.f53173j.mo20655c() || (call = this.f53174k.call()) == null || !call.mo46431c()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo45395g() {
        mo45483b(true);
    }

    /* renamed from: c */
    public Object mo45174c() {
        return C11969ia.f53115b;
    }

    /* renamed from: a */
    public Object mo45391a(String str) {
        if (str != null) {
            C11969ia iaVar = C11969ia.f53115b;
            try {
                return new C11969ia(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static int m52506a(CellInfo cellInfo) {
        CellSignalStrength cellSignalStrength;
        if (cellInfo instanceof CellInfoCdma) {
            cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoGsm) {
            cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
        } else if (cellInfo instanceof CellInfoLte) {
            cellSignalStrength = ((CellInfoLte) cellInfo).getCellSignalStrength();
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
                cellSignalStrength = ((CellInfoNr) cellInfo).getCellSignalStrength();
            } else if (i < 29 || !(cellInfo instanceof CellInfoTdscdma)) {
                cellSignalStrength = (i < 18 || !(cellInfo instanceof CellInfoWcdma)) ? null : ((CellInfoWcdma) cellInfo).getCellSignalStrength();
            } else {
                cellSignalStrength = ((CellInfoTdscdma) cellInfo).getCellSignalStrength();
            }
        }
        if (cellSignalStrength != null) {
            return cellSignalStrength.getLevel();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo45482a(C11969ia iaVar, List<CellInfo> list) {
        CellIdentityWcdma cellIdentity;
        int tac;
        int timingAdvance;
        int tac2;
        CellSignalStrengthGsm cellSignalStrength;
        int timingAdvance2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C11994b(this));
        iaVar.mo45454a(6, C11760a.m51986b(arrayList.toString()));
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            if (z) {
                z = false;
                if (cellInfo instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                    if (cellIdentity2 != null) {
                        int latitude = cellIdentity2.getLatitude();
                        int longitude = cellIdentity2.getLongitude();
                        if (!(latitude == Integer.MAX_VALUE || longitude == Integer.MAX_VALUE)) {
                            iaVar.mo45454a(1, C11760a.m51986b(String.valueOf(latitude)));
                            iaVar.mo45454a(2, C11760a.m51986b(String.valueOf(longitude)));
                        }
                    }
                } else if (cellInfo instanceof CellInfoGsm) {
                    CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                    CellIdentityGsm cellIdentity3 = cellInfoGsm.getCellIdentity();
                    if (cellIdentity3 != null) {
                        int lac = cellIdentity3.getLac();
                        if (lac != Integer.MAX_VALUE) {
                            iaVar.mo45454a(3, C11760a.m51986b(String.valueOf(lac)));
                        }
                        int cid = cellIdentity3.getCid();
                        if (cid != Integer.MAX_VALUE) {
                            iaVar.mo45454a(4, C11760a.m51986b(String.valueOf(cid)));
                        }
                    }
                    if (!(Build.VERSION.SDK_INT < 26 || (cellSignalStrength = cellInfoGsm.getCellSignalStrength()) == null || (timingAdvance2 = cellSignalStrength.getTimingAdvance()) == Integer.MAX_VALUE)) {
                        iaVar.mo45454a(13, String.valueOf(timingAdvance2));
                    }
                } else if (cellInfo instanceof CellInfoLte) {
                    CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                    CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
                    if (!(cellIdentity4 == null || (tac2 = cellIdentity4.getTac()) == Integer.MAX_VALUE)) {
                        iaVar.mo45454a(5, C11760a.m51986b(String.valueOf(tac2)));
                    }
                    CellSignalStrengthLte cellSignalStrength2 = cellInfoLte.getCellSignalStrength();
                    if (!(cellSignalStrength2 == null || (timingAdvance = cellSignalStrength2.getTimingAdvance()) == Integer.MAX_VALUE)) {
                        iaVar.mo45454a(13, String.valueOf(timingAdvance));
                    }
                } else {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
                        CellIdentityNr cellIdentityNr = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                        if (!(cellIdentityNr == null || (tac = cellIdentityNr.getTac()) == Integer.MAX_VALUE)) {
                            iaVar.mo45454a(5, C11760a.m51986b(String.valueOf(tac)));
                        }
                    } else if (i >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                        CellIdentityTdscdma cellIdentity5 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                        if (cellIdentity5 != null) {
                            int lac2 = cellIdentity5.getLac();
                            if (lac2 != Integer.MAX_VALUE) {
                                iaVar.mo45454a(3, C11760a.m51986b(String.valueOf(lac2)));
                            }
                            int cid2 = cellIdentity5.getCid();
                            if (cid2 != Integer.MAX_VALUE) {
                                iaVar.mo45454a(4, C11760a.m51986b(String.valueOf(cid2)));
                            }
                        }
                    } else if (i >= 18 && (cellInfo instanceof CellInfoWcdma) && (cellIdentity = ((CellInfoWcdma) cellInfo).getCellIdentity()) != null) {
                        int lac3 = cellIdentity.getLac();
                        if (lac3 != Integer.MAX_VALUE) {
                            iaVar.mo45454a(3, C11760a.m51986b(String.valueOf(lac3)));
                        }
                        int cid3 = cellIdentity.getCid();
                        if (cid3 != Integer.MAX_VALUE) {
                            iaVar.mo45454a(4, C11760a.m51986b(String.valueOf(cid3)));
                        }
                    }
                }
            }
            if (!cellInfo.isRegistered()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29 && (cellInfo instanceof CellInfoNr)) {
                iaVar.mo45454a(14, 1);
            }
        }
    }
}
