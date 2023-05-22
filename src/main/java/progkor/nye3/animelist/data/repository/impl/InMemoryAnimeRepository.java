package progkor.nye3.animelist.data.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import progkor.nye3.animelist.data.model.Anime;
import progkor.nye3.animelist.data.repository.Repository;

/**
 * Map-based in-memory implementation of {@link Repository}.
 */
@org.springframework.stereotype.Repository
public class InMemoryAnimeRepository implements Repository<Anime, Long> {


    private static final Map<Long, Anime> STORAGE = new HashMap<>();

    @Override
    public Anime save(Anime anime) {
        Long id = STORAGE.size() +1L;
        anime.setId(id);
        STORAGE.put(id, anime);
        return null;
    }

    @Override
    public Anime getById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public List<Anime> getAll() {
        return STORAGE.values().stream().toList();
    }

    @Override
    public Anime update(Anime anime) {
        Long id = anime.getId();
        STORAGE.put(id, anime);
        return STORAGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
        STORAGE.remove(id);
    }
}
