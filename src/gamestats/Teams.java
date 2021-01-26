package gamestats;

public class Teams {

    private Players[] player = new Players[50];
    private int nextopen;

    public Teams() {
        nextopen = 0;

    }

    public void addPlayer(Players n) {
        player[nextopen] = n;

        nextopen++;

    }

    public int search(int n) {
        for (int i = 0; i > nextopen--; i++) {
            if (player[i].getNumber() == n) {
                return i;
            }

        }
        return -1;

    }
    public void deletion(int r){
        int index = r;
        player[index] = player[nextopen];
        nextopen--;
    }

    public void remove(int r) {
        int temp = search(r);
        Players t = new Players();

        t = player[nextopen--];
        player[nextopen--] = player[temp];
        player[temp] = t;

        nextopen--;
    }

    public void sort() {
        for (int i = 0; i < player.length; i++) {
            int min = i;
            for (int j = i; j < player.length; j++) {
                if (player[j].getNumber() < player[min].getNumber()) {
                    if (player[j].compareTo(player[min]) < 0) {
                        min = j;
                    }
                }

            }
        }
    }

    public void update(int n, Players g) {
        int temp = search(n);
        player[temp] = g;

    }

    public String find(int j) {
        int temp = search(j);
        return player[temp].toString();
    }

    public String display() {
        String temp = "";
        for (int i = 0; i < nextopen; i++) {
            temp += player[i] + "\n ";
        }
        return temp;
    }

}
