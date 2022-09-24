package com.google.android.exoplayer2.transformer;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.C4766t;
import com.google.common.collect.C4792z;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class SegmentSpeedProvider implements SpeedProvider {
    private static final int INPUT_FRAME_RATE = 30;
    private final float baseSpeedMultiplier;
    private final C4792z<Long, Float> speedsByStartTimeUs;

    public SegmentSpeedProvider(Format format) {
        float captureFrameRate = getCaptureFrameRate(format);
        float f = captureFrameRate == -3.4028235E38f ? 1.0f : captureFrameRate / 30.0f;
        this.baseSpeedMultiplier = f;
        this.speedsByStartTimeUs = buildSpeedByStartTimeUsMap(format, f);
    }

    private static C4792z<Long, Float> buildSpeedByStartTimeUsMap(Format format, float f) {
        C4766t<SlowMotionData.Segment> extractSlowMotionSegments = extractSlowMotionSegments(format);
        if (extractSlowMotionSegments.isEmpty()) {
            return C4792z.m22115G();
        }
        TreeMap treeMap = new TreeMap();
        for (int i = 0; i < extractSlowMotionSegments.size(); i++) {
            SlowMotionData.Segment segment = extractSlowMotionSegments.get(i);
            treeMap.put(Long.valueOf(C6540C.msToUs(segment.startTimeMs)), Float.valueOf(f / ((float) segment.speedDivisor)));
        }
        for (int i2 = 0; i2 < extractSlowMotionSegments.size(); i2++) {
            SlowMotionData.Segment segment2 = extractSlowMotionSegments.get(i2);
            if (!treeMap.containsKey(Long.valueOf(C6540C.msToUs(segment2.endTimeMs)))) {
                treeMap.put(Long.valueOf(C6540C.msToUs(segment2.endTimeMs)), Float.valueOf(f));
            }
        }
        return C4792z.m22120u(treeMap);
    }

    private static C4766t<SlowMotionData.Segment> extractSlowMotionSegments(Format format) {
        ArrayList arrayList = new ArrayList();
        Metadata metadata = format.metadata;
        if (metadata != null) {
            for (int i = 0; i < metadata.length(); i++) {
                Metadata.Entry entry = metadata.get(i);
                if (entry instanceof SlowMotionData) {
                    arrayList.addAll(((SlowMotionData) entry).segments);
                }
            }
        }
        return C4766t.m21983K(SlowMotionData.Segment.BY_START_THEN_END_THEN_DIVISOR, arrayList);
    }

    private static float getCaptureFrameRate(Format format) {
        Metadata metadata = format.metadata;
        if (metadata == null) {
            return -3.4028235E38f;
        }
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof SmtaMetadataEntry) {
                return ((SmtaMetadataEntry) entry).captureFrameRate;
            }
        }
        return -3.4028235E38f;
    }

    public float getSpeed(long j) {
        Assertions.checkArgument(j >= 0);
        Map.Entry<Long, Float> floorEntry = this.speedsByStartTimeUs.floorEntry(Long.valueOf(j));
        return floorEntry != null ? floorEntry.getValue().floatValue() : this.baseSpeedMultiplier;
    }
}
