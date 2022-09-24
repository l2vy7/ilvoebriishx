package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C6750a;
import com.google.android.exoplayer2.metadata.Metadata;

public abstract class SpliceCommand implements Metadata.Entry {
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return C6750a.m28557a(this);
    }

    public /* synthetic */ Format getWrappedMetadataFormat() {
        return C6750a.m28558b(this);
    }

    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        C6750a.m28559c(this, builder);
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }
}
