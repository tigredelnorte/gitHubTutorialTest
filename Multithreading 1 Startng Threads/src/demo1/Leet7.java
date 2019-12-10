package demo1;

public class Leet7 {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
    	char[]roman = s.toCharArray();
    	int number = 0;
    	int len = s.length();
    	
    	for(int i=0; i<len; i++) {
    		
  
    	switch (roman[i]){
    		case 'I':  //1
    			if(i!=len-1) {
    				switch(roman[i+1]) {
    				case'X':
    					number+=9;
    					i++;
    					break;
    				case'V':
    					number+=4;
    					i++;
    					break;
    				default:
    					number+=1;
    					break;
    				}
    			}else {
    				number+=1;
    			}
    			break;
    		case 'V':  //5
    			number+=5;
    			break;
    		case'X':  //10
    			if(i!=len-1) {
				switch(roman[i+1]) {
				case'C':
					number+=90;
					i++;
					break;
				case'L':
					number+=40;
					i++;
					break;
				default:
					number+=10;
					break;
				}
			}else {
				number+=10;
			}
    			break;
    		case'L':   //50
    			number+=50;
    			break;
    		case'C':   //100
    			if(i!=len-1) {
    				switch(roman[i+1]) {
    				case'M':
    					number+=900;
    					i++;
    					break;
    				case'D':
    					number+=400;
    					i++;
    					break;
    				default:
    					number+=100;
    					break;
    				}
    			}else {
    				number+=100;
    			}
    			break;
    		case'D':   //500
    			number+=500;
    			break;
    		case'M':   //1000
    			number+=1000;
    			break;
    		}
    	}
    	return number;
	}
}
