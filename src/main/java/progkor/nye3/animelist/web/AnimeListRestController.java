package progkor.nye3.animelist.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progkor.nye3.animelist.data.model.Anime;
import progkor.nye3.animelist.service.AnimeService;

/**
 * A REST controller for managing animes in the anime list.
 */
@RestController
@RequestMapping("/api/v1/anime")
public class AnimeListRestController {

    private final AnimeService animeService;

    @Autowired
    public AnimeListRestController(AnimeService animeService) {
        this.animeService = animeService;
    }

    /**
     * Returns an anime with the given id.
     *
     * @param id the id of the anime to retrieve
     * @return the anime object
     */
    @GetMapping("/{id}")
    public Anime getAnimeById(@PathVariable Long id) {
        return animeService.retrieveAnimeById(id);
    }

    /**
     * Returns a list of all the animes in the list.
     *
     * @return the list of animes
     */
    @GetMapping
    public List<Anime> getAllAnimes() {
        return animeService.retrieveAllAnime();
    }

    /**
     * Creates a new anime and returns it.
     *
     * @param anime the anime object to create
     * @return the created anime object
     */
    @PostMapping
    public Anime createAnime(@RequestBody Anime anime) {
        return animeService.createAnime(anime);
    }

    /**
     * Updates an existing anime and returns it.
     *
     * @param anime the anime object to update
     * @return the updated anime object
     */
    @PutMapping
    public Anime updateAnime(@RequestBody Anime anime) {
        return animeService.updateAnime(anime);
    }

    /**
     * Deletes an anime by its id.
     *
     * @param id the id of the anime to delete
     */
    @DeleteMapping("/{id}")
    public void deleteAnimeById(@PathVariable Long id) {
        animeService.deleteAnimeById(id);
    }
}
