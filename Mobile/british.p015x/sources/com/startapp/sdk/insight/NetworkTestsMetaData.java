package com.startapp.sdk.insight;

import java.io.Serializable;

/* compiled from: Sta */
public class NetworkTestsMetaData implements Serializable {
    private static final long serialVersionUID = 91489019050126377L;
    private String connectivityTestCdnconfigUrl = "https://d2to8y50b3n6dq.cloudfront.net/truststores/[PROJECTID]/cdnconfig.zip";
    private boolean connectivityTestEnabled = true;
    private String connectivityTestFilename = "/favicon.ico";
    private String connectivityTestHostname = "d2to8y50b3n6dq.cloudfront.net";
    private boolean ctCollectCellinfoEnabled = true;
    private long ctltIntervalMilli = 900000;
    private boolean enabled = false;
    private boolean enabledCachedProcess;
    private String geoipUrl = "https://geoip.api.p3insight.de/geoip/";
    private long guardDiffMilli = 120000;
    private String hostCt;
    private String hostLt;
    private String hostNir;
    private double iep = 0.0d;
    private boolean nirCollectCellinfoEnabled = true;
    private int numberOfRecordsMax = 10000;
    private int numberOfRecordsMin = 5000;
    private String projectId = "20050";
    private long sendIntervalMilli = 7200000;
    private long ttl = 86400000;

    /* renamed from: a */
    public String mo46457a() {
        return this.connectivityTestCdnconfigUrl;
    }

    /* renamed from: b */
    public String mo46458b() {
        return this.connectivityTestFilename;
    }

    /* renamed from: c */
    public String mo46459c() {
        return this.connectivityTestHostname;
    }

    /* renamed from: d */
    public long mo46460d() {
        return this.ctltIntervalMilli;
    }

    /* renamed from: e */
    public String mo46461e() {
        return this.geoipUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkTestsMetaData networkTestsMetaData = (NetworkTestsMetaData) obj;
        if (this.numberOfRecordsMin != networkTestsMetaData.numberOfRecordsMin || this.numberOfRecordsMax != networkTestsMetaData.numberOfRecordsMax || this.enabled != networkTestsMetaData.enabled || this.enabledCachedProcess != networkTestsMetaData.enabledCachedProcess || this.connectivityTestEnabled != networkTestsMetaData.connectivityTestEnabled || this.nirCollectCellinfoEnabled != networkTestsMetaData.nirCollectCellinfoEnabled || this.ctCollectCellinfoEnabled != networkTestsMetaData.ctCollectCellinfoEnabled || this.ctltIntervalMilli != networkTestsMetaData.ctltIntervalMilli || this.sendIntervalMilli != networkTestsMetaData.sendIntervalMilli || this.ttl != networkTestsMetaData.ttl) {
            return false;
        }
        String str = this.hostCt;
        if (str == null ? networkTestsMetaData.hostCt != null : !str.equals(networkTestsMetaData.hostCt)) {
            return false;
        }
        String str2 = this.hostLt;
        if (str2 == null ? networkTestsMetaData.hostLt != null : !str2.equals(networkTestsMetaData.hostLt)) {
            return false;
        }
        String str3 = this.hostNir;
        if (str3 == null ? networkTestsMetaData.hostNir != null : !str3.equals(networkTestsMetaData.hostNir)) {
            return false;
        }
        String str4 = this.projectId;
        if (str4 == null ? networkTestsMetaData.projectId != null : !str4.equals(networkTestsMetaData.projectId)) {
            return false;
        }
        String str5 = this.connectivityTestHostname;
        if (str5 == null ? networkTestsMetaData.connectivityTestHostname != null : !str5.equals(networkTestsMetaData.connectivityTestHostname)) {
            return false;
        }
        String str6 = this.connectivityTestFilename;
        if (str6 == null ? networkTestsMetaData.connectivityTestFilename != null : !str6.equals(networkTestsMetaData.connectivityTestFilename)) {
            return false;
        }
        String str7 = this.connectivityTestCdnconfigUrl;
        if (str7 == null ? networkTestsMetaData.connectivityTestCdnconfigUrl != null : !str7.equals(networkTestsMetaData.connectivityTestCdnconfigUrl)) {
            return false;
        }
        String str8 = this.geoipUrl;
        String str9 = networkTestsMetaData.geoipUrl;
        if (str8 != null) {
            return str8.equals(str9);
        }
        if (str9 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo46463f() {
        return this.guardDiffMilli;
    }

    /* renamed from: g */
    public String mo46464g() {
        return this.hostCt;
    }

    /* renamed from: h */
    public String mo46465h() {
        return this.hostLt;
    }

    public int hashCode() {
        String str = this.hostCt;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hostLt;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hostNir;
        int hashCode3 = (((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.numberOfRecordsMin) * 31) + this.numberOfRecordsMax) * 31) + (this.enabled ? 1 : 0)) * 31) + (this.enabledCachedProcess ? 1 : 0)) * 31;
        String str4 = this.projectId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.connectivityTestHostname;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.connectivityTestFilename;
        int hashCode6 = (((((((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.connectivityTestEnabled ? 1 : 0)) * 31) + (this.nirCollectCellinfoEnabled ? 1 : 0)) * 31) + (this.ctCollectCellinfoEnabled ? 1 : 0)) * 31;
        String str7 = this.connectivityTestCdnconfigUrl;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.geoipUrl;
        if (str8 != null) {
            i = str8.hashCode();
        }
        long j = this.ctltIntervalMilli;
        long j2 = this.sendIntervalMilli;
        long j3 = this.ttl;
        return ((((((hashCode7 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    /* renamed from: i */
    public String mo46467i() {
        return this.hostNir;
    }

    /* renamed from: j */
    public double mo46468j() {
        return this.iep;
    }

    /* renamed from: k */
    public String mo46469k() {
        return this.projectId;
    }

    /* renamed from: l */
    public boolean mo46470l() {
        return this.connectivityTestEnabled;
    }

    /* renamed from: m */
    public boolean mo46471m() {
        return this.ctCollectCellinfoEnabled;
    }

    /* renamed from: n */
    public boolean mo46472n() {
        return this.enabled;
    }

    /* renamed from: o */
    public boolean mo46473o() {
        return this.enabledCachedProcess;
    }

    /* renamed from: p */
    public boolean mo46474p() {
        return this.nirCollectCellinfoEnabled;
    }
}
