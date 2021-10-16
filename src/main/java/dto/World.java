package dto;

/**
 * Класс хранения мира и его настроек
 */
public class World {

    private final GameObj[][] fields;

    public World(GameObj[][] fields) {
        this.fields = fields;
    }
}
