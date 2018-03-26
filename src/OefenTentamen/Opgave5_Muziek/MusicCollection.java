package OefenTentamen.Opgave5_Muziek;

import com.sun.javafx.collections.SortableList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MusicCollection
{
    private List<Song> collection = new ArrayList();


    public void Add(Song newSong)
    {
        collection.add(newSong);
    }

    public void getAllCollectionTitles()
    {
        String songTitles = "";
        for (Song song : collection)
            songTitles = songTitles + song.getTitle() + "\n";
        System.out.println(songTitles);
    }

    public int Size()
    {
        return collection.size();
    }

    public void sortByTitle() {
        collection.sort(new SongTitleSorter());
    }

    public void sortByPerformer() {
        collection.sort(new SongPerformerSorter());
    }

    public void sortByDuration() {
        collection.sort(new SongDurationSorter());
    }
}