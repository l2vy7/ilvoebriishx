package com.startapp.sdk.ads.banner;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class BannerOptions implements Serializable {
    private static final long serialVersionUID = 6023183209176231429L;
    private int adsNumber = 4;
    private boolean checkCoverage = true;
    private boolean checkFocus = true;
    private int delayFaceTime = 5000;
    @C5010hb(type = Effect.class)
    private Effect effect = Effect.ROTATE_3D;
    private int height = 50;
    private float heightRatio = 1.0f;
    private int htmlAdsNumber = 10;
    private float minScale = 0.88f;
    private int minViewabilityPercentage = 50;
    private int refreshRate = 60000;
    private int refreshRate3D = 60000;
    private boolean rotateThroughOnStart = true;
    private int rotateThroughSpeedMult = 2;
    private int scalePower = 4;
    private int stepSize = 5;
    private int timeBetweenFrames = 25;
    private int width = 300;
    private float widthRatio = 1.0f;

    /* compiled from: Sta */
    public enum Effect {
        ROTATE_3D(1),
        EXCHANGE(2),
        FLY_IN(3);
        
        private int index;

        private Effect(int i) {
            this.index = i;
        }

        public int getRotationMultiplier() {
            return (int) Math.pow(2.0d, (double) (this.index - 1));
        }
    }

    public BannerOptions() {
    }

    /* renamed from: a */
    public void mo45778a(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* renamed from: b */
    public int mo45779b() {
        return this.delayFaceTime;
    }

    /* renamed from: c */
    public Effect mo45780c() {
        return this.effect;
    }

    /* renamed from: d */
    public int mo45781d() {
        return this.height;
    }

    /* renamed from: e */
    public float mo45782e() {
        return this.heightRatio;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerOptions bannerOptions = (BannerOptions) obj;
        if (this.width == bannerOptions.width && this.height == bannerOptions.height && this.minViewabilityPercentage == bannerOptions.minViewabilityPercentage && this.checkFocus == bannerOptions.checkFocus && this.checkCoverage == bannerOptions.checkCoverage && this.timeBetweenFrames == bannerOptions.timeBetweenFrames && this.stepSize == bannerOptions.stepSize && this.delayFaceTime == bannerOptions.delayFaceTime && this.adsNumber == bannerOptions.adsNumber && this.htmlAdsNumber == bannerOptions.htmlAdsNumber && this.refreshRate3D == bannerOptions.refreshRate3D && Float.compare(this.widthRatio, bannerOptions.widthRatio) == 0 && Float.compare(this.heightRatio, bannerOptions.heightRatio) == 0 && Float.compare(this.minScale, bannerOptions.minScale) == 0 && this.scalePower == bannerOptions.scalePower && this.rotateThroughOnStart == bannerOptions.rotateThroughOnStart && this.rotateThroughSpeedMult == bannerOptions.rotateThroughSpeedMult && this.refreshRate == bannerOptions.refreshRate && this.effect == bannerOptions.effect) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo45784f() {
        return this.htmlAdsNumber;
    }

    /* renamed from: g */
    public float mo45785g() {
        return this.minScale;
    }

    /* renamed from: h */
    public int mo45786h() {
        return this.minViewabilityPercentage;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.minViewabilityPercentage), Boolean.valueOf(this.checkFocus), Boolean.valueOf(this.checkCoverage), Integer.valueOf(this.timeBetweenFrames), Integer.valueOf(this.stepSize), Integer.valueOf(this.delayFaceTime), Integer.valueOf(this.adsNumber), Integer.valueOf(this.htmlAdsNumber), Integer.valueOf(this.refreshRate3D), Float.valueOf(this.widthRatio), Float.valueOf(this.heightRatio), Float.valueOf(this.minScale), Integer.valueOf(this.scalePower), this.effect, Boolean.valueOf(this.rotateThroughOnStart), Integer.valueOf(this.rotateThroughSpeedMult), Integer.valueOf(this.refreshRate)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public int mo45788i() {
        return this.refreshRate;
    }

    /* renamed from: j */
    public int mo45789j() {
        return this.refreshRate3D;
    }

    /* renamed from: k */
    public int mo45790k() {
        return this.rotateThroughSpeedMult;
    }

    /* renamed from: l */
    public int mo45791l() {
        return this.scalePower;
    }

    /* renamed from: m */
    public int mo45792m() {
        return this.stepSize;
    }

    /* renamed from: n */
    public int mo45793n() {
        return this.timeBetweenFrames;
    }

    /* renamed from: o */
    public int mo45794o() {
        return this.width;
    }

    /* renamed from: p */
    public float mo45795p() {
        return this.widthRatio;
    }

    /* renamed from: q */
    public boolean mo45796q() {
        return this.checkCoverage;
    }

    /* renamed from: r */
    public boolean mo45797r() {
        return this.checkFocus;
    }

    /* renamed from: s */
    public boolean mo45798s() {
        return this.rotateThroughOnStart;
    }

    /* renamed from: a */
    public int mo45777a() {
        return this.adsNumber;
    }

    public BannerOptions(BannerOptions bannerOptions) {
        this.width = bannerOptions.width;
        this.height = bannerOptions.height;
        this.timeBetweenFrames = bannerOptions.timeBetweenFrames;
        this.stepSize = bannerOptions.stepSize;
        this.delayFaceTime = bannerOptions.delayFaceTime;
        this.adsNumber = bannerOptions.adsNumber;
        this.htmlAdsNumber = bannerOptions.htmlAdsNumber;
        this.refreshRate3D = bannerOptions.refreshRate3D;
        this.widthRatio = bannerOptions.widthRatio;
        this.heightRatio = bannerOptions.heightRatio;
        this.minScale = bannerOptions.minScale;
        this.scalePower = bannerOptions.scalePower;
        this.effect = bannerOptions.effect;
        this.rotateThroughOnStart = bannerOptions.rotateThroughOnStart;
        this.rotateThroughSpeedMult = bannerOptions.rotateThroughSpeedMult;
        this.refreshRate = bannerOptions.refreshRate;
        this.minViewabilityPercentage = bannerOptions.minViewabilityPercentage;
        this.checkFocus = bannerOptions.checkFocus;
        this.checkCoverage = bannerOptions.checkCoverage;
    }
}
