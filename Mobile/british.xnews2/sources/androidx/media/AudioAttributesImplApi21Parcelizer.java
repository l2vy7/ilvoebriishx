package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1366a;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1366a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3886a = (AudioAttributes) aVar.mo6578r(audioAttributesImplApi21.f3886a, 1);
        audioAttributesImplApi21.f3887b = aVar.mo6576p(audioAttributesImplApi21.f3887b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1366a aVar) {
        aVar.mo6584x(false, false);
        aVar.mo6558H(audioAttributesImplApi21.f3886a, 1);
        aVar.mo6556F(audioAttributesImplApi21.f3887b, 2);
    }
}
