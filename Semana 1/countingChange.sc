object countingChange {

//Se supone lista de monedas ordenadas de mayor a menor valor
  def countChange(money: Int, coins: List[Int]): Int = {
  		
 		def num_Ways(money: Int, coins: List[Int], n : Int) : Int = {
 			
 			if (money == 0) 1
 			
 			else
 				if(coins.isEmpty) 0
 				
 				else
 					
 					if(comprueba_maximo(money, coins.head))
 						num_Ways(money - coins.head, coins, n) + num_Ways(money, coins.tail, n)
 					
 					else num_Ways(money, coins.tail, n)
  	}
  	
  	def comprueba_maximo (m: Int, c: Int) : Boolean = {
  		if (m >= c) true
  		else false
  	}
  	
  	num_Ways(money, coins, 0)
	}                                         //> countChange: (money: Int, coins: List[Int])Int
	
	countChange(10, List(4,2,1))              //> res0: Int = 12
}