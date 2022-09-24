package british.p015x;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.ads.AdsLoader;

/* renamed from: british.x.a3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1596a3 implements DefaultMediaSourceFactory.AdsLoaderProvider {

    /* renamed from: a */
    public final /* synthetic */ t_video_exoplayer f6839a;

    public /* synthetic */ C1596a3(t_video_exoplayer t_video_exoplayer) {
        this.f6839a = t_video_exoplayer;
    }

    public final AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration) {
        return this.f6839a.m9029d0(adsConfiguration);
    }
}
