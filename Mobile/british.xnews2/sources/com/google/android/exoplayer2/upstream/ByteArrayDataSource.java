package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;
    private final byte[] data;
    private boolean opened;
    private int readPosition;
    private Uri uri;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ByteArrayDataSource(byte[] bArr) {
        super(false);
        boolean z = false;
        Assertions.checkNotNull(bArr);
        Assertions.checkArgument(bArr.length > 0 ? true : z);
        this.data = bArr;
    }

    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
    }

    public Uri getUri() {
        return this.uri;
    }

    public long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        transferInitializing(dataSpec);
        long j = dataSpec.position;
        byte[] bArr = this.data;
        if (j <= ((long) bArr.length)) {
            this.readPosition = (int) j;
            int length = bArr.length - ((int) j);
            this.bytesRemaining = length;
            long j2 = dataSpec.length;
            if (j2 != -1) {
                this.bytesRemaining = (int) Math.min((long) length, j2);
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j3 = dataSpec.length;
            return j3 != -1 ? j3 : (long) this.bytesRemaining;
        }
        throw new DataSourceException(0);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.data, this.readPosition, bArr, i, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }
}
