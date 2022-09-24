package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.startapp.C12425x3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class RtpH264Reader implements RtpPayloadReader {
    private static final int FU_PAYLOAD_OFFSET = 2;
    private static final long MEDIA_CLOCK_FREQUENCY = 90000;
    private static final ParsableByteArray NAL_START_CODE;
    private static final int NAL_START_CODE_LENGTH;
    private static final int NAL_UNIT_TYPE_IDR = 5;
    private static final int RTP_PACKET_TYPE_FU_A = 28;
    private static final int RTP_PACKET_TYPE_STAP_A = 24;
    private static final String TAG = "RtpH264Reader";
    private int bufferFlags;
    private long firstReceivedTimestamp = C6540C.TIME_UNSET;
    private int fragmentedSampleSizeBytes;
    private final ParsableByteArray fuScratchBuffer = new ParsableByteArray();
    private final RtpPayloadFormat payloadFormat;
    private int previousSequenceNumber = -1;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;

    static {
        byte[] bArr = NalUnitUtil.NAL_START_CODE;
        NAL_START_CODE = new ParsableByteArray(bArr);
        NAL_START_CODE_LENGTH = bArr.length;
    }

    public RtpH264Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private static int getBufferFlagsFromNalType(int i) {
        return i == 5 ? 1 : 0;
    }

    @RequiresNonNull({"trackOutput"})
    private void processFragmentationUnitPacket(ParsableByteArray parsableByteArray, int i) {
        byte b = parsableByteArray.getData()[0];
        byte b2 = parsableByteArray.getData()[1];
        byte b3 = (b & 224) | (b2 & 31);
        boolean z = (b2 & C12425x3.f55111d) > 0;
        boolean z2 = (b2 & 64) > 0;
        if (z) {
            this.fragmentedSampleSizeBytes += writeStartCode(this.trackOutput);
            parsableByteArray.getData()[1] = (byte) b3;
            this.fuScratchBuffer.reset(parsableByteArray.getData());
            this.fuScratchBuffer.setPosition(1);
        } else {
            int i2 = (this.previousSequenceNumber + 1) % RtpPacket.MAX_SEQUENCE_NUMBER;
            if (i != i2) {
                Log.m19797w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i2), Integer.valueOf(i)));
                return;
            } else {
                this.fuScratchBuffer.reset(parsableByteArray.getData());
                this.fuScratchBuffer.setPosition(2);
            }
        }
        int bytesLeft = this.fuScratchBuffer.bytesLeft();
        this.trackOutput.sampleData(this.fuScratchBuffer, bytesLeft);
        this.fragmentedSampleSizeBytes += bytesLeft;
        if (z2) {
            this.bufferFlags = getBufferFlagsFromNalType(b3 & 31);
        }
    }

    @RequiresNonNull({"trackOutput"})
    private void processSingleNalUnitPacket(ParsableByteArray parsableByteArray) {
        int bytesLeft = parsableByteArray.bytesLeft();
        this.fragmentedSampleSizeBytes += writeStartCode(this.trackOutput);
        this.trackOutput.sampleData(parsableByteArray, bytesLeft);
        this.fragmentedSampleSizeBytes += bytesLeft;
        this.bufferFlags = getBufferFlagsFromNalType(parsableByteArray.getData()[0] & 31);
    }

    @RequiresNonNull({"trackOutput"})
    private void processSingleTimeAggregationPacket(ParsableByteArray parsableByteArray) {
        parsableByteArray.readUnsignedByte();
        while (parsableByteArray.bytesLeft() > 4) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            this.fragmentedSampleSizeBytes += writeStartCode(this.trackOutput);
            this.trackOutput.sampleData(parsableByteArray, readUnsignedShort);
            this.fragmentedSampleSizeBytes += readUnsignedShort;
        }
        this.bufferFlags = 0;
    }

    private static long toSampleUs(long j, long j2, long j3) {
        return j + Util.scaleLargeTimestamp(j2 - j3, 1000000, MEDIA_CLOCK_FREQUENCY);
    }

    private static int writeStartCode(TrackOutput trackOutput2) {
        ParsableByteArray parsableByteArray = NAL_START_CODE;
        int i = NAL_START_CODE_LENGTH;
        trackOutput2.sampleData(parsableByteArray, i);
        parsableByteArray.setPosition(0);
        return i;
    }

    public void consume(ParsableByteArray parsableByteArray, long j, int i, boolean z) throws ParserException {
        int i2 = i;
        try {
            byte b = parsableByteArray.getData()[0] & 31;
            Assertions.checkStateNotNull(this.trackOutput);
            if (b > 0 && b < 24) {
                processSingleNalUnitPacket(parsableByteArray);
            } else if (b == 24) {
                processSingleTimeAggregationPacket(parsableByteArray);
            } else if (b == 28) {
                processFragmentationUnitPacket(parsableByteArray, i2);
            } else {
                throw new ParserException(String.format("RTP H264 packetization mode [%d] not supported.", new Object[]{Integer.valueOf(b)}));
            }
            if (z) {
                long j2 = j;
                if (this.firstReceivedTimestamp == C6540C.TIME_UNSET) {
                    this.firstReceivedTimestamp = j2;
                }
                this.trackOutput.sampleMetadata(toSampleUs(this.startTimeOffsetUs, j, this.firstReceivedTimestamp), this.bufferFlags, this.fragmentedSampleSizeBytes, 0, (TrackOutput.CryptoData) null);
                this.fragmentedSampleSizeBytes = 0;
            }
            this.previousSequenceNumber = i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ParserException((Throwable) e);
        }
    }

    public void createTracks(ExtractorOutput extractorOutput, int i) {
        TrackOutput track = extractorOutput.track(i, 2);
        this.trackOutput = track;
        ((TrackOutput) Util.castNonNull(track)).format(this.payloadFormat.format);
    }

    public void onReceivingFirstPacket(long j, int i) {
    }

    public void seek(long j, long j2) {
        this.firstReceivedTimestamp = j;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j2;
    }
}
