public class J_Test {
public static void main(String[] args) {
int sum = 0;
for(int i = 1; i< 10; ++i) {
inner: for(int j = 1; j < 3; ++j) {
sum += j;
if(i + j>6)//5 2
break inner;
          }
      }
System.out.println("sum = " + sum);
  }
}