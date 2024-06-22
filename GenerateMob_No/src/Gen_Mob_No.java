
public class Gen_Mob_No {
		
		public void generateMob(String mob)
		{
			    if(mob.length()==10)
			    {    int count =0;
			    	char[] m=mob.toCharArray();
			    	  for(int i=0; i<=999;i++)
			    	  {
			    		  if(i<=9)
			    		  {
			    			  m[7]='0';
			    			  m[8]='0';
			    			  m[9]=(char)(i+'0');
			    		  }else if(i>9&&i<=99)
			    		  {
			    			  m[7]='0';
			    			  m[8]=(char)(i/10+'0');
			    			  m[9]=(char)(i%10+'0');
			    		  }
			    		  else if (i>99&&i<=999)
			    		  {
			    			  m[7]=(char)(i/100+'0');
			    			  int r=i%100;
			    			  m[8]=(char)(r/10+'0');
			    			  m[9]=(char)(r%10+'0');
			    		  }
			    		 
			    		  String t=new String(m);
			    		  System.out.println(t);
			    		  count ++;
			    		  
			    	  }
			    	System.out.println("total " +count);
			    	
			    	
			    }
			    
			
			
		}
		public static void main(String[] args) {
			Gen_Mob_No ob = new Gen_Mob_No();
			ob.generateMob("7503382136");
		}
		
		

	}



