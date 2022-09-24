package com.startapp.networkTest.data;

import com.startapp.C11916g2;
import com.startapp.C11934h2;
import com.startapp.networkTest.enums.TimeSources;
import java.io.Serializable;
import java.util.TimeZone;

/* compiled from: Sta */
public class TimeInfo implements Cloneable, Serializable {
    private static final long serialVersionUID = 3793653153982296400L;
    public long DeviceDriftMillis;
    public boolean IsSynced;
    public long MillisSinceLastSync;
    public TimeSources TimeSource = TimeSources.Unknown;
    public String TimestampDateTime = "";
    public long TimestampMillis;
    public double TimestampOffset;
    public String TimestampTableau = "";
    public transient int day;
    public transient int hour;
    public transient int millisecond;
    public transient int minute;
    public transient int month;
    public transient int second;
    public transient int year;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setMillis(long j) {
        this.TimestampTableau = C11934h2.m52379b(j);
        this.TimestampDateTime = C11934h2.m52375a(j);
        this.TimestampOffset = (double) (((((float) TimeZone.getDefault().getOffset(j)) / 1000.0f) / 60.0f) / 60.0f);
        this.TimestampMillis = j;
        C11916g2 c = C11934h2.m52380c(j);
        this.year = c.f52967a;
        this.month = c.f52968b;
        this.day = c.f52969c;
        this.hour = c.f52970d;
        this.minute = c.f52971e;
        this.second = c.f52972f;
        this.millisecond = c.f52973g;
    }
}
