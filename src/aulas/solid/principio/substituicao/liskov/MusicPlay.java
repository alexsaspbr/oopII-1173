package solid.principio.substituicao.liskov;

import java.io.File;

class MusicPlay
{
    public void play(File file)
    {
        // toca a música
    }
}

class Mp3MusicPlay extends MusicPlay
{
    public void play(File file) {
        if (Util.getFileExtension(file) != "mp3") {
            throw new Exception;
        }

        // toca a música
    }
}

class Util {
    public static String getFileExtension(File file) {
        return null;
    };
}
