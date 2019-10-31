package dozero;

public class SumTest {

	  public long solution(int a, int b) {
	      long i = 0;
	      long j = 0;
	      if(a>b){
	          for(i = b+1;i<a;i++){
	             j += i;
	          }
	          long answer = a+b+j;
	          return answer;
	        
	      }else if(b>a){
	            for(i = a+1;i<b;i++){
	              j += i;
	          }
	          long answer = a+b+j;
	          return answer;
	      }
	      else {
	          long answer = a;
	          return answer;
	      }
	          
	  }
}