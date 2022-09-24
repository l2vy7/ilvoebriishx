package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class MotionMetadata implements Serializable {
    private static final long serialVersionUID = 3936848659568026217L;
    private double apm = 3.0d;
    private double apr = 3600000.0d;
    private double aps = -2.0d;
    private double awh = 100.0d;
    private double awr = 1.0d;
    private boolean enabled = false;
    private double hpfgb = 10.0d;
    private double hpflb = 15.0d;
    private double hpflmb = 25.0d;
    private double hpfv = 1000.0d;
    private int ief = 0;
    private double iep = 0.0d;
    private double ipm = 0.0d;
    private double ipr = 20000.0d;
    private double ips = -4.0d;
    private double iwh = 100.0d;
    private double iwr = 1.0d;
    private int sampleLimit = 200;
    private String samplePeriod;
    private double vdmis = 1.0d;
    private double vma = 0.1d;

    /* renamed from: a */
    public double mo46347a() {
        return this.apm;
    }

    /* renamed from: b */
    public double mo46348b() {
        return this.apr;
    }

    /* renamed from: c */
    public double mo46349c() {
        return this.aps;
    }

    /* renamed from: d */
    public double mo46350d() {
        return this.awh;
    }

    /* renamed from: e */
    public double mo46351e() {
        return this.awr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionMetadata motionMetadata = (MotionMetadata) obj;
        if (this.enabled == motionMetadata.enabled && this.ief == motionMetadata.ief && Double.compare(this.iep, motionMetadata.iep) == 0 && this.sampleLimit == motionMetadata.sampleLimit && Double.compare(this.hpfgb, motionMetadata.hpfgb) == 0 && Double.compare(this.hpflb, motionMetadata.hpflb) == 0 && Double.compare(this.hpflmb, motionMetadata.hpflmb) == 0 && Double.compare(this.hpfv, motionMetadata.hpfv) == 0 && Double.compare(this.vdmis, motionMetadata.vdmis) == 0 && Double.compare(this.vma, motionMetadata.vma) == 0 && Double.compare(this.awh, motionMetadata.awh) == 0 && Double.compare(this.awr, motionMetadata.awr) == 0 && Double.compare(this.apr, motionMetadata.apr) == 0 && Double.compare(this.apm, motionMetadata.apm) == 0 && Double.compare(this.aps, motionMetadata.aps) == 0 && Double.compare(this.iwh, motionMetadata.iwh) == 0 && Double.compare(this.iwr, motionMetadata.iwr) == 0 && Double.compare(this.ipr, motionMetadata.ipr) == 0 && Double.compare(this.ipm, motionMetadata.ipm) == 0 && Double.compare(this.ips, motionMetadata.ips) == 0 && C5015nb.m22922a(this.samplePeriod, motionMetadata.samplePeriod)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public double mo46353f() {
        return this.hpfgb;
    }

    /* renamed from: g */
    public double mo46354g() {
        return this.hpflb;
    }

    /* renamed from: h */
    public double mo46355h() {
        return this.hpflmb;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.ief), Double.valueOf(this.iep), this.samplePeriod, Integer.valueOf(this.sampleLimit), Double.valueOf(this.hpfgb), Double.valueOf(this.hpflb), Double.valueOf(this.hpflmb), Double.valueOf(this.hpfv), Double.valueOf(this.vdmis), Double.valueOf(this.vma), Double.valueOf(this.awh), Double.valueOf(this.awr), Double.valueOf(this.apr), Double.valueOf(this.apm), Double.valueOf(this.aps), Double.valueOf(this.iwh), Double.valueOf(this.iwr), Double.valueOf(this.ipr), Double.valueOf(this.ipm), Double.valueOf(this.ips)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public double mo46357i() {
        return this.hpfv;
    }

    /* renamed from: j */
    public int mo46358j() {
        return this.ief;
    }

    /* renamed from: k */
    public double mo46359k() {
        return this.iep;
    }

    /* renamed from: l */
    public double mo46360l() {
        return this.ipm;
    }

    /* renamed from: m */
    public double mo46361m() {
        return this.ipr;
    }

    /* renamed from: n */
    public double mo46362n() {
        return this.ips;
    }

    /* renamed from: o */
    public double mo46363o() {
        return this.iwh;
    }

    /* renamed from: p */
    public double mo46364p() {
        return this.iwr;
    }

    /* renamed from: q */
    public int mo46365q() {
        return this.sampleLimit;
    }

    /* renamed from: r */
    public String mo46366r() {
        return this.samplePeriod;
    }

    /* renamed from: s */
    public double mo46367s() {
        return this.vdmis;
    }

    /* renamed from: t */
    public double mo46368t() {
        return this.vma;
    }

    /* renamed from: u */
    public boolean mo46369u() {
        return this.enabled;
    }
}
