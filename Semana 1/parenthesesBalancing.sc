object parenthesesBalancing {
  def balance(chars: List[Char]): Boolean = {
  	
  	def recorreList (chars: List[Char], n : Int) : Boolean = {
  		
  		if (chars.isEmpty) compruebaBalance(n)
  		
  		else if (chars.head.toString == "(")
  			recorreList(chars.tail, n + 1)
  			
  			else if (chars.head.toString == ")")
  				recorreList(chars.tail, n - 1)
  				else recorreList(chars.tail, n)
  		}
  			
  		def compruebaBalance(num : Int) : Boolean = {
  			if (num == 0) true
  			else false
  		}

  	recorreList(chars, 0)
	}                                         //> balance: (chars: List[Char])Boolean

balance("".toList)                                //> res0: Boolean = false
}