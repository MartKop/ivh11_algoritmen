package OefenTentamen.Opgave5_Muziek;

import java.util.Comparator;

public class SongDurationSorter implements Comparator<Song> {
    @Override
    public int compare(Song song1, Song song2) {
        return song1.getDuration() - song2.getDuration();
    }
}