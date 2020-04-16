package demo1.person;

import java.util.ArrayList;

public class PersonDemo {
	
	//학생, 대학생, 대학원생이 파라미터 타입으로 지정된 Coruse객체만 전달받는다.
	public static void addStudentCoruse(Course<? extends Student> c) {}
	//직장인, 일반사람이 파라미터 타입으로 지정된 Course객체만 전달받는다.
	public static void addWorkAndPersonCourse(Course<? super Worker> c) {}
	
	public static void main(String[] args) {

		/*
		 * 와일드 카드 제네릭 타입제한
		 * 	<? extends T>		//상위제한		T와 T의 자손들
		 *  <? super T>			//하위제한		T와 T의 조상들
		 *  <?>					//제한없음		<? extends Object>와 동일
		 * 	* 단, 와일드 카드를 사용해서 타입을 제한하기 위해서는 해당 클래스가 제니릭 타입 클래스이어야한다.
		 */
		
		//<? extends Student> 는  Student와 Student 자손의 타입을 제산한다.
		ArrayList<? extends Student> list1 = new ArrayList<Student>();
		//<? extends Worker>은 Worker과 Worker의 부모들로 타입을 제한한다.
		ArrayList<? super Worker> list2 = new ArrayList<Person>();
		
		Course<Student> c1 = new Course<Student>("전공과정");
		Course<PostGraduateStudent> c2 = new Course<PostGraduateStudent>("석사과정");
		Course<Worker> c3 = new Course<Worker>("직장인과정");
		Course<Person> c4 = new Course<Person>("일반인과정");
		addStudentCoruse(c1);
		addStudentCoruse(c2);
//		addStudentCoruse(c3);		//c3는 파라미터 타입이 Worker로 지정되어 있어서 전달불가.
//		addStudentCoruse(c4);		//c4는 파라미터 타입이 Person으로 지정되어 있어서 전달불가.
		
//		addWorkAndPersonCourse(c1);	//c1은 파라미터 타입이 Student로 지정되어 있어서 전달불가
//		addWorkAndPersonCourse(c2);	//c2는 파라미터 타입이 PostGraduateStudent로 지정되어 있어서 전달불가.
		addWorkAndPersonCourse(c3);
		addWorkAndPersonCourse(c4);
		
		
		
		
	}
}
