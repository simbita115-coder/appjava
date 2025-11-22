public class OperadoresAritmeticos {
    public static void main(String[] args){
        int c = 2+2;//suma
        int d = 2-2;//resta
        int e = 3*3;//multiplicacion
        float f = 25f/4f; //division, para indicarele a java que un numero es flotante, se le agrega f
        int m = 4%3; //modulo
        double i = 10.0 / 3.0; //double es agregado con und decimal
        int x = 2;
        int y = ++x;
        x += x + 5;
        x++; //incremento

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(m);
        System.out.println(i);


        System.out.println(x);
        System.out.println(y);
    }
}
