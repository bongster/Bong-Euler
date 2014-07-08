object prob32 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var a = 31000;                                  //> a  : Int = 31000
  
  var b = a * a toString                          //> b  : String = 961000000
 
 	while(b.size < 10){
 		a = a + 1;
 		b = a * a toString
 	}
 	
 	println(a)                                //> 31623
 	
 	a = 10000
 	while(b.size > 9){
 		a = a - 1;
 		b = a * a toString
 	}
 
}