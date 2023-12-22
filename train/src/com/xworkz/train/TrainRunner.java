package com.xworkz.train;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.train.app.Bangalore;
import com.xworkz.train.app.Cheenai;
import com.xworkz.train.app.Hevan;
import com.xworkz.train.app.Kerala;
import com.xworkz.train.app.Mulbagal;
import com.xworkz.train.app.TrainInterface;
import com.xworkz.train.confg.TrainConfg;

public class TrainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TrainConfg.class);

		TrainInterface ban = context.getBean(Bangalore.class);
		ban.getDurationFromSelam();
		
		TrainInterface chennai = context.getBean(Cheenai.class);
		chennai.getDurationFromSelam();
		
		TrainInterface mulbagal = context.getBean(Mulbagal.class);
		mulbagal.getDurationFromSelam();
		
		TrainInterface kerala = context.getBean(Kerala.class);
		kerala.getDurationFromSelam();
		
		TrainInterface hevan = context.getBean(Hevan.class);
		hevan.getDurationFromSelam();

	}

}
