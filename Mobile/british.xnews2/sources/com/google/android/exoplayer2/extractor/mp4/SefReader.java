package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p148s6.C11005m;

final class SefReader {
    private static final C11005m ASTERISK_SPLITTER = C11005m.m49359d('*');
    private static final C11005m COLON_SPLITTER = C11005m.m49359d(':');
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final List<DataReference> dataReferences = new ArrayList();
    private int readerState = 0;
    private int tailLength;

    private static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int i, long j, int i2) {
            this.dataType = i;
            this.startOffset = j;
            this.size = i2;
        }
    }

    private void checkForSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.tailLength = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != SAMSUNG_TAIL_SIGNATURE) {
            positionHolder.position = 0;
            return;
        }
        positionHolder.position = extractorInput.getPosition() - ((long) (this.tailLength - 12));
        this.readerState = 2;
    }

    private static int nameToDataType(String str) throws ParserException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TYPE_SLOW_MOTION_DATA;
            case 1:
                return TYPE_SUPER_SLOW_MOTION_EDIT_DATA;
            case 2:
                return TYPE_SUPER_SLOW_MOTION_DATA;
            case 3:
                return TYPE_SUPER_SLOW_DEFLICKERING_ON;
            case 4:
                return TYPE_SUPER_SLOW_MOTION_BGM;
            default:
                throw new ParserException("Invalid SEF name");
        }
    }

    private void readSdrs(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int i = (this.tailLength - 12) - 8;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        extractorInput.readFully(parsableByteArray.getData(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            parsableByteArray.skipBytes(2);
            short readLittleEndianShort = parsableByteArray.readLittleEndianShort();
            if (readLittleEndianShort == TYPE_SLOW_MOTION_DATA || readLittleEndianShort == TYPE_SUPER_SLOW_MOTION_DATA || readLittleEndianShort == TYPE_SUPER_SLOW_MOTION_BGM || readLittleEndianShort == TYPE_SUPER_SLOW_MOTION_EDIT_DATA || readLittleEndianShort == TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                this.dataReferences.add(new DataReference(readLittleEndianShort, (length - ((long) this.tailLength)) - ((long) parsableByteArray.readLittleEndianInt()), parsableByteArray.readLittleEndianInt()));
            } else {
                parsableByteArray.skipBytes(8);
            }
        }
        if (this.dataReferences.isEmpty()) {
            positionHolder.position = 0;
            return;
        }
        this.readerState = 3;
        positionHolder.position = this.dataReferences.get(0).startOffset;
    }

    private void readSefData(ExtractorInput extractorInput, List<Metadata.Entry> list) throws IOException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - ((long) this.tailLength));
        ParsableByteArray parsableByteArray = new ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i = 0; i < this.dataReferences.size(); i++) {
            DataReference dataReference = this.dataReferences.get(i);
            parsableByteArray.setPosition((int) (dataReference.startOffset - position));
            parsableByteArray.skipBytes(4);
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int nameToDataType = nameToDataType(parsableByteArray.readString(readLittleEndianInt));
            int i2 = dataReference.size - (readLittleEndianInt + 8);
            if (nameToDataType == TYPE_SLOW_MOTION_DATA) {
                list.add(readSlowMotionData(parsableByteArray, i2));
            } else if (!(nameToDataType == TYPE_SUPER_SLOW_MOTION_DATA || nameToDataType == TYPE_SUPER_SLOW_MOTION_BGM || nameToDataType == TYPE_SUPER_SLOW_MOTION_EDIT_DATA || nameToDataType == TYPE_SUPER_SLOW_DEFLICKERING_ON)) {
                throw new IllegalStateException();
            }
        }
    }

    private static SlowMotionData readSlowMotionData(ParsableByteArray parsableByteArray, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> f = ASTERISK_SPLITTER.mo43297f(parsableByteArray.readString(i));
        int i2 = 0;
        while (i2 < f.size()) {
            List<String> f2 = COLON_SPLITTER.mo43297f(f.get(i2));
            if (f2.size() == 3) {
                try {
                    arrayList.add(new SlowMotionData.Segment(Long.parseLong(f2.get(0)), Long.parseLong(f2.get(1)), 1 << (Integer.parseInt(f2.get(2)) - 1)));
                    i2++;
                } catch (NumberFormatException e) {
                    throw new ParserException((Throwable) e);
                }
            } else {
                throw new ParserException();
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder, List<Metadata.Entry> list) throws IOException {
        int i = this.readerState;
        long j = 0;
        if (i == 0) {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            positionHolder.position = j;
            this.readerState = 1;
        } else if (i == 1) {
            checkForSefData(extractorInput, positionHolder);
        } else if (i == 2) {
            readSdrs(extractorInput, positionHolder);
        } else if (i == 3) {
            readSefData(extractorInput, list);
            positionHolder.position = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void reset() {
        this.dataReferences.clear();
        this.readerState = 0;
    }
}
