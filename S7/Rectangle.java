class Rectangle{
	
	int  height;
	int width;
	Rectangle(int h,int w){
		height=h;
		width=w;
		System.out.println("Just created a rectangle object with size(h*w) "+height+", "+width);
       print(width,height);
		
	}
	
	
	
	
	
	
	
	
 void	print(int width, int height){
		for(int i=0;i<height;i++){
			 for(int j=0;j<width;j++){
				  System.out.print("*");
			 }
			  System.out.println(" ");
		}
		
	}
	
}


class Main{
	public static void main(String[] args){
	/* for(int i=0;i<10;i++){
        System.out.println("Value of i is "+i);	
	}

  }*/
    Rectangle r1=new Rectangle(5,3);
   Rectangle r2=new Rectangle(3,6);
	   Rectangle r3=r1;
	   System.out.println(" r1:Height "+r1.height+" ,width "+r1.width);
	   System.out.println("r2:Height "+r2.height+" ,width "+r2.width);
	   System.out.println("r3:Height "+r3.height+" ,width "+r3.width);

   //  r1.print(3,4);
   }
}