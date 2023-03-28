import java.util.Stack;
public class TOHIteration {
    public static void main(String[] args) {
        int n = 3;
        int numMoves = (int) Math.pow(2, n) - 1;
        Stack<Integer> [] tower = new Stack[3];

        for (int i = 0; i < tower.length; i++) {
            tower[i] = new Stack<Integer>();
        }
        for (int i = n; i >= 1; i--) {
            tower[0].push(i);
        }
        for(int i = 1; i <= numMoves; i++) {
            int fromTower = (i % 2 == 1) ? 0 : 1;
            int toTower = ((i + 1) % 2 == 1) ? 2 : 1;

            if(tower[fromTower].isEmpty()) {
                tower[fromTower].push(tower[toTower].pop());
                System.out.println("Move disk from Tower " + (toTower + 1) + " to Tower " + (fromTower + 1));
            } else if (tower[toTower].isEmpty()) {
                tower[toTower].push(tower[fromTower].pop());
                System.out.println("Move disk from Tower " + (fromTower + 1) + " to Tower " + (toTower + 1));
            } else if(tower[fromTower].peek() > tower[toTower].peek()) {
                tower[fromTower].push(tower[toTower].pop());
                System.out.println("Move disk from Tower " + (toTower + 1) + " to Tower " + (fromTower + 1));
            } else {
                tower[toTower].push(tower[fromTower].pop());
                System.out.println("Move disk from Tower " + (fromTower + 1) + " to Tower " + (toTower + 1));
            }
        }
    }
}
