package progkor.nye3.animelist.data.model;

import java.util.Objects;

/**
 * Model class for animes.
 */
public class Anime {

    private Long id;
    private String title;
    private Integer episodes;
    private Integer release;
    private Integer end;

    public Anime() {
    }

    public Anime(Long id, String title, Integer episodes, Integer release, Integer end) {
        this.id = id;
        this.title = title;
        this.episodes = episodes;
        this.release = release;
        this.end = end;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    public Integer getRelease() {
        return release;
    }

    public void setRelease(Integer release) {
        this.release = release;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Objects.equals(id, anime.id) && Objects.equals(title, anime.title) && Objects.equals(episodes, anime.episodes) && Objects.equals(release, anime.release) && Objects.equals(end, anime.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, episodes, release, end);
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", episodes=" + episodes +
                ", release=" + release +
                ", end=" + end +
                '}';
    }
}
