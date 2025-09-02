package curriculum_D;

class Character {
    String name;
    int hp;
    int at;
    int sp;

    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }
    public boolean isAlive() {
        return hp > 0;
    }

    public void attack(Character target) {
        target.hp = Math.max(0, target.hp - this.at);// 0以下にならないように気を付ける
        System.out.println(this.name + " の攻撃！ " + target.name + " に " + this.at + " ダメージ！");
    }

    @Override
    public String toString() {
        return name + " [HP=" + hp + ", AT=" + at + ", SP=" + sp + "]";
    }
}

