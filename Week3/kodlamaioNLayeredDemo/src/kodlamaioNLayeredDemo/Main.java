package kodlamaioNLayeredDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kodlamaioNLayeredDemo.business.concrete.CategoryManager;
import kodlamaioNLayeredDemo.business.concrete.CourseManager;
import kodlamaioNLayeredDemo.business.concrete.EducatorManager;
import kodlamaioNLayeredDemo.core.logging.DatabaseLogger;
import kodlamaioNLayeredDemo.core.logging.FileLogger;
import kodlamaioNLayeredDemo.core.logging.ILogger;
import kodlamaioNLayeredDemo.dataAccess.concrete.hibernate.HibernateCategoryDao;
import kodlamaioNLayeredDemo.dataAccess.concrete.hibernate.HibernateCourseDao;
import kodlamaioNLayeredDemo.dataAccess.concrete.hibernate.HibernateEducatorDao;
import kodlamaioNLayeredDemo.entities.concrete.Category;
import kodlamaioNLayeredDemo.entities.concrete.Course;
import kodlamaioNLayeredDemo.entities.concrete.Educator;

public class Main {

	public static void main(String[] args) {

		List<ILogger> loggers = new ArrayList<ILogger>(Arrays.asList(new FileLogger(),new DatabaseLogger()));
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		EducatorManager educatorManager = new  EducatorManager(new HibernateEducatorDao(), loggers);
		
		
		Category category1 = new Category(1,"Programming");
		Category category2 = new Category(2,"Architechture");
		Category category3 = new Category(3,"Architechture");
		
		Course course1 = new Course(1,"Java Camp 2022",5000);
		Course course2 = new Course(2,".Net NLayered Architecture",7500);
		Course course3 = new Course(3,"Java Camp 2022",8250);
		Course course4 = new Course(4,"React&Redux",0);
		
		Educator educator1 = new Educator(1,"Engin", "Demirog", "edemirog@kodlama.io");
		Educator educator2 = new Educator(2, "Murat", "", "murat@kodlama.io");
		

		System.out.println("*****************************************************");
		System.out.println();
		
		categoryManager.add(category1);
		System.out.println("------------------");
		categoryManager.add(category2);
		System.out.println("------------------");
		categoryManager.add(category3);
		
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println();
		
		courseManager.add(course1);
		System.out.println("------------------");
		courseManager.add(course2);
		System.out.println("------------------");
		courseManager.add(course3);
		System.out.println("------------------");
		courseManager.add(course4);
		System.out.println("------------------");
		
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println();

		educatorManager.add(educator1);
		System.out.println("------------------");
		educatorManager.add(educator2);
		System.out.println("------------------");
	}

}
