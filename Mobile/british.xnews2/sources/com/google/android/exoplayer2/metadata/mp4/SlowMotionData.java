package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C6750a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p148s6.C6069h;

public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new Parcelable.Creator<SlowMotionData>() {
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        public SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    };
    public final List<Segment> segments;

    public static final class Segment implements Parcelable {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = C6774a.f27477b;
        public static final Parcelable.Creator<Segment> CREATOR = new Parcelable.Creator<Segment>() {
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            public Segment[] newArray(int i) {
                return new Segment[i];
            }
        };
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        public Segment(long j, long j2, int i) {
            Assertions.checkArgument(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C6069h.m26675b(Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public String toString() {
            return Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.startTimeMs);
            parcel.writeLong(this.endTimeMs);
            parcel.writeInt(this.speedDivisor);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.segments = list;
        Assertions.checkArgument(!doSegmentsOverlap(list));
    }

    private static boolean doSegmentsOverlap(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).startTimeMs < j) {
                return true;
            }
            j = list.get(i).endTimeMs;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((SlowMotionData) obj).segments);
    }

    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return C6750a.m28557a(this);
    }

    public /* synthetic */ Format getWrappedMetadataFormat() {
        return C6750a.m28558b(this);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    public /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        C6750a.m28559c(this, builder);
    }

    public String toString() {
        String valueOf = String.valueOf(this.segments);
        StringBuilder sb = new StringBuilder(valueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(valueOf);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.segments);
    }
}
