package androidx.media;

import androidx.versionedparcelable.C1366a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1366a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3889a = aVar.mo6576p(audioAttributesImplBase.f3889a, 1);
        audioAttributesImplBase.f3890b = aVar.mo6576p(audioAttributesImplBase.f3890b, 2);
        audioAttributesImplBase.f3891c = aVar.mo6576p(audioAttributesImplBase.f3891c, 3);
        audioAttributesImplBase.f3892d = aVar.mo6576p(audioAttributesImplBase.f3892d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1366a aVar) {
        aVar.mo6584x(false, false);
        aVar.mo6556F(audioAttributesImplBase.f3889a, 1);
        aVar.mo6556F(audioAttributesImplBase.f3890b, 2);
        aVar.mo6556F(audioAttributesImplBase.f3891c, 3);
        aVar.mo6556F(audioAttributesImplBase.f3892d, 4);
    }
}
