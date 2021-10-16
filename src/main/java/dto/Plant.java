package dto;

import java.io.Serializable;

/**
 * Базовый класс растения
 */
public class Plant implements Serializable {

    /**
     * Текущий показатель энергии данного растения
     * Когда растение съедят, данная энергия будет передана животному
     */
    private int energy;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
