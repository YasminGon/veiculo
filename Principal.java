public class Principal {
    
    public static void main(String[] args) {
        
        Bike bike =new Bike("Giant","Giant","Azul",2023);

        System.out.println(bike.getNome());
        System.out.println(bike.getMarca());
        System.out.println(bike.getCor());
        System.out.println(bike.getAno());

        Mobi mobi =new Mobi("Monark","Monark","Preto",2023);

        System.out.println(mobi.getNome());
        System.out.println(mobi.getMarca());
        System.out.println(mobi.getCor());
        System.out.println(mobi.getAno());

        Patinete patinete =new Patinete("Bandeirantes","Bandeirantes","Rosa", 2023);

        System.out.println(patinete.getNome());
        System.out.println(patinete.getMarca());
        System.out.println(patinete.getCor());
        System.out.println(patinete.getAno());
}
}

