package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

final class EventSampleStream implements SampleStream {
    private int currentIndex;
    private final EventMessageEncoder eventMessageEncoder = new EventMessageEncoder();
    private EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private long pendingSeekPositionUs = C6540C.TIME_UNSET;
    private final Format upstreamFormat;

    public EventSampleStream(EventStream eventStream2, Format format, boolean z) {
        this.upstreamFormat = format;
        this.eventStream = eventStream2;
        this.eventTimesUs = eventStream2.presentationTimesUs;
        updateEventStream(eventStream2, z);
    }

    public String eventStreamId() {
        return this.eventStream.mo26675id();
    }

    public boolean isReady() {
        return true;
    }

    public void maybeThrowError() throws IOException {
    }

    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        if ((i & 2) != 0 || !this.isFormatSentDownstream) {
            formatHolder.format = this.upstreamFormat;
            this.isFormatSentDownstream = true;
            return -5;
        }
        int i2 = this.currentIndex;
        if (i2 != this.eventTimesUs.length) {
            this.currentIndex = i2 + 1;
            byte[] encode = this.eventMessageEncoder.encode(this.eventStream.events[i2]);
            decoderInputBuffer.ensureSpaceForWrite(encode.length);
            decoderInputBuffer.data.put(encode);
            decoderInputBuffer.timeUs = this.eventTimesUs[i2];
            decoderInputBuffer.setFlags(1);
            return -4;
        } else if (this.eventStreamAppendable) {
            return -3;
        } else {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
    }

    public void seekToUs(long j) {
        boolean z = true;
        int binarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j, true, false);
        this.currentIndex = binarySearchCeil;
        if (!this.eventStreamAppendable || binarySearchCeil != this.eventTimesUs.length) {
            z = false;
        }
        if (!z) {
            j = C6540C.TIME_UNSET;
        }
        this.pendingSeekPositionUs = j;
    }

    public int skipData(long j) {
        int max = Math.max(this.currentIndex, Util.binarySearchCeil(this.eventTimesUs, j, true, false));
        int i = max - this.currentIndex;
        this.currentIndex = max;
        return i;
    }

    public void updateEventStream(EventStream eventStream2, boolean z) {
        int i = this.currentIndex;
        long j = i == 0 ? -9223372036854775807L : this.eventTimesUs[i - 1];
        this.eventStreamAppendable = z;
        this.eventStream = eventStream2;
        long[] jArr = eventStream2.presentationTimesUs;
        this.eventTimesUs = jArr;
        long j2 = this.pendingSeekPositionUs;
        if (j2 != C6540C.TIME_UNSET) {
            seekToUs(j2);
        } else if (j != C6540C.TIME_UNSET) {
            this.currentIndex = Util.binarySearchCeil(jArr, j, false, false);
        }
    }
}
