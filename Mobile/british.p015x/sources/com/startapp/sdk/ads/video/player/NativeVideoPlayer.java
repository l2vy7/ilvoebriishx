package com.startapp.sdk.ads.video.player;

import android.media.MediaPlayer;
import android.widget.VideoView;
import com.startapp.C12350tc;
import com.startapp.C12376uc;
import com.startapp.C12397vc;
import com.startapp.C5004d4;
import com.startapp.sdk.ads.video.C12237d;
import com.startapp.sdk.ads.video.C12244i;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface;
import com.startapp.sdk.adsbase.C5055a;

/* compiled from: Sta */
public class NativeVideoPlayer extends C12254a implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    /* renamed from: f */
    public MediaPlayer f54421f;

    /* renamed from: g */
    public final VideoView f54422g;

    /* compiled from: Sta */
    public enum MediaErrorExtra {
        MEDIA_ERROR_IO,
        MEDIA_ERROR_MALFORMED,
        MEDIA_ERROR_UNSUPPORTED,
        MEDIA_ERROR_TIMED_OUT
    }

    /* compiled from: Sta */
    public enum MediaErrorType {
        MEDIA_ERROR_UNKNOWN,
        MEDIA_ERROR_SERVER_DIED
    }

    /* renamed from: com.startapp.sdk.ads.video.player.NativeVideoPlayer$a */
    /* compiled from: Sta */
    public class C12248a implements MediaPlayer.OnBufferingUpdateListener {
        public C12248a() {
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            VideoPlayerInterface.C12249a aVar = NativeVideoPlayer.this.f54443e;
            if (aVar != null) {
                ((C12376uc) aVar).mo46667a(i);
            }
        }
    }

    public NativeVideoPlayer(VideoView videoView) {
        this.f54422g = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    /* renamed from: a */
    public void mo46041a(String str) {
        this.f54439a = str;
        if (str != null) {
            try {
                this.f54422g.setVideoPath(str);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                onError(this.f54421f, 1, 0);
            }
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoPlayerInterface.C12250b bVar = this.f54442d;
        if (bVar != null) {
            ((C12244i) bVar).mo46038a();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        MediaErrorType mediaErrorType;
        VideoPlayerInterface.VideoPlayerErrorType videoPlayerErrorType;
        MediaErrorExtra mediaErrorExtra;
        if (this.f54441c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        VideoPlayerInterface.C12251c cVar = this.f54441c;
        if (i == 100) {
            mediaErrorType = MediaErrorType.MEDIA_ERROR_SERVER_DIED;
        } else {
            mediaErrorType = MediaErrorType.MEDIA_ERROR_UNKNOWN;
        }
        if (mediaErrorType == MediaErrorType.MEDIA_ERROR_SERVER_DIED) {
            videoPlayerErrorType = VideoPlayerInterface.VideoPlayerErrorType.SERVER_DIED;
        } else {
            videoPlayerErrorType = VideoPlayerInterface.VideoPlayerErrorType.UNKNOWN;
        }
        if (i2 == -1010) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED;
        } else if (i2 == -1007) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_MALFORMED;
        } else if (i2 != -110) {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_IO;
        } else {
            mediaErrorExtra = MediaErrorExtra.MEDIA_ERROR_TIMED_OUT;
        }
        String str = mediaErrorExtra.toString();
        VideoPlayerInterface.C12253e eVar = new VideoPlayerInterface.C12253e(videoPlayerErrorType, str, currentPosition);
        C12397vc vcVar = (C12397vc) cVar;
        VideoMode videoMode = vcVar.f54935a;
        if (videoMode.f54325K != null) {
            videoMode.f54346f0 = false;
            if (!videoMode.f54345e0 || videoMode.f54349i0 > videoMode.f54350j0 || currentPosition <= 0 || !str.equals("MEDIA_ERROR_IO")) {
                vcVar.f54935a.mo46009a(eVar);
            } else {
                VideoMode videoMode2 = vcVar.f54935a;
                videoMode2.f54349i0++;
                videoMode2.mo46002O();
                VideoMode videoMode3 = vcVar.f54935a;
                ((NativeVideoPlayer) videoMode3.f54325K).mo46041a(videoMode3.mo46019y().mo45971c());
                ((NativeVideoPlayer) vcVar.f54935a.f54325K).f54422g.seekTo(eVar.f54438c);
            }
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        this.f54421f = mediaPlayer;
        VideoPlayerInterface.C12252d dVar = this.f54440b;
        if (dVar != null) {
            C12350tc tcVar = (C12350tc) dVar;
            VideoMode videoMode = tcVar.f54779a;
            videoMode.f54346f0 = true;
            if (videoMode.f54335U && videoMode.f54336V) {
                videoMode.mo45989B();
            }
            if (tcVar.f54779a.mo45991D()) {
                tcVar.f54779a.mo46004Q();
            }
        }
        if (C5055a.m23166c(this.f54439a) && (mediaPlayer2 = this.f54421f) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new C12248a());
        } else if (!C5055a.m23166c(this.f54439a)) {
            C12237d.C12239b.f54399a.f54397b = this.f54443e;
        }
    }
}
