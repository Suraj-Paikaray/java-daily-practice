package javaPrograms;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class startPrint {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int num = 5;
        for (int i=num; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
