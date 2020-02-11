package exam;

public class question4 {
	public static void main(String[] args) {
        for(int a=3;a<=100;a++){
            int state = 0;
            for(int b=2;b<a;b++){
                if(a%b== 0)
                    state++;
            }
            if(state == 0){
                System.out.print(a+", ");
            }
        }
    }


}
