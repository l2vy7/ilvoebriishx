package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1366a;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C1366a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3886a = (AudioAttributes) aVar.mo6578r(audioAttributesImplApi26.f3886a, 1);
        audioAttributesImplApi26.f3887b = aVar.mo6576p(audioAttributesImplApi26.f3887b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C1366a aVar) {
        aVar.mo6584x(false, false);
        aVar.mo6558H(audioAttributesImplApi26.f3886a, 1);
        aVar.mo6556F(audioAttributesImplApi26.f3887b, 2);
    }
}
