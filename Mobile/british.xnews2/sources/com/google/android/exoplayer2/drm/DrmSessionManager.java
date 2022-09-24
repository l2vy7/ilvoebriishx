package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;

public interface DrmSessionManager {
    public static final DrmSessionManager DRM_UNSUPPORTED;
    @Deprecated
    public static final DrmSessionManager DUMMY;

    public interface DrmSessionReference {
        public static final DrmSessionReference EMPTY = C6673r.f27396a;

        void release();
    }

    static {
        C66541 r0 = new DrmSessionManager() {
            public DrmSession acquireSession(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
                if (format.drmInitData == null) {
                    return null;
                }
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
            }

            public Class<UnsupportedMediaCrypto> getExoMediaCryptoType(Format format) {
                if (format.drmInitData != null) {
                    return UnsupportedMediaCrypto.class;
                }
                return null;
            }

            public /* synthetic */ DrmSessionReference preacquireSession(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
                return C6672q.m28528a(this, looper, eventDispatcher, format);
            }

            public /* synthetic */ void prepare() {
                C6672q.m28529b(this);
            }

            public /* synthetic */ void release() {
                C6672q.m28530c(this);
            }
        };
        DRM_UNSUPPORTED = r0;
        DUMMY = r0;
    }

    DrmSession acquireSession(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    Class<? extends ExoMediaCrypto> getExoMediaCryptoType(Format format);

    DrmSessionReference preacquireSession(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    void prepare();

    void release();
}
