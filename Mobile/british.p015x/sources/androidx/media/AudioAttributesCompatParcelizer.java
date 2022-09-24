package androidx.media;

import androidx.versionedparcelable.C1366a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1366a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3884a = (AudioAttributesImpl) aVar.mo6582v(audioAttributesCompat.f3884a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1366a aVar) {
        aVar.mo6584x(false, false);
        aVar.mo6563M(audioAttributesCompat.f3884a, 1);
    }
}
