package com.startapp.sdk.ads.video.player;

/* compiled from: Sta */
public interface VideoPlayerInterface {

    /* compiled from: Sta */
    public enum VideoPlayerErrorType {
        UNKNOWN,
        SERVER_DIED,
        BUFFERING_TIMEOUT
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$a */
    /* compiled from: Sta */
    public interface C12249a {
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$b */
    /* compiled from: Sta */
    public interface C12250b {
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$c */
    /* compiled from: Sta */
    public interface C12251c {
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$d */
    /* compiled from: Sta */
    public interface C12252d {
    }

    /* renamed from: com.startapp.sdk.ads.video.player.VideoPlayerInterface$e */
    /* compiled from: Sta */
    public static class C12253e {

        /* renamed from: a */
        public VideoPlayerErrorType f54436a;

        /* renamed from: b */
        public String f54437b;

        /* renamed from: c */
        public int f54438c;

        public C12253e(VideoPlayerErrorType videoPlayerErrorType, String str, int i) {
            this.f54436a = videoPlayerErrorType;
            this.f54437b = str;
            this.f54438c = i;
        }
    }
}
