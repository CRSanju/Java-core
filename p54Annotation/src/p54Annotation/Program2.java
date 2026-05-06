package p54Annotation;

//Custom Annotation
class Demo5 {
	@Maxage(age = 100)
	int age;
	
	@Minage(age = 18)
	void display(@Oneparameter(para = 1)int age) {
		System.out.println(age);
	}
}
