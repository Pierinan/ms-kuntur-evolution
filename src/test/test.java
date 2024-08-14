public class Test { //Test3 - Sin MODIFICAR TESTS 2

    public static void main(String[] args) {
        // Ejemplo simple de una prueba unitaria básica
        int result = add(2, 3);
        if (result == 5) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed.");
        }
    }

    // Método simple que realiza una suma
    public static int add(int a, int b) {
        return a + b;
    }
}
