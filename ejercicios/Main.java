public class Main {
    public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println(par);
    }
    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Juan", 20);
        System.out.println("PAR STRING - INTEGER:");
        imprimirPar(par1);
        System.out.println();
        Par<Double, Boolean> par2 = new Par<>(15.5, true);
        System.out.println("PAR DOUBLE - BOOLEAN:");
        imprimirPar(par2);
        System.out.println();
        Persona persona = new Persona("Carlos", 21);
        Par<Persona, Integer> par3 = new Par<>(persona, 100);
        System.out.println("PAR PERSONA - INTEGER:");
        imprimirPar(par3);
        System.out.println();
        Contenedor<String, Integer> contenedor = new Contenedor<>();
        contenedor.agregarPar("Juan", 20);
        contenedor.agregarPar("Pedro", 25);
        contenedor.agregarPar("Maria", 30);
        System.out.println("PARES DEL CONTENEDOR:");
        contenedor.mostrarPares();
        System.out.println();
        System.out.println("PAR EN LA POSICION 1:");
        System.out.println(contenedor.obtenerPar(1));
        System.out.println();
        System.out.println("TODOS LOS PARES:");
        System.out.println(contenedor.obtenerTodosLosPares());
    }
}