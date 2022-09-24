package com.startapp.networkTest.results;

import com.startapp.C11801b6;
import com.startapp.C11825c8;
import com.startapp.C11849d8;
import com.startapp.C12070n2;
import com.startapp.C12415wa;
import com.startapp.C5010hb;
import com.startapp.networkTest.data.BatteryInfo;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.enums.ConnectionTypes;
import com.startapp.networkTest.enums.IpVersions;
import com.startapp.networkTest.enums.MeasurementTypes;
import com.startapp.networkTest.enums.NetworkGenerations;
import com.startapp.networkTest.enums.SpeedtestEndStates;
import com.startapp.networkTest.results.speedtest.MeasurementPointBase;
import com.startapp.networkTest.speedtest.SpeedtestEngineError;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Sta */
public class P3TestResult extends BaseResult {
    public int AvgValue;
    @C5010hb(complex = true)
    public BatteryInfo BatteryInfoOnEnd = new BatteryInfo();
    @C5010hb(complex = true)
    public BatteryInfo BatteryInfoOnStart = new BatteryInfo();
    public String CampaignId = "";
    public long ConnectingTimeControlServer = -1;
    public long ConnectingTimeTestServerControl = -1;
    public long ConnectingTimeTestServerSockets = -1;
    public String CustomerID = "";
    @C5010hb(complex = true)
    public C12070n2 DeviceInfo = new C12070n2();
    public String IMEI = "";
    public String IMSI = "";
    public IpVersions IpVersion = IpVersions.Unknown;
    public int IsAppInForeground = -1;
    @C5010hb(complex = true)
    public LocationInfo LocationInfoOnEnd = new LocationInfo();
    @C5010hb(complex = true)
    public LocationInfo LocationInfoOnStart = new LocationInfo();
    public int MaxValue;
    public MeasurementTypes MeasurementType = MeasurementTypes.Unknown;
    public int MedValue;
    @C5010hb(complex = true)
    public C11801b6 MemoryInfoOnEnd = new C11801b6();
    @C5010hb(complex = true)
    public C11801b6 MemoryInfoOnStart = new C11801b6();
    public String Meta = "";
    public int MinValue;
    @C5010hb(type = ArrayList.class, value = C11825c8.class)
    public ArrayList<C11825c8> QuestionAnswerList = new ArrayList<>();
    public String QuestionnaireName = "";
    @C5010hb(complex = true)
    public RadioInfo RadioInfoOnEnd = new RadioInfo();
    @C5010hb(complex = true)
    public RadioInfo RadioInfoOnStart = new RadioInfo();
    public double RatShare2G;
    public double RatShare3G;
    public double RatShare4G;
    public double RatShare5G;
    public double RatShareUnknown;
    public double RatShareWiFi;
    public String SequenceID = "";
    public String Server = "";
    public boolean Success;
    public SpeedtestEndStates TestEndState = SpeedtestEndStates.Unknown;
    public SpeedtestEngineError TestErrorReason = SpeedtestEngineError.OK;
    @C5010hb(complex = true)
    public TimeInfo TimeInfoOnEnd = new TimeInfo();
    @C5010hb(complex = true)
    public TimeInfo TimeInfoOnStart = new TimeInfo();
    @C5010hb(complex = true)
    public C12415wa TrafficInfoOnEnd = new C12415wa();
    @C5010hb(complex = true)
    public C12415wa TrafficInfoOnStart = new C12415wa();
    @C5010hb(complex = true)
    public WifiInfo WifiInfoOnEnd = new WifiInfo();
    @C5010hb(complex = true)
    public WifiInfo WifiInfoOnStart = new WifiInfo();

    /* renamed from: com.startapp.networkTest.results.P3TestResult$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C12087a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53832a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.startapp.networkTest.enums.NetworkGenerations[] r0 = com.startapp.networkTest.enums.NetworkGenerations.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53832a = r0
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53832a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53832a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen4     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53832a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Gen5     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f53832a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.networkTest.enums.NetworkGenerations r1 = com.startapp.networkTest.enums.NetworkGenerations.Unknown     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.networkTest.results.P3TestResult.C12087a.<clinit>():void");
        }
    }

    public P3TestResult(String str, String str2) {
        super(str, str2);
    }

    public void calcRatShare(ArrayList<? extends MeasurementPointBase> arrayList) {
        Iterator<? extends MeasurementPointBase> it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            MeasurementPointBase measurementPointBase = (MeasurementPointBase) it.next();
            ConnectionTypes connectionTypes = measurementPointBase.ConnectionType;
            if (connectionTypes != ConnectionTypes.Unknown) {
                if (connectionTypes == ConnectionTypes.Mobile) {
                    NetworkGenerations b = C11849d8.m52156b(measurementPointBase.NetworkType);
                    if (measurementPointBase.NrState.equals("CONNECTED")) {
                        b = NetworkGenerations.Gen5;
                    }
                    int i8 = C12087a.f53832a[b.ordinal()];
                    if (i8 == 1) {
                        i7++;
                    } else if (i8 == 2) {
                        i6++;
                    } else if (i8 == 3) {
                        i5++;
                    } else if (i8 == 4) {
                        i4++;
                    }
                } else {
                    i3++;
                }
                i++;
            }
            i2++;
            i++;
        }
        if (i > 0) {
            double d = (double) i7;
            double d2 = (double) i;
            Double.isNaN(d);
            Double.isNaN(d2);
            this.RatShare2G = d / d2;
            double d3 = (double) i6;
            Double.isNaN(d3);
            Double.isNaN(d2);
            this.RatShare3G = d3 / d2;
            double d4 = (double) i5;
            Double.isNaN(d4);
            Double.isNaN(d2);
            this.RatShare4G = d4 / d2;
            double d5 = (double) i4;
            Double.isNaN(d5);
            Double.isNaN(d2);
            this.RatShare5G = d5 / d2;
            double d6 = (double) i3;
            Double.isNaN(d6);
            Double.isNaN(d2);
            this.RatShareWiFi = d6 / d2;
            double d7 = (double) i2;
            Double.isNaN(d7);
            Double.isNaN(d2);
            this.RatShareUnknown = d7 / d2;
        }
    }
}
