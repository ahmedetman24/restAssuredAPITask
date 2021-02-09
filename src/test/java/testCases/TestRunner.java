package testCases;

public class TestRunner {

	public static void main(String[] args) 
	{
			// Create User and assert on the result
			CreateUsers createUser = new CreateUsers();
			createUser.createUser(11, 101, "test title", "test body");
			System.out.println("User Created Successfully");
			System.out.println("********************************");

			// Retrieve all users and assert on the total number of users
			RetrieveUsers retrieveUsers = new RetrieveUsers();
			retrieveUsers.RetrieveAllUsers("id[99]", 100); //new created user didn't added
			System.out.println("All users retrieved successfully");
			System.out.println("********************************");

			// Retrieve specific user with id =35 and assert on the result
			retrieveUsers.RetrieveSpecificUser(4, 35);

			System.out.println("Specific user retrieved successfully");
	}

}
