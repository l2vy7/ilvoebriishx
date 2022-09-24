package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.adcolony.sdk.AdColonyUserMetadata;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: a */
    String f50473a;

    /* renamed from: b */
    private int f50474b = 999999;

    /* renamed from: c */
    private double f50475c = 999999.99d;

    /* renamed from: d */
    private final String f50476d = "custom";

    /* renamed from: e */
    private final int f50477e = 5;

    /* renamed from: f */
    int f50478f = -1;

    /* renamed from: g */
    String f50479g;

    /* renamed from: h */
    int f50480h = -1;

    /* renamed from: i */
    AtomicBoolean f50481i = null;

    /* renamed from: j */
    double f50482j = -1.0d;

    /* renamed from: k */
    long f50483k = 0;

    /* renamed from: l */
    Vector<Pair<String, String>> f50484l = new Vector<>();

    /* renamed from: a */
    private static boolean m50214a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: b */
    private static boolean m50215b(String str, int i, int i2) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    public int getAge() {
        return this.f50478f;
    }

    public String getGender() {
        return this.f50479g;
    }

    public double getIapt() {
        return this.f50482j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f50481i;
    }

    public int getLevel() {
        return this.f50480h;
    }

    public String getSegmentName() {
        return this.f50473a;
    }

    public long getUcd() {
        return this.f50483k;
    }

    public void setAge(int i) {
        if (i <= 0 || i > 199) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setAge( " + i + " ) age must be between 1-199", 2);
            return;
        }
        this.f50478f = i;
    }

    public void setCustom(String str, String str2) {
        try {
            if (!m50214a(str) || !m50214a(str2) || !m50215b(str, 1, 32) || !m50215b(str2, 1, 32)) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
                return;
            }
            String str3 = ContentMetadata.KEY_CUSTOM_PREFIX + str;
            if (this.f50484l.size() < 5) {
                this.f50484l.add(new Pair(str3, str2));
                return;
            }
            this.f50484l.remove(0);
            this.f50484l.add(new Pair(str3, str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (!TextUtils.isEmpty(str)) {
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(AdColonyUserMetadata.USER_MALE) || str.toLowerCase(locale).equals(AdColonyUserMetadata.USER_FEMALE)) {
                this.f50479g = str;
                return;
            }
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
    }

    public void setIAPTotal(double d) {
        if (d <= 0.0d || d >= this.f50475c) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f50475c, 2);
            return;
        }
        this.f50482j = Math.floor(d * 100.0d) / 100.0d;
    }

    public void setIsPaying(boolean z) {
        if (this.f50481i == null) {
            this.f50481i = new AtomicBoolean();
        }
        this.f50481i.set(z);
    }

    public void setLevel(int i) {
        if (i <= 0 || i >= this.f50474b) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setLevel( " + i + " ) level must be between 1-" + this.f50474b, 2);
            return;
        }
        this.f50480h = i;
    }

    public void setSegmentName(String str) {
        if (!m50214a(str) || !m50215b(str, 1, 32)) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
            return;
        }
        this.f50473a = str;
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.f50483k = j;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }
}
