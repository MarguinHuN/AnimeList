package progkor.nye3.animelist.service;

import java.util.List;
import java.util.Optional;

import progkor.nye3.animelist.data.model.Anime;

/**
 * A service for managing animes in the anime list.
 */
public interface AnimeService {

    /**
     * Creates a new anime.
     *
     * @param anime the anime to create
     * @return the created anime
     */
    Anime createAnime(Anime anime);

    /**
     * Retrieves an anime by its id.
     *
     * @param id the id of the anime to retrieve
     * @return the retrieved anime
     */
    Anime retrieveAnimeById(Long id);

    /**
     * Retrieves all animes in the list.
     *
     * @return the list of found animes
     */
    List<Anime> retrieveAllAnime();

    /**
     * Updates an existing anime.
     *
     * @param anime the anime to update
     * @return the updated anime
     */
    Anime updateAnime(Anime anime);

    /**
     * Deletes an anime by its id.
     *
     * @param id the id of the anime to delete
     */
    void deleteAnimeById(Long id);
}
