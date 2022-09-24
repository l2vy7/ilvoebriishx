package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import p148s6.C6069h;

public final class HeartRating extends Rating {
    public static final Bundleable.Creator<HeartRating> CREATOR = C6720g0.f27435a;
    private static final int FIELD_IS_HEART = 2;
    private static final int FIELD_RATED = 1;
    private static final int TYPE = 0;
    private final boolean isHeart;
    private final boolean rated;

    public HeartRating() {
        this.rated = false;
        this.isHeart = false;
    }

    /* access modifiers changed from: private */
    public static HeartRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 0);
        if (bundle.getBoolean(keyForField(1), false)) {
            return new HeartRating(bundle.getBoolean(keyForField(2), false));
        }
        return new HeartRating();
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        if (this.isHeart == heartRating.isHeart && this.rated == heartRating.rated) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6069h.m26675b(Boolean.valueOf(this.rated), Boolean.valueOf(this.isHeart));
    }

    public boolean isHeart() {
        return this.isHeart;
    }

    public boolean isRated() {
        return this.rated;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), 0);
        bundle.putBoolean(keyForField(1), this.rated);
        bundle.putBoolean(keyForField(2), this.isHeart);
        return bundle;
    }

    public HeartRating(boolean z) {
        this.rated = true;
        this.isHeart = z;
    }
}
