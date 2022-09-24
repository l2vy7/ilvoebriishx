package com.google.android.exoplayer2.ext.rtmp;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;

public final class RtmpDataSourceFactory implements DataSource.Factory {
    private final TransferListener listener;

    public RtmpDataSourceFactory() {
        this((TransferListener) null);
    }

    public RtmpDataSourceFactory(TransferListener transferListener) {
        this.listener = transferListener;
    }

    public RtmpDataSource createDataSource() {
        RtmpDataSource rtmpDataSource = new RtmpDataSource();
        TransferListener transferListener = this.listener;
        if (transferListener != null) {
            rtmpDataSource.addTransferListener(transferListener);
        }
        return rtmpDataSource;
    }
}
