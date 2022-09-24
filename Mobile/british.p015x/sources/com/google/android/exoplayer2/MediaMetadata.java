package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.List;
import p149s6.C6069h;

public final class MediaMetadata implements Bundleable {
    public static final Bundleable.Creator<MediaMetadata> CREATOR = C6728k0.f27443a;
    public static final MediaMetadata EMPTY = new Builder().build();
    private static final int FIELD_ALBUM_ARTIST = 3;
    private static final int FIELD_ALBUM_TITLE = 2;
    private static final int FIELD_ARTIST = 1;
    private static final int FIELD_DESCRIPTION = 6;
    private static final int FIELD_DISPLAY_TITLE = 4;
    private static final int FIELD_MEDIA_URI = 7;
    private static final int FIELD_OVERALL_RATING = 9;
    private static final int FIELD_SUBTITLE = 5;
    private static final int FIELD_TITLE = 0;
    private static final int FIELD_USER_RATING = 8;
    public final CharSequence albumArtist;
    public final CharSequence albumTitle;
    public final CharSequence artist;
    public final CharSequence description;
    public final CharSequence displayTitle;
    public final Uri mediaUri;
    public final Rating overallRating;
    public final CharSequence subtitle;
    public final CharSequence title;
    public final Rating userRating;

    public static final class Builder {
        /* access modifiers changed from: private */
        public CharSequence albumArtist;
        /* access modifiers changed from: private */
        public CharSequence albumTitle;
        /* access modifiers changed from: private */
        public CharSequence artist;
        /* access modifiers changed from: private */
        public CharSequence description;
        /* access modifiers changed from: private */
        public CharSequence displayTitle;
        /* access modifiers changed from: private */
        public Uri mediaUri;
        /* access modifiers changed from: private */
        public Rating overallRating;
        /* access modifiers changed from: private */
        public CharSequence subtitle;
        /* access modifiers changed from: private */
        public CharSequence title;
        /* access modifiers changed from: private */
        public Rating userRating;

        public MediaMetadata build() {
            return new MediaMetadata(this);
        }

        public Builder populateFromMetadata(Metadata metadata) {
            for (int i = 0; i < metadata.length(); i++) {
                metadata.get(i).populateMediaMetadata(this);
            }
            return this;
        }

        public Builder setAlbumArtist(CharSequence charSequence) {
            this.albumArtist = charSequence;
            return this;
        }

        public Builder setAlbumTitle(CharSequence charSequence) {
            this.albumTitle = charSequence;
            return this;
        }

        public Builder setArtist(CharSequence charSequence) {
            this.artist = charSequence;
            return this;
        }

        public Builder setDescription(CharSequence charSequence) {
            this.description = charSequence;
            return this;
        }

        public Builder setDisplayTitle(CharSequence charSequence) {
            this.displayTitle = charSequence;
            return this;
        }

        public Builder setMediaUri(Uri uri) {
            this.mediaUri = uri;
            return this;
        }

        public Builder setOverallRating(Rating rating) {
            this.overallRating = rating;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public Builder setUserRating(Rating rating) {
            this.userRating = rating;
            return this;
        }

        public Builder() {
        }

        private Builder(MediaMetadata mediaMetadata) {
            this.title = mediaMetadata.title;
            this.artist = mediaMetadata.artist;
            this.albumTitle = mediaMetadata.albumTitle;
            this.albumArtist = mediaMetadata.albumArtist;
            this.displayTitle = mediaMetadata.displayTitle;
            this.subtitle = mediaMetadata.subtitle;
            this.description = mediaMetadata.description;
            this.mediaUri = mediaMetadata.mediaUri;
            this.userRating = mediaMetadata.userRating;
            this.overallRating = mediaMetadata.overallRating;
        }

        public Builder populateFromMetadata(List<Metadata> list) {
            for (int i = 0; i < list.size(); i++) {
                Metadata metadata = list.get(i);
                for (int i2 = 0; i2 < metadata.length(); i2++) {
                    metadata.get(i2).populateMediaMetadata(this);
                }
            }
            return this;
        }
    }

    /* access modifiers changed from: private */
    public static MediaMetadata fromBundle(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        Builder builder = new Builder();
        builder.setTitle(bundle.getCharSequence(keyForField(0))).setArtist(bundle.getCharSequence(keyForField(1))).setAlbumTitle(bundle.getCharSequence(keyForField(2))).setAlbumArtist(bundle.getCharSequence(keyForField(3))).setDisplayTitle(bundle.getCharSequence(keyForField(4))).setSubtitle(bundle.getCharSequence(keyForField(5))).setDescription(bundle.getCharSequence(keyForField(6))).setMediaUri((Uri) bundle.getParcelable(keyForField(7)));
        if (bundle.containsKey(keyForField(8)) && (bundle3 = bundle.getBundle(keyForField(8))) != null) {
            builder.setUserRating(Rating.CREATOR.fromBundle(bundle3));
        }
        if (bundle.containsKey(keyForField(9)) && (bundle2 = bundle.getBundle(keyForField(9))) != null) {
            builder.setUserRating(Rating.CREATOR.fromBundle(bundle2));
        }
        return builder.build();
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        if (!Util.areEqual(this.title, mediaMetadata.title) || !Util.areEqual(this.artist, mediaMetadata.artist) || !Util.areEqual(this.albumTitle, mediaMetadata.albumTitle) || !Util.areEqual(this.albumArtist, mediaMetadata.albumArtist) || !Util.areEqual(this.displayTitle, mediaMetadata.displayTitle) || !Util.areEqual(this.subtitle, mediaMetadata.subtitle) || !Util.areEqual(this.description, mediaMetadata.description) || !Util.areEqual(this.mediaUri, mediaMetadata.mediaUri) || !Util.areEqual(this.userRating, mediaMetadata.userRating) || !Util.areEqual(this.overallRating, mediaMetadata.overallRating)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6069h.m26675b(this.title, this.artist, this.albumTitle, this.albumArtist, this.displayTitle, this.subtitle, this.description, this.mediaUri, this.userRating, this.overallRating);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(keyForField(0), this.title);
        bundle.putCharSequence(keyForField(1), this.artist);
        bundle.putCharSequence(keyForField(2), this.albumTitle);
        bundle.putCharSequence(keyForField(3), this.albumArtist);
        bundle.putCharSequence(keyForField(4), this.displayTitle);
        bundle.putCharSequence(keyForField(5), this.subtitle);
        bundle.putCharSequence(keyForField(6), this.description);
        bundle.putParcelable(keyForField(7), this.mediaUri);
        if (this.userRating != null) {
            bundle.putBundle(keyForField(8), this.userRating.toBundle());
        }
        if (this.overallRating != null) {
            bundle.putBundle(keyForField(9), this.overallRating.toBundle());
        }
        return bundle;
    }

    private MediaMetadata(Builder builder) {
        this.title = builder.title;
        this.artist = builder.artist;
        this.albumTitle = builder.albumTitle;
        this.albumArtist = builder.albumArtist;
        this.displayTitle = builder.displayTitle;
        this.subtitle = builder.subtitle;
        this.description = builder.description;
        this.mediaUri = builder.mediaUri;
        this.userRating = builder.userRating;
        this.overallRating = builder.overallRating;
    }
}
