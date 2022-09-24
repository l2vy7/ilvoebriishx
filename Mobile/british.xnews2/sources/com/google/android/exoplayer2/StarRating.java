package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import p148s6.C6069h;

public final class StarRating extends Rating {
    public static final Bundleable.Creator<StarRating> CREATOR = C7017v0.f27681a;
    private static final int FIELD_MAX_STARS = 1;
    private static final int FIELD_STAR_RATING = 2;
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i) {
        Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        this.maxStars = i;
        this.starRating = -1.0f;
    }

    /* access modifiers changed from: private */
    public static StarRating fromBundle(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(keyForField(0), -1) == 2) {
            z = true;
        }
        Assertions.checkArgument(z);
        int i = bundle.getInt(keyForField(1), 5);
        float f = bundle.getFloat(keyForField(2), -1.0f);
        if (f == -1.0f) {
            return new StarRating(i);
        }
        return new StarRating(i, f);
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating2 = (StarRating) obj;
        if (this.maxStars == starRating2.maxStars && this.starRating == starRating2.starRating) {
            return true;
        }
        return false;
    }

    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return C6069h.m26675b(Integer.valueOf(this.maxStars), Float.valueOf(this.starRating));
    }

    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), 2);
        bundle.putInt(keyForField(1), this.maxStars);
        bundle.putFloat(keyForField(2), this.starRating);
        return bundle;
    }

    public StarRating(int i, float f) {
        boolean z = true;
        Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        Assertions.checkArgument((f < 0.0f || f > ((float) i)) ? false : z, "starRating is out of range [0, maxStars]");
        this.maxStars = i;
        this.starRating = f;
    }
}
