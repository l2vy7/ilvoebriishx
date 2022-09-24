package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Collections;
import java.util.List;

public class Period {
    public final List<AdaptationSet> adaptationSets;
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;

    /* renamed from: id */
    public final String f27538id;
    public final long startMs;

    public Period(String str, long j, List<AdaptationSet> list) {
        this(str, j, list, Collections.emptyList(), (Descriptor) null);
    }

    public int getAdaptationSetIndex(int i) {
        int size = this.adaptationSets.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.adaptationSets.get(i2).type == i) {
                return i2;
            }
        }
        return -1;
    }

    public Period(String str, long j, List<AdaptationSet> list, List<EventStream> list2) {
        this(str, j, list, list2, (Descriptor) null);
    }

    public Period(String str, long j, List<AdaptationSet> list, List<EventStream> list2, Descriptor descriptor) {
        this.f27538id = str;
        this.startMs = j;
        this.adaptationSets = Collections.unmodifiableList(list);
        this.eventStreams = Collections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }
}
