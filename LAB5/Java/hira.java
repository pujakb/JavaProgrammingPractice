
public class hira{

     public static void main(String []args){
        System.out.println("Hello World");
        int x[]={1,1,2,2,3,3,3,3,3,4,4,4,5,5,6,7,7,7,8,8};
        int y[]={5,7,6,9,3,6,8,8,9,5,8,8,4,7,9,2,3,9,1,7};
        for(int i=0;i<=20;i++){
            for(int j=i+1;j<=20;j++){
               double dist = calculateDistance(x[i],x[j],y[i],y[j]);
               System.out.println("("+x[i]+","+y[i]+")("+x[j]+","+y[j]+"):"+dist);
            }
        }
     }
     
     public static double calculateDistance(int x1,int x2,int y1,int y2){
        int x = (x2-x1)*(x2-x1);
        int y = (y2-y1)*(y2-y1);
        double dist = Math.sqrt(x+y);
        return dist;
     }
}
