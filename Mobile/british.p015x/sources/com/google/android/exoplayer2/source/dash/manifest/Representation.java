package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import java.util.Collections;
import java.util.List;

public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final String baseUrl;
    public final Format format;
    public final List<Descriptor> inbandEventStreams;
    private final RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;

    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {
        final SegmentBase.MultiSegmentBase segmentBase;

        public MultiSegmentRepresentation(long j, Format format, String str, SegmentBase.MultiSegmentBase multiSegmentBase, List<Descriptor> list) {
            super(j, format, str, multiSegmentBase, list);
            this.segmentBase = multiSegmentBase;
        }

        public long getAvailableSegmentCount(long j, long j2) {
            return this.segmentBase.getAvailableSegmentCount(j, j2);
        }

        public String getCacheKey() {
            return null;
        }

        public long getDurationUs(long j, long j2) {
            return this.segmentBase.getSegmentDurationUs(j, j2);
        }

        public long getFirstAvailableSegmentNum(long j, long j2) {
            return this.segmentBase.getFirstAvailableSegmentNum(j, j2);
        }

        public long getFirstSegmentNum() {
            return this.segmentBase.getFirstSegmentNum();
        }

        public DashSegmentIndex getIndex() {
            return this;
        }

        public RangedUri getIndexUri() {
            return null;
        }

        public long getNextSegmentAvailableTimeUs(long j, long j2) {
            return this.segmentBase.getNextSegmentAvailableTimeUs(j, j2);
        }

        public long getSegmentCount(long j) {
            return this.segmentBase.getSegmentCount(j);
        }

        public long getSegmentNum(long j, long j2) {
            return this.segmentBase.getSegmentNum(j, j2);
        }

        public RangedUri getSegmentUrl(long j) {
            return this.segmentBase.getSegmentUrl(this, j);
        }

        public long getTimeUs(long j) {
            return this.segmentBase.getSegmentTimeUs(j);
        }

        public boolean isExplicit() {
            return this.segmentBase.isExplicit();
        }
    }

    public static class SingleSegmentRepresentation extends Representation {
        private final String cacheKey;
        public final long contentLength;
        private final RangedUri indexUri;
        private final SingleSegmentIndex segmentIndex;
        public final Uri uri;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SingleSegmentRepresentation(long j, Format format, String str, SegmentBase.SingleSegmentBase singleSegmentBase, List<Descriptor> list, String str2, long j2) {
            super(j, format, str, singleSegmentBase, list);
            SingleSegmentIndex singleSegmentIndex;
            this.uri = Uri.parse(str);
            RangedUri index = singleSegmentBase.getIndex();
            this.indexUri = index;
            this.cacheKey = str2;
            this.contentLength = j2;
            if (index != null) {
                singleSegmentIndex = null;
            } else {
                singleSegmentIndex = new SingleSegmentIndex(new RangedUri((String) null, 0, j2));
            }
            this.segmentIndex = singleSegmentIndex;
        }

        public static SingleSegmentRepresentation newInstance(long j, Format format, String str, long j2, long j3, long j4, long j5, List<Descriptor> list, String str2, long j6) {
            return new SingleSegmentRepresentation(j, format, str, new SegmentBase.SingleSegmentBase(new RangedUri((String) null, j2, (j3 - j2) + 1), 1, 0, j4, (j5 - j4) + 1), list, str2, j6);
        }

        public String getCacheKey() {
            return this.cacheKey;
        }

        public DashSegmentIndex getIndex() {
            return this.segmentIndex;
        }

        public RangedUri getIndexUri() {
            return this.indexUri;
        }
    }

    public static Representation newInstance(long j, Format format2, String str, SegmentBase segmentBase) {
        return newInstance(j, format2, str, segmentBase, (List<Descriptor>) null);
    }

    public abstract String getCacheKey();

    public abstract DashSegmentIndex getIndex();

    public abstract RangedUri getIndexUri();

    public RangedUri getInitializationUri() {
        return this.initializationUri;
    }

    private Representation(long j, Format format2, String str, SegmentBase segmentBase, List<Descriptor> list) {
        List<Descriptor> list2;
        this.revisionId = j;
        this.format = format2;
        this.baseUrl = str;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.inbandEventStreams = list2;
        this.initializationUri = segmentBase.getInitialization(this);
        this.presentationTimeOffsetUs = segmentBase.getPresentationTimeOffsetUs();
    }

    public static Representation newInstance(long j, Format format2, String str, SegmentBase segmentBase, List<Descriptor> list) {
        return newInstance(j, format2, str, segmentBase, list, (String) null);
    }

    public static Representation newInstance(long j, Format format2, String str, SegmentBase segmentBase, List<Descriptor> list, String str2) {
        SegmentBase segmentBase2 = segmentBase;
        if (segmentBase2 instanceof SegmentBase.SingleSegmentBase) {
            return new SingleSegmentRepresentation(j, format2, str, (SegmentBase.SingleSegmentBase) segmentBase2, list, str2, -1);
        } else if (segmentBase2 instanceof SegmentBase.MultiSegmentBase) {
            return new MultiSegmentRepresentation(j, format2, str, (SegmentBase.MultiSegmentBase) segmentBase2, list);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }
}
