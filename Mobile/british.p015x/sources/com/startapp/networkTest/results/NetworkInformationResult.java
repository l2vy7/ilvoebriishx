package com.startapp.networkTest.results;

import com.startapp.C5010hb;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.data.RadioInfo;
import com.startapp.networkTest.data.TimeInfo;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.data.radio.CellInfo;
import com.startapp.networkTest.enums.NetworkTypes;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.enums.TriggerEvents;
import com.startapp.networkTest.enums.voice.CallStates;
import java.util.ArrayList;

/* compiled from: Sta */
public class NetworkInformationResult extends BaseResult {
    public CallStates CallState = CallStates.Unknown;
    public double CellIdDeltaDistance = -1.0d;
    @C5010hb(type = ArrayList.class, value = CellInfo.class)
    public ArrayList<CellInfo> CellInfo = new ArrayList<>();
    @C5010hb(complex = true)
    public LocationInfo LocationInfo = new LocationInfo();
    public String NirId = "";
    public String PrevCellId = "";
    public String PrevLAC = "";
    public String PrevMCC = "";
    public String PrevMNC = "";
    public NetworkTypes PrevNetworkType = NetworkTypes.Unknown;
    public String PrevNirId = "";
    public int PrevRXLevel;
    @C5010hb(complex = true)
    public RadioInfo RadioInfo = new RadioInfo();
    public ScreenStates ScreenState = ScreenStates.Unknown;
    @C5010hb(complex = true)
    public TimeInfo TimeInfo = new TimeInfo();
    public String Timestamp = "";
    public TriggerEvents TriggerEvent = TriggerEvents.Unknown;
    @C5010hb(complex = true)
    public WifiInfo WifiInfo = new WifiInfo();
    public transient long timestampMillis;

    public NetworkInformationResult(String str, String str2) {
        super(str, str2);
    }
}
