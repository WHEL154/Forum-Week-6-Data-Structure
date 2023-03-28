public class TOHRecursive {
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi (n, 'A', 'B', 'C');
    }
    public static void towerOfHanoi (int n, char fromRod, char toRod, char finRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n - 1, fromRod, finRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n - 1, finRod, toRod, fromRod);
    }
}
