class Sum {
    // 1st PART
    public void printSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) 
            total += i;

        System.out.println("Sum : " + total);
    }

    // 2nd PART
    public void printSum(int a, int b) {
        int total = 0;
        for (int i = a; i <= b; i++)
            total += i;
    
        System.out.println("Sum : " + total);
    }

    // 3RD PART
    public void printSum() {
        double total = 0;
        for (int i = 10; i <= 20;){
            total += i;
            i += 1;
    }
        System.out.println("Sum : " + total / 10);
    }
}