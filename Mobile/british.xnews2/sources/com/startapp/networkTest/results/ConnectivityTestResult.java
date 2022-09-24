package com.startapp.networkTest.results;

import com.startapp.C11801b6;
import com.startapp.C11870da;
import com.startapp.C12028l5;
import com.startapp.C12070n2;
import com.startapp.C12162r6;
import com.startapp.C12166r9;
import com.startapp.C12415wa;
import com.startapp.C5010hb;
import com.startapp.networkTest.data.BatteryInfo;
import com.startapp.networkTest.data.IspInfo;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.data.radio.ApnInfo;
import com.startapp.networkTest.data.radio.CellInfo;
import com.startapp.networkTest.data.radio.NetworkRegistrationInfo;
import com.startapp.networkTest.enums.CtTestTypes;
import com.startapp.networkTest.enums.FileTypes;
import com.startapp.networkTest.enums.IdleStates;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.enums.voice.CallStates;
import java.util.ArrayList;

/* compiled from: Sta */
public class ConnectivityTestResult extends BaseResult {
    public String AirportCode;
    public String AmazonId = "";
    @C5010hb(type = ArrayList.class, value = ApnInfo.class)
    public ArrayList<ApnInfo> ApnInfo;
    @C5010hb(complex = true)
    public BatteryInfo BatteryInfo;
    public long BytesRead = -1;
    public CallStates CallState;
    @C5010hb(type = ArrayList.class, value = CellInfo.class)
    public ArrayList<CellInfo> CellInfo;
    public String CtId = "";
    @C5010hb(complex = true)
    public C12070n2 DeviceInfo;
    public long DurationDNS = -1;
    public long DurationHttpGetCommand = -1;
    public long DurationHttpReceive = -1;
    public long DurationOverall = -1;
    public long DurationOverallNoSleep = -1;
    public long DurationSSL = -1;
    public long DurationTcpConnect = -1;
    public String ErrorReason;
    public int HTTPStatus = -1;
    public long HeaderBytesRead = -1;
    public IdleStates IdleStateOnEnd;
    public IdleStates IdleStateOnStart;
    public int IsAppInForeground;
    public boolean IsKeepAlive = false;
    @C5010hb(complex = true)
    public IspInfo IspInfo;
    public boolean LocalhostPingSuccess = false;
    @C5010hb(complex = true)
    public LocationInfo LocationInfo;
    @C5010hb(complex = true)
    public C11801b6 MemoryInfo;
    @C5010hb(type = ArrayList.class, value = C12162r6.class)
    public ArrayList<C12162r6> MultiCdnInfo;
    @C5010hb(type = ArrayList.class, value = NetworkRegistrationInfo.class)
    public ArrayList<NetworkRegistrationInfo> NetworkRegistrationInfo;
    @C5010hb(complex = true)
    public RadioInfo RadioInfo;
    @C5010hb(complex = true)
    public RadioInfo RadioInfoOnEnd;
    public ScreenStates ScreenState = ScreenStates.Unknown;
    public String ServerFilename = "";
    public String ServerHostname = "";
    public String ServerIp = "";
    public long ServerMultiSuccess;
    @C5010hb(complex = true)
    public C12166r9 SimInfo;
    public String SslException;
    @C5010hb(complex = true)
    public C11870da StorageInfo;
    public boolean Success = false;
    public String TestTimestamp = "";
    public CtTestTypes TestType = CtTestTypes.Unknown;
    @C5010hb(complex = true)
    public TimeInfo TimeInfo;
    @C5010hb(complex = true)
    public C12415wa TrafficInfo;
    public long TruststoreTimestamp;
    public NetworkTypes VoiceNetworkType;
    @C5010hb(complex = true)
    public WifiInfo WifiInfo;

    public ConnectivityTestResult(String str, String str2) {
        super(str, str2);
        IdleStates idleStates = IdleStates.Unknown;
        this.IdleStateOnStart = idleStates;
        this.IdleStateOnEnd = idleStates;
        this.ErrorReason = "";
        this.SslException = "";
        this.CallState = CallStates.Unknown;
        this.VoiceNetworkType = NetworkTypes.Unknown;
        this.ServerMultiSuccess = -1;
        this.AirportCode = "";
        this.IsAppInForeground = -1;
        this.BatteryInfo = new BatteryInfo();
        this.DeviceInfo = new C12070n2();
        this.LocationInfo = new LocationInfo();
        this.MemoryInfo = new C11801b6();
        this.RadioInfo = new RadioInfo();
        this.RadioInfoOnEnd = new RadioInfo();
        this.StorageInfo = new C11870da();
        this.TrafficInfo = new C12415wa();
        this.WifiInfo = new WifiInfo();
        this.TimeInfo = new TimeInfo();
        this.IspInfo = new IspInfo();
        this.SimInfo = new C12166r9();
        this.MultiCdnInfo = new ArrayList<>();
        this.CellInfo = new ArrayList<>();
        this.ApnInfo = new ArrayList<>();
        this.NetworkRegistrationInfo = new ArrayList<>();
    }

    public String toJson() {
        return C12028l5.m52558a(FileTypes.CT, (BaseResult) this);
    }
}
