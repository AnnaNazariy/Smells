package Laba5.LargeClass;

import java.util.List;

public class EnemyList {
    private List<String> enemies;

    public EnemyList(List<String> enemies) {
        this.enemies = enemies;
    }

    public List<String> getEnemies() {
        return enemies;
    }

    public void addEnemy(String enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        this.enemies.remove(enemy);
    }
}

