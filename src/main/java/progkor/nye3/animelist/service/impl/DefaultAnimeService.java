package progkor.nye3.animelist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progkor.nye3.animelist.data.model.Anime;
import progkor.nye3.animelist.data.repository.Repository;
import progkor.nye3.animelist.service.AnimeService;

/**
 * Default implementation of {@link AnimeService}.
 */
@Service
public class DefaultAnimeService implements AnimeService {

    private final Repository<Anime, Long> animeRepository;

    @Autowired
    public DefaultAnimeService(Repository<Anime, Long> animeRepository) {
        this.animeRepository = animeRepository;
    }

    @Override
    public Anime createAnime(Anime anime) {
        return animeRepository.save(anime);
    }

    @Override
    public Anime retrieveAnimeById(Long id) {
        return animeRepository.getById(id);
    }

    @Override
    public List<Anime> retrieveAllAnime() {
        return animeRepository.getAll();
    }

    @Override
    public Anime updateAnime(Anime anime) {
        return animeRepository.update(anime);
    }

    @Override
    public void deleteAnimeById(Long id) {
        animeRepository.deleteById(id);
    }
}
