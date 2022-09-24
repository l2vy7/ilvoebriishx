package com.google.android.exoplayer2.ext.rtmp;

import android.net.Uri;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import net.butterflytv.rtmp_client.RtmpClient;

public final class RtmpDataSource extends BaseDataSource {

    /* renamed from: a */
    public static final /* synthetic */ int f27409a = 0;
    private RtmpClient rtmpClient;
    private Uri uri;

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.rtmp");
    }

    public RtmpDataSource() {
        super(true);
    }

    public void close() {
        if (this.uri != null) {
            this.uri = null;
            transferEnded();
        }
        RtmpClient rtmpClient2 = this.rtmpClient;
        if (rtmpClient2 != null) {
            rtmpClient2.mo47989a();
            this.rtmpClient = null;
        }
    }

    public Uri getUri() {
        return this.uri;
    }

    public long open(DataSpec dataSpec) throws RtmpClient.C12843a {
        transferInitializing(dataSpec);
        RtmpClient rtmpClient2 = new RtmpClient();
        this.rtmpClient = rtmpClient2;
        rtmpClient2.mo47990b(dataSpec.uri.toString(), false);
        this.uri = dataSpec.uri;
        transferStarted(dataSpec);
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int c = ((RtmpClient) Util.castNonNull(this.rtmpClient)).mo47991c(bArr, i, i2);
        if (c == -1) {
            return -1;
        }
        bytesTransferred(c);
        return c;
    }
}
