package com.google.android.exoplayer2.extractor;

import java.io.IOException;

public class ForwardingExtractorInput implements ExtractorInput {
    private final ExtractorInput input;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.input = extractorInput;
    }

    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        return this.input.advancePeekPosition(i, z);
    }

    public long getLength() {
        return this.input.getLength();
    }

    public long getPeekPosition() {
        return this.input.getPeekPosition();
    }

    public long getPosition() {
        return this.input.getPosition();
    }

    public int peek(byte[] bArr, int i, int i2) throws IOException {
        return this.input.peek(bArr, i, i2);
    }

    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.input.peekFully(bArr, i, i2, z);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.input.read(bArr, i, i2);
    }

    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.input.readFully(bArr, i, i2, z);
    }

    public void resetPeekPosition() {
        this.input.resetPeekPosition();
    }

    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        this.input.setRetryPosition(j, e);
    }

    public int skip(int i) throws IOException {
        return this.input.skip(i);
    }

    public boolean skipFully(int i, boolean z) throws IOException {
        return this.input.skipFully(i, z);
    }

    public void advancePeekPosition(int i) throws IOException {
        this.input.advancePeekPosition(i);
    }

    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        this.input.peekFully(bArr, i, i2);
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.input.readFully(bArr, i, i2);
    }

    public void skipFully(int i) throws IOException {
        this.input.skipFully(i);
    }
}
