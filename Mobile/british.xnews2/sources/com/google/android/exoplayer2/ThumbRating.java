package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import p148s6.C6069h;

public final class ThumbRating extends Rating {
    public static final Bundleable.Creator<ThumbRating> CREATOR = C7040x0.f27716a;
    private static final int FIELD_IS_THUMBS_UP = 2;
    private static final int FIELD_RATED = 1;
    private static final int TYPE = 3;
    private final boolean isThumbsUp;
    private final boolean rated;

    public ThumbRating() {
        this.rated = false;
        this.isThumbsUp = false;
    }

    /* access modifiers changed from: private */
    public static ThumbRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 3);
        if (bundle.getBoolean(keyForField(1), false)) {
            return new ThumbRating(bundle.getBoolean(keyForField(2), false));
        }
        return new ThumbRating();
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        if (this.isThumbsUp == thumbRating.isThumbsUp && this.rated == thumbRating.rated) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6069h.m26675b(Boolean.valueOf(this.rated), Boolean.valueOf(this.isThumbsUp));
    }

    public boolean isRated() {
        return this.rated;
    }

    public boolean isThumbsUp() {
        return this.isThumbsUp;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), 3);
        bundle.putBoolean(keyForField(1), this.rated);
        bundle.putBoolean(keyForField(2), this.isThumbsUp);
        return bundle;
    }

    public ThumbRating(boolean z) {
        this.rated = true;
        this.isThumbsUp = z;
    }
}
