
public class Testloadeddie{
    public static void main(String[] args) {
        Lodeddie D1 = new Lodeddie();
        Die D = new Die();
        Die D2 = new Die();
        int a=0;

        for(int x=0; x<1000; x++){
            if(D.getValue()>D2.getValue()){
                a+=1;
            }
            D = new Die();
            D2 = new Die();
        }
        System.out.println("El dado uno cayo "+a+ " veces mas alto que el dado 2");

        for(int x=0; x<1000; x++){
            if(D.getValue()>D1.getValue()){
                a+=1;
            }
            D = new Die();
            D1 = new Lodeddie();
        }
        System.out.println("El dado uno cayo "+a+ " veces mas alto que el dado cargado");
    }
}