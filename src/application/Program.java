package application;

/*Leitura do forEach
* Para cada objeto x, que contenha Y, faça z
* */
public class Program {

    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Carlos"};

        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("-------------------");

        for (String obj : vect) {
            System.out.println(obj);
        }

    }
}
