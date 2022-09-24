package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C7774hy;
import com.google.android.gms.internal.ads.C8280vz;
import com.google.android.gms.internal.ads.co0;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* renamed from: a */
    private final Object f27740a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private C7774hy f27741b;
    @GuardedBy("lock")

    /* renamed from: c */
    private VideoLifecycleCallbacks f27742c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public int getPlaybackState() {
        synchronized (this.f27740a) {
            C7774hy hyVar = this.f27741b;
            if (hyVar == null) {
                return 0;
            }
            try {
                int zzh = hyVar.zzh();
                return zzh;
            } catch (RemoteException e) {
                co0.zzh("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    @RecentlyNullable
    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f27740a) {
            videoLifecycleCallbacks = this.f27742c;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.f27740a) {
            z = this.f27741b != null;
        }
        return z;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.f27740a) {
            C7774hy hyVar = this.f27741b;
            if (hyVar == null) {
                return false;
            }
            try {
                boolean zzo = hyVar.zzo();
                return zzo;
            } catch (RemoteException e) {
                co0.zzh("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.f27740a) {
            C7774hy hyVar = this.f27741b;
            if (hyVar == null) {
                return false;
            }
            try {
                boolean zzp = hyVar.zzp();
                return zzp;
            } catch (RemoteException e) {
                co0.zzh("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.f27740a) {
            C7774hy hyVar = this.f27741b;
            if (hyVar == null) {
                return true;
            }
            try {
                boolean zzq = hyVar.zzq();
                return zzq;
            } catch (RemoteException e) {
                co0.zzh("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.f27740a) {
            C7774hy hyVar = this.f27741b;
            if (hyVar != null) {
                try {
                    hyVar.mo18394F(z);
                } catch (RemoteException e) {
                    co0.zzh("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.f27740a) {
            C7774hy hyVar = this.f27741b;
            if (hyVar != null) {
                try {
                    hyVar.zzk();
                } catch (RemoteException e) {
                    co0.zzh("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public void play() {
        synchronized (this.f27740a) {
            C7774hy hyVar = this.f27741b;
            if (hyVar != null) {
                try {
                    hyVar.zzl();
                } catch (RemoteException e) {
                    co0.zzh("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        C8280vz vzVar;
        synchronized (this.f27740a) {
            this.f27742c = videoLifecycleCallbacks;
            C7774hy hyVar = this.f27741b;
            if (hyVar != null) {
                if (videoLifecycleCallbacks == null) {
                    vzVar = null;
                } else {
                    try {
                        vzVar = new C8280vz(videoLifecycleCallbacks);
                    } catch (RemoteException e) {
                        co0.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        return;
                    }
                }
                hyVar.mo18395i3(vzVar);
            }
        }
    }

    public void stop() {
        synchronized (this.f27740a) {
            C7774hy hyVar = this.f27741b;
            if (hyVar != null) {
                try {
                    hyVar.zzn();
                } catch (RemoteException e) {
                    co0.zzh("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public final C7774hy zza() {
        C7774hy hyVar;
        synchronized (this.f27740a) {
            hyVar = this.f27741b;
        }
        return hyVar;
    }

    public final void zzb(C7774hy hyVar) {
        synchronized (this.f27740a) {
            this.f27741b = hyVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.f27742c;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}
