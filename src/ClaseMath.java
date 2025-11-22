public class ClaseMath {
    public static void main(String[] args){
        System.out.println(Math.abs(-15));
        System.out.println(Math.ceil(10.0001));
        System.out.println(Math.floor(10.999));

        System.out.println(Math.max(15, 25)); //te devulve el numero de mayor valor
        System.out.println(Math.min(15, 25)); //te devuelve el numero de menor valor

        System.out.println(Math.round(15.5)); //imprime el numero mas cercano

        double ramdom = Math.random(); //te da numeros al azar
        System.out.println((int)(ramdom * 100)); //tiene que tener estos parnetesis para que se pueda ejecutar


    }
}
