object pascalTriangle {

	def pascal (c:Int, r:Int) : Int = {
			
			if (r == 0 || c == 0 || r == c)  1
			else pascal (c - 1, r - 1) + pascal (c, r - 1)
	}                                         //> pascal: (c: Int, r: Int)Int
	
	pascal(2,4)                               //> res0: Int = 6

}