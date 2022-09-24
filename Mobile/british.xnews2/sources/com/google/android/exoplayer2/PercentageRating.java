package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import p148s6.C6069h;

public final class PercentageRating extends Rating {
    public static final Bundleable.Creator<PercentageRating> CREATOR = C6781n0.f27480a;
    private static final int FIELD_PERCENT = 1;
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating() {
        this.percent = -1.0f;
    }

    /* access modifiers changed from: private */
    public static PercentageRating fromBundle(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(keyForField(0), -1) == 1) {
            z = true;
        }
        Assertions.checkArgument(z);
        float f = bundle.getFloat(keyForField(1), -1.0f);
        return f == -1.0f ? new PercentageRating() : new PercentageRating(f);
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PercentageRating) && this.percent == ((PercentageRating) obj).percent) {
            return true;
        }
        return false;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return C6069h.m26675b(Float.valueOf(this.percent));
    }

    public boolean isRated() {
        return this.percent != -1.0f;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), 1);
        bundle.putFloat(keyForField(1), this.percent);
        return bundle;
    }

    public PercentageRating(float f) {
        Assertions.checkArgument(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f;
    }
}
