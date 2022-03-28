package praktikum;

public class class2 extends class1 {
   int gaji1, gaji2;
   
   public void identitas(){
       super.identitas();
       System.out.println("Bekerja di bagian "+bagian);
   }
   public void setGaji1(int gaji1){
       this.gaji1 =gaji1;
   }
   public void setGaji2(int gaji2){
       this.gaji2 =gaji2;
   }
   public int getGaji1(){
       return this.gaji1;
   }
   public int getGaji2(){
       return this.gaji2;
   }
}
