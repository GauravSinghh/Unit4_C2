package question_1;

/*IS-A relationship is a phenomenon where one class makes a relationship with another class in such a way that
 * it become sub class or a child class of another class while the other class become super class or the parent 
 * class . They attain the IS-a relationship among selves. this is also known as method overriding where the subclass
 * can override the implementation of th parent class.
 * example: 
 * parrot is a bird;
 * cow is an animal;
 * 
 * class A{
 * 		void funA(){
 * 
 *  				}
 *  
 * }
 * class B extends A{
 * @Override
 * void funA(){
 * }
 * }
 * 
 * 'here, funA of class B will be called.
 * 
 * 
 * HAS-A relationship is something when one class has the reference to the another class 
 * or we can say when there's method overloading . When a method has some parameters which will
 * help in the calling of the method is known as method overloading and attain the has a relationship.
 * 
 * example:
 * 
 * class A{
 * 	void funA(){
 * 				}
 * 
 * 	void funA(int x){
 * 					}
 * 
 * 			}
 * 
 * class B{
 *  public static void main(String[] args) {
		A a1 = new A();
		a1.funA();
		a1.funA(10);
	}
 * }
 * 
 * Here, if no args is passed then different function is called else different function is called.
 * 
 * 
 * ACCESS MODIFIERS- Access modifiers are those which have some visibilities and have some accessibilities as well.
 * 
 * PUBLIC- these modifiers are accessible from anywhere ,inside the class or outside or outside the package as well.
 * 
 * DEFAULT - These modifiers are accessible only in the same package. We don't have to define as well whether it is default or not.
 * 
 * PROTECTED -  these are similar to default but if some class wants to access it from outside the package then inheritence must be there.
 * 
 * PRIVATE - 	these modifiers cannot be accessed by any class outside that class and not even accessible by the different package.
 * 
 * 
 * 
 * 
 */










public class Main {
	

}
