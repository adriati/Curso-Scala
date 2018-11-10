object funcionalSets {
  
  type Set = Int => Boolean
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: funcionalSets.Set, elem: Int)Boolean
  
  def singletonSet(elemento: Int) : Set = (x: Int) => x == elemento
                                                  //> singletonSet: (elemento: Int)funcionalSets.Set
	
	def union (s: Set, t: Set) : Set = (x: Int) => s(x) | t(x)
                                                  //> union: (s: funcionalSets.Set, t: funcionalSets.Set)funcionalSets.Set
	def intersect (s: Set, t: Set) : Set = (x: Int) => s(x) & t(x)
                                                  //> intersect: (s: funcionalSets.Set, t: funcionalSets.Set)funcionalSets.Set
	def diff (s: Set, t: Set) : Set = (x: Int) => s(x) & (t(x) == false)
                                                  //> diff: (s: funcionalSets.Set, t: funcionalSets.Set)funcionalSets.Set
	def filter(s : Set, pred : Int => Boolean) : Set = (x: Int) => s(x) & pred(x)
                                                  //> filter: (s: funcionalSets.Set, pred: Int => Boolean)funcionalSets.Set
	
	def forall(s: Set, p: Int => Boolean): Boolean = {
		def forall_iter(a: Int, b: Int) : Boolean = {
			if (a == b) true
			else
				if (contains(s, a) == false) forall_iter(a+1, b)
				else
					if(p(a)) forall_iter (a + 1, b)
					else false
		
		}
		forall_iter(-1000, 1000)
	}                                         //> forall: (s: funcionalSets.Set, p: Int => Boolean)Boolean
	
	def exists (s: Set, p: Int => Boolean): Boolean =
		if (forall (s, (x: Int) => p(x) == false)) false
		else true                         //> exists: (s: funcionalSets.Set, p: Int => Boolean)Boolean
	
	
	
	
	val conjunto1 = (x: Int) => x > 1         //> conjunto1  : Int => Boolean = funcionalSets$$$Lambda$8/747464370@6b71769e
	val conjunto2 = (x: Int) => x < 5         //> conjunto2  : Int => Boolean = funcionalSets$$$Lambda$9/659748578@e580929
	val union1 = intersect (conjunto1, conjunto2)
                                                  //> union1  : funcionalSets.Set = funcionalSets$$$Lambda$10/2088051243@4c203ea1
                                                  //| 
	val union2 = filter(union1, (x: Int) => x > 3)
                                                  //> union2  : funcionalSets.Set = funcionalSets$$$Lambda$12/488970385@48140564
                                                  //| 
	exists(union1, (x:Int) => x < 2 & x > 0)  //> res0: Boolean = false
	contains (union2, 2)                      //> res1: Boolean = false
	
	
	
}