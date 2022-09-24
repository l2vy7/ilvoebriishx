package com.startapp.networkTest.results;

import com.startapp.C12414w9;
import com.startapp.C5010hb;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.results.speedtest.MeasurementPointLatency;
import java.util.ArrayList;

/* compiled from: Sta */
public class LatencyResult extends P3TestResult {
    public String AirportCode;
    public long DurationOverall = -1;
    public long DurationOverallNoSleep = -1;
    public double Jitter;
    public String LtrId = "";
    @C5010hb(type = ArrayList.class, value = MeasurementPointLatency.class)
    public ArrayList<MeasurementPointLatency> MeasurementPoints;
    public int Pause;
    public int Pings;
    public ScreenStates ScreenStateOnEnd;
    public ScreenStates ScreenStateOnStart;
    public int SuccessfulPings;

    public LatencyResult(String str, String str2) {
        super(str, str2);
        ScreenStates screenStates = ScreenStates.Unknown;
        this.ScreenStateOnStart = screenStates;
        this.ScreenStateOnEnd = screenStates;
        this.AirportCode = "";
        this.MeasurementPoints = new ArrayList<>();
    }

    public void calculateStats(ArrayList<MeasurementPointLatency> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).Rtt != -1) {
                arrayList2.add(Integer.valueOf(arrayList.get(i).Rtt));
            }
        }
        this.MinValue = C12414w9.m53725e(arrayList2);
        this.MaxValue = C12414w9.m53723c(arrayList2);
        this.AvgValue = C12414w9.m53719a(arrayList2);
        this.MedValue = C12414w9.m53724d(arrayList2);
        this.Jitter = C12414w9.m53721b(arrayList2);
        this.MeasurementPoints = arrayList;
    }
}
