package com.google.android.exoplayer2.transformer;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4766t;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class SefSlowMotionVideoSampleTransformer implements SampleTransformer {
    static final int INPUT_FRAME_RATE = 30;
    private static final int NAL_START_CODE_LENGTH = NalUnitUtil.NAL_START_CODE.length;
    private static final int NAL_UNIT_TYPE_PREFIX = 14;
    private static final int TARGET_OUTPUT_FRAME_RATE = 30;
    private final float captureFrameRate;
    private SegmentInfo currentSegmentInfo;
    private long frameTimeDeltaUs;
    private final int inputMaxLayer;
    private SegmentInfo nextSegmentInfo;
    private final int normalSpeedMaxLayer;
    private final byte[] scratch = new byte[NAL_START_CODE_LENGTH];
    private final Iterator<SlowMotionData.Segment> segmentIterator;
    private final SlowMotionData slowMotionData;

    private static final class MetadataInfo {
        public float captureFrameRate = -3.4028235E38f;
        public int inputMaxLayer = -1;
        public int normalSpeedMaxLayer = -1;
        public SlowMotionData slowMotionData;
    }

    private static final class SegmentInfo {
        public final long endTimeUs;
        public final int maxLayer;
        public final int speedDivisor;
        public final long startTimeUs;

        public SegmentInfo(SlowMotionData.Segment segment, int i, int i2) {
            this.startTimeUs = C6540C.msToUs(segment.startTimeMs);
            this.endTimeUs = C6540C.msToUs(segment.endTimeMs);
            int i3 = segment.speedDivisor;
            this.speedDivisor = i3;
            this.maxLayer = getSlowMotionMaxLayer(i3, i, i2);
        }

        private static int getSlowMotionMaxLayer(int i, int i2, int i3) {
            int i4 = i;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                boolean z = true;
                if ((i4 & 1) == 1) {
                    if ((i4 >> 1) != 0) {
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Invalid speed divisor: ");
                    sb.append(i);
                    Assertions.checkState(z, sb.toString());
                } else {
                    i3++;
                    i4 >>= 1;
                }
            }
            return Math.min(i3, i2);
        }
    }

    public SefSlowMotionVideoSampleTransformer(Format format) {
        MetadataInfo metadataInfo = getMetadataInfo(format.metadata);
        SlowMotionData slowMotionData2 = metadataInfo.slowMotionData;
        this.slowMotionData = slowMotionData2;
        Iterator<SlowMotionData.Segment> it = (slowMotionData2 != null ? slowMotionData2.segments : C4766t.m21978E()).iterator();
        this.segmentIterator = it;
        this.captureFrameRate = metadataInfo.captureFrameRate;
        int i = metadataInfo.inputMaxLayer;
        this.inputMaxLayer = i;
        int i2 = metadataInfo.normalSpeedMaxLayer;
        this.normalSpeedMaxLayer = i2;
        this.nextSegmentInfo = it.hasNext() ? new SegmentInfo(it.next(), i, i2) : null;
        if (slowMotionData2 != null) {
            boolean equals = MimeTypes.VIDEO_H264.equals(format.sampleMimeType);
            String valueOf = String.valueOf(format.sampleMimeType);
            Assertions.checkArgument(equals, valueOf.length() != 0 ? "Unsupported MIME type for SEF slow motion video track: ".concat(valueOf) : new String("Unsupported MIME type for SEF slow motion video track: "));
        }
    }

    private void enterNextSegment() {
        if (this.currentSegmentInfo != null) {
            leaveCurrentSegment();
        }
        this.currentSegmentInfo = this.nextSegmentInfo;
        this.nextSegmentInfo = this.segmentIterator.hasNext() ? new SegmentInfo(this.segmentIterator.next(), this.inputMaxLayer, this.normalSpeedMaxLayer) : null;
    }

    private static MetadataInfo getMetadataInfo(Metadata metadata) {
        MetadataInfo metadataInfo = new MetadataInfo();
        if (metadata == null) {
            return metadataInfo;
        }
        boolean z = false;
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof SmtaMetadataEntry) {
                SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) entry;
                metadataInfo.captureFrameRate = smtaMetadataEntry.captureFrameRate;
                metadataInfo.inputMaxLayer = smtaMetadataEntry.svcTemporalLayerCount - 1;
            } else if (entry instanceof SlowMotionData) {
                metadataInfo.slowMotionData = (SlowMotionData) entry;
            }
        }
        if (metadataInfo.slowMotionData == null) {
            return metadataInfo;
        }
        Assertions.checkState(metadataInfo.inputMaxLayer != -1, "SVC temporal layer count not found.");
        Assertions.checkState(metadataInfo.captureFrameRate != -3.4028235E38f, "Capture frame rate not found.");
        float f = metadataInfo.captureFrameRate;
        boolean z2 = f % 1.0f == 0.0f && f % 30.0f == 0.0f;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Invalid capture frame rate: ");
        sb.append(f);
        Assertions.checkState(z2, sb.toString());
        int i2 = ((int) metadataInfo.captureFrameRate) / 30;
        int i3 = metadataInfo.inputMaxLayer;
        while (true) {
            if (i3 < 0) {
                break;
            } else if ((i2 & 1) == 1) {
                if ((i2 >> 1) == 0) {
                    z = true;
                }
                float f2 = metadataInfo.captureFrameRate;
                StringBuilder sb2 = new StringBuilder(84);
                sb2.append("Could not compute normal speed max SVC layer for capture frame rate  ");
                sb2.append(f2);
                Assertions.checkState(z, sb2.toString());
                metadataInfo.normalSpeedMaxLayer = i3;
            } else {
                i2 >>= 1;
                i3--;
            }
        }
        return metadataInfo;
    }

    @RequiresNonNull({"currentSegmentInfo"})
    private void leaveCurrentSegment() {
        long j = this.frameTimeDeltaUs;
        SegmentInfo segmentInfo = this.currentSegmentInfo;
        this.frameTimeDeltaUs = j + ((segmentInfo.endTimeUs - segmentInfo.startTimeUs) * ((long) (segmentInfo.speedDivisor - 1)));
        this.currentSegmentInfo = null;
    }

    private boolean shouldKeepFrameForOutputValidity(int i, long j) {
        int i2;
        SegmentInfo segmentInfo = this.nextSegmentInfo;
        if (segmentInfo != null && i < (i2 = segmentInfo.maxLayer)) {
            long j2 = ((segmentInfo.startTimeUs - j) * 30) / 1000000;
            float f = ((float) (-(1 << (this.inputMaxLayer - i2)))) + 0.45f;
            int i3 = 1;
            while (i3 < this.nextSegmentInfo.maxLayer && ((float) j2) < ((float) (1 << (this.inputMaxLayer - i3))) + f) {
                if (i <= i3) {
                    return true;
                }
                i3++;
            }
        }
        return false;
    }

    private void skipToNextNalUnit(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        while (true) {
            int remaining = byteBuffer.remaining();
            int i = NAL_START_CODE_LENGTH;
            if (remaining >= i) {
                byteBuffer.get(this.scratch, 0, i);
                if (Arrays.equals(this.scratch, NalUnitUtil.NAL_START_CODE)) {
                    byteBuffer.position(position);
                    return;
                } else {
                    position++;
                    byteBuffer.position(position);
                }
            } else {
                throw new IllegalStateException("Could not find NAL unit start code.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public long getCurrentFrameOutputTimeUs(long j) {
        long j2 = this.frameTimeDeltaUs + j;
        SegmentInfo segmentInfo = this.currentSegmentInfo;
        if (segmentInfo != null) {
            j2 += (j - segmentInfo.startTimeUs) * ((long) (segmentInfo.speedDivisor - 1));
        }
        return (long) Math.round(((float) (j2 * 30)) / this.captureFrameRate);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean processCurrentFrame(int r5, long r6) {
        /*
            r4 = this;
        L_0x0000:
            com.google.android.exoplayer2.transformer.SefSlowMotionVideoSampleTransformer$SegmentInfo r0 = r4.nextSegmentInfo
            if (r0 == 0) goto L_0x000e
            long r1 = r0.endTimeUs
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x000e
            r4.enterNextSegment()
            goto L_0x0000
        L_0x000e:
            if (r0 == 0) goto L_0x001a
            long r0 = r0.startTimeUs
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x001a
            r4.enterNextSegment()
            goto L_0x0027
        L_0x001a:
            com.google.android.exoplayer2.transformer.SefSlowMotionVideoSampleTransformer$SegmentInfo r0 = r4.currentSegmentInfo
            if (r0 == 0) goto L_0x0027
            long r0 = r0.endTimeUs
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0027
            r4.leaveCurrentSegment()
        L_0x0027:
            com.google.android.exoplayer2.transformer.SefSlowMotionVideoSampleTransformer$SegmentInfo r0 = r4.currentSegmentInfo
            if (r0 == 0) goto L_0x002e
            int r0 = r0.maxLayer
            goto L_0x0030
        L_0x002e:
            int r0 = r4.normalSpeedMaxLayer
        L_0x0030:
            if (r5 <= r0) goto L_0x003b
            boolean r5 = r4.shouldKeepFrameForOutputValidity(r5, r6)
            if (r5 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r5 = 0
            goto L_0x003c
        L_0x003b:
            r5 = 1
        L_0x003c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.transformer.SefSlowMotionVideoSampleTransformer.processCurrentFrame(int, long):boolean");
    }

    public void transformSample(DecoderInputBuffer decoderInputBuffer) {
        if (this.slowMotionData != null) {
            ByteBuffer byteBuffer = (ByteBuffer) Util.castNonNull(decoderInputBuffer.data);
            byteBuffer.position(byteBuffer.position() + NAL_START_CODE_LENGTH);
            boolean z = false;
            byteBuffer.get(this.scratch, 0, 4);
            byte[] bArr = this.scratch;
            byte b = bArr[0] & 31;
            boolean z2 = ((bArr[1] & 255) >> 7) == 1;
            if (b == 14 && z2) {
                z = true;
            }
            Assertions.checkState(z, "Missing SVC extension prefix NAL unit.");
            if (processCurrentFrame((this.scratch[3] & 255) >> 5, decoderInputBuffer.timeUs)) {
                decoderInputBuffer.timeUs = getCurrentFrameOutputTimeUs(decoderInputBuffer.timeUs);
                skipToNextNalUnit(byteBuffer);
                return;
            }
            decoderInputBuffer.data = null;
        }
    }
}
