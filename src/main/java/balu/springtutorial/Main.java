package balu.springtutorial;

import balu.springtutorial.api.Logger;
import balu.springtutorial.api.UsersRepository;
import balu.springtutorial.domain.User;
import balu.springtutorial.implementations.LoggerImpl;
import balu.springtutorial.implementations.UsersRepositoryImpl;


public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("Konrad");

	}

}
