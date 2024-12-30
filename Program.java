class Program {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c1 = 0;
        int n = 6;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n * 2 - 1; c++) {
                if (r == c) {
                    System.out.print(a + " ");
                    c1 = a + b;
                    a = b;
                    b = c1;
                } else if (r + c == n * 2) {
                    System.out.print(a + " ");
                    c1 = a + b;
                    a = b;
                    b = c1;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}