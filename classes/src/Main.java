public class Main {
    public static void main(String[] args) {
        //reference type (Stack icinde olusuyor, referansi heap icinde de olusuyor.)
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type (Her sey stack icerisinde.)
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        //Arrays are also reference type!!!
        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }
}

